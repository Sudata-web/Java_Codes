import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of NOT/Compliment Operator\n");
        System.out.println("Please enter your number");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your result is: " + result);
    }
}



//output:---
//Welcome to showcase of NOT/Compliment Operator
//Please enter your number
//12
//Your result is: -13
