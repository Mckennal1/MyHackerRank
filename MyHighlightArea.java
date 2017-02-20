/*
 * Author: Luisa McKenna
 * Problem By: HackerRank.com
 * 
 * When you select a contiguous block of text in a PDF viewer,
 * the selection is highlighted with a blue rectangle. In a new
 * kind of PDF viewer, the selection of each word is independent of 
 * the other words; this means that each rectangle selection area forms 
 * independently around each highlighted word.
 * 
 * Consider a word consisting of lowercase Enlgish alphabetic letters, 
 * where each letter is 1mm wide. Given the height of each letter in millimeters, 
 * find the total are that will be highlighted by blue rectangle when the given word
 * selected in the new PDF viewer.
 * 
 */
import java.util.*;

public class MyHighlightArea {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        in.close();
        
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] chars = word.toCharArray();
        int temp = 0;
        int height = 0;
        
        for(int i = 0; i < 26; i++){
            hash.put(alphabet[i],h[i]);
        }
       
        for(int j = 0; j<chars.length;j++){
            temp = hash.get(chars[j]);
            if(temp>height){
                height = temp;
            }
        }
        
        int area = 0;
        area = height * 1 * chars.length;
        System.out.println(area);
    }
}