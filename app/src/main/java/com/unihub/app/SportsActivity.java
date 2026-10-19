
package com.unihub.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ScrollView;

public class SportsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       ScrollView scrollView = new ScrollView(this);

LinearLayout layout = new LinearLayout(this);
layout.setOrientation(LinearLayout.VERTICAL);
layout.setPadding(24, 24, 24, 24);
layout.setBackgroundColor(Color.rgb(35, 35, 40));

scrollView.addView(layout);

        TextView title = new TextView(this);
        title.setText("UniHub Sports");
        title.setTextSize(28);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        
TextView fixtures = new TextView(this);
fixtures.setText(
    "CAMPUS SPORTS\n\n" +
    "FOOTBALL\n" +
    "Fixtures to be announced\n\n" +
    "BASKETBALL\n" +
    "Fixtures to be announced\n\n" +
    "NETBALL\n" +
    "Fixtures to be announced\n\n" +
    "CHESS\n" +
    "Competitions to be announced\n\n" +
    "BADMINTON\n" +
    "Fixtures to be announced\n\n" +
    "VOLLEYBALL\n" +
    "Fixtures to be announced\n\n" +
    "TABLE TENNIS\n" +
    "Competitions to be announced"
);

        fixtures.setTextSize(18);
        fixtures.setTextColor(Color.WHITE);
        fixtures.setPadding(0, 30, 0, 30);
        layout.addView(fixtures);

        TextView training = new TextView(this);
        training.setText(
            "TRAINING\n\n" +
            "Contact the campus sports team " +
            "for training schedules."
        );
        training.setTextSize(17);
        training.setTextColor(Color.LTGRAY);
        layout.addView(training);

        TextView gym = new TextView(this);
        gym.setText(
            "\nGYM INFORMATION\n\n" +
            "Contact the campus gym for " +
            "opening hours."
        );
        gym.setTextSize(17);
        gym.setTextColor(Color.LTGRAY);
        layout.addView(gym);

        Button backButton = new Button(this);
        backButton.setText("Back to Home");
        layout.addView(backButton);

        backButton.setOnClickListener(v -> finish());

       setContentView(scrollView);
    }
}
