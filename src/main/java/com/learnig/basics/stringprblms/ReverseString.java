package com.learnig.basics.stringprblms;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

        // without using builtin methods
        String rev1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev1 = rev1 + str.charAt(i);
        }
        System.out.println(rev1);
    }
}
