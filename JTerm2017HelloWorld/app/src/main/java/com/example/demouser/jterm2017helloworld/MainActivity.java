package com.example.demouser.jterm2017helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    //hit option enter
    private static Map<String, String> countryCodes = new HashMap();

    static{
        countryCodes.put("GBR", "United Kingdom");
        countryCodes.put("IND", "India");
        countryCodes.put("IDN", "Indonesia");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.lookUpButton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lookUp();
            }
        });

    }

    public void lookUp(){
        String code = ((EditText) findViewById(R.id.editText)).getText().toString().toUpperCase();
        String country = "";
        if (countryCodes.containsKey(code)){
            country = countryCodes.get(code);

        }
        else{
            country = code;
        }

        ((TextView)findViewById(R.id.countryCode)).setText(country);
    }
}
