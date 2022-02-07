package data.types;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //1
        String testName = " My name is <Some>";
        System.out.println("Please enter name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String newName = testName.replaceAll("<Some>", name);
        System.out.println("Original name" + testName);
        System.out.println(" New name" + newName);
        //2
        System.out.println("Enter string");
        String test = scanner.nextLine();
        System.out.println("Other string");
        String test2 = scanner.nextLine();
        if (test.equals(test2)) {
            System.out.println(test + " Test is equal with " + test2);
        } else {
            System.out.println(test + " Not equal with " + test2);
        }
        //3
        String [] stringArray = testName.split(" ");
        System.out.println( "\""+ testName + "\"" + " has " + stringArray.length + " words" );

        //4
        String string1 = "Name";
        String string2 = "Second name";
        String string3 = "Third name";
        System.out.println(string1 + " " + " " + string2 + " " + string3);


        }
    }

