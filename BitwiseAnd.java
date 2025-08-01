import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise AND Operator");
        System.out.println("Please enter the first number: ");
        int first = input.nextInt();
        System.out.println("Now, enter the other number: ");
        int second = input.nextInt();

        int result = first  & second;
        System.out.println("result is: " + result );
    }
}


//output:---
//Showcasing Bitwise AND Operator
//Please enter the first number:
//12
//Now, enter the other number:
//5
//result is: 4


//Please enter the first number:
//13
//Now, enter the other number:
//3
//result is: 1