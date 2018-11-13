package com.example.lenovo.quizapp;

import java.lang.String;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class QuizActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final LinearLayout Qcard1 = (LinearLayout) findViewById(R.id.card1);
        final LinearLayout Qcard2 = (LinearLayout) findViewById(R.id.card2);
        final LinearLayout Qcard3 = (LinearLayout) findViewById(R.id.card3);
        final LinearLayout Qcard4 = (LinearLayout) findViewById(R.id.card4);
        final LinearLayout Qcard5 = (LinearLayout) findViewById(R.id.card5);
        final LinearLayout Qcard6 = (LinearLayout) findViewById(R.id.card6);
        final LinearLayout Qcard7 = (LinearLayout) findViewById(R.id.card7);
        final LinearLayout Qcard8 = (LinearLayout) findViewById(R.id.card8);
        final LinearLayout Qcard9 = (LinearLayout) findViewById(R.id.card9);
        final LinearLayout Qcard10 = (LinearLayout) findViewById(R.id.card10);
        final RadioGroup rgroup1 = (RadioGroup) findViewById(R.id.rg_q1);
        final RadioGroup rgroup3 = (RadioGroup) findViewById(R.id.rg_q3);
        final RadioGroup rgroup6 = (RadioGroup) findViewById(R.id.rg_q6);
        final RadioGroup rgroup8 = (RadioGroup) findViewById(R.id.rg_q8);
        final RadioGroup rgroup10 = (RadioGroup) findViewById(R.id.rg_q10);
        final EditText etext2 = (EditText) findViewById(R.id.et_q2);
        final EditText etext4 = (EditText) findViewById(R.id.et_q4);
        final EditText etext5 = (EditText) findViewById(R.id.et_q5);
        final CheckBox cbox7_concrete = (CheckBox)findViewById(R.id.cb_concrete);
        final CheckBox cbox7_steel = (CheckBox)findViewById(R.id.cb_steel);
        final CheckBox cbox7_brnz = (CheckBox)findViewById(R.id.cb_bronze);
        final DatePicker dpicker9 = (DatePicker) findViewById(R.id.dp_q9);
        Button submitButton = (Button) findViewById(R.id.submitBtn);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                int result = 0;
                int response1 = rgroup1.getCheckedRadioButtonId();
                String response2 = etext2.getText().toString().toLowerCase();
                int response3 = rgroup3.getCheckedRadioButtonId();
                String response4 = etext4.getText().toString().toLowerCase();
                String response5 = etext5.getText().toString();
                int response6 = rgroup6.getCheckedRadioButtonId();
                int response8 = rgroup8.getCheckedRadioButtonId();
                int day = dpicker9.getDayOfMonth();
                int month = dpicker9.getMonth() + 1;
                int year = dpicker9.getYear();
                StringBuilder sb = new StringBuilder();
                String response9 = sb.append(day).append(month).append(year).toString();
                int response10 = rgroup10.getCheckedRadioButtonId();
                int green = Color.rgb(10, 150, 10);
                int red = Color.rgb(255, 69, 0);

                if (response1 == R.id.radio_sardar) {
                    result++;
                    Qcard1.setBackgroundColor(green);
                } else
                    Qcard1.setBackgroundColor(red);

                if (response2.equals("narmada")) {
                    result++;
                    Qcard2.setBackgroundColor(green);
                } else
                    Qcard2.setBackgroundColor(red);

                if (response3 == R.id.radio_gujrat) {
                    result++;
                    Qcard3.setBackgroundColor(green);
                } else
                    Qcard3.setBackgroundColor(red);

                if (response4.equals("iron")) {
                    result++;
                    Qcard4.setBackgroundColor(green);
                } else
                    Qcard4.setBackgroundColor(red);

                if (response5.equals("143")) {
                    result++;
                    Qcard5.setBackgroundColor(green);
                } else
                    Qcard5.setBackgroundColor(red);

                if (response6 == R.id.radio_182) {
                    result++;
                    Qcard6.setBackgroundColor(green);
                } else
                    Qcard6.setBackgroundColor(red);

                if (cbox7_concrete.isChecked() && cbox7_steel.isChecked() && cbox7_brnz.isChecked()) {
                    result++;
                    Qcard7.setBackgroundColor(green);
                } else
                    Qcard7.setBackgroundColor(red);

                if (response8 == R.id.radio_ram) {
                    result++;
                    Qcard8.setBackgroundColor(green);
                } else
                    Qcard8.setBackgroundColor(red);

                if (response9.equals("31102018")) {
                    result++;
                    Qcard9.setBackgroundColor(green);
                } else
                    Qcard9.setBackgroundColor(red);

                if (response10 == R.id.radio_nm) {
                    result++;
                    Qcard10.setBackgroundColor(green);
                } else
                    Qcard10.setBackgroundColor(red);

                // Toast.makeText(QuizActivity.this,,Toast.LENGTH_SHORT).show();
                if (result == 10)
                    Toast.makeText(QuizActivity.this, "Great!!! You Scored:" + result, Toast.LENGTH_LONG).show();
                else if (result < 10 && result >= 6)
                    Toast.makeText(QuizActivity.this, "Good You Scored:" + result, Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(QuizActivity.this, " You Scored:" + result, Toast.LENGTH_LONG).show();
            }
        });
    }

}
