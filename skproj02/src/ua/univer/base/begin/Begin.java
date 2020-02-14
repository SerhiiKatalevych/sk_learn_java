package ua.univer.base.begin;

public class Begin {
	
	final static double PI=3.1415;
	
	public static int PerimeterOfSquare (int side) {
		return side*4;
	}
	
	public static int AreaOfSquare (int side) {
		return (int) Math.pow(side, 2);
	}
	
	public static int PerimeterOfRectangle (int side_x, int side_y) {
		return 2*(side_x+side_y);
	}
	
	public static int AreaOfRectangle (int side_x, int side_y) {
		return side_x*side_y;
	}
	
	public static double CircleLengthByDiameter (double diameter) {
		return PI*diameter;
	}
	
	public static double CircleLengthByRadius (double radius) {
		return PI*2*radius;
	}
	
	public static double AreaOfCircle (double radius) {
		return PI*Math.pow(radius, 2);
	}
	
	public static int VoulumeOfCube (int edge) {
		return (int) Math.pow(edge, 3);
	}
	
	public static int SurfaceAreaOfCube (int edge) {
		return 6* (int) Math.pow(edge, 2);
	}
	
	public static int VolumeOfParallelepiped (int side_x, int side_y, int side_z) {
		return side_x*side_y*side_z;
	}
	
	public static int SurfaceAreaOfParallelepiped (int side_x, int side_y, int side_z) {
		return 2*(side_x*side_y+side_y*side_z+side_x*side_z);
	}
	
	public static double ArithmeticMean (double a, double b) {
		return (a+b)/2;
	}
	
	public static double GeometricMean (double a, double b) {
		return Math.sqrt(a*b);
	}
}
