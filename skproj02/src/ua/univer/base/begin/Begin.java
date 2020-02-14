package ua.univer.base.begin;

public class Begin {
	
	final static double PI=3.1415;
	
	/**
	 * Дана сторона квадрата a. Найти его периметр P = 4·a.
	 * @param side size of square
	 * @return perimeter of square
	 */
	public static int PerimeterOfSquare (int side) {
		return side*4;
	}
	
	/**
	 * Дана сторона квадрата a. Найти его площадь.
	 * @param side size of square
	 * @return area of square
	 */
	public static int AreaOfSquare (int side) {
		return (int) Math.pow(side, 2);
	}
	
	/**
	 * Даны стороны прямоугольника a и b. Найти его периметр.
	 * @param side_x of rectangle
	 * @param side_y of rectangle
	 * @return perimeter of rectangle
	 */
	public static int PerimeterOfRectangle (int side_x, int side_y) {
		return 2*(side_x+side_y);
	}
	
	/**
	 * Даны стороны прямоугольника a и b. Найти его площадь.
	 * @param side_x of rectangle
	 * @param side_y of rectangle
	 * @return area of rectangle
	 */
	public static int AreaOfRectangle (int side_x, int side_y) {
		return side_x*side_y;
	}
	
	/**
	 * Дан диаметр окружности d. Найти ее длину L = π·d.
	 * @param diameter of circle
	 * @return lenghth of circle
	 */
	public static double CircleLengthByDiameter (double diameter) {
		return PI*diameter;
	}
	
	/**
	 * Найти длину окружности L заданного радиуса R.
	 * @param radius of circle
	 * @return lenghth of circle
	 */
	public static double CircleLengthByRadius (double radius) {
		return PI*2*radius;
	}
	
	/**
	 * Найти площадь круга S заданного радиуса R.
	 * @param radius of circle
	 * @return area of circle
	 */
	public static double AreaOfCircle (double radius) {
		return PI*Math.pow(radius, 2);
	}
	
	/**
	 * Дана длина ребра куба a. Найти объем куба.
	 * @param edge of cube
	 * @return volume of cube
	 */
	public static int VoulumeOfCube (int edge) {
		return (int) Math.pow(edge, 3);
	}
	
	/**
	 * Дана длина ребра куба a. Найти площадь его поверхности S = 6·a^2.
	 * @param edge
	 * @return surface area of cube
	 */
	public static int SurfaceAreaOfCube (int edge) {
		return 6* (int) Math.pow(edge, 2);
	}
	
	/**
	 * Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его объем V = a·b·c
	 * @param side_x of parallelepiped
	 * @param side_y of parallelepiped
	 * @param side_z of parallelepiped
	 * @return volume of parallelepiped
	 */
	public static int VolumeOfParallelepiped (int side_x, int side_y, int side_z) {
		return side_x*side_y*side_z;
	}
	
	/**
	 * Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его площадь поверхности S = 2·(a·b + b·c + a·c).
	 * @param side_x of parallelepiped
	 * @param side_y of parallelepiped
	 * @param side_z of parallelepiped
	 * @return surface area of parallelepiped
	 */
	public static int SurfaceAreaOfParallelepiped (int side_x, int side_y, int side_z) {
		return 2*(side_x*side_y+side_y*side_z+side_x*side_z);
	}
	
	/**
	 * Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2
	 * @param a first number
	 * @param b second number
	 * @return arithmetic mean of two numbers
	 */
	public static double ArithmeticMean (double a, double b) {
		return (a+b)/2;
	}
	
	/**
	 * Даны два неотрицательных числа a и b. Найти их среднее геометрическое, то есть квадратный корень из их произведения
	 * @param a first number
	 * @param b second number
	 * @return geometric mean
	 */
	public static double GeometricMean (double a, double b) {
		return Math.sqrt(a*b);
	}
}
