import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the World of three\n");
        System.out.println("Please enter your first number");
        int first = input.nextInt();
        System.out.println("Now, enter your second number");
        int second = input.nextInt();
        System.out.println("Finally, enter your third number: ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println(first + " is the greatest number");
        }else if(second >=  third){
            System.out.println(second + " is the greatest number");
        }else {
            System.out.println(third + " is the greatest number");
        }
    }
}


//Output:--
//Welcome to the World of three
//
//Please enter your first number
//8
//Now, enter your second number
//25
//Finally, enter your third number:
//3
//25 is the greatest number