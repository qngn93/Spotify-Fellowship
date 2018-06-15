package SpotifyFellowship;

import java.util.*;

/*
 * Question 2 --decodeString(s)
 * Given an encoded string, return its corresponding decoded string. 
The encoding rule is: k[encoded_string], 
where the encoded_string inside the square brackets is repeated exactly k times. 
Note: k is guaranteed to be a positive integer. 

For s = "4[ab]", the output should be decodeString(s) = "abababab" 
For s = "2[b3[a]]", the output should be decodeString(s) = "baaabaaa"
 */

public class Question2 {
	public static String decodeString(String s){
		Stack<Integer> intStack = new Stack<>();
		Stack<String> charStack = new Stack<>();
		
		String result = "";
		int index = 0;
		
		while(index < s.length()){
			if(s.charAt(index) == '['){
				charStack.push(result);
				result = "";
				index++;
			} else if(Character.isDigit(s.charAt(index))){
				int count = 0;
				while(Character.isDigit(s.charAt(index))){
					count = 10 * count +(s.charAt(index) - '0');
					index++;
				}
				intStack.push(count);
			} else if(s.charAt(index) == ']'){
				StringBuilder temp = new StringBuilder(charStack.pop());
				int repeat = intStack.pop();
				for(int i = 0; i < repeat; i++){
					temp.append(result);
				}
				
				result = temp.toString();
				index++;
			} else {
				result += s.charAt(index);
				index++;
			}
		}
		return result;
		
	}
}
