package com.vmarian;
import java.lang.*;

public class GeeksBuffer {

    public static void main(String[] args)
    {
        StringBuffer strBuffer = new StringBuffer("Salut");
        System.out.println(strBuffer);
        strBuffer.append(" Alex");
        System.out.println(strBuffer);
        strBuffer.replace(0, 5, "Privet");
        System.out.println(strBuffer);
        strBuffer.delete(3, 5);
        System.out.println(strBuffer);
        strBuffer.insert(4,"(aici au mai fost 'e' si 't')");
        System.out.println(strBuffer);
        // returns the current capacity of the String buffer i.e. 16 +
        System.out.println("capacity=" +strBuffer.capacity());
    }
}
