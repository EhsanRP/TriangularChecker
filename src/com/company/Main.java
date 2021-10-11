package com.company;

public class Main {

    public static void main(String[] args) {

        /**
         @Input hardcoded matrix of all kinds
         **/
        int[][] upperTriangularMat = {
                {1, 3, 5, 3},
                {0, 4, 6, 2},
                {0, 0, 2, 5},
                {0, 0, 0, 6}
        };
        TriangularChecker.checkIfTriangular(upperTriangularMat);

        int[][] lowerTriangularMat = {
                {1, 0, 0, 0},
                {1, 4, 0, 0},
                {4, 6, 2, 0},
                {0, 4, 7, 6}
        };
        TriangularChecker.checkIfTriangular(lowerTriangularMat);


        int[][] notTriangularMat = {
                {1, 1, 2, 3},
                {1, 4, 4, 3},
                {4, 6, 2, 0},
                {0, 4, 7, 6}
        };
        TriangularChecker.checkIfTriangular(notTriangularMat);

        int[][] notSquareMat = {
                {1, 1, 2, 3},
                {1, 4, 4, 3},
                {4, 6, 2, 0},
        };
        TriangularChecker.checkIfTriangular(notSquareMat);
    }
}
