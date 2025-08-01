import java.util.Scanner;

public class BitwiseOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise OR Operator");
        System.out.println("Please enter the first number: ");
        int first = input.nextInt();
        System.out.println("Now, enter the other number: ");
        int second = input.nextInt();

        int result = first  | second;
        System.out.println("result is: " + result );
    }
}


//output:--
//Showcasing Bitwise OR Operator
//Please enter the first number:
//12
//Now, enter the other number:
//6
//result is: 14
