package com.vmarian;


import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Mouse {

    public static void main(String[] args) {

        String msg = "1 5 s 6 44567 . g 5fsfes";
        String digits = msg.replaceAll("[^\\d ]", "");
        String[] arrayOfStrings = StringUtils.split(digits);


        List<Integer> numbers = new ArrayList<>();
        List<String> wrongStrings = new ArrayList<>();

        String exMess = "";

        for (String string : arrayOfStrings) {

            if (StringUtils.isNumeric(string)) {
                numbers.add(Integer.valueOf(string));
            }


        }


        System.out.println(numbers);
//        System.err.println("Strings \"" + wrongStrings + "\" could not be converted to int.");
//        System.err.println(exMess);
    }

}
