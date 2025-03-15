package com.practice.java._8javapolymorphism;

public class _3CovariantReturnType {

    public static void main(String[] args) {

        ParentCovariant pc = new ParentCovariant();
        System.out.println(pc.getClass().getName() + " " + pc.getClass().getSuperclass().getName());
        pc.get().print();
        ChildCovariant cc = new ChildCovariant();
        System.out.println(cc.getClass().getName() + " " + cc.getClass().getSuperclass().getName());
        cc.get().print();
        ChildOfChildCovariant ccc = new ChildOfChildCovariant();
        System.out.println(ccc.getClass().getName() + " " + ccc.getClass().getSuperclass().getName());
        ccc.get().print();

    }
}

class ParentCovariant {

    ParentCovariant get() {

        return this;
    }

    void print() {

        System.out.println("From ParentCovariant");
    }
}

class ChildCovariant extends ParentCovariant {

    @Override
    ChildCovariant get() {

        return this;
    }


    void print() {

        System.out.println("From ChildCovariant");
    }
}


class ChildOfChildCovariant extends ChildCovariant {

    @Override
    ChildOfChildCovariant get() {

        return this;
    }

    @Override
    void print() {

        System.out.println("From ChildOfChildCovariant");
    }
}