package com.wesleyreisz.algorithms.karatsuba.simple;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.Assert;

import org.junit.Test;

public class KaratsubaTest {
	private static int BIT_SIZE = 8;
	@Test
	public void test() {
		Random rand = new Random();
		BigInteger a = new BigInteger(BIT_SIZE,rand);
		BigInteger b = new BigInteger(BIT_SIZE,rand);
		
		BigInteger testResult =  Karatsuba.multiply(a,b);
		System.out.println(String.format("%s * %s = %s", a , b, testResult));
		Assert.assertEquals(a.multiply(b),testResult);
	}
}
