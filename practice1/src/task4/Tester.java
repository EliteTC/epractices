package task4;


public class Tester {

    public static void main(String[] args) {
        int [][] matr1 = new int [][]{{1,2},{3,4}};
        int [][] matr2 = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
        int [][] matr3 = new int [][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        RotateMatrix.rotateMatrix(matr1);
        RotateMatrix.rotateMatrix(matr2);
        RotateMatrix.rotateMatrix(matr3);

        }

}
