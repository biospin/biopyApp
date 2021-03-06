package com.dubu.biopyApp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.parse.ParseAnalytics;
import com.parse.PushService;

public class MyActivity extends Activity {

    private static String URL = "http://biopy.github.io";
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);

        // set parse push noti
        PushService.setDefaultPushCallback(this, MyActivity.class);
        ParseAnalytics.trackAppOpened(getIntent());

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(URL));
        MyActivity.this.startActivityForResult(intent, 0);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        finish();
    }
}
