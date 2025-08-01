import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of RightShift Operator\n");
        System.out.println("Please enter your number");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("Your result is: " + result);
    }
}


//Output:--
//Welcome to showcase of RightShift Operator
//
//Please enter your number
//10
//Your result is: 5
