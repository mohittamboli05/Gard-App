package com.example.gardxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        inflateFragment(new UpcomingEventsFragment());

        // Bind Tab Layout
        TabLayout tabLayout = findViewById(R.id.tabs);

        // Add tabs to tabLayout
        TabLayout.Tab upcomingTab = tabLayout.newTab();
        upcomingTab.setText("Upcoming Events");
        TabLayout.Tab pastTab = tabLayout.newTab();
        pastTab.setText("Past Events");
        tabLayout.addTab(upcomingTab);
        tabLayout.addTab(pastTab);

        // Add tab change listener
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Set content of the selected tab
                setTabContent(tab);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    private void setTabContent(TabLayout.Tab tab) {
        switch (tab.getText().toString()) {
            case "Upcoming Events":
                inflateFragment(new UpcomingEventsFragment());
                break;
            case "Past Events":
                inflateFragment(new PastEventsFragment());
                break;
        }
    }

    void inflateFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}
