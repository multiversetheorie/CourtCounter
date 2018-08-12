package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the "+3 points" button is clicked.
     */
    public void threepointer(View view) {
        int quantity = 3;
        displayForTeamA(quantity);
    }

    /**
     * This method is called when the "+2 points" button is clicked.
     */
    public void twopointer(View view) {
        int quantity = 2;
        displayForTeamA(quantity);
    }

    /**
     * This method is called when the "+3 points" button is clicked.
     */
    public void freethrow(View view) {
        int quantity = 1;
        displayForTeamA(quantity);
    }
}
