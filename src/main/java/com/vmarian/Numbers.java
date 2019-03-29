package com.vmarian;

public class Numbers {
    static byte byteNumber=123;
    static short shortNumber=12345;
    static int intNumber=123456789;
    static long longNumber=123456789_123456789L;
    static char charCaracter='q';
    static float floatNumber=1234565f;
    static double doubleNumber=123456.789;
    static boolean booleanExpresion=false;
    static Integer integer;

    public static void main(String[] args) {
        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);
        System.out.println(charCaracter);
        System.out.println(floatNumber);
        System.out.println(doubleNumber);
        System.out.println(booleanExpresion);
        integer = new Integer(Integer.MAX_VALUE);
        // TODO : Read Boxing and Unboxing

        // TODO: declare and create variable of other class number types



        System.out.println(integer);
    }

}
