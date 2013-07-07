package com.pivotallabs;

import android.widget.Button;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class HomeActivityTest {
    private HomeActivity activity;
    private Button flagStatsButton;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(HomeActivity.class).create().get();
        flagStatsButton = (Button) activity.findViewById(R.id.flag_stats_button);
    }

    @Test
    public void shouldHaveFlagStatsButton() throws Exception {
        assertThat((String) flagStatsButton.getText(), equalTo("Flag Stats"));
    }
}
