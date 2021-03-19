package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VKf3qM2ihQ6kf9BOIwtIhAprCHN8m4UKeyu1SvbZ")
                .clientKey("RW3IvmdEUVGi1hYtiP3OTOIWSuCylnWP7C6oiuS9")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
