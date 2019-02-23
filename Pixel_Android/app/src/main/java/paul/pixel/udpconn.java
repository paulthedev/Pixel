package paul.pixel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class udpconn extends AppCompatActivity {
    private String Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.udpconn);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Pixel");
    }
    public void Save(View view){
        //Extracting Text from gui
        EditText text = (EditText)findViewById(R.id.Pass);
         Password = text.getText().toString();

    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        //Change the activity.
        startActivity(i);
        finish();
    }

}
