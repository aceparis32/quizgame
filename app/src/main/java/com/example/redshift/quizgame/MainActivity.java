package com.example.redshift.quizgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int i = 0;
    int j = 0;
    TextView SkorAtas, SkorBawah, QuestionAtas, QuestionBawah;

    /*Buat Bank soalnya*/
    String[][] BankSoal = new String[][]{
            {"1 + 1 = 2","Yes"},
            {"2 + 1 = 3","Yes"},
            {"3 + 4 = 5","No"},
            {"7 + 2 = 9","Yes"},
            {"5 - 1 = 2","No"},
            {"9 x 4 = 30","No"},
            {"9 / 3 = 3","Yes"},
            {"5 - 1 + 2 = 4","No"},
            {"2 + 4 = 6","Yes"},
            {"100 / 2 = 55","No"},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button NoAtas;
        Button YesAtas;
        Button NoBawah;
        Button YesBawah;
        Button Mulai;

        /*Button*/
        NoAtas = (Button)findViewById(R.id.no_atas);
        YesAtas = (Button)findViewById(R.id.yes_atas);
        NoBawah = (Button)findViewById(R.id.no_bawah);
        YesBawah = (Button)findViewById(R.id.yes_bawah);
        Mulai = (Button)findViewById(R.id.mulai);

        /*TextView*/
        SkorAtas = (TextView)findViewById(R.id.skor_atas);
        SkorBawah = (TextView)findViewById(R.id.skor_bawah);
        QuestionAtas = (TextView)findViewById(R.id.question_atas);
        QuestionBawah = (TextView)findViewById(R.id.question_bawah);

        Mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuestionAtas.setText(BankSoal[0][0]);
                QuestionBawah.setText(BankSoal[0][0]);
            }
        });

        /*kalo mau gampang pas masukin di parameternya ketik "OnClickListener" terus enter*/
        YesAtas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                /*Toast.makeText(getApplicationContext(), "Yes Top", Toast.LENGTH_SHORT).show();*/
                updateSoalAtas("Yes");
                /*Log.v("jawaban", "Yes");*/

            }
        });

        NoAtas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                /*Toast.makeText(getApplicationContext(), "No Top", Toast.LENGTH_SHORT).show();*/
                updateSoalAtas("No");
                /*Log.v("jawaban", "No");*/
            }
        });

        NoBawah.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                /*Toast.makeText(getApplicationContext(), "No Bottom", Toast.LENGTH_SHORT).show();*/
                updateSoalBawah("No");
                /*Log.v("jawaban", "No");*/
            }
        });

        YesBawah.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                /*Toast.makeText(getApplicationContext(), "Yes Bottom", Toast.LENGTH_SHORT).show();*/
                updateSoalBawah("Yes");
                /*Log.v("jawaban", "Yes");*/
            }
        });


    }

    public void updateSoalAtas(String message){
        QuestionAtas.setText(BankSoal[i][0]);
        if(message.equals(BankSoal[i][1])){
            Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_SHORT).show();
            i++;
        }else{
            Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_SHORT).show();
            i++;
        }
    }

    public void updateSoalBawah(String message){
        QuestionBawah.setText(BankSoal[j][0]);
        if(message.equals(BankSoal[j][1])){
            Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_SHORT).show();
            j++;
        }else{
            Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_SHORT).show();
            j++;
        }
    }
}
