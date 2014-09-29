package com.dubu.biopyApp;

import android.app.Application;
import com.parse.Parse;

/**
 * User: kingkingdubu
 * Date: 14. 9. 30
 * Time: 오전 1:23
 */
public class BioApplication  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // set parse init
        Parse.initialize(this, "8Ky2BPjaxF9IB0E0IDkHOFwVsx14t8EVCdNmGS29", "vEiDkbKdbQyob0HSaWEvmpH5WOEY7jBhXmeMJzVz");

    }
}
