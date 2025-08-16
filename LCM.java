import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to LCM(Least Common Multiple)");
        System.out.println("Please enter your number");
        int first = input.nextInt();
        System.out.println("Please enter your number");
        int second = input.nextInt();
        int lcm = lcm(first,second);
        System.out.println("LCM of the two number is : " + lcm);
    }

    public static int lcm(int first,int second) {
        int i = 1;
        while (i <= second) {               //true
            int factor = first * i;
            if (factor % second== 0 ){
                return factor;
            }
        i++;
    }
        return 0;          //unreachable

    }
}



//output:---
//Welcome to LCM(Least Common Multiple)
//Please enter your number
//25
//Please enter your number
//65
//LCM of the two number is : 325