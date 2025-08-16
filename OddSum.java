import java.util.Scanner;

public class OddSum {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.println("Please enter your number");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("OddSum till " + num + "is : " + sum );
    }

    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += 1;
            i += 2;
        }
        return sum;
    }
}


//output:---
//Welcome to Odd Sum
//Please enter your number
//657
//OddSum till 657is : 329
