/*
 * Author: Luisa McKenna
 * Problem By: HackerRank.com
 * 
 * Given an array of integers, calculate which fraction of its 
 * elements are positive,negative, and zeros, respectively.
 *  Print the decimal value of each fraction on a separate lines. 
 * 
 */
import java.util.*;

public class MyPlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        float positiveNum = 0;
        float negativeNum = 0;
        float zeroNum = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]>0){
                positiveNum+=1;
            }
            else if(arr[i]<0){
                negativeNum+=1;
            }
            else{
                zeroNum+=1;
            }
        }

            
        System.out.println(positiveNum/n + "\n" + negativeNum/n + "\n" + zeroNum/n);
    }
}