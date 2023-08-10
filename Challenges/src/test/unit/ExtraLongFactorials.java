package test.unit;

import static org.junit.Assert.assertEquals;
import static dev.extraLongFactorials.Solution.computeFactorial;

import java.math.BigInteger;

import org.junit.Test;;

public class ExtraLongFactorials {
	
    @Test
    public void testFactorialWithSmallInput() {
        int n = 5;
        BigInteger expected = BigInteger.valueOf(120);
        BigInteger result = computeFactorial(n, BigInteger.ONE);
        assertEquals(expected, result);
    }

    @Test
    public void testFactorialWithLargeInput() {
        int n = 25;
        BigInteger expected = new BigInteger("15511210043330985984000000");
        BigInteger result = computeFactorial(n, BigInteger.ONE);
        assertEquals(expected, result);
    }


}
