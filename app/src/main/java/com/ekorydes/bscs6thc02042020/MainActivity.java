package com.ekorydes.bscs6thc02042020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    HumanClass objectHumanClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objectHumanClass=new HumanClass();
        objectHumanClass.setHumanName("Muhammad Ali");
    }

    public void moveData(View v)
    {
        try
        {
//            Bundle objectBundle=new Bundle();
//            //objectBundle.put("name",objectHumanClass);
//
//            Intent objectIntent=new Intent(this,SecondScreen.class);
//            objectIntent.putExtra("name",objectHumanClass);

//            startActivity(objectIntent);

            Bundle objectBundle=new Bundle();
            objectBundle.putString("name","Bundle Value");

            startActivity(new Intent(this,SecondScreen.class)
            .putExtra("value","Some value")
            .putExtra("Human",objectHumanClass)
                    .putExtras(objectBundle)
            );
        }
        catch (Exception e)
        {
            Toast.makeText(this, "move Data:"+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
