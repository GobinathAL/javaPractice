/*
Create a class MATRIX with following member: Mat[][]
Write functions for the following:
	Get()       
	Disp()
	Compute and return the sum of diagonal elements
*/
import java.util.Scanner;

class Matrix {
    private int[][] Mat;
    public void get() {
        Scanner sc = new Scanner(System.in);

        System.out.println("rows: ");
        int r = sc.nextInt();
        System.out.println("columns: ");
        int c = sc.nextInt();
        this.Mat = new int[r][c];
        System.out.println("Enter the matrix");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                this.Mat[i][j] = sc.nextInt();
            }
        }
    }
    public void display() {
        System.out.println("Matrix:");
        for(int i = 0; i < Mat.length; i++) {
            for(int j = 0; j < Mat[i].length; j++) {
                System.out.printf("%d ",Mat[i][j]);
            }
            System.out.println();
        }
    }
    public void sumOfDiagonal() {
        if(Mat.length != Mat[0].length) {
            System.out.println("Diagonals cant be summed for non-square matrix");
            return;
        }
        int sum = 0;
        for(int i = 0, j = 0; i < Mat.length && j < Mat[0].length; i++,j++) {
            sum += Mat[i][j];
        }
        System.out.println(sum);
    }
}
public class MatrixMain {
    public static void main(String[] args) {
        Matrix m = new Matrix();

        m.get();
        m.display();
        m.sumOfDiagonal();
    }
}
