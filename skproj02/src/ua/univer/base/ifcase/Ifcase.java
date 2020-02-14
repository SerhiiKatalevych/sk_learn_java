package ua.univer.base.ifcase;

import ua.univer.base.bool.Bool;

public class Ifcase {
	
	/**
	 * Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае не изменять его.
	 * @param a
	 * @return
	 */
	public static int AboveZeroAddOne (int a) {
		if (Bool.IsAboveZero(a))
			return a+1;
		else
			return a;
	}
	
	/**
	 * Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае вычесть из него 2.
	 * @param a
	 * @return
	 */
	public static int AboveZeroMinus (int a) {
		if (Bool.IsAboveZero(a))
			return a+1;
		else
			return a-2;
	}
	
	/**
	 * Дано целое число. Если оно является положительным, то прибавить к нему 1; если отрицательным, то вычесть из него 2;
	 * если нулевым, то заменить его на 10.
	 *  
	 * @param a
	 * @return
	 */
	public static int NumberManipulation1 (int a) {
		if (a == 0)
			return 10;
		else
			return Ifcase.AboveZeroMinus(a);
	}
	
	/**
	 * Даны три целых числа. Найти количество положительных чисел в исходном наборе.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
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
	
	/**
	 * Даны два числа. Вывести большее из них.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int BiggerNum (int a, int b) {
		if (a > b)
			return a;
		else 
			return b;
	}
	
	/**
	 * Даны три целых числа. Найти количество положительных и количество отрицательных чисел в исходном наборе
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
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
	
	/**
	 * Дано целое число в диапазоне 1–7. Вывести строку — название дня недели, соответствующее данному числу 
	 * (1 — «понедельник», 2 — «вторник» и т. д.)
	 * 
	 * @param a number of day in week
	 */
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
	
	/**
	 * Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.). 
	 * Вывести название соответствующего времени года («зима», «весна», «лето», «осень»)
	 * 
	 * @param a number of month in year
	 */
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
