package com.example.piotr.guessnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;

    public void generateRandom(){
        Random rand = new Random();
        n = rand.nextInt(20) + 1;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view){
        EditText guessedNumber = (EditText) findViewById(R.id.editText);

        if(n>Integer.parseInt(guessedNumber.getText().toString())){
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
        }else if(n<Integer.parseInt(guessedNumber.getText().toString())){
            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Congrats!", Toast.LENGTH_SHORT).show();
            generateRandom();
        }

    }
}
