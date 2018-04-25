package com.example.ntutcsie.app2_105590049;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt_yes;
    Button bt_no;
    Spinner sp_question;
    ImageButton show, hide;
    TextView tv_yes, tv_no;

    int [] q_chose = {0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_yes = (TextView) findViewById(R.id.tv_yes);
        tv_no = (TextView) findViewById(R.id.tv_no);
        bt_yes = (Button) findViewById(R.id.btn_yes);
        bt_no = (Button) findViewById(R.id.btn_no);
        show = (ImageButton) findViewById(R.id.imb_show);
        hide = (ImageButton) findViewById(R.id.imb_hide);
        sp_question=(Spinner) findViewById(R.id.sp_question);

        show.setImageResource(R.drawable.show_icon);
        hide.setImageResource(R.drawable.hide_icon);

        bt_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q_chose[sp_question.getSelectedItemPosition()] = 1;
                changeTextView();
            }
        });
        bt_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q_chose[sp_question.getSelectedItemPosition()] = 2;
                changeTextView();
            }
        });
    }

    public void changeTextView(){
        tv_yes.setText("YES:"+getStingNumber(1));
        tv_no.setText("NO:"+getStingNumber(2));
    }

    public String getStingNumber(int n){
        String v = " ";
        if(q_chose[0] == n){
            if(v!=" "){
                v += ",";
            }
            v+="1";
        }
        if(q_chose[1] == n){
            if(v!=" "){
                v += ",";
            }
            v+="2";
        }
        if(q_chose[2] == n){
            if(v!=" "){
                v += ",";
            }
            v+="3";
        }
        if(q_chose[3] == n){
            if(v!=" "){
                v += ",";
            }
            v+="4";
        }
        if(q_chose[4] == n){
            if(v!=" "){
                v += ",";
            }
            v+="5";
        }
        return v;

    }




}
