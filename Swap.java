import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping station\n\n");
        System.out.println("Enter value of A: ");
        int a = input.nextInt();
        System.out.println("Enter value of B: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Swapping done...");
        System.out.println("Value of A is:" + a);
        System.out.println("Value of B is:" + b);



    }
}

//output:--
//Welcome to Swapping station
//
//
//Enter value of A:
//
//        41
//Enter value of B:
//        56
//Swapping done...
//Value of A is:56
//Value of B is:41