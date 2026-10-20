package com.unihub.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Main screen layout
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.rgb(35, 35, 40));

        // App title
        TextView title = new TextView(this);
        title.setText("UniHub");
        title.setTextSize(32);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        // Welcome message
        TextView message = new TextView(this);
        message.setText("Your Campus, Connected!");
        message.setTextSize(18);
        message.setTextColor(Color.LTGRAY);
        message.setGravity(Gravity.CENTER);
        layout.addView(message);

        // Sports button
        Button sportsButton = new Button(this);
        sportsButton.setText("Sports");
        layout.addView(sportsButton);

        sportsButton.setOnClickListener(v -> openActivity(v, SportsActivity.class));

        // Cafeteria button
        Button cafeteriaButton = new Button(this);
        cafeteriaButton.setText("Cafeteria");
        layout.addView(cafeteriaButton);

        cafeteriaButton.setOnClickListener(v -> openActivity(v, CafeteriaActivity.class));

        setContentView(layout);
    }

    private void openActivity(View view, Class<?> activityClass) {
        Intent intent = new Intent(view.getContext(), activityClass);
        startActivity(intent);
    }
}
