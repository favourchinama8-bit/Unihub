
package com.unihub.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class CafeteriaActivity extends Activity {

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
        title.setText("UniHub Cafeteria");
        title.setTextSize(28);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        TextView menu = new TextView(this);
        menu.setText(
            "CAFETERIA MENU\n\n" +

            "BREAKFAST\n" +
            "Tea - Price to be confirmed\n" +
            "Bread - Price to be confirmed\n" +
            "Eggs - Price to be confirmed\n\n" +

            "LUNCH\n" +
            "Rice - Price to be confirmed\n" +
            "Nshima - Price to be confirmed\n" +
            "Chicken - Price to be confirmed\n" +
            "Vegetables - Price to be confirmed\n\n" +

            "OPENING HOURS\n" +
            "To be confirmed by the cafeteria"
        );
        menu.setTextSize(18);
        menu.setTextColor(Color.WHITE);
        menu.setPadding(0, 30, 0, 30);
        layout.addView(menu);

        Button backButton = new Button(this);
        backButton.setText("Back to Home");
        layout.addView(backButton);

        backButton.setOnClickListener(v -> finish());

        setContentView(scrollView);
    }
}
