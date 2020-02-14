package ua.univer.base.integers;

public class Integers {
		
		public static int NumberOfMeters (int distance_in_cm) {
			return distance_in_cm/100;
		}
		
		public static int NumbersOfTon (int weight_in_kg) {
			return weight_in_kg/1000;
		}
		
		public static int SizeInKb (int size_in_b) {
			return size_in_b/1024;
		}
		
		public static int Multiplicity (int a, int b) {
			return a/b;
		}
		
		public static int EuclideanDivision (int a, int b) {
			return a%b;
		}
		
		public static int FirstDigitOfdd (int dd) {
			return dd/10;
		}
		
		public static int SecondDigitOfdd (int dd) {
			return dd%10;
		}
		
		public static int SumOfddDigit (int dd) {
			return Integers.FirstDigitOfdd(dd)+Integers.SecondDigitOfdd(dd);
		}
		
		public static int MultOfddDigit (int dd) {
			return Integers.FirstDigitOfdd(dd)*Integers.SecondDigitOfdd(dd);
		}


}
