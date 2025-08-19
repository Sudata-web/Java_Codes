public class IsSortedArray {

    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Check post\n");
        int[] numArr = ArrayUtility.inputArray();           //Array input
        boolean isInc = isDecreasing(numArr);
        boolean isDec = isIncreasing(numArr);
        if (isInc || isDec) {
            System.out.println("you array is sorted");
        }else {
            System.out.println("you array is not sorted");
        }
    }

    public static boolean isDecreasing(int[] numArr) {
        int i =1;
        while (i < numArr.length) {
            if (numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;

    }

    public static boolean isIncreasing(int[] numArr) {
        int i =1;
        while (i < numArr.length) {
            if (numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}



//output:---
//Welcome to Array Sorting Check post
//
//Please enter the number of element:
//4
//Please enter element number 1:
//2
//Please enter element number 2:
//65
//Please enter element number 3:
//4
//Please enter element number 4:
//35
//you array is not sorted
//or) you array is sorted
