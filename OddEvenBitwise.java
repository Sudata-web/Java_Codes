import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd/Even Calculator");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.println("Your number is Odd");
        }else {
            System.out.println("Your number is Even");
        }
    }
}



//output:---
//Welcome to Odd/Even Calculator
//Please enter your number:
//25
//Your number is Odd


//Welcome to Odd/Even Calculator
//Please enter your number:
//12
//Your number is Even