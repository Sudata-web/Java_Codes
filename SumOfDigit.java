import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Sum Of Digit");
        System.out.println("Please enter your number");
        int num = input.nextInt();
        int sum = sumOfDigit(num);
        System.out.println("Sum of Digit is: " + sum);

    }
    public static int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;

        }
        return sum;
    }
}


//output:---
//Welcome to Sum Of Digit
//Please enter your number
//968
//Sum of Digit is: 23
