 package com.practice.java._6javaoopsbasic;

public class _3StaticKeyword {

    public static void main(String[] args) {

        Student s1 = new Student(1, "ramesh");
        Student s2 = new Student(2, "suresh");
        Student s3 = new Student(3, "rakesh");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        Student.change();

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}

class Student {
    static String college = "ITGGU";
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void change() {
        college = "ITGGVV";
    }

    void displayDetails() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}