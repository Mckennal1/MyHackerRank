import java.util.Scanner;
/*
 * Author: Luisa McKenna
 * Problem by: HackerRank.com
 * 
 * Given two strings, a and b, that may or may not be of the same length, 
 * determine the minimum number of character deletions required to make
 * a and b anagrams. Any characters can be deleted from either of the strings.
 */
public class MyAnagram {
	
	public static int numberNeeded(String first, String second) {
		StringBuilder sb = new StringBuilder();
		sb.append(first);
		sb.append(second);//combines both strings
		int count = 0;
		String s = sb.toString();
		char[] a = s.toCharArray();//strings converted character array

		for(int i = 0; i < a.length-1; i++){
			for(int j = i+1; j < a.length; j++){
				if(a[i]==a[j]){//change characters to zero if they are equal
					a[i]='0';
					a[j]='0';
					break;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++){//count up zeros
			if(a[i]!='0'){
				count++;
			}
		}
		return count;

	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide two strings, may or may not be the same length");
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
