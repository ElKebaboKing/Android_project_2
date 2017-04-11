package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare variables for keeping score
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    // Add three points for team A
    public void addThreeForTeamA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    // Add two points for team A
    public void addTwoForTeamA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    // Add one point for team A
    public void addOneForTeamA(View view){
        scoreTeamA ++;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // Add three points for team B
    public void addThreeForTeamB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    // Add two points for team B
    public void addTwoForTeamB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    // Add one point for team B
    public void addOneForTeamB(View view){
        scoreTeamB ++;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    // Resets the scores of both teams
    public void resetScores(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
