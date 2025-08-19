import java.util.Scanner;

public class OccurrenceArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrence\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now enter the number you want to find: ");
        int num = input.nextInt();
        int occurrence = noOfOccurrence(numArr, num);
        System.out.println("Your element was found " +occurrence + " time in the Array");

    }
    public static int noOfOccurrence(int[] numArr, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArr.length) {
            if (numArr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }

}
