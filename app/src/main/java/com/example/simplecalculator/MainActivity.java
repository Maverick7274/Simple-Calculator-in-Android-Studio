package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    TextView workingsTV;
    TextView resultsTV;

    String workings = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();



        Button clear_text = findViewById(R.id.clear_text);
        Button brackets = findViewById(R.id.brackets);
        Button exponent = findViewById(R.id.exponent);
        Button division = findViewById(R.id.division);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button multiplication = findViewById(R.id.multiplication);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button subtraction = findViewById(R.id.subtraction);
        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button addition = findViewById(R.id.addition);
        Button decimal = findViewById(R.id.decimal);
        Button zero = findViewById(R.id.zero);
        Button equalsTo = findViewById(R.id.equalsTo);



        equalsTo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Double result = null;
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");

                try {
                    result = (double)engine.eval(workings);
                } catch (ScriptException e) {
                    Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_SHORT).show();
                }
                if(result != null)
                    resultsTV.setText(String.valueOf(result.doubleValue()));
            }



        });


        clear_text.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                workingsTV.setText("");
                workings = "";
                resultsTV.setText("");
            }
        });

        brackets.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {

            }
        });

        exponent.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("^");
            }
        });

        division.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("/");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("7");
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("8");
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("9");
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("*");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("4");
            }
        });


        five.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("5");
            }
        });


        six.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("6");
            }
        });


        subtraction.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("-");
            }
        });


        one.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("1");
            }
        });


        two.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("2");
            }
        });


        three.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("3");
            }
        });


        addition.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("+");
            }
        });


        decimal.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings(".");
            }
        });


        zero.setOnClickListener(new View.OnClickListener() {

            private void setWorkings(String givenValue)
            {
                workings = workings + givenValue;
                workingsTV.setText(workings);
            }

            @Override
            public void onClick(View view) {
                setWorkings("0");
            }
        });

    }

        private void initTextViews()
        {
            workingsTV = (TextView)findViewById(R.id.WorkView);
            resultsTV = (TextView)findViewById(R.id.ResultView);
        }















}