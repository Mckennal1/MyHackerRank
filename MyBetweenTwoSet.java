/*
 * Author: Luisa McKenna
 * Problem By: HackerRank.com
 * 
 * Consider two sets of positive integers, A = {a0,a1...an-1} and B = {a0,a1...an-1}.
 * We say that a positive integer x, is between sets A and B if the following 
 * conditions are satisfied:
 * 	 1) All elements in A are a factor of x.
 *   2) X is a factor of all elements in B.
 * 
 * Given A and B, find and print integers (i.e, possible x's) that are
 * between the two sets.
 */
import java.util.*;

public class MyBetweenTwoSet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        in.close();
        
        int numCount = 0;
        boolean flag = true;
        
        for(int i = a[a.length-1]; i<=b[0]; i++){//loop through a[n-1] to b[0]
            flag = true;
            for(int j = 0; j < a.length; j++){//loop through set A
                if(i%a[j]!=0){//factor checking
                    flag = false;
                    break;
                }
            }
            
            if(flag == true){
                for(int k = 0; k < b.length; k++){//loop through set B
                    if(b[k]%i!=0){//factor checking
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    numCount++;
                
                }
            }
        }
        
        System.out.println(numCount);
    }
}
