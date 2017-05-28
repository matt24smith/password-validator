package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends Activity implements View.OnClickListener {

    private Button btn;
    private EditText txt;
    private TextView helloTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

        txt = (EditText) findViewById(R.id.editText2);
        helloTxt = (TextView) findViewById(R.id.helloText);
    }



    @Override
    public void onClick(View v) {
        helloTxt.setText(txt.getText());
        //btn.setText(txt.getText());
    }

    public int validate(String password){
        int rulesPassed = 0;
        if (!password.equals("password")) rulesPassed++;
        if (password.length() >= 8) rulesPassed++;

        return rulesPassed;
    }
}



