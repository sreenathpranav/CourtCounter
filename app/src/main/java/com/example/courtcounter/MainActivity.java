package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void plus_three_a(View view){
        scoreTeamA=scoreTeamA+3;
        displayTeamA(scoreTeamA);
    }
    public void plus_two_a(View view){
        scoreTeamA=scoreTeamA+2;
        displayTeamA(scoreTeamA);
    }

    public void plus_one_a(View view){
        scoreTeamA=scoreTeamA+1;
        displayTeamA(scoreTeamA);
    }


    public void plus_three_b(View view){
        scoreTeamB=scoreTeamB+3;
        displayTeamB(scoreTeamB);
    }
    public void plus_two_b(View view){
        scoreTeamB=scoreTeamB+2;
        displayTeamB(scoreTeamB);
    }
    public void plus_one_b(View view){
        scoreTeamB=scoreTeamB+1;
        displayTeamB(scoreTeamB);
    }

    public void reset(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }



    public void displayTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}