package com.example.redshift.quizgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button NoAtas;
        Button YesAtas;
        Button NoBawah;
        Button YesBawah;
        TextView SkorAtas, SkorBawah, QuestionAtas, QuestionBawah;

        NoAtas = (Button)findViewById(R.id.no_atas);
        YesAtas = (Button)findViewById(R.id.yes_atas);
        NoBawah = (Button)findViewById(R.id.no_bawah);
        YesBawah = (Button)findViewById(R.id.yes_bawah);
        SkorAtas = (TextView)findViewById(R.id.skor_atas);
        SkorBawah = (TextView)findViewById(R.id.skor_bawah);
        QuestionAtas = (TextView)findViewById(R.id.question_atas);
        QuestionBawah = (TextView)findViewById(R.id.question_bawah);

        YesAtas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Yes Top", Toast.LENGTH_SHORT).show();
            }
        });

        NoAtas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "No Top", Toast.LENGTH_SHORT).show();
            }
        });

        NoBawah.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "No Bottom", Toast.LENGTH_SHORT).show();
            }
        });

        YesBawah.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Yes Bottom", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
