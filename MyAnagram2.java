import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Author: Luisa McKenna
 * Problem: HackerRank.com
 * 
 * Find the needle in the haystack(in any order). 
 * Print out the location where the needle was found. 
 * (Originally used hashmap to solve this but found a somewhat more efficient)
 */
public class MyAnagram2 {

	public List<Integer> anagram(String haystack, String needle){
		List<Integer> list = new ArrayList<Integer>();
		String[] hay = haystack.split("");
		StringBuilder sb = new StringBuilder();
		int i,j;
		//.length() are for strings
		//.length are for arrays of any type
		
		for(i = 0; i<=haystack.length()-needle.length(); i++){
			for(j = i; j<needle.length()+i; j++){//put characters from haystack with length of needle into stringbuilder 
				sb.append(hay[j]);
			}
			String s = sb.toString();
			char[] word1 = s.toCharArray();
	    	char[] word2 = needle.toCharArray();
	    	Arrays.sort(word1);
	    	Arrays.sort(word2);
	    	if(Arrays.equals(word1, word2)){ 
	    		list.add(i);//add the index where the word was found to the list
	    	}
			sb.setLength(0);//clear StringBuilder for reuse 
		}
		return list;
// My first attempt at a solution
		
//		Iterator it = hashmap.entrySet().iterator();
//	    for(String key: hashmap.keySet()) {
//	    	//String key = (String) it.next();
//	    	char[] word1 = key.toCharArray();
//	    	char[] word2 = needle.toCharArray();
//	    	Arrays.sort(word1);
//	    	Arrays.sort(word2);
//	    	if(Arrays.equals(word1, word2)){
//	    		int value = hashmap.get(key);
//	    		list.add(value);
//	    	}
//	    }
//	    System.out.println(Arrays.toString(hay));
//	    System.out.println(hashmap.keySet());
//	    System.out.println(hashmap.values());
	}
	
	public static void main(String[] args){
		MyAnagram2 an = new MyAnagram2();
		System.out.println("Please provide two strings, first(haystack) and second(needle)");
		Scanner in = new Scanner(System.in);
		String a = in.next();
        String b = in.next();
		System.out.println(an.anagram(a, b));
	}
}
