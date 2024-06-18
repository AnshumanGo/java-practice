package com.practice.java._6javaoopsbasic;

public class _4ThisKeyword {

    private int id;

    _4ThisKeyword() {
    }

    _4ThisKeyword(_4ThisKeyword thisKeyword) {

        //this used to refer current class no arg constructor
        this();
        //this used to refer current class instance method
        this.setId(thisKeyword);
    }

    public static void main(String[] args) {

        _4ThisKeyword thisKeywordOne = new _4ThisKeyword();
        thisKeywordOne.id = 1;

        //this used as argument in the constructor call.
        _4ThisKeyword thisKeywordTwo = new _4ThisKeyword(thisKeywordOne.getThisKeywordObject());
        thisKeywordTwo.displayDetails(thisKeywordTwo);
        thisKeywordTwo.id=2;
        thisKeywordTwo.displayDetails(thisKeywordTwo);
        thisKeywordTwo.displayDetails(thisKeywordOne);
    }

    void setId(_4ThisKeyword thisKeyword) {

        //this used to refer current class instance variable
        this.id = thisKeyword.id;
    }

    //this is used as argument to method
    void displayDetails(_4ThisKeyword thisKeyword) {

        System.out.println(thisKeyword.id);
    }

    //this is used to return current class instance
    _4ThisKeyword getThisKeywordObject() {

        return this;
    }
}
