import java.sql.SQLOutput;
import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Perimeter calculator");
        System.out.println("Please enter all 4 side in cms: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double perimeter = a+b+b+d;

        System.out.println("perimeter of your rectangle is: " + perimeter + "cms");


    }
}




//Qs:---
//Create a program to calculate Perimeter of a rectangle?  ABCD=A+B+C+D?

//output:---
//Welcome to Perimeter calculator
//Please enter all 4 side in cms
//1.1
//        2.1
//        1.4
//        53
//perimeter of your rectangle is: 58.3