package com.practice.java._6javaoopsbasic;

public class _2JavaObjectCloning implements Cloneable {

    int rollNo;
    String name;

    _2JavaObjectCloning(int rollNo, String name) {

        this.rollNo = rollNo;
        this.name = name;
    }

    public static void main(String[] args) {

        try {
            _2JavaObjectCloning s1 = new _2JavaObjectCloning(1, "nameOne");

            _2JavaObjectCloning s2 = (_2JavaObjectCloning) s1.clone();

            System.out.println(s1.rollNo + " " + s1.name);
            System.out.println(s2.rollNo + " " + s2.name);
        } catch (CloneNotSupportedException exception) {
        }
    }

    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
