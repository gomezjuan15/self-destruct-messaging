package com.treehouse.gaara.selfdestructmessaging;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Gaara on 1/25/2015.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "FGgIIOAC6owh8g7PNGwyUMLzXYxLTu03yELovirM", "vGfh3itGgO6sfkfLRyXith5Fpns9OIg7AuBhOd3N");
    }
}
