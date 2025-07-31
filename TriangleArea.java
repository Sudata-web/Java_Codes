import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area calculator\n");
        System.out.println("Please enter your base in cms: ");
        double base = input.nextDouble();
        System.out.println("Now, enter your perpendicular height in cms: ");
        double height = input.nextDouble();

//        double area = 0.5 * base * height;
        double area = (base * height) / 2;
        System.out.println("The Area of your triangle is: " + area + "cms");


    }
}



//Qs:---
//Create a prog to calculate Area of a Triangle.  (Area of Trg = 1/2*B*H) ?

//output:--
//Welcome to Area calculator
//
//Please enter your base in cms:
//5
//Now, enter your perpendicular height in cms:
//8
//The Area of your triangle is: 20.0cms
