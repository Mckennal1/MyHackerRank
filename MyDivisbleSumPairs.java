/*
 * Author: Luisa McKenna
 * Problem By: HackerRank.com
 * 
 * You are given an array of n integers, a0,a1,...an-1, and a positive integer k.
 * Find and print the number of (i,j) pairs where i<j and ai+aj is evenly divisible by k.
 * 
 */
import java.util.*;


public class MyDivisbleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int addPair = 0;
        int pairCount = 0;
        for(int i = 0; i<a.length-1; i++){
            for(int j = i+1; j<a.length; j++){
                addPair = a[i]+a[j];
                if(addPair%k==0){
                    pairCount++;
                }
            }
        }
        
        System.out.println(pairCount);
    }
}