package paul.pixel;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ToggleButton;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class grid extends AppCompatActivity {
    char grid[]=new char[64];
    private String ipaddress = "255.255.255.255";
    private int port = 8888;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Pixel");
        //this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        cleargrid();

        ToggleButton grid0 = (ToggleButton) findViewById(R.id.grid0);
        grid0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[0]='1';
                }
                else{
                    grid[0]='0';
                }
            }
        });
        ToggleButton grid1 = (ToggleButton) findViewById(R.id.grid1);
        grid1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[1]='1';
                }
                else{
                    grid[1]='0';
                }
            }
        });
        ToggleButton grid2 = (ToggleButton) findViewById(R.id.grid2);
        grid2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[2]='1';
                }
                else{
                    grid[2]='0';
                }
            }
        });
        ToggleButton grid3 = (ToggleButton) findViewById(R.id.grid3);
        grid3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[3]='1';
                }
                else{
                    grid[3]='0';
                }
            }
        });
        ToggleButton grid4 = (ToggleButton) findViewById(R.id.grid4);
        grid4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[4]='1';
                }
                else{
                    grid[4]='0';
                }
            }
        });
        ToggleButton grid5 = (ToggleButton) findViewById(R.id.grid5);
        grid5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[5]='1';
                }
                else{
                    grid[5]='0';
                }
            }
        });
        ToggleButton grid6 = (ToggleButton) findViewById(R.id.grid6);
        grid6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[6]='1';
                }
                else{
                    grid[6]='0';
                }
            }
        });
        ToggleButton grid7 = (ToggleButton) findViewById(R.id.grid7);
        grid7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[7]='1';
                }
                else{
                    grid[7]='0';
                }
            }
        });
        ToggleButton grid8 = (ToggleButton) findViewById(R.id.grid8);
        grid8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[8]='1';
                }
                else{
                    grid[8]='0';
                }
            }
        });
        ToggleButton grid9 = (ToggleButton) findViewById(R.id.grid9);
        grid9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[9]='1';
                }
                else{
                    grid[9]='0';
                }
            }
        });
        ToggleButton grid10 = (ToggleButton) findViewById(R.id.grid10);
        grid10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[10]='1';
                }
                else{
                    grid[10]='0';
                }
            }
        });
        ToggleButton grid11 = (ToggleButton) findViewById(R.id.grid11);
        grid11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[11]='1';
                }
                else{
                    grid[11]='0';
                }
            }
        });
        ToggleButton grid12 = (ToggleButton) findViewById(R.id.grid12);
        grid12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[12]='1';
                }
                else{
                    grid[12]='0';
                }
            }
        });
        ToggleButton grid13 = (ToggleButton) findViewById(R.id.grid13);
        grid13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[13]='1';
                }
                else{
                    grid[13]='0';
                }
            }
        });
        ToggleButton grid14 = (ToggleButton) findViewById(R.id.grid14);
        grid14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[14]='1';
                }
                else{
                    grid[14]='0';
                }
            }
        });
        ToggleButton grid15 = (ToggleButton) findViewById(R.id.grid15);
        grid15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[15]='1';
                }
                else{
                    grid[15]='0';
                }
            }
        });
        ToggleButton grid16 = (ToggleButton) findViewById(R.id.grid16);
        grid16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[16]='1';
                }
                else{
                    grid[16]='0';
                }
            }
        });
        ToggleButton grid17 = (ToggleButton) findViewById(R.id.grid17);
        grid17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[17]='1';
                }
                else{
                    grid[17]='0';
                }
            }
        });
        ToggleButton grid18 = (ToggleButton) findViewById(R.id.grid18);
        grid18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[18]='1';
                }
                else{
                    grid[18]='0';
                }
            }
        });
        ToggleButton grid19 = (ToggleButton) findViewById(R.id.grid19);
        grid19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[19]='1';
                }
                else{
                    grid[19]='0';
                }
            }
        });
        ToggleButton grid20 = (ToggleButton) findViewById(R.id.grid20);
        grid20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[20]='1';
                }
                else{
                    grid[20]='0';
                }
            }
        });
        ToggleButton grid21 = (ToggleButton) findViewById(R.id.grid21);
        grid21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[21]='1';
                }
                else{
                    grid[21]='0';
                }
            }
        });
        ToggleButton grid22 = (ToggleButton) findViewById(R.id.grid22);
        grid22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[22]='1';
                }
                else{
                    grid[22]='0';
                }
            }
        });
        ToggleButton grid23 = (ToggleButton) findViewById(R.id.grid23);
        grid23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[23]='1';
                }
                else{
                    grid[23]='0';
                }
            }
        });
        ToggleButton grid24 = (ToggleButton) findViewById(R.id.grid24);
        grid24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[24]='1';
                }
                else{
                    grid[24]='0';
                }
            }
        });
        ToggleButton grid25 = (ToggleButton) findViewById(R.id.grid25);
        grid25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[25]='1';
                }
                else{
                    grid[25]='0';
                }
            }
        });
        ToggleButton grid26 = (ToggleButton) findViewById(R.id.grid26);
        grid26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[26]='1';
                }
                else{
                    grid[26]='0';
                }
            }
        });
        ToggleButton grid27 = (ToggleButton) findViewById(R.id.grid27);
        grid27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[27]='1';
                }
                else{
                    grid[27]='0';
                }
            }
        });
        ToggleButton grid28 = (ToggleButton) findViewById(R.id.grid28);
        grid28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[28]='1';
                }
                else{
                    grid[28]='0';
                }
            }
        });
        ToggleButton grid29 = (ToggleButton) findViewById(R.id.grid29);
        grid29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[29]='1';
                }
                else{
                    grid[29]='0';
                }
            }
        });
        ToggleButton grid30 = (ToggleButton) findViewById(R.id.grid30);
        grid30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[30]='1';
                }
                else{
                    grid[30]='0';
                }
            }
        });
        ToggleButton grid31 = (ToggleButton) findViewById(R.id.grid31);
        grid31.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[31]='1';
                }
                else{
                    grid[31]='0';
                }
            }
        });
        ToggleButton grid32 = (ToggleButton) findViewById(R.id.grid32);
        grid32.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[32]='1';
                }
                else{
                    grid[32]='0';
                }
            }
        });
        ToggleButton grid33 = (ToggleButton) findViewById(R.id.grid33);
        grid33.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[33]='1';
                }
                else{
                    grid[33]='0';
                }
            }
        });
        ToggleButton grid34 = (ToggleButton) findViewById(R.id.grid34);
        grid34.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[34]='1';
                }
                else{
                    grid[34]='0';
                }
            }
        });
        ToggleButton grid35 = (ToggleButton) findViewById(R.id.grid35);
        grid35.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[35]='1';
                }
                else{
                    grid[35]='0';
                }
            }
        });
        ToggleButton grid36 = (ToggleButton) findViewById(R.id.grid36);
        grid36.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[36]='1';
                }
                else{
                    grid[36]='0';
                }
            }
        });
        ToggleButton grid37 = (ToggleButton) findViewById(R.id.grid37);
        grid37.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[37]='1';
                }
                else{
                    grid[37]='0';
                }
            }
        });
        ToggleButton grid38 = (ToggleButton) findViewById(R.id.grid38);
        grid38.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[38]='1';
                }
                else{
                    grid[38]='0';
                }
            }
        });
        ToggleButton grid39 = (ToggleButton) findViewById(R.id.grid39);
        grid39.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[39]='1';
                }
                else{
                    grid[39]='0';
                }
            }
        });
        ToggleButton grid40 = (ToggleButton) findViewById(R.id.grid40);
        grid40.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[40]='1';
                }
                else{
                    grid[40]='0';
                }
            }
        });
        ToggleButton grid41 = (ToggleButton) findViewById(R.id.grid41);
        grid41.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[41]='1';
                }
                else{
                    grid[41]='0';
                }
            }
        });
        ToggleButton grid42 = (ToggleButton) findViewById(R.id.grid42);
        grid42.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[42]='1';
                }
                else{
                    grid[42]='0';
                }
            }
        });
        ToggleButton grid43 = (ToggleButton) findViewById(R.id.grid43);
        grid43.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[43]='1';
                }
                else{
                    grid[43]='0';
                }
            }
        });
        ToggleButton grid44 = (ToggleButton) findViewById(R.id.grid44);
        grid44.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[44]='1';
                }
                else{
                    grid[44]='0';
                }
            }
        });
        ToggleButton grid45 = (ToggleButton) findViewById(R.id.grid45);
        grid45.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[45]='1';
                }
                else{
                    grid[45]='0';
                }
            }
        });
        ToggleButton grid46 = (ToggleButton) findViewById(R.id.grid46);
        grid46.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[46]='1';
                }
                else{
                    grid[46]='0';
                }
            }
        });
        ToggleButton grid47 = (ToggleButton) findViewById(R.id.grid47);
        grid47.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[47]='1';
                }
                else{
                    grid[47]='0';
                }
            }
        });
        ToggleButton grid48 = (ToggleButton) findViewById(R.id.grid48);
        grid48.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[48]='1';
                }
                else{
                    grid[48]='0';
                }
            }
        });
        ToggleButton grid49 = (ToggleButton) findViewById(R.id.grid49);
        grid49.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[49]='1';
                }
                else{
                    grid[49]='0';
                }
            }
        });
        ToggleButton grid50 = (ToggleButton) findViewById(R.id.grid50);
        grid50.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[50]='1';
                }
                else{
                    grid[50]='0';
                }
            }
        });
        ToggleButton grid51 = (ToggleButton) findViewById(R.id.grid51);
        grid51.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[51]='1';
                }
                else{
                    grid[51]='0';
                }
            }
        });
        ToggleButton grid52 = (ToggleButton) findViewById(R.id.grid52);
        grid52.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[52]='1';
                }
                else{
                    grid[52]='0';
                }
            }
        });
        ToggleButton grid53 = (ToggleButton) findViewById(R.id.grid53);
        grid53.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[53]='1';
                }
                else{
                    grid[53]='0';
                }
            }
        });
        ToggleButton grid54 = (ToggleButton) findViewById(R.id.grid54);
        grid54.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[54]='1';
                }
                else{
                    grid[54]='0';
                }
            }
        });
        ToggleButton grid55 = (ToggleButton) findViewById(R.id.grid55);
        grid55.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[55]='1';
                }
                else{
                    grid[55]='0';
                }
            }
        });
        ToggleButton grid56 = (ToggleButton) findViewById(R.id.grid56);
        grid56.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[56]='1';
                }
                else{
                    grid[56]='0';
                }
            }
        });
        ToggleButton grid57 = (ToggleButton) findViewById(R.id.grid57);
        grid57.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[57]='1';
                }
                else{
                    grid[57]='0';
                }
            }
        });
        ToggleButton grid58 = (ToggleButton) findViewById(R.id.grid58);
        grid58.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[58]='1';
                }
                else{
                    grid[58]='0';
                }
            }
        });
        ToggleButton grid59 = (ToggleButton) findViewById(R.id.grid59);
        grid59.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[59]='1';
                }
                else{
                    grid[59]='0';
                }
            }
        });
        ToggleButton grid60 = (ToggleButton) findViewById(R.id.grid60);
        grid60.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[60]='1';
                }
                else{
                    grid[60]='0';
                }
            }
        });
        ToggleButton grid61 = (ToggleButton) findViewById(R.id.grid61);
        grid61.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[61]='1';
                }
                else{
                    grid[61]='0';
                }
            }
        });
        ToggleButton grid62 = (ToggleButton) findViewById(R.id.grid62);
        grid62.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[62]='1';
                }
                else{
                    grid[62]='0';
                }
            }
        });
        ToggleButton grid63 = (ToggleButton) findViewById(R.id.grid63);
        grid63.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    grid[63]='1';
                }
                else{
                    grid[63]='0';
                }
            }
        });
    }
    public void cleargrid()
    {
        for(int i=0;i<64;i++){
            grid[i]='0';
        }
    }
    public void clear(View v){
        String gridstr = "";
        for (Character c : grid)
            gridstr += c.toString();
        pushtoUDP("grid"+"000000000"+gridstr);
        Intent i = new Intent(getApplicationContext(), grid.class);
        //Change the activity.
        i.putExtra("ipaddress", ipaddress);
        i.putExtra("port", ""+port);
        startActivity(i);
        finish();
    }
    public void SendGrid(View v){
        try {
            EditText colorcode=(EditText)findViewById(R.id.colorcode);
            int currentColor=Color.parseColor(colorcode.getText().toString());
            int redvalue=Color.red(currentColor);
            int greenvalue=Color.green(currentColor);
            int bluevalue=Color.blue(currentColor);
            String gridstr = "";
            for (Character c : grid)
                gridstr += c.toString();
            pushtoUDP("grid"+String.format("%03d", redvalue)+String.format("%03d", greenvalue)+String.format("%03d", bluevalue)+gridstr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        //Change the activity.
        i.putExtra("ipaddress", ipaddress);
        i.putExtra("port", ""+port);
        startActivity(i);
        finish();
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}