package com.practice.java._6javaoopsbasic;

/*
*
    Don't provide "setter" methods — methods that modify fields or objects referred to by fields.
    Make all fields final and private.
    Don't allow subclasses to override methods. The simplest way to do this is to declare the class as final.
    * A more sophisticated approach is to make the constructor private and construct instances in factory methods.
    If the instance fields include references to mutable objects, don't allow those objects to be changed:
    Don't provide methods that modify the mutable objects.
    Don't share references to the mutable objects.
    * Never store references to external, mutable objects passed to the constructor;
    * if necessary, create copies, and store references to the copies.
    * Similarly, create copies of your internal mutable objects when necessary to avoid returning the originals in your methods.
*/
public final class _9ImmutableClass {

    private final String name;
    private final int regNo;

    public _9ImmutableClass() {
        this.name = "name";
        this.regNo = 1;
    }

    public _9ImmutableClass(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    public static void main(String[] args) {

        _9ImmutableClass immutableClass = new _9ImmutableClass();
        //immutableClass.name = "rename";// Can't assign value to already initialized final non-static variable

        _9ImmutableClass immutableClass1 = new _9ImmutableClass("new", 2);
        //immutableClass1.name = "renew";// Can't assign value to already initialized final non-static variable
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }
}
