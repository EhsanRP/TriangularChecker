package com.company;

public class TriangularChecker {


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

    public static boolean isLowerTriangularMatrix(int mat[][]) {
        int N = mat.length;
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (mat[i][j] != 0)
                    return false;

        return true;
    }

    public static Boolean isUpperTriangularMatrix(int mat[][]) {
        int N = mat.length;
        for (int i = 1; i < N; i++)
            for (int j = 0; j < i; j++)
                if (mat[i][j] != 0)
                    return false;
        return true;
    }

}
