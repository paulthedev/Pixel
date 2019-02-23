package paul.pixel;

import android.content.Intent;
import android.graphics.Color;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;



public class MainActivity extends AppCompatActivity{
    private String ipaddress = "255.255.255.255";
    private int port = 8888;

    private SeekBar red;
    private SeekBar green;
    private SeekBar blue;
    private EditText colorcode;
    private int redvalue;
    private int greenvalue;
    private int bluevalue;
    private int currentColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Pixel");

        colorcode=(EditText)findViewById(R.id.colorcode);
        red=(SeekBar)findViewById(R.id.red);
        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                redvalue = progressValue;
                currentColor=Color.rgb(redvalue,greenvalue,bluevalue);
                View colordisplay=findViewById(R.id.colordisplay);
                colordisplay.setBackgroundColor(currentColor);
                colorcode.setText(String.format("#%06X", (0xFFFFFF & currentColor)), TextView.BufferType.EDITABLE);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        green=(SeekBar)findViewById(R.id.green);
        green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                greenvalue = progressValue;
                currentColor=Color.rgb(redvalue,greenvalue,bluevalue);
                View colordisplay=findViewById(R.id.colordisplay);
                colordisplay.setBackgroundColor(currentColor);
                colorcode.setText(String.format("#%06X", (0xFFFFFF & currentColor)), TextView.BufferType.EDITABLE);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        blue=(SeekBar)findViewById(R.id.blue);
        blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progressValue, boolean fromUser) {
                bluevalue = progressValue;
                currentColor=Color.rgb(redvalue,greenvalue,bluevalue);
                View colordisplay=findViewById(R.id.colordisplay);
                colordisplay.setBackgroundColor(currentColor);
                colorcode.setText(String.format("#%06X", (0xFFFFFF & currentColor)), TextView.BufferType.EDITABLE);

            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        colorcode.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length()==7) {
                    View colordisplay=findViewById(R.id.colordisplay);
                    currentColor=Color.parseColor(s.toString());
                    colordisplay.setBackgroundColor(currentColor);
                    redvalue=Color.red(currentColor);
                    greenvalue=Color.green(currentColor);
                    bluevalue=Color.blue(currentColor);
                    red.setProgress(redvalue);
                    green.setProgress(greenvalue);
                    blue.setProgress(bluevalue);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.con_diag) {
            Intent i = new Intent(getApplicationContext(), udpconn.class);
            startActivity(i);
            finish();

        }
        if (id == R.id.matrix) {
            Intent i = new Intent(getApplicationContext(), grid.class);
            //Change the activity.
            i.putExtra("ipaddress", ipaddress);
            i.putExtra("port", ""+port);
            startActivity(i);
            finish();
        }
        if (id == R.id.anim) {
            Intent i = new Intent(getApplicationContext(), animation.class);
            //Change the activity.
            i.putExtra("ipaddress", ipaddress);
            i.putExtra("port", ""+port);
            startActivity(i);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }



    public void Send(View view) {
        try {
            pushtoUDP("fill"+String.format("%03d", redvalue)+String.format("%03d", greenvalue)+String.format("%03d", bluevalue));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void pushtoUDP(String messageStr) {
        // Hack Prevent crash (sending should be done using an async task)
        StrictMode.ThreadPolicy policy = new   StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        try {
            //Open a random port to send the package
            DatagramSocket socket = new DatagramSocket();
            socket.setBroadcast(true);
            byte[] sendData = messageStr.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName(ipaddress), port);
            socket.send(sendPacket);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        finish();
    }
}
