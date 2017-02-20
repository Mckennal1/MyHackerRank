/*
 * Author: Luisa McKenna
 * Problem By: HackerRank.com
 * 
 * There are two kangaroos on an x-axis ready to jump in the positive 
 * direction (i.e toward positive infinity). The first kangaroo starts
 * at location x1 and moves at a rate of v1 meter per jump. The second 
 * kangaroo starts at location x2 and moves at v2 meters per jump. Given 
 * the starting locations and movement rates for each kangaroo, can
 * you determine if they'll ever land at the same location at the same time?
 * 
 */
import java.util.*;


public class MyKangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        
        int initialJump1 = x1;
        int initialJump2 = x2;
        boolean flag = false;
        if(initialJump1==initialJump2){
            System.out.println("Yes");
        }
        else{
            for(int i = 0; i< 10000; i++){
                initialJump1 += v1;
                initialJump2 += v2;
                if(initialJump1==initialJump2){
                    flag= true;
                    break;
                }
            }
            if(flag==true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}