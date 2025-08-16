import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Prime number checker");
        System.out.println("Please enter your number");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime){
            System.out.println("your number is prime");
        }else {
            System.out.println("your number is not prime");
        }

    }
    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i ==0) {
                return false;
            }
            i++;
        }
        return false;
    }
}


//output:---
//Welcome to Prime number checker
//Please enter your number
//5634
//your number is not prime
