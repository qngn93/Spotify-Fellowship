package SpotifyFellowship;
/*
 * Your quirky boss collects rare, old coins. 
 * They found out you're a programmer and asked you to solve something they've been wondering for a long time. 
 * Write a function that, given an amount of money and an array of coin denominations, 
 * -computes the number of ways to make the amount of money with coins of the available denominations. 
 */

public class Question3 {
	public static int changePossibilities(int [] denominations, int amount){
		int [] combos = new int[amount + 1];
		combos[0] = 1;
		
		for(int i = 0; i <= denominations.length; i++){
			for(int j = 1; j <= amount; j++){
				if(j >= i){
					combos[j] += combos[j- i];
				}
			}
		}
		return combos[amount];
	}
}
