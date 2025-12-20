package com.practice.java._6javaoopsbasic;

public class _5SuperKeyword {

    public static void main(String[] args) {

        SuperParent superParent = new SuperChild();
        SuperChild superChild = (SuperChild) superParent;

        //Result be similar to both call as they are referring to same object
        superParent.test();
        superChild.test();

        superChild.name = "child";
        superParent.name = null;

        superParent.test();
        superChild.test();

        /*SuperChild superChild1 = (SuperChild) new SuperParent();// It will give class cast exception
        superChild1.test();*/
    }

}


class SuperParent {

    String name = "SuperParent"; 

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
        if (super.name == null && name != null) {
            super.name = name;
            System.out.println(this + "  " + name + " name");
            System.out.println(this + "  SuperChild test");
        } else {
            if (super.name != null && super.name.equals(name)) {
                System.out.println(this + "  Super " + super.name + " name");
            } else {
                System.out.println(this + "  " + super.name + " name");
            }
            System.out.println(this + "  SuperParent test");
        }
    }
}