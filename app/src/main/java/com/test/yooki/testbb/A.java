package com.test.yooki.testbb;

public abstract class A {
    public abstract String getString(B b);


    public static A createA(final String arg1, final String arg2) {

        return new A() {
            @Override
            public String getString(B b) {
                return b.getTotalString(arg1, arg2);
            }
        };

    }

}
