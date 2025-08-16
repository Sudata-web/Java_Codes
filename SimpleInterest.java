import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest calculator");
        System.out.println("Please enter your principle amount Rs");
        int principle = input.nextInt();
        System.out.println("Now, tell me rate of interest: ");
        float rate = input.nextFloat();
        System.out.println("Now, Tell me for how many year are you borrowing this money ");
        float years = input.nextFloat();

        float interest = (principle * rate * years) / 100;
        System.out.println("\n\n Your Simple Interest is Rs: " + interest);

    }
}


//Qs:---
//create a prg to calculate simple interest.  (Simple interst = (p*t*r)/100)?
//output:--
//Welcome to Simple Interest calculator
//Please enter your principle amount Rs
//10000
//Now, tell me rate of interest:
//8.5
//Now, Tell me for how many year are you borrowing this money
//3
// Your Simple Interest is Rs: 2550.0
