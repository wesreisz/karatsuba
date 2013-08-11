package com.wesleyreisz.algorithms.karatsuba.simple;

public class ShiftTests {
	public static void main(String[] args){
		int val = 23;
		System.out.println("Val: " + val + " / " + Integer.toBinaryString(val));
		System.out.println("Shift right 1: " + (val >> 1) + " / " +  Integer.toBinaryString((val >> 1)));
		System.out.println("Shift right 2: " + (val >> 2) + " / " +  Integer.toBinaryString((val >> 2)));
		System.out.println("Shift right 3: " + (val >> 3) + " / " +  Integer.toBinaryString((val >> 3)));
		System.out.println("Shift right 4: " + (val >> 4) + " / " +  Integer.toBinaryString((val >> 4)));
		System.out.println("Shift right 5: " + (val >> 5) + " / " +  Integer.toBinaryString((val >> 5)));
		System.out.println("");
		System.out.println("Val: " + val + " / " + Integer.toBinaryString(val));
		System.out.println("Shift left 1: " + (val << 1) + " / " +  Integer.toBinaryString((val << 1)));
		System.out.println("Shift left 2: " + (val << 2) + " / " +  Integer.toBinaryString((val << 2)));
		System.out.println("Shift left 3: " + (val << 3) + " / " +  Integer.toBinaryString((val << 3)));
	}
}
