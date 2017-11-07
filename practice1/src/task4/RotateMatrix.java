package task4;

import static task4.MatrixPrinter.printMatrix;

public class RotateMatrix {

  private  static int [][] rotate(int [][] matr) {
      for(int i=0; i < matr.length; i++){
          if(matr.length != matr[i].length){
              System.out.println("Invalid input.");
              return null;
          }
      }

        int n = matr.length;
        int tmp;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                tmp = matr[i][j];
                matr[i][j] = matr[j][n - 1 - i];
                matr[j][n - 1 - i] = matr[n - 1 - i][n - 1 - j];
                matr[n - 1 - i][n - 1 - j] = matr[n - 1 - j][i];
                matr[n - 1 - j][i] = tmp;
            }
        }
        return matr;
    }
    static void rotateMatrix(int [][]matrix){
        System.out.println("Before :");
        printMatrix(matrix);
        System.out.println("After :");
        printMatrix(RotateMatrix.rotate(matrix));
    }
}
