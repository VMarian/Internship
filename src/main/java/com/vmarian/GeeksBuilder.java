package com.vmarian;

import java.lang.*;

public class GeeksBuilder {

    public static void main(String[] args) {

        StringBuilder strBuilder = new StringBuilder("Core ");
        strBuilder.append(" JavaGuru ");
        System.out.println(strBuilder);
        strBuilder.append( 101);
        System.out.println(strBuilder);
        strBuilder.replace(0, 8, "Record Aj");
        System.out.println(strBuilder);
        strBuilder.insert(0, "Play ");
        System.out.println(strBuilder);
        // returns the current capacity of the String buffer i.e. 16 +
        System.out.println("capacity=" +strBuilder.capacity());
    }
}