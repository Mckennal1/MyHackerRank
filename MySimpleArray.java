import java.util.*;

/*
 * Author: Luisa McKenna
 * Problem by: HackerRank.com
 * 
 * Given an integer n and a list of integers with length n, add up the integers.
 */

public class MySimpleArray {
    
    public static int add(int[] num){
        int sum = 0;
        for(int j = 0; j < num.length; j++){//adds up all the integers in the array
            sum += num[j];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Please provide an integer n, followed by a list of integers with length n");
    	Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = in.nextInt();
        }
        in.close();
        System.out.println(add(numbers));
    }
}