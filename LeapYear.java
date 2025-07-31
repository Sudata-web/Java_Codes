import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to new year Calculator\n");
        System.out.println("please enter the year that you want to checked");
        int year = input.nextInt();

        if (year % 400 == 0){
            System.out.println("Your year is a leap year");
        } else if ( year % 4 == 0 && year % 100 == 0) {
            System.out.println("your year is not a leap year");
        }else {
            System.out.println("Your year is not a leap year");
        }
    }
}


//output:--
//