package ua.univer.base;

import ua.univer.base.begin.Begin;
import ua.univer.base.bool.Bool;
import ua.univer.base.ifcase.Ifcase;
import ua.univer.base.integers.Integers;

public class Base {

	public static void main(String[] args) {
		System.out.println(Begin.AreaOfCircle(22.4));
		System.out.println(Integers.SumOfddDigit(42));
		System.out.println(Integers.ReversDd(42));
		System.out.println(Integers.SeconDigitOftd(542));
		System.out.println(Bool.IsAboveZero(-1));
		System.out.println(Bool.IsEvenNum(55));
		System.out.println(Bool.IsOddNum(221));
		System.out.println(Bool.NumInSection1(34, 1));
		System.out.println(Bool.NumbersAreOdds(31, 33));
		System.out.println(Bool.OneOfTwoNumOdd(22, 34));
		System.out.println("-----------------------------------");
		//System.out.println(Bool.OnlyOneNumberOdd(1, 1));
		//System.out.println(Bool.DigitsAreAboveZero(1, -2, 3));
		System.out.println(Bool.IsOddThreeDigits(9999));
		System.out.println(Bool.AreDigitsInNumDiff(231));
		System.out.println("-----------------------------------");
		System.out.println(Ifcase.AboveZeroAddOne(-3));
		System.out.println(Ifcase.AboveZeroMinus(-1));
		System.out.println(Ifcase.NumberManipulation1(-10));
		System.out.println(Ifcase.NumOfAboveZeroInSet(-1, -1, -1));
		System.out.println(Ifcase.BeggerNum(100, 2));
		Ifcase.NumOfAboveAndBelowZero(1, -2, -30);
		Ifcase.DayOfWeek(4);
		Ifcase.SeasonByMonth(11);
	}

}
