package io.github.XenCSE;


import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Xenia {
    public static void main(String[] args) {
        int[] arrayOfInts= {5,4,7,2};
        String[] arrayOfStrings = {"Hello, My Name Is Xenia, Good Bye"};

        int i = 0;
        while (i < arrayOfInts.length) {
            arrayOfInts[i] = 2 * arrayOfInts[i];
            System.out.println(arrayOfInts[i]);
            i++;
        }

        for (int k = 0; k < arrayOfStrings.length; k++) {
            System.out.println(arrayOfStrings[k]);
        }

        for (String phrase : arrayOfStrings) {
            System.out.println(phrase);
        }

        int[] newArrayOfInts = new int[10];
        for (int k = 0; k < newArrayOfInts.length; k++) {
            newArrayOfInts[k] += k;
        }

        for (int value : newArrayOfInts) {
            System.out.println(value);
        }


        i = 50;

        while (i < 10) {
            System.out.println("It worked");
        }

        do {
            System.out.println("It worked");
        } while (i < 10);

//        i = 100;
//        while (i < 110) {
//           System.out.println(i);
//           i++;
//        }
//
//        i = 100;
//        while (i < 110) {
//            System.out.println(++i);
//        }

        i = 100;
        while (i < 110) {
            System.out.println(i++);
        }

        ArrayList<String> dynamicArrayOfStrings = new ArrayList<>();
        dynamicArrayOfStrings.add("My Name Is Xenia");
        dynamicArrayOfStrings.add("My last name is Shang");
        dynamicArrayOfStrings.add("My friend is Moss");

        for (String phrase : dynamicArrayOfStrings) {
            System.out.println(phrase);
        }

        dynamicArrayOfStrings.remove(1);
        for (String phrase : dynamicArrayOfStrings) {
            System.out.println(phrase);
        }

        dynamicArrayOfStrings.replaceAll(s -> s + "!");

        for (String dynamicArrayOfString : dynamicArrayOfStrings) {
            System.out.println(dynamicArrayOfString);
        }
    }
}