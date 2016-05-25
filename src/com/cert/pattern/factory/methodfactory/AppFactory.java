package com.cert.pattern.factory.methodfactory;

import com.cert.pattern.factory.App;
import com.cert.pattern.factory.TextProcessor;
import com.cert.pattern.factory.WordProcessor;

/**
 * Created by sridhar on 9/5/16.
 */
public abstract class AppFactory {
    public App getInstance(){
        App app = getApp();
        return app;
    }

    public abstract App getApp();

}
