package com.wesleyreisz.algorithms.karatsuba.simple;

import java.math.BigInteger;

public class Karatsuba {
	public static BigInteger multiply(BigInteger x, BigInteger y){
        char xNumber[]=x.toString().toCharArray();
        char yNumber[]=y.toString().toCharArray();
        
        //split the first number into two parts
        long xNumberHalf = xNumber.length/2 + xNumber.length % 2;//divide by 2 and round up
        long a = Integer.parseInt(new String(getSubString(xNumber, 0, (int) xNumberHalf)));
        long b = Integer.parseInt(new String(getSubString(xNumber, (int) xNumberHalf, xNumber.length)));
       
        //split the second number into two parts
        long yNumberHalf = yNumber.length/2 + yNumber.length % 2;//divide by 2 and round up
        long c = Integer.parseInt(new String(getSubString(yNumber, 0, (int) yNumberHalf)));
        long d =  Integer.parseInt(new String(getSubString(yNumber, (int) yNumberHalf, yNumber.length)));
        
        //perform the steps
        long step1 = a*c;
        long step2 = b*d;
        long step3 = (a+b)*(c+d);
        long step4 = step3-step2-step1;
        
        //add the results
        long result = 0;
        result = padWithZeros(step1, String.valueOf(step3).length());
        result = result + step2;
        result = result + padWithZeros(step4,  String.valueOf(step3).length()/2 + (String.valueOf(step3).length() % 2));
        
        return BigInteger.valueOf(result);
	}
	private static long padWithZeros(long value, long num2pad){
		String result =String.valueOf(value);
		for(int cnt=0;cnt<num2pad;cnt++){
			result+="0";
		}
		return Integer.parseInt(result);
	}
	private static char[] getSubString(char[] chars, int start, int length){
		char[]result = new char[length-start];
		for(int cnt=start;cnt<length;cnt++){
			result[cnt-start]=chars[cnt];
		}
		return result;
	}
}
