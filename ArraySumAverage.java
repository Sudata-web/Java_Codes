import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array sum and Average");
        System.out.println("Please enter the number of element: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        int i =0;
        while (i < size) {
            System.out.println("Please enter element number " + (i+1) + ": ");
            nums[i] = sc.nextInt();
            i++;

        }

    }
}
