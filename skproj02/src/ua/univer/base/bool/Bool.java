package ua.univer.base.bool;

import ua.univer.base.integers.Integers;

public class Bool {
	
	/**
	 * Дано целое число A. Проверить истинность высказывания: «Число A является положительным»
	 * 
	 * @param a
	 * @return 
	 */
	public static boolean IsAboveZero (int a) {
		return a > 0;
	}
	
	/**
	 * Дано целое число A. Проверить истинность высказывания: «Число A является отрицательным»
	 * 
	 * @param a
	 * @return
	 */
	public static boolean IsBelowZero (int a) {
		return a < 0;
	}
	
	/**
	 * Дано целое число A. Проверить истинность высказывания: «Число A является четным»
	 * @param a
	 * @return
	 */
	public static boolean IsEvenNum (int a) {
		return a%2 == 0;
	}
	
	/**
	 * Дано целое число A. Проверить истинность высказывания: «Число Aявляется нечетным»
	 * @param a
	 * @return
	 */
	public static boolean IsOddNum (int a) {
		return a%2 != 0;
	}
	
	/**
	 * Даны два целых числа: A, B. Проверить истинность высказывания: «Справедливы неравенства A > 2 и B ≤ 3»
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean NumInSection1 (int a, int b) {
		return a>2 && b <=3;
	}
	
	/**
	 * Даны три целых числа: A, B, C. Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C»
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static boolean NumbersIsSeq (int a, int b, int c) {
		return a<b && b<c;
	}
	
	/**
	 * Даны два целых числа: A, B. Проверить истинность высказывания: «Каждое из чисел A и B нечетное».
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean NumbersAreOdds (int a, int b) {
		return Bool.IsOddNum(a) && Bool.IsOddNum(b);
	}
	
	/**
	 * Даны два целых числа: A, B. Проверить истинность высказывания: «Хотя бы одно из чисел A и B нечетное»
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean OneOfTwoNumOdd (int a, int b) {
		return Bool.IsOddNum(a) || Bool.IsOddNum(b);
	}
	
	/**
	 * Даны два целых числа: A, B. Проверить истинность высказывания: «Ровно одно из чисел A и B нечетное».
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean OnlyOneNumberOdd (int a, int b) {
		return (Bool.IsOddNum(a) && Bool.IsEvenNum(b)) || (Bool.IsEvenNum(a) && Bool.IsOddNum(b));
	}
	
	/**
	 * Даны три целых числа: A, B, C. Проверить истинность высказывания: «Каждое из чисел A, B, C положительное».
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static boolean DigitsAreAboveZero (int a, int b, int c) {
		return Bool.IsAboveZero(a) && Bool.IsAboveZero(b) && Bool.IsAboveZero(c);
	}
	
	/**
	 * Дано целое положительное число. Проверить истинность высказывания: «Данное число является нечетным трехзначным».
	 * 
	 * @param a
	 * @return
	 */
	public static boolean IsOddThreeDigits (int a) {
		return Bool.IsOddNum(a) && (a < 1000 && a > 99);
	}
	
	/**
	 * Дано трехзначное число. Проверить истинность высказывания: «Все цифры данного числа различны».
	 * 
	 * @param a
	 * @return
	 */
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
