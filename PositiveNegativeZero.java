import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number checker\n");
        System.out.println("Please enter your number");
        int num = input.nextInt();

        if (num > 0){
            System.out.println("You number is Positive");
        } else if (num == 0) {
            System.out.println("Your number is zero");
        }else {
            System.out.println("Your number is Negative");
        }
    }
}



//Qs:--Create a prog that determines is a no is pos,neg and zero?

//Output:--
//Welcome to Number checker
//
//Please enter your number
//-52
//Your number is Negative