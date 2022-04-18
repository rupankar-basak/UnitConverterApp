package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button ;
//private TextView textView;
private TextView textView2;
private EditText editText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
       // textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        editText=findViewById(R.id.editText);
 /*       button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Action performed when the button is clicked
                Toast.makeText(MainActivity.this, "Weight Converted!!", Toast.LENGTH_SHORT).show();
                String s=editText.getText().toString();
                int kg=Integer.parseInt(s);
                double pound=2.205*kg;
                textView2.setText("The corresponding value in Pounds is "+pound);
            }
        });
*/

    }
    public void calculate(View view)
    {
        String s=editText.getText().toString();
        int kg=Integer.parseInt(s);
        float pound=2.205*kg;
        textView2.setText("The corresponding value in Pounds is "+pound);
    }
}