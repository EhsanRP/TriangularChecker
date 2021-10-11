package com.company;

public class TriangularChecker {

    /**
     * @param mat: dimensional matrix to check if is triangular
     * @Logic First Checks if matrix is a square
     * @Logic Second Checks if is Triangular
     */
    public static void checkIfTriangular(int mat[][]) {
        if (checkSquare(mat)){
            if (isLowerTriangularMatrix(mat)) {
                System.out.println("Array is Lower Triangular");
            } else if (isUpperTriangularMatrix(mat)) {
                System.out.println("Array is Upper Triangular");
            } else {
                System.out.println("Array is not Triangular");
            }
        }
    }


    /**
     * @param mat: dimensional matrix to check if is triangular
     * @Logic Checks if a matrix is suare
     * @Return true if square false if not
     */
    public static boolean checkSquare(int mat[][]) {
        var height = mat.length;

        for (int i = 0; i < height; i++) {
            if (mat[i].length != height) {
                System.out.println("Array is not square");
                return false;
            }
        }

        System.out.println("Array is of type " + height + " x " + height);
        return true;
    }

    /**
     * @param mat: dimensional matrix to check if is triangular
     * @Logic Checks if a matrix is Lower Triangular
     * @Return true if Lower Triangular false if not
     */
    public static boolean isLowerTriangularMatrix(int mat[][]) {
        int N = mat.length;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (mat[i][j] != 0)
                    return false;

        return true;
    }

    /**
     * @param mat: dimensional matrix to check if is triangular
     * @Logic Checks if a matrix is Upper Triangular
     * @Return true if Upper Triangular false if not
     */
    public static Boolean isUpperTriangularMatrix(int mat[][]) {
        int N = mat.length;
        for (int i = 1; i < N; i++)
            for (int j = 0; j < i; j++)
                if (mat[i][j] != 0)
                    return false;
        return true;
    }

}
