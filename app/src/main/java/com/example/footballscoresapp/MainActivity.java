package com.example.footballscoresapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.footballscoresapp.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    int scoreTeamB = 0;

    int foulsTeamA = 0;

    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PointsA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void foulsA(View v) {
        foulsTeamA = foulsTeamA + 1;
        displayForFoulsTeamA(foulsTeamA);
    }


    public void PointsB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void foulsB(View v) {
        foulsTeamB = foulsTeamB + 1;
        displayForFoulsTeamB(foulsTeamB);
    }



    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForFoulsTeamA(foulsTeamA);
        displayForFoulsTeamB(foulsTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(this.scoreTeamA));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(this.scoreTeamB));
    }

    private void displayForFoulsTeamA(int foulsTeamA) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(this.foulsTeamA));
    }

    private void displayForFoulsTeamB(int foulsTeamB) {
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(this.foulsTeamB));
    }
}


