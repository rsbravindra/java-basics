package com.learnig.basics.Interface.marker;

// marker interface functionality to mark a class as cloneable if not implemented then the class is not cloneable which will throw exception
public class CloneableDemo {
    public static void main(String[] args) {

        Demo1 d = new Demo1();
        try {
            Object o = d.clone();
            System.out.println(o);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}

class Demo1 implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Cloning the object");
        return super.clone();
    }
}