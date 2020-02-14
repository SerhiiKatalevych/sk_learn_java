package ua.univer.base.integers;

public class Integers {
		
		/**
		 * Дано расстояние L в сантиметрах. Используя операцию деления нацело, найти количество полных метров в нем
		 * @param distance_in_cm distance (cm)
		 * @return number of meters in distance
		 */
		public static int NumberOfMeters (int distance_in_cm) {
			return distance_in_cm/100;
		}
		
		/**
		 * Дана масса M в килограммах. Используя операцию деления нацело, найти количество полных тонн в ней
		 * @param weight_in_kg
		 * @return wieght in kilograms
		 */
		public static int NumbersOfTon (int weight_in_kg) {
			return weight_in_kg/1000;
		}
		
		/**Дан размер файла в байтах. Используя операцию деления нацело, найти количество полных килобайтов, 
		 * которые занимает данный файл
		 * @param size_in_b bytes
		 * @return size if kilobytes
		 */
		public static int SizeInKb (int size_in_b) {
			return size_in_b/1024;
		}
		
		/**
		 * Даны целые положительные числа A и B (A > B). На отрезке длины A
		 * размещено максимально возможное количество отрезков длины B (без наложений). 
		 * Используя операцию деления нацело, найти количество отрезков B, размещенных на отрезке A.
		 * 
		 * @param a
		 * @param b
		 * @return 
		 */
		public static int Multiplicity (int a, int b) {
			return a/b;
		}
		
		/**
		 * Даны целые положительные числа A и B (A > B). На отрезке длины A размещено максимально возможное 
		 * количество отрезков длины B (без наложений). Используя операцию взятия остатка от деления нацело,
		 * найти длину незанятой части отрезка A
		 * 
		 * @param a
		 * @param b
		 * @return
		 */
		public static int EuclideanDivision (int a, int b) {
			return a%b;
		}
		
		/**
		 * Дано двузначное число. Вывести его левую цифру (десятки)
		 * 
		 * @param dd two digit number
		 * @return first digit of number
		 */
		public static int FirstDigitOfdd (int dd) {
			return dd/10;
		}
		
		/**
		 * Дано двузначное число. Вывести правую цифру (единицы)
		 * 
		 * @param dd two digit number
		 * @return second digit of number
		 */
		public static int SecondDigitOfdd (int dd) {
			return dd%10;
		}
		
		/**
		 * Дано двузначное число. Найти сумму его цифр
		 * 
		 * @param dd two digit number
		 * @return sum of number's digits
		 */
		public static int SumOfddDigit (int dd) {
			return Integers.FirstDigitOfdd(dd)+Integers.SecondDigitOfdd(dd);
		}
		
		/**
		 * Дано двузначное число. Найти произведение его цифр
		 * 
		 * @param dd two digit number
		 * @return mult of number's digits
		 */
		public static int MultOfddDigit (int dd) {
			return Integers.FirstDigitOfdd(dd)*Integers.SecondDigitOfdd(dd);
		}
		
		/**
		 * Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа
		 * 
		 * @param dd two digit number
		 * @return revers order of number's digits
		 */
		public static int ReversDd (int dd) {
			return Integers.SecondDigitOfdd(dd)*10+Integers.FirstDigitOfdd(dd);
		}
		
		/**
		 * Дано трехзначное число. Используя одну операцию деления нацело, вывести первую цифру данного числа (сотни)
		 * 
		 * @param td three digit number
		 * @return first digit of number
		 */
		public static int FirstDigitOftd (int td) {
			return td/100;
		}
		
		/**
		 * Дано трехзначное число. Вывести его среднюю цифру (десятки).
		 * 
		 * @param td three digit number
		 * @return second digit of number
		 */
		public static int SeconDigitOftd (int td) {
			return Integers.FirstDigitOfdd((td-(Integers.FirstDigitOftd(td)*100)));
		}
		
		/**
		 * Дано трехзначное число. Вывести его последнюю цифру (единицы)
		 * 
		 * @param td three digit number
		 * @return third digit of number
		 */
		public static int ThirdDigitOftd (int td) {
			return td%100;
		}


}
