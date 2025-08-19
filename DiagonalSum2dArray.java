public class DiagonalSum2dArray {

    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonals(numArr);
        System.out.println("Sum of Diagonal is: " + sum);

    }

    public static long sumOfDiagonals(int[][] numArr) {
        long leftSum = sumOfLeftDiagonals(numArr);
        long rightSum = sumOfRightDiagonals(numArr);
        long sum = leftSum + rightSum;
        if (numArr.length % 2 != 0) {
            int ind = numArr.length / 2;
            sum -= numArr[ind][ind];
        }
        return sum;
    }

    public static long sumOfLeftDiagonals(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            sum += numArr[i][i];
            i++;
       }
        return sum;
    }

    public static long sumOfRightDiagonals(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int col = numArr.length - 1 - i;
            sum += numArr[i][col];
            i++;
        }
        return sum;
    }
}



//output:----
//Welcome to Diagonal Sum
//Please enter the number of rows:
//3
//Please enter the number of columns:
//3
//Please enter element rows: 1, column: 1 :
//1
//Please enter element rows: 1, column: 2 :
//2
//Please enter element rows: 1, column: 3 :
//3
//Please enter element rows: 2, column: 1 :
//4
//Please enter element rows: 2, column: 2 :
//5
//Please enter element rows: 2, column: 3 :
//6
//Please enter element rows: 3, column: 1 :
//7
//Please enter element rows: 3, column: 2 :
//8
//Please enter element rows: 3, column: 3 :
//9
//Sum of Diagonal is: 25
