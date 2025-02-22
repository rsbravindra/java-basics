package com.learnig.basics.Interface.nested;

public class NestedInterfaceDemo {
    public static void main(String[] args) {
        SampleDemo1 sampleDemo1 = new SampleDemo1();
        sampleDemo1.m1();
        sampleDemo1.m2();
    }
}

class SampleDemo {
    interface A{
        void m1();
    }
    interface B extends A{
        void m2();
    }
}

class SampleDemo1 implements SampleDemo.B {

    @Override
    public void m2() {
        System.out.println("M2");
    }

    @Override
    public void m1() {
        System.out.println("M2");
    }
}
