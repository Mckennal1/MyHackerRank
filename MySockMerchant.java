/*
 * Author: Luisa McKenna
 * Problem By: HackerRank.com
 * 
 * John's clothing store has a pile of n loose socks where each sock i
 * is labeled with an integer ci, denoting its color. He can only sell socks
 * in a matching pair. Two socks, i and j, are a single pair if ci=cj.
 * Given n and the colors of each sock, how many pairs can John sell?
 */
import java.util.*;

public class MySockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        in.close();
        
        int temp = 0;
        int count = 0;
        Arrays.sort(c);
        for(int i = 0; i < c.length-1; i++){
            temp = c[i];
            if(temp==c[i+1]){
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}