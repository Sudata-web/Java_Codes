import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR Operator");
        System.out.println("Please enter the first number: ");
        int first = input.nextInt();
        System.out.println("Now, enter the other number: ");
        int second = input.nextInt();

        int result = first  ^ second;
        System.out.println("result is: " + result );
    }
}



//output:--
//Showcasing Bitwise XOR Operator
//Please enter the first number:
//10
//Now, enter the other number:
//14
//result is: 4
