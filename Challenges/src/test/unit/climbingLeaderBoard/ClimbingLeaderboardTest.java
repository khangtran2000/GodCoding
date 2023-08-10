package test.unit.climbingLeaderBoard;

import static dev.ClimbingTheLeaderboard.Solution.climbingLeaderboard;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ClimbingLeaderboardTest {
	
    @Test
    public void testClimbingLeaderboard() {
        List<Integer> ranked = Arrays.asList(100, 100, 50, 40, 40, 20, 10);
        List<Integer> player = Arrays.asList(5, 25, 50, 120);
        List<Integer> expected = Arrays.asList(6, 4, 2, 1);
        
        List<Integer> result = climbingLeaderboard(ranked, player);
        assertEquals(expected, result);
    }
    
}
