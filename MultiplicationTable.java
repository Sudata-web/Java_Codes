import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to Multiplication World\n");
        System.out.println("Please enter your number: ");
        int num = scanner.nextInt();
        printMultiplicationTable(num);

    }

    public static void printMultiplicationTable(int num) {         //Funtion/Method

        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;

        }
    }
}


//Qs:--
//Develop a program that print thr multiplication table for a given number?

//Output:----
//welcome to Multiplication World
//Please enter your number:
//12
//12 X 1 = 12
//12 X 2 = 24
//12 X 3 = 36
//12 X 4 = 48
//12 X 5 = 60
//12 X 6 = 72
//12 X 7 = 84
//12 X 8 = 96
//12 X 9 = 108
//12 X 10 = 120