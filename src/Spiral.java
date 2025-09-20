package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];

        int top = 0, bottom = rows - 1;
        int left = 0, right = columns - 1;

        int num = 1;
        while (num <= rows * columns) {
            for (int j = left; j <= right && num <= rows * columns; j++) {
                result[top][j] = num++;
            }
            top++;

            for (int i = top; i <= bottom && num <= rows * columns; i++) {
                result[i][right] = num++;
            }
            right--;

            for (int j = right; j >= left && num <= rows * columns; j--) {
                result[bottom][j] = num++;
            }
            bottom--;

            for (int i = bottom; i >= top && num <= rows * columns; i--) {
                result[i][left] = num++;
            }
            left++;
        }

        return result;
    }

    public static void main(String[] args) {
        /*
            Should be:
                1   2   3   4
               10  11  12   5
                9   8   7   6
        */
        {
            int[][] spiral = Spiral.spiral(3, 4);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        /*
            Should be:
               1   2   3
              10  11   4
               9  12   5
               8   7   6
        */
        {
            int[][] spiral = Spiral.spiral(4, 3);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        /*
            Should be:
               1   2   3   4   5   6
              18  19  20  21  22   7
              17  28  29  30  23   8
              16  27  26  25  24   9
              15  14  13  12  11  10
        */
        {
            int[][] spiral = Spiral.spiral(5, 6);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
        /*
            Should be:
               1   2   3   4   5
              16  17  18  19   6
              15  24  25  20   7
              14  23  22  21   8
              13  12  11  10   9
        */
        {
            int[][] spiral = Spiral.spiral(5, 5);

            for (int i = 0; i < spiral.length; i++) {
                for (int j = 0; j < spiral[i].length; j++) {
                    System.out.print(String.format("%4s", spiral[i][j]));
                }
                System.out.println();
            }
        }
    }
}
