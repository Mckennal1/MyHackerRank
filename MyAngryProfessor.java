/*
 * Author: Luisa McKenna
 * Problem By: HackerRank.com
 * 
 * A discrete mathematics professor has a class of N students. 
 * Frustrated with their lack of discipline, he decides to cancel
 * class if fewer than K students are present when class starts.
 * Given the arrival time of each student determine if the class
 * is canceled.
 */
import java.util.*;

public class MyAngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();//number of following inputs
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();//number of students
            int k = in.nextInt();//cancellation threshold
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int studentCount = 0;
            for(int i = 0; i < a.length; i++){
                if(a[i]<=0){
                    studentCount++;
                }
            }
            if(studentCount>=k){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        in.close();
    }
}