package com.learnig.basics.stringprblms;


import java.util.*;
import java.util.stream.Stream;

public class ReverseWordsInStr {
    public static void main(String[] args) {
        String str = "Hello World Java";
        System.out.println(str);
        List<String> listStr = new ArrayList<>();
        Collections.addAll(listStr, str.split(" "));
        System.out.println(listStr);
        str = "";
        Collections.reverse(listStr);
        for (String s : listStr) {
            str = str + " " + s;
        }
        System.out.println(str);
        listStr.clear();
        String [] strArr = str.split(" ");

        System.out.println("-------");

        // using list split and join
        List<String> list = new ArrayList<>();

        String str1 = "... Hello ... World ....";
        System.out.println(str1);

        String [] strArr1 = str1.split(" ");
        str1 = "";
        for(String s: strArr1){
            list.add(s);
        }

        //reverse list
        Collections.reverse(list);

        String str2 = String.join(" ", list);
        System.out.println(str2);


        //using stack
        System.out.println("Using Stack");
        Stack<String> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        String str3 = "... Hello ... World ....";
        System.out.println(str3);
        char ch [] = str3.toCharArray();
        for(char c: ch){
            stack.push(String.valueOf(c));
        }

        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
            if(!stack.isEmpty()){
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder);

    }
}
