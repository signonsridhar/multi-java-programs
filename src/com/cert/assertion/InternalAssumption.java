package com.cert.assertion;

/**
 * Created by sridhar on 6/2/16.
 */
enum State {ON, OFF};
public class InternalAssumption {
    private void machineState(State state) {
        switch (state) {
            case ON: System.out.println("state is ON");
                break;
            case OFF: System.out.println("state is OFF");
                break;
        }   
    }

    public static void main(String[] args) {
        new InternalAssumption().machineState(State.OFF);
    }
}
