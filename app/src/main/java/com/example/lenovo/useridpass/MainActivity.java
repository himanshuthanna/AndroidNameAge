 package com.example.lenovo.useridpass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
 import android.view.View;

import static android.widget.Toast.makeText;


 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayMsg(View view){
        EditText uname;
        EditText uage;
        uname=(EditText)findViewById(R.id.name);
        uage=(EditText)findViewById(R.id.Age);
        String name=uname.getText().toString();
        int age=Integer.parseInt(uage.getText().toString());
        String message=name+" is "+age+" yearsold";
        Toast toast=makeText(getApplicationContext(),message,Toast.LENGTH_LONG);
        toast.show();

    }
}
