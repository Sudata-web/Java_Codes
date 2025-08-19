import java.util.Scanner;

public class DeleteFromArray {

    public static void main(String[] args) {
        System.out.println("Welcome to Array Deletion");
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now enter then number to delete: ");
        int numToDelete =input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array");
        ArrayUtility.displayArray(numArr);

    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
         int occ = OccurrenceArray.noOfOccurrence(numArr,numToDelete);
         if (occ == 0) {
             return numArr;
         }
         int newSize =numArr.length - occ;
         int[] newArr = new int[newSize];

         int i = 0, j = 0;
         while (i < numArr.length) {
             if (numArr[i] != numToDelete) {
                 newArr[j] = numArr[i];
                 j++;
             }
             i++;
         }
         return  newArr;
    }
}
