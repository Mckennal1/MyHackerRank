/*
 * Author: Luisa McKenna
 * Problem By: HackerRank.com
 * 
 * The Utopian Tree goes through 2 cycles of growth every year. 
 * Each spring, it doubles in height. Each summer, its height
 * increases by 1. Laura plants a Utopian Tree sapling with a 
 * height of 1 meter. How tall will her tree by after N growth cycles?
 * 
 */
import java.util.*;

public class MyUtopianTree {

    public  static int GrowingPlant(int n){//recursive approach
        if(n == 0){
           return 1;
        }
        else if(n%2!=0){
           return 2 * GrowingPlant(n-1);    
        }
        else{
           return GrowingPlant(n - 1) + 1;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            list.add(GrowingPlant(n));
        }
        
        for (int element : list) {
            System.out.println(element);
        }
        in.close();
    }
}