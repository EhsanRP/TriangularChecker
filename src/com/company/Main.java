package com.company;

public class Main {

    public static void main(String[] args) {

        /**
         echo "# TriangularChecker" >> README.md
         git init
         git add README.md
         git commit -m "first commit"
         git branch -M main
         git remote add origin https://github.com/EhsanRP/TriangularChecker.git
         git push -u origin main@Param
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
