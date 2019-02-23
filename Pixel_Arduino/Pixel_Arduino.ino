#include <FastLED.h>
#include <ESP8266WiFi.h>
#include <WiFiUDP.h>
#include <SPI.h>
#include <SD.h>

//WS2812 Matrix values
#define LED_PIN     3
#define NUM_LEDS    64
#define LED_TYPE    WS2812
#define COLOR_ORDER GRB
#define FASTLED_ESP8266_NODEMCU_PIN_ORDER
CRGB leds[NUM_LEDS];

// wifi connection variables
String ssid = "";
String password = "";
boolean wifiConnected = false;
uint8_t wifiled = D2;

// UDP variables
unsigned int localPort = 8888;

WiFiUDP UDP;
boolean udpConnected = false;
char packetBuffer[UDP_TX_PACKET_MAX_SIZE]; //buffer to hold incoming packet
char ReplyBuffer[] = "acknowledged"; //a string to send back
String msg = "";


void setup() 
{
  
	// Initialise Serial connection
	Serial.begin(115200);
  
  //Wifi Indicator light
  pinMode(wifiled, OUTPUT);
    
  // Initialise SD card
  connectSD();
  
  // initialise FastLED
  FastLED.addLeds<LED_TYPE, LED_PIN, COLOR_ORDER>(leds, NUM_LEDS).setCorrection( TypicalLEDStrip );
  
  // turned off initially until any command comes up
  fill_solid ( leds, NUM_LEDS, CRGB(0,0,0));
  FastLED.show();

  connect:
  // Initialise wifi connection
  wifiConnected = connectWifi();
  
	// only proceed if wifi connection successful
	if(wifiConnected)
	{
		udpConnected = connectUDP();
		if (udpConnected)
		{
    digitalWrite(wifiled, HIGH);
		}
	}
 else
 {
    digitalWrite(wifiled, LOW);
    goto connect;
 }
}

void loop() 
{
	// check if the WiFi and UDP connections were successful
	if(wifiConnected)
	{
		if(udpConnected)
		{
		// if there’s data available, read a packet
		int packetSize = UDP.parsePacket();
			if(packetSize)
			{
				Serial.println("");
				Serial.print("Received packet of size ");
				Serial.println(packetSize);
				Serial.print("From ");
				IPAddress remote = UDP.remoteIP();
				for (int i =0; i < 4; i++)
				{
					Serial.print(remote[i], DEC);
					if (i < 3)
					{
						Serial.print(".");
					}
				}
				Serial.print(", port ");
				Serial.println(UDP.remotePort());

				// read the packet into packetBufffer
				UDP.read(packetBuffer,UDP_TX_PACKET_MAX_SIZE);
				Serial.println("Contents:");
				Serial.println(packetBuffer);
        msg="";
        for(int i=0; i<sizeof(packetBuffer);i++)
        {
           msg+=(String)packetBuffer[i];
        }
        int r=(msg.substring(4,7)).toInt();
        int g=(msg.substring(7,10)).toInt();
        int b=(msg.substring(10,13)).toInt();

        if(msg.substring(0,4) == "fill")
        {
        fill_solid ( leds, NUM_LEDS, CRGB(r,g,b));
        FastLED.show();
        }
        if(msg.substring(0,4) == "grid")
        {
           for(int j=0 ; j < 64 ; j++)
           {
            if(msg.substring(13+j,13+j+1)=="1")
              leds[j].setRGB( r, g, b);
            else
              leds[j].setRGB( 0, 0, 0);
           }
          FastLED.show();// display this frame
        }
				// send a reply, to the IP address and port that sent us the packet we received
				UDP.beginPacket(UDP.remoteIP(), UDP.remotePort());
				UDP.write(ReplyBuffer);
				UDP.endPacket();
			}
		}
	}

  if(msg.substring(0,4) == "lava"){
    LavaFlow();
    FastLED.show();// display this frame
    FastLED.delay(1000 / 60);
  }
  if(msg.substring(0,4) == "fire"){
    Fire2012();
    FastLED.show();// display this frame
    FastLED.delay(1000 / 60);
 }
 if(msg.substring(0,7) == "rainbow"){
    rainbow();
    FastLED.show();// display this frame
    FastLED.delay(1000 / 120);
 }
}


//Initialize SD Card
void connectSD()
{
  //File pointer
  File myFile;

  
  if (!SD.begin(4)) 
  {
    Serial.println("SD initialization failed!");
    return;
  }
  
  Serial.println("SD initialization done.");

  //Open the file for reading:
  myFile = SD.open("pass.txt");
  if (myFile) 
  {
    ssid = myFile.readStringUntil('\n');
    ssid.trim();
    
    password = myFile.readStringUntil('\n');
    password.trim();
  
    myFile.close();
  } 
  else 
  {
    Serial.println("error opening file");
  }
}

// connect to UDP – returns true if successful or false if not
boolean connectUDP()
{
	boolean state = false;

	Serial.println("");
	Serial.println("Connecting to UDP");

	if(UDP.begin(localPort) == 1)
	{
		Serial.println("Connection successful");
		state = true;
	}
	else
	{
		Serial.println("Connection failed");
	}

	return state;
}

// connect to wifi – returns true if successful or false if not
boolean connectWifi()
{
	boolean state = true;
	int i = 0;
  WiFi.mode(WIFI_STA);
	WiFi.begin(ssid.c_str(), password.c_str());
	Serial.println("");
	Serial.println("Connecting to WiFi");

	// Wait for connection
	Serial.print("Connecting");
	while (WiFi.status() != WL_CONNECTED) 
	{
    delay(500);
		Serial.print(".");
		if (i > 10)
		{
			state = false;
			break;
		}
		i++;
	}
	if (state)
	{
		Serial.println("");
		Serial.print("Connected to ");
		Serial.println(ssid);
		Serial.print("IP address: ");
		Serial.println(WiFi.localIP());
	}
	else 
	{
		Serial.println("");
		Serial.println("Connection failed");
	}
	return state;
}


//Lava Animation
CRGBPalette16 currentPalette( CRGB::Black);
CRGBPalette16 targetPalette( LavaColors_p );

void LavaFlow()
{
  uint8_t maxChanges = 24; 
  nblendPaletteTowardPalette( currentPalette, targetPalette, maxChanges);


  static uint8_t startIndex = 0;
  startIndex = startIndex + 1; /* motion speed */
  FillLEDsFromPaletteColors( startIndex);
}

void FillLEDsFromPaletteColors( uint8_t colorIndex)
{
  uint8_t brightness = 255;
  
  for( int i = 0; i < NUM_LEDS; i++) 
  {
    leds[i] = ColorFromPalette( currentPalette, colorIndex + sin8(i*16), brightness);
    colorIndex += 3;
  }
}

//Fire Animation

// COOLING: How much does the air cool as it rises?
// Less cooling = taller flames.  More cooling = shorter flames.
// Default 50, suggested range 20-100 
#define COOLING  55

// SPARKING: What chance (out of 255) is there that a new spark will be lit?
// Higher chance = more roaring fire.  Lower chance = more flickery fire.
// Default 120, suggested range 50-200.
#define SPARKING 120

bool gReverseDirection = false;

void Fire2012()
{
// Array of temperature readings at each simulation cell
  static byte heat[NUM_LEDS];

  // Step 1.  Cool down every cell a little
    for( int i = 0; i < NUM_LEDS; i++) {
      heat[i] = qsub8( heat[i],  random8(0, ((COOLING * 10) / NUM_LEDS) + 2));
    }
  
    // Step 2.  Heat from each cell drifts 'up' and diffuses a little
    for( int k= NUM_LEDS - 1; k >= 2; k--) {
      heat[k] = (heat[k - 1] + heat[k - 2] + heat[k - 2] ) / 3;
    }
    
    // Step 3.  Randomly ignite new 'sparks' of heat near the bottom
    if( random8() < SPARKING ) {
      int y = random8(7);
      heat[y] = qadd8( heat[y], random8(160,255) );
    }

    // Step 4.  Map from heat cells to LED colors
    for( int j = 0; j < NUM_LEDS; j++) {
      CRGB color = HeatColor( heat[j]);
      int pixelnumber;
      if( gReverseDirection ) {
        pixelnumber = (NUM_LEDS-1) - j;
      } else {
        pixelnumber = j;
      }
      leds[pixelnumber] = color;
    }
}

//Rainbow animation
uint8_t gHue = 0;
void rainbow() 
{
  // FastLED's built-in rainbow generator
  fill_rainbow( leds, NUM_LEDS, gHue, 7);
  EVERY_N_MILLISECONDS( 20 ) { gHue++; }
}
