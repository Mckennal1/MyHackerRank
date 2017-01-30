import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
 * Author: Luisa McKenna
 * Problem by: HackerRank.com
 * 
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points
 * on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
 * 
 * We define the rating for Alice's to be A=(a0,a1,a2) and Bob's to be B=(b0,b1,b2). 
 * Criteria:
 * If ai>bi, then Alice is awarded 1 point.
 * If ai<bi, then Bob is awarded 1 point.
 * If ai=bi, then neither person receives a point
 * 
 * Given A and B, can you compare the two challenges and print their respective comparison points?
 */
public class MyComparison {   
	    public static String comparison(int[] a, int[] b){
	        int bobPoint = 0;
	        int alicePoint = 0;
	        
	        for(int i = 0; i < a.length; i ++){
	            if(a[i]>b[i]){
	                alicePoint++;
	            }
	            if(a[i]<b[i]){
	                bobPoint++;
	            }
	        }
	        return alicePoint + " " + bobPoint;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int a0 = in.nextInt();
	        int a1 = in.nextInt();
	        int a2 = in.nextInt();
	        int b0 = in.nextInt();
	        int b1 = in.nextInt();
	        int b2 = in.nextInt();
	        int[] aSet = new int[]{a0,a1,a2};
	        int[] bSet = new int[]{b0,b1,b2};
	        System.out.println(comparison(aSet,bSet));
	    }
}
