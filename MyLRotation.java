import java.util.*;
/*
 * Author: Luisa McKenna
 * Problem: HackerRank.com
 * 
 * Given an array of n integers and a number,k, perform k left rotations on the
 * array. Then print the updated array as a single line of spaced integers.
 */
public class MyLRotation {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }//scan integers into array, a
        
        //My code below
        int b[] = new int[a.length];
        int s_i = 0;

        //collect the elements that are in first array as n-k
        while(s_i<n-k){
            b[n-k-1-s_i]=a[n-1-s_i];
            s_i++;
        }//efficiency of O(n)??
        
        //collect the first k elements and insert into second array offset of push
        for(int r_i = 0; r_i <= k - 1 ; r_i++){
            b[r_i+n-k]=a[r_i];
        }
        //efficiency of O(n)??
        
        //print out array as separated by space
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
