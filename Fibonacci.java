import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Fibonacci series");
        System.out.println("Please enter the number upto which series has to be printed: ");
        int num = input.nextInt();
        System.out.println("here is the fibonacci series");
        printFibonacci(num);

    }
    public static void printFibonacci(int num) {
        if (num < 1) return;
        System.out.println("0");
        if (num == 0) return;
        System.out.println("1");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;

        }

    }
}


//output:---
//Welcome to Fibonacci series
//Please enter the number up to which series has to be printed:
//12
//here is the fibonacci series
//0
//1
//1
//2
//3
//5
//8
