/*
 * Author: Luisa McKenna
 * Problem By: HackerRank.com
 * 
 * Anna and Brian order n items at a restaurant, but Anna declines to eat
 * any of the kth item (where 0<= k <= n) due to an allergy. When the check
 * comes, the decide to split the cost of all the items they share; however,
 * Brian may forgotten that they didn't split the kth item and accidentally
 * charged Anna for it.
 * 
 * You are given n, k, the cost of each of the n items, and the total amount
 * of money that Brian charged Anna for her portion of the bill. If the bill
 * is fairly split, print "Bon Appetit"; otherwise, print the amount of money that
 * Brian must refund to Anna.
 * 
 */
import java.util.*;


public class MyBonAppetit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int k = in.nextInt();
        int[] cost = new int[n];
        for(int i =0; i<n; i++){
            cost[i]=in.nextInt();
        }
        int b = in.nextInt();
        
        double annaBill = 0;
        
        for(int j = 0; j < cost.length; j++){//loop through cost[i]
            if(j!=k){
                annaBill += cost[j]/2.0;
            }
        }
        if(annaBill==b){//Brian charged Anna correctly 
            System.out.println("Bon Appetit");
        }
        else{
            System.out.printf("%.0f", b-annaBill);
        }
        
    }
}