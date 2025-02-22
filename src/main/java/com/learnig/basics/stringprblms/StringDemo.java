package com.learnig.basics.stringprblms;

public class StringDemo {
    public static void main(String[] args) {
        String str = "I am a Software Engineer";
        System.out.println(str);

        String strTest = str.replace("I", "J");

        String newString = str.replace("Engineer", "Developer");
        System.out.println("After replace : " + newString);

        String newString1 = str.replaceFirst("am", "m");
        System.out.println("After replace : " + newString1);

        String newString3 = str.formatted("Hello %s", "World");
        System.out.println(newString3);


        StringBuilder sbf = new StringBuilder(str);
        sbf.insert(4, "aaaaaaaaa");
        System.out.println(sbf);
        sbf.repeat("I ", 6);
        System.out.println(sbf);

        StringBuffer sbr = new StringBuffer(str);



    }
}
