import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of LeftShift Operator\n");
        System.out.println("Please enter your number");
    int num = input.nextInt();

    int result = num << 4;
        System.out.println("Your result is: " + result);
    }
}


//Output:--
//Welcome to showcase of LeftShift Operator
//
//Please enter your number    //*2
//6
//Your result is: 96