package sample.nanorep.com.nanorepsample;

import android.app.Application;

import com.nanorep.nanoclient.Nanorep;

/**
 * Created by noat on 23/11/2016.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Nanorep.getInstance().init(getApplicationContext(), "nanorep", "English");
    }
}
