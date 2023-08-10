package dev.extraLongFactorials;

import java.math.BigInteger;

public class Solution {
	
    public static void extraLongFactorials(int n) {
    	BigInteger result = computeFactorial(n, new BigInteger(String.valueOf(n)));
    	System.out.println(result);

    }
    
    public static BigInteger computeFactorial(int n, BigInteger result) {
    	if(n <= 1 ) {
    		return result;
    	}
    	BigInteger next = new BigInteger(String.valueOf(n - 1));
    	result = result.multiply(next);
    	return computeFactorial(n - 1, result);
    }

}
