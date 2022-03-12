package com.example.myapplication;
import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("0tKkjamJ00Z1ArDp3wddqGjM7KsW1TeoupFezBTW")
                .clientKey("anlE8x6ehKdKu5yf7tr1dzZiDAcHCdGq0AjpBSzO")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
