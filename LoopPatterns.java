import java.util.Scanner;

public class LoopPatterns {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are here to print patterns \n");
        System.out.println("Please enter the no of rows: ");
        int rows = input.nextInt();
        printRightHalfPyramid(rows);
        printReverseRightHalfPyramid(rows);
        printReverseLeftHalfPyramid(rows);

    }

    public static void printReverseLeftHalfPyramid(int maxRows) {
        System.out.println("Here is Reverse Left Half Pyramid");
        int rows = maxRows;
        while (rows > 0) {
            int i = 0;
            while (i <=(maxRows-rows)){
                System.out.print(" *");
                i++;
            }
            System.out.println("*");
            rows--;
        }
    }



    public static void printReverseRightHalfPyramid(int maxRows) {
        System.out.println("Here is Reverse Right Half Pyramid");
        int rows = maxRows;
        while (rows > 0) {
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }

            System.out.println("*");
            rows--;
        }
    }



    public static void printRightHalfPyramid (int maxRows) {
            int rows = 0;
            while (rows < maxRows) ;
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.println(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
}

