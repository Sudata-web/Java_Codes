public class SumAverage2dArray {

    public static void main(String[] args) {
        System.out.println("welcome to Sum and Average of 2D Array");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        long avg = average(numArr);
        System.out.println("Your sum of Array is: " + sum);
        System.out.println("Your Average of Array is: " + avg);

    }

    public static long average(int[][] numArr) {
        if (numArr.length == 0) {
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows * cols;
        return sum(numArr) / (rows * cols);
    }

    public static long sum(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}


//output:---
//welcome to Sum and Average of 2D Array
//Please enter the number of rows:
//2
//Please enter the number of columns:
//3
//Please enter element rows: 1, column: 1 :
//2
//Please enter element rows: 1, column: 2 :
//3
//Please enter element rows: 1, column: 3 :
//5
//Please enter element rows: 2, column: 1 :
//4
//Please enter element rows: 2, column: 2 :
//6
//Please enter element rows: 2, column: 3 :
//3
//Your sum of Array is: 23
//Your Average of Array is: 3