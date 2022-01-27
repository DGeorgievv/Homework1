package automation.qa;

import java.util.Scanner;

public class FirstAtempt {
    public static void main(String[] args) {
        //whrites the text in the console
        System.out.println("Please enter your first name");
//Scanner is class for reding values from the console
        Scanner scanner = new Scanner(System.in);
//a string variable that will store the value enter from user
        String firstname = scanner.next();

        System.out.println("Your name is: " + firstname);

        System.out.println("Please enter your age");
        //integer variable that will store the age entered
        int userAge = scanner.nextInt();

        System.out.println("Your name is: " + firstname + "/nYour age is:" + userAge);

        if (userAge >= 18) {
            System.out.println(firstname + "can drink");
        }
        if (userAge < 18) {
            System.out.println(firstname + "Dont drink");
        }
        if (userAge >= 68) {
            System.out.println(firstname + "Too old");


        }
    }
}