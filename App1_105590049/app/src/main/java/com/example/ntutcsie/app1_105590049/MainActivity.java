package com.example.ntutcsie.app1_105590049;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv_grade;
    EditText et_score;
    Button submit;
    getGrade gg = new getGrade();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_grade = (TextView) findViewById(R.id.tv_grade);
        et_score = (EditText) findViewById(R.id.et_score);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(submitMarks);
    }

    View.OnClickListener submitMarks = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int marks =Getint(et_score.getText().toString());
            tv_grade.setText(gg.letterGrade(marks));

        }
    };
    private int Getint( String input ) { //Pass in string
        try { //Try to make the input into an integer
            return Integer.parseInt( input ); //Return true if it age
        }
        catch( Exception e ) {
            return -1; //If it doesn't work return -1 and mean age input error
        }
    }
}
