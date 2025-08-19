
public class MaxMinArray {

    public static void main(String[] args) {
        System.out.println("Welcome to max and Min Array\n");
        int[] numArr = ArrayUtility.inputArray();
        int min = min(numArr);
        int max = max(numArr);
        System.out.println("Max of the Array is: " + max);
        System.out.println("Mix of the Array is: " + min);
    }

    public static int min(int[] numArr) {
        int min = Integer.MAX_VALUE;
        int i=0;
        while (i< numArr.length) {
            if (min > numArr[i]){
                min = numArr[i];
            }
            i++;
        }
        return min;
    }

    public static int max(int[] numArr) {
        if (numArr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i =1;
        while (i < numArr.length) {
            if (max < numArr[i]){
                max = numArr[i];
            }
            i++;
        }
        return max;
    }
}



//Output:---
//Welcome to max and Min Array
//
//Please enter the number of element:
//5
//Please enter element number 1:
//12
//Please enter element number 2:
//10
//Please enter element number 3:
//3
//Please enter element number 4:
//6
//Please enter element number 5:
//24
//Max of the Array is: 24
//Mix of the Array is: 3
