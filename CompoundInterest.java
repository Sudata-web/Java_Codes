import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compound interest calculation\n");
        System.out.println("Please enter your principle amount Rs");
        int principle = input.nextInt();
        System.out.println("Now, tell me rate of interest: ");
        float rate = input.nextFloat();
        System.out.println("Now, Tell me for how many year are you borrowing this money ");
        float years = input.nextFloat();

        double compInt =principle * Math.pow((1 + rate / 100), years);
        System.out.println("Your compound interest is Rs: " + compInt);

    }
}


//Qs:---
//Create a prog to cal Compound interest .(C.I=p(1+R/100)t)  ?
//Output:--
//Welcome to Compound interest calculation
//
//Please enter your principle amount Rs
//
//15000
//Now, tell me rate of interest:
//5
//Now, Tell me for how many year are you borrowing this money
//2
//Your compound interest is Rs: 16537.498497962984