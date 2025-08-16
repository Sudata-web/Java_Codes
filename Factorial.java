import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to factorial");
        System.out.println("Please enter your number");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial is: " + fact);
    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
        long fact =1;
        int i = 2;
        while (i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
}


//output---
//Welcome to factorial
//Please enter your number
//5
//Factorial is: 120
