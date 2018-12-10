package com.example.asus.lab_2;

import android.content.Intent;
import android.icu.util.IslamicCalendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Fourth extends AppCompatActivity {
    Button buttonAdd, buttonSub, buttonDivision,buttonMul,buttonEqual;
    EditText crunchifyEditText,crunchifyEditText1,crunchifyEditText2;
    float mValueOne, mValueTwo;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;
    String multi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        buttonAdd = (Button) findViewById(R.id.btnAdd);
        buttonSub = (Button) findViewById(R.id.btnSub);
        buttonMul = (Button) findViewById(R.id.btnMul);
        buttonDivision = (Button) findViewById(R.id.btnDiv);
        buttonEqual = (Button) findViewById(R.id.btnEqual);
        crunchifyEditText1 = (EditText) findViewById(R.id.txtNum);
        crunchifyEditText = (EditText) findViewById(R.id.txtNum1);
        crunchifyEditText2 = (EditText) findViewById(R.id.txtNum2);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "" );
                    crunchifyAddition = true;
                   // crunchifyEditText.setText(null);


                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                mSubtract = true;
                //crunchifyEditText.setText(null);

            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyMultiplication = true;
               // crunchifyEditText.setText(null);

            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                crunchifyDivision = true;
               // crunchifyEditText.setText(null);

            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyEditText2.getText() + "");

                if (crunchifyAddition == true) {
                    crunchifyEditText1.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                    Intent intent = new Intent(Fourth.this,Fifty.class);
                    intent.putExtra("X",crunchifyEditText.getText().toString());
                    intent.putExtra("Y",crunchifyEditText2.getText().toString());
                    String str = "+";
                    intent.putExtra("Z",str);
                    intent.putExtra("CAL",crunchifyEditText1.getText().toString());
                    startActivity(intent);
                }

                if (mSubtract == true) {
                    crunchifyEditText1.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                    Intent intent = new Intent(Fourth.this,Fifty.class);
                    intent.putExtra("X",crunchifyEditText.getText().toString());
                    intent.putExtra("Y",crunchifyEditText2.getText().toString());
                    String str = "-";
                    intent.putExtra("Z",str);
                    intent.putExtra("CAL",crunchifyEditText1.getText().toString());
                    startActivity(intent);
                }

                if (crunchifyMultiplication == true) {
                    crunchifyEditText1.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                    Intent intent = new Intent(Fourth.this,Fifty.class);
                    intent.putExtra("X",crunchifyEditText.getText().toString());
                    intent.putExtra("Y",crunchifyEditText2.getText().toString());
                    String str = "*";
                    intent.putExtra("Z",str);
                    intent.putExtra("CAL",crunchifyEditText1.getText().toString());
                    startActivity(intent);
                }

                if (crunchifyDivision == true) {
                    crunchifyEditText1.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                    Intent intent = new Intent(Fourth.this,Fifty.class);
                    intent.putExtra("X",crunchifyEditText.getText().toString());
                    intent.putExtra("Y",crunchifyEditText2.getText().toString());
                    String str = "/";
                    intent.putExtra("Z",str);
                    intent.putExtra("CAL",crunchifyEditText1.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}
