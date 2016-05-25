package com.cert.serialization;

import java.io.Serializable;

/**
 * Created by sridhar on 5/4/16.
 */
public class Box implements Serializable {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString(){
        return "Box height :"+ height + " width :" + width;
    }
}
