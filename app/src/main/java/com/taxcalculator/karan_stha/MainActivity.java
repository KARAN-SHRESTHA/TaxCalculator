package com.taxcalculator.karan_stha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    private EditText etSalary;
    private Button btn;
    private TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSalary = findViewById(R.id.etSalary);
        btn = findViewById(R.id.btn);
        tvOut = findViewById(R.id.tvOut);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (validate()) {
                    int Salary = Integer.parseInt(etSalary.getText().toString());

                    Calculate c = new Calculate();

                    if (Salary <= 200000)
                    {
                        c.setSalary(Salary);
                        double Total = c.Two_lakh();
                        tvOut.setText("Your Yearly Tax is:  " + Total);
                    }
                    else if (Salary <= 350000)
                    {
                        c.setSalary(Salary);
                        double Total = c.Three_half_lakh();
                        tvOut.setText("Your Yearly Tax is:  " + Total);
                    }
                    else if (Salary > 350000)
                    {
                        c.setSalary(Salary);
                        double Total = c.Above_three();
                        tvOut.setText("Your Yearly Tax is:  " + Total);
                    }

                }
            }
        });


    }


    private boolean validate() {
        boolean flag = true;
        Pattern p = Pattern.compile("[-+]?[0-9]");
        Matcher m1 = p.matcher(etSalary.getText().toString());

        //Validating for Empty Text
        if (TextUtils.isEmpty(etSalary.getText().toString())) {
            etSalary.setError("Enter Number");
            etSalary.requestFocus();
            flag = false;
        } else if (!m1.find())    //validating for number only
        {
            Toast.makeText(getApplicationContext(), "Enter a valid number", Toast.LENGTH_LONG).show();
            etSalary.setError("Enter Valid Number");
            etSalary.requestFocus();
            flag = false;
        }
        return flag;
    }


}
