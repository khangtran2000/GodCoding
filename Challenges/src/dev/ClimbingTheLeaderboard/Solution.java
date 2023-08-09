package dev.ClimbingTheLeaderboard;

import java.util.*;

public class Solution {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int score : ranked) {
            if (stack.isEmpty() || stack.peek() != score) {
                stack.push(score);
            }
        }
        
        for (int score : player) {
            while (!stack.isEmpty() && score >= stack.peek()) {
                stack.pop();
            }
            result.add(stack.size() + 1);
        }
        
        return result;
    }

}
