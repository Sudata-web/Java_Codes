import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to GCD(Greatest Common Divisor)");
        System.out.println("Please enter your number");
        int first = input.nextInt();
        System.out.println("Please enter your number");
        int second = input.nextInt();
        int gcd = gcd(first, second);
        System.out.println("GCD of the number is: " + gcd);

    }

    public static int gcd(int num1 , int num2) {
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
        }
            i++;
        }
        return gcd;
    }
    public static int least(int num1, int num2){
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}



//output:---
//Welcome to GCD(Greatest Common Divisor)
//Please enter your number
//12
//Please enter your number
//56
//GCD of the number is: 4

