package com.ekorydes.bscs6thc02042020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {

    private TextView objectTextView;
    private Intent objectIntent;

    private Bundle objectGetBundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        objectTextView=findViewById(R.id.TV);
        getDataFromPreviousScreen();
    }

    private void getDataFromPreviousScreen()
    {
        try
        {
            if(getIntent()!=null)
            {
                objectIntent=getIntent();
               // objectGetBundle=objectIntent.getExtras();

                //String name=objectGetBundle.getString("name");
//                int someIntValue=objectIntent.getIntExtra("intValue",0);

                HumanClass objectHumanClass=objectIntent.getParcelableExtra("name");
                objectTextView.setText(objectHumanClass.getHumanName());
            }
            else
            {
                Toast.makeText(this, "No data retrieved", Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e)
        {
            Toast.makeText(this, "getDataFromPreviousScreen:"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
