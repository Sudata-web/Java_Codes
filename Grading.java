import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to grade calculator\n");
        System.out.println("Please enter your percentage: ");
        float percentage = input.nextFloat();

        if (percentage >= 90){
            System.out.println("Great ,you have got A");
        } else if (percentage >= 70) {
            System.out.println("Good, you have got B");
        } else if (percentage >=60 ) {
            System.out.println("You have got C, work harder next time");
        } else if (percentage >= 30) {
            System.out.println("you have got D, you seriously need to work");
        }else {
            System.out.println("Sorry. You failed the test ");
        }
    }
}


//output:--
//Welcome to grade calculator
//
//Please enter your percentage:
//80
//Good, you have got B