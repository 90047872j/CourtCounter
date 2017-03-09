package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 //       displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void scored3(View view) {

        if (view == findViewById(R.id.aButton3)){
            scoreTeamA += 3;
            displayForTeamA(scoreTeamA);
        } else scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void scored2(View view) {
        if (view == findViewById(R.id.aButton2)){
            scoreTeamA += 2;
            displayForTeamA(scoreTeamA);
        } else scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void scored1(View view) {
        if (view == findViewById(R.id.aButtonFT)){
            scoreTeamA ++;
            displayForTeamA(scoreTeamA);
        } else scoreTeamB ++;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}
