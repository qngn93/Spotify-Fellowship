package SpotifyFellowship;

/*
 * Question 1 -- sortByStrings(s, t)
 * Sort the letters in the string s by the order they occur in the string t. 
 * You can assume t will not have repetitive characters. 
 * For s = "weather" and t = "therapyw", the output should be sortByString(s, t) = "theeraw". 
 * For s = "good" and t = "odg", the output should be sortByString(s, t) = "oodg".
 */

public class Question1 {
	public static String sortByStrings(String s, String t){
		char [] st = s.toCharArray();
		int count = 0;
		int index = 0;
		
		while(count < t.length()){
			for(int i = 0; i < st.length; i++){
				if(st[i] == t.charAt(count)){
					char temp = st[index];
					st[index] = st[i];
					st[i] = temp;
					
					index++;
				}
			}
			count++;
		}
		
		String result = String.valueOf(st);
		return result;
	}
}
