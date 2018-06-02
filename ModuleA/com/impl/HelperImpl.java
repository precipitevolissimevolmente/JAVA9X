package impl;

import util.Helper;

public class HelperImpl implements Helper {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public void hidden() {
        System.out.println("hidden method called...");
    }
}