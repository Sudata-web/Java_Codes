import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

//1.Create a program to input name of the person and respond with "Welcome NAME to Sudata Coding" ?

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter ur name: ");
        String namee = input1.nextLine();
        System.out.println("Welcome to " +namee+ " Coding");


//2.Create a program to add two number?

        Scanner input2 = new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.println("Please enter the first number");
        int firstNum = input2.nextInt();
        System.out.println("Please enter the second number");
        int secondNum = input2.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of Number is: "+sum);
    }

}


//output:---
//Please enter ur name:
//Sudata
//Welcome to Sudata Coding

//Welcome to our Calculator
//Please enter the first number
//14
//Please enter the second number
//25
//Sum of Number is: 39



