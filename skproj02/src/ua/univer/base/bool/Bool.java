package ua.univer.base.bool;

import ua.univer.base.integers.Integers;

public class Bool {
	
	public static boolean IsAboveZero (int a) {
		return a > 0;
	}
	
	public static boolean IsBelowZero (int a) {
		return a < 0;
	}
	
	public static boolean IsEvenNum (int a) {
		return a%2 == 0;
	}
	
	public static boolean IsOddNum (int a) {
		return a%2 != 0;
	}
	
	public static boolean NumInSection1 (int a, int b) {
		return a>2 && b <=3;
	}
	
	public static boolean NumbersIsSeq (int a, int b, int c) {
		return a<b && b<c;
	}
	
	public static boolean NumbersAreOdds (int a, int b) {
		return Bool.IsOddNum(a) && Bool.IsOddNum(b);
	}
	
	public static boolean OneOfTwoNumOdd (int a, int b) {
		return Bool.IsOddNum(a) || Bool.IsOddNum(b);
	}
	
	public static boolean OnlyOneNumberOdd (int a, int b) {
		return (Bool.IsOddNum(a) && Bool.IsEvenNum(b)) || (Bool.IsEvenNum(a) && Bool.IsOddNum(b));
	}
	
	public static boolean DigitsAreAboveZero (int a, int b, int c) {
		return Bool.IsAboveZero(a) && Bool.IsAboveZero(b) && Bool.IsAboveZero(c);
	}
	
	public static boolean IsOddThreeDigits (int a) {
		return Bool.IsOddNum(a) && (a < 1000 && a > 99);
	}
	
	public static boolean AreDigitsInNumDiff (int a) {
		int firstDig=0;
		int secondDig=0;
		int thirdDig=0;
		
		firstDig=Integers.FirstDigitOftd(a);
		secondDig=Integers.SeconDigitOftd(a);
		thirdDig=Integers.ThirdDigitOftd(a);
		
		return firstDig != secondDig && secondDig != thirdDig && firstDig != thirdDig;
	}
}
