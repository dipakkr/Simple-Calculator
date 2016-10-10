package com.example.deepak.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2;
    Button add, sub, multiply, divide, percenatge, power1, power2;
    TextView txtresult;

    double data1, data2, result, result2, result3, result4, result5, result6, result7;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.edittext);
        input2 = (EditText) findViewById(R.id.edittext2);

        add = (Button) findViewById(R.id.btn_add);
        sub = (Button) findViewById(R.id.btn_subtract);
        multiply = (Button) findViewById(R.id.btn_multiply);
        divide = (Button) findViewById(R.id.btn_divide);
        percenatge = (Button) findViewById(R.id.btn_percentage);

        power1 = (Button) findViewById(R.id.btn_power2);
        power2 = (Button) findViewById(R.id.btn_power1);


        txtresult = (TextView) findViewById(R.id.txt_result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data1 = Double.parseDouble(input1.getText().toString());
                data2 = Double.parseDouble(input2.getText().toString());


                result = data1 + data2;

                txtresult.setText(Double.toString(result));


            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data1 = Double.parseDouble(input1.getText().toString());
                data2 = Double.parseDouble(input2.getText().toString());

                result2 = data1 - data2;

                txtresult.setText(Double.toString(result2));

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data1 = Double.parseDouble(input1.getText().toString());
                data2 = Double.parseDouble(input2.getText().toString());

                result3 = data1 * data2;

                txtresult.setText(Double.toString(result3));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data1 = Double.parseDouble(input1.getText().toString());
                data2 = Double.parseDouble(input2.getText().toString());

                result4 = data1 / data2;

                txtresult.setText(Double.toString(result4));
            }
        });
        percenatge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data1 = Double.parseDouble(input1.getText().toString());
                data2 = Double.parseDouble(input2.getText().toString());

                result5 = (data1 / 100) * data2;

                txtresult.setText(Double.toString(result5));

            }
        });

        power1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data1 = Double.parseDouble(input1.getText().toString());
                data2 = Double.parseDouble(input2.getText().toString());

                result6 = Math.pow(data1, data2);

                txtresult.setText(Double.toString(result6));

            }
        });
        power2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data1 = Double.parseDouble(input1.getText().toString());
                data2 = Double.parseDouble(input2.getText().toString());

                result7 = Math.pow(data2, data1);

                txtresult.setText(Double.toString(result7));

            }
        });


    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Return true to display menu
        return true;
    }




    public boolean onOptionsItemSelected(MenuItem item) {


                switch (item.getItemId()) {
                    case R.id.about:
                        startActivity(new Intent(this, AboutusActivity.class));
                        return true;

                    case R.id.shareapp :
                        sharingButton();


                    default:
                        return super.onOptionsItemSelected(item);
                }
        }

    private void sharingButton(){
        Intent intent = new Intent(android.content.Intent.ACTION_SEND);
        startActivity(intent);
    }



  }

