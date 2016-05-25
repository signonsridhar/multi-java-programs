package com.cert.pattern.factory.simplefactory;

import com.cert.pattern.factory.App;
import com.cert.pattern.factory.TextProcessor;
import com.cert.pattern.factory.WordProcessor;

/**
 * Created by sridhar on 9/5/16.
 */
public class AppFactory {
    public static App getInstance(String fileExtn){
        App app = null;
        if (fileExtn.equals("doc")){
            app = new WordProcessor();
        } else {
            app = new TextProcessor();
        }
        return app;
    }
}
