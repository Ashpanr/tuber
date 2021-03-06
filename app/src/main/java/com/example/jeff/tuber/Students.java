package com.example.jeff.tuber;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Students extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button studentSubmit = (Button)findViewById(R.id.studentSubmit);

        studentSubmit.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        //assign variables to EditText fields
                        EditText textLow = (EditText) findViewById(R.id.textLow);
                        EditText textHigh = (EditText) findViewById(R.id.textHigh);
                        EditText searchRadius = (EditText) findViewById(R.id.searchRadius);

                        //assigns data input to variables
                        Editable low = textLow.getText();
                        Editable high = textHigh.getText();
                        Editable radius = searchRadius.getText();

                        /*ParseObject tutorInfo = new ParseObject("studentInfo");
                        studentInfo.put("name", low);
                        studentInfo.put("rate", high);
                        studentInfo.put("radius", radius);
                        studentInfo.saveInBackground();*/
                    }
                }
        );
    }

}
