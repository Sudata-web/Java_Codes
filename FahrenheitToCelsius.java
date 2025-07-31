import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Temperature converter");
        System.out.println("enter your temp in F: ");
        float fah = input.nextFloat();
        float cel = (fah - 32) * 5 / 9;
        System.out.println("Your Temperature is : " + cel + "C");
    }
}



//Qs:----
//Create a prog to convert Fahrenheit to Celsius?('C=('f-32)*5/9)    Wether degree celsius?

//output:--
//Welcome to Temperature converter
//enter your temp in f:
//72
//Your Temperature is : 22.222221C