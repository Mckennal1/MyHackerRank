/*
 * Author: Luisa McKenna
 * Problem By: HackerRank.com
 * 
 * Given five positive integers, find the minimum and maximum values that can
 * be calculated by summing exactly four of the five integers. Then print the 
 * respective minimum and maximum values as a single line of two space-separated
 * long integers.
 * 
 */
import java.util.*;

public class MyMinMax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long[] array = {a,b,c,d,e};
        Arrays.sort(array);
        
        long min = 0;
        long max = 0;
        long temp = 0;
        for (int i = 0; i < array.length-1; i++){
            temp = array[i];
            min += temp;
        }
        
        for (int j = 1; j < array.length; j++){
            temp = array[j];
            max += temp;
        }
        
        System.out.print(min + " " + max);
    }
}