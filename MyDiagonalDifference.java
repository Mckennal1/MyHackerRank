/*
 * Author: Luisa McKenna
 * Problem By: HackerRank.com
 * 
 * Given a square matrix of size N x N, calculate the 
 * absolute difference between the sums of its diagonals.
 * 
 */
import java.util.*;

public class MyDiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        int diagonalOne = 0;
        int diagonalTwo = 0;
        int temp = 0;
        for(int i = 0; i < n; i++){
            temp = a[i][i];
            diagonalOne += temp;
        }
        
        for(int j = 0; j<n; j++){
            temp = a[j][n-j-1];
            diagonalTwo += temp;
        }
        
        System.out.println(Math.abs(diagonalOne - diagonalTwo));
    }
}
