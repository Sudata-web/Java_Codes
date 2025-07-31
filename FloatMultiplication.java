import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing Float Multiplication");
        System.out.println("Please enter first decimal number: ");
        double first = input.nextDouble();
        System.out.println("Now, please enter second number: ");
        double second = input.nextDouble();

        double mul = first * second;
        System.out.println("\n Result is: " + mul);

        System.out.println("\n Result is: "+ (first+second));   //String addition()

    }
}


//Qs:--
//Create Program to calculate product of two floating point no?

//output:---
//We are doing Float Multiplication
//Please enter first decimal number:
//        1.5
//Now, please enter second number:
//        2.5
//
//Result is: 3.75