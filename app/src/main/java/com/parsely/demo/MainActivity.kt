package com.parsely.demo

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import com.parsely.parselyandroid.ParselyTracker

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        ParselyTracker.init(
            // Replace the value below with your actual Parsely public site id (eg "example.com")
            siteId = "<site id>",
            context = this
        )

        findViewById<Button>(R.id.button_track_page_view).setOnClickListener {
            ParselyTracker.sharedInstance().trackPageview(
                url = "https://example.com",
            )
        }

        findViewById<Button>(R.id.button_start_engagement).setOnClickListener {
            ParselyTracker.sharedInstance().startEngagement(
                url = "https://example.com",
            )
        }

        findViewById<Button>(R.id.button_stop_engagement).setOnClickListener {
            ParselyTracker.sharedInstance().stopEngagement()
        }
    }
}
