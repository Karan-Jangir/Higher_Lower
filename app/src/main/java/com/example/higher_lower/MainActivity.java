package com.example.higher_lower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
  int n;
  public void makeToast(String string)
  {
      Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
  }

    public void Guess(View view)
    {
        EditText num=findViewById(R.id.editTextNumber);
        Log.i("Number",num.getText().toString());
        int number=Integer.parseInt(num.getText().toString());
        if(number>n)
        {
            makeToast("Lower");
        }
        else if(number<n)
        {
            makeToast("Higher!");
        }
        else
           makeToast("Thats correct!! Great!!");
//        Random rand=new Random();
//        n=rand.nextInt(20)+1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
         n=rand.nextInt(20)+1;
    }
}