/*
 * Author: Luisa McKenna
 * Problem By: HackerRank.com
 * 
 *https://www.hackerrank.com/challenges/apple-and-orange
 * 
 */
import java.util.*;

public class MyAppleOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        int appleCount = 0;
        int orangeCount = 0;
        int fall = 0;
        
        for(int i = 0; i<apple.length; i++){
            fall = a + apple[i];
            if(fall >=s && fall<=t){
                appleCount++;
            }
        }
        
        for(int j = 0; j<orange.length; j++){
            fall = b + orange[j];
            if(fall >=s && fall<=t){
                orangeCount++;
            }
        }
        
        System.out.println(appleCount + "\n" + orangeCount);   
    }
}