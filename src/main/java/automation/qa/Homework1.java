package automation.qa;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Please enter your First name and Last name");
        Scanner scanner = new Scanner(System.in);

        String firstname = scanner.next();
        String lastname = scanner.next();

        System.out.println("Your first and lasnt name are" + " " + firstname + " " + lastname);

        System.out.println("What is your hobby");
        String hobby = scanner.next();

        System.out.println("Your favorite hobby is" + " " + hobby +" and it's great" + " " + firstname + " " + lastname);

    }
}


