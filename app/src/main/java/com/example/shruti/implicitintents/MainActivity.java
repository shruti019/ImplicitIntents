package com.example.shruti.implicitintents;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText2= (EditText) findViewById(R.id.editText2);
        Button button= (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= editText2.getText().toString();
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        final EditText editText1= (EditText) findViewById(R.id.editText1);
        Button button2= (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String ring= editText1.getText().toString();
                Intent IntentRing= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ring));
                startActivity(IntentRing);
            }
        });

    }

    public void closeApp(View v){
        MainActivity.this.finish();
    }
}
