package Lesson3;

// Multidimensional Arrays
public class Session8 {
    public static void main(String[] args) {
        // int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

        // System.out.println(myNumbers[0][2]);

        // int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        // for (int i = 0; i < myNumbers.length; ++i) {
        // for (int j = 0; j < myNumbers[i].length; ++j) {
        // System.out.println(myNumbers[i][j]);
        // }
        // }
        String[] cars;
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }

}
