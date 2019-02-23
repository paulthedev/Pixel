package paul.pixel;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class animation extends AppCompatActivity {
    private String ipaddress = "255.255.255.255";
    private int port = 8888;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Pixel");

    }
    public void lava(View view) {
        try {
            pushtoUDP("lava");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void fire(View view) {
        try {
            pushtoUDP("fire");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void rainbow(View view) {
        try {
            pushtoUDP("rainbow");
        }catch (Exception e) {
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
