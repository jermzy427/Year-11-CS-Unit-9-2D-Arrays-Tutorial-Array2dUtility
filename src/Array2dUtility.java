import java.lang.reflect.Array;

public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(Array[][] arrays){
        for(Array[] row : arrays){
            for(Array col : row)
                System.out.print(col + " " );
        }
        System.out.println();
    }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum (int[][] ints){
        int sum = 0;
        for(int[] row: ints ){
            for(int col: row ){
                sum += col;
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] ints){
        double avg = 0.00;
        int sum = sum(ints);
        int numrows = ints.length;
        int numcols = ints[0].length;

        avg = (double) sum /(numrows*numcols);
        return avg;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum (int[][] ints){
        int min = ints[0][0] ;
        for(int[] row: ints ){
            for(int col: row ){
                if(col<min){
                    min = col;
                }
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum (int[][] ints){
        int max = 0;
        for(int[] row: ints ){
            for(int col: row ){
                if(col> max){
                    max = col;
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.

    public static int evenCountStandard (int[][] ints){
        int counteven = 0;
        for(int i = 0; i< ints.length; i++){
            for(int j = 0; j<ints[i].length; j++){
                if(ints[i][j] % 2 == 0){
                    counteven++;
                }
            }
        }
        return counteven;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.

    public static int evenCountEnhanced (int[][] ints){
        int counteven = 0;
        for(int[] row:ints){
            for(int col: row){
                if(col%2 == 0 ){
                    counteven++;
                }
            }
        }
        return counteven;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a        2D array of integers are positive.
    public static boolean allPositive (int[][] ints){
        for(int i = 0; i< ints.length; i++){
            for(int j = 0; j<ints[i].length; j++){
                if(ints[i][j] < 0){
                    return false;
                }
            }
        }
        return true;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums (int[][] ints){
        int[] rowSum = new int[ints.length];
        int row = 0;

        for(int i =0; i<rowSum.length; i++ ){
            for(int j : ints[i]){
                row += j;

            }
            rowSum[i] = row;
            row = 0;
        }
        return rowSum;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums (int[][] ints){
        int[] colSum = new int[ints.length];
        int col = 0;
        int colnum = 0;
        for(int i =0; i<colSum.length; i++ ){
            for(int j = 0; j< ints.length; j++){
                col += ints[j][colnum];
            }
            colnum++;
            colSum[i] = col;
            col=0;

        }

        return colSum;
    }
}
