package dev.ClimbingTheLeaderboard;

import java.util.*;

public class Solution {

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		List<Integer> result = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		System.out.println();
		for(int i : ranked) {
			if(stack.isEmpty() || stack.peek() != i) {
				stack.push(i);
			}
		}
		
		for(int score : player) {
			while(!stack.isEmpty() && stack.peek() <= score) {
				stack.pop();
			}
			result.add(stack.size() + 1);
		}

		return result;
	}

}
