package com.pivotallabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.pivotallabs.injected.InjectedActivity;
import com.pivotallabs.tracker.RecentActivityActivity;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home_layout);

        findViewById(R.id.press_me_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(NamesActivity.class);
            }
        });
    }

    private void startActivity(Class<? extends Activity> activityClass) {
        Intent intent = new Intent();
        intent.setClassName(getPackageName(), activityClass.getName());
        startActivity(intent);
    }
}
