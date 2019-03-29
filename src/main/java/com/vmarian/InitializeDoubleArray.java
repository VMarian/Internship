package com.vmarian;

public class InitializeDoubleArray {
    public static void main(String[] args) {
        Double[] DoubleArray = {25.21, 24.23, 34.35};

        System.out.print("Print value of double:");
        for (double d : DoubleArray) {
            System.out.print(" " + d + " ");
        }
    }
}