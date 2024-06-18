package com.practice.java._6javaoopsbasic;

import java.util.Objects;

public class _5SuperKeyword {

    public static void main(String[] args) {

        SuperParent superParent = new SuperChild();
        SuperChild superChild = (SuperChild) superParent;

        //Result be similar to both call as they are referring to same object
        superParent.test();
        superChild.test();

        superChild.name = "child";

        superParent.test();
        superChild.test();

        /*SuperChild superChild1 = (SuperChild) new SuperParent();// It will give class cast exception
        superChild1.test();*/
    }

}


class SuperParent {

    String name;

    //Before constructor statement executes, it executes check for non-static data member and if possible initializes them
    SuperParent() {

        System.out.println("SuperParent Constructor");
    }

    void test() {
        System.out.println("SuperParent test");
    }
}

class SuperChild extends SuperParent {

    String name = "Child";
    SuperChild() {

        super();
        //this(); //Can't call super() and this () at same time in same constructor
        System.out.println("SuperChild Constructor");
    }

    @Override
    void test() {
        if(Objects.equals(super.name, null)){
            super.name = name;
        }
        System.out.println(this + "  " + name + " name");
        System.out.println(this + "  " + "SuperChild test");
    }
}