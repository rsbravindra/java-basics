package com.learnig.basics.Interface.marker;

import com.learnig.basics.Interface.defaultI.A;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Sample s = new Sample(10, "A");

        // Serializing s
        FileOutputStream fos = new FileOutputStream("sample.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        objectOutputStream.writeObject(s);

        // Deserializing s
        FileInputStream fis = new FileInputStream("sample.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        Sample s1 = (Sample) objectInputStream.readObject();
        System.out.println(s1.i + " " + s1.s);

        // close streams
        objectOutputStream.close();
        objectInputStream.close();
    }
}


class Sample implements Serializable {
    int i;
    String s;

    Sample(int i, String s) {
        this.i = i;
        this.s = s;
    }
}