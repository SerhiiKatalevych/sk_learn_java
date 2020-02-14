package ua.univer.base.ifcase;

import ua.univer.base.bool.Bool;

public class Ifcase {
	
	public static int AboveZeroAddOne (int a) {
		if (Bool.IsAboveZero(a))
			return a+1;
		else
			return a;
	}
	
	public static int AboveZeroMinus (int a) {
		if (Bool.IsAboveZero(a))
			return a+1;
		else
			return a-2;
	}
	
	public static int NumberManipulation1 (int a) {
		if (a == 0)
			return 10;
		else
			return Ifcase.AboveZeroMinus(a);
	}
	
	public static int NumOfAboveZeroInSet (int a, int b, int c) {
		int numAboveZero=0;
		
		if (Bool.IsAboveZero(a))
			numAboveZero++;
		if (Bool.IsAboveZero(b))
			numAboveZero++;
		if (Bool.IsAboveZero(c))
			numAboveZero++;
		return numAboveZero;
	}
	
	public static int BeggerNum (int a, int b) {
		if (a > b)
			return a;
		else 
			return b;
	}
	
	public static void NumOfAboveAndBelowZero (int a, int b, int c) {
		int aboveZero=0;
		int belowZero=0;
		
		if (Bool.IsAboveZero(a))
			aboveZero++;
		if (Bool.IsAboveZero(b))
			aboveZero++;
		if (Bool.IsAboveZero(c))
			aboveZero++;
		if (Bool.IsBelowZero(a))
			belowZero++;
		if (Bool.IsBelowZero(b))
			belowZero++;
		if (Bool.IsBelowZero(c))
			belowZero++;
		System.out.println("Numbers above zero: "+aboveZero+" Numbers bolow zero: "+belowZero);
	}
	
	public static void DayOfWeek (int a) {
		switch (a) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Err: Unknown day number");
					
		}
	}
	
	public static void SeasonByMonth (int a) {
		switch (a) {
		case 1:
		case 2:
		case 12:
			System.out.println("Winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Autumn");
			break;
		default:
			System.out.println("Err: unkmown month number");
		}
	}

}
