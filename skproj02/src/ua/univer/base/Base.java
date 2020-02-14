package ua.univer.base;

import ua.univer.base.begin.Begin;
import ua.univer.base.bool.Bool;
import ua.univer.base.ifcase.Ifcase;
import ua.univer.base.integers.Integers;

public class Base {

	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		System.out.println(">>>>>>>>>>Begin>>>>>>>>>>>>>>>>>>>>");
		int side_of_square=55;
		System.out.println("The side of squre is "
							+side_of_square+" Perimeter = "
							+Begin.PerimeterOfSquare(side_of_square)
							+" Area = "
							+Begin.AreaOfSquare(side_of_square));
		int rectangle_side_x=23;
		int rectangle_side_y=121;
		System.out.println("Rectangle dimension is ("
							+rectangle_side_x
							+","
							+rectangle_side_y
							+") Area = "
							+Begin.AreaOfRectangle(rectangle_side_x, rectangle_side_y)
							+" Perimeter = "
							+Begin.PerimeterOfRectangle(rectangle_side_x, rectangle_side_y));
		double circle_diameter=39;
		double circle_radius=0;
		circle_radius=circle_diameter/2;
		System.out.println("Circle diameter is "
							+circle_diameter
							+" Lenght of circle = "
							+Begin.CircleLengthByDiameter(circle_diameter)
							+" Circle area = "
							+Begin.AreaOfCircle(circle_radius));
		int cube_edge=56;
		System.out.println("Cube edge is "
							+cube_edge
							+" Vulume of cube = "
							+Begin.VoulumeOfCube(cube_edge)
							+" Surface area of cube = "
							+Begin.SurfaceAreaOfCube(cube_edge));
		int pp_side_x=123;
		int pp_side_y=32;
		int pp_side_z=9;
		System.out.println("Parallelepiped dimension is ("
							+pp_side_x
							+","
							+pp_side_y
							+","
							+pp_side_z
							+") Volume of parallelepiped = "
							+Begin.VolumeOfParallelepiped(pp_side_x, pp_side_y, pp_side_z)
							+" Surface area of parallelepiped = "
							+Begin.SurfaceAreaOfParallelepiped(pp_side_x, pp_side_y, pp_side_z));
		double first_number=123.4;
		double second_number=649.0;
		System.out.println("There are two numbers ("
							+first_number
							+","
							+second_number
							+") Arithmetic mean = "
							+Begin.ArithmeticMean(first_number, second_number)
							+" Geometric mean = "
							+Begin.GeometricMean(first_number, second_number));
		System.out.println("-----------------------------------");
		System.out.println(">>>>>>>>>>Integer>>>>>>>>>>>>>>>>>>>");
		int distance_cm=1264;
		System.out.println("Distance in cm = "
							+distance_cm
							+" It has "
							+Integers.NumberOfMeters(distance_cm)
							+" meters");
		int weight_kg=8564;
		System.out.println("Weight is kg = "
							+weight_kg
							+" It has "
							+Integers.NumbersOfTon(weight_kg)
							+" tones");
		int size_bytes=2182646;
		System.out.println("Size of file in bytes = "
							+size_bytes
							+" It has "
							+Integers.SizeInKb(size_bytes)
							+" kilobytes");
		int a=34;
		int b=13;
		System.out.println("Number a = "
							+a
							+" has number b = "
							+b
							+" "
							+Integers.Multiplicity(a, b)
							+" times");
		System.out.println("Rest of a ="
							+a
							+" and b = "
							+b
							+" is "
							+Integers.EuclideanDivision(a, b));
		int dd_num=92;
		System.out.println("Two digit number is "
							+dd_num
							+" First digit: "
							+Integers.FirstDigitOfdd(dd_num)
							+" Second digit: "
							+Integers.SecondDigitOfdd(dd_num)
							+" Sum of numbers digits: "
							+Integers.SumOfddDigit(dd_num)
							+" Mult of numbers digits: "
							+Integers.MultOfddDigit(dd_num)
							+" reversed number:"
							+Integers.ReversDd(dd_num));
		int td_num=345;
		System.out.println("Three digit number is "
							+td_num
							+" First digit: "
							+Integers.FirstDigitOftd(td_num)
							+" Second digit: "
							+Integers.FirstDigitOftd(td_num)
							+" Thirs digit: "
							+Integers.ThirdDigitOftd(td_num));
		System.out.println("-----------------------------------");
		System.out.println(">>>>>>>>>>Boolean>>>>>>>>>>>>>>>>>>");
		int num=3;
		System.out.println("Number is "
							+num
							+" Is number positive: "
							+Bool.IsAboveZero(num)
							+". Is number negative "
							+Bool.IsBelowZero(num)
							+". Is number even "
							+Bool.IsEvenNum(num)
							+". Is number odd "
							+Bool.IsOddNum(num));
		int num1=2;
		int num2=5;
		System.out.println("Numbers are ("
							+num1
							+","
							+num2
							+"). Is num1 > 2 and num2 <= 3: "
							+Bool.NumInSection1(num1, num2)
							+". Two numbers are odd: "
							+Bool.NumbersAreOdds(num1, num2)
							+". Only one of two numbers is odd: "
							+Bool.OnlyOneNumberOdd(num1, num2)
							+". One of two numbers is odd: "
							+Bool.OneOfTwoNumOdd(num1, num2));
		System.out.println("Nubers are ("
							+num
							+","
							+num1
							+","
							+num2
							+") Are these numbers positive: "
							+Bool.DigitsAreAboveZero(num, num1, num2));
		int num_td=237;
		System.out.println("Number is "
							+num_td
							+". Is number has three digits and it's odd: "
							+Bool.IsOddThreeDigits(num_td)
							+". Are number's digits different: "
							+Bool.AreDigitsInNumDiff(num_td));
		System.out.println("-----------------------------------");
		System.out.println(">>>>>>>>>>if and case>>>>>>>>>>>>>>");
		int n1=23;
		int n2=-3;
		int n3=0;
		System.out.println("Number is "
							+n1
							+"Add one if positive: "
							+Ifcase.AboveZeroAddOne(n1));
		System.out.println("Number is "
				+n2
				+"Add one if positive, minus tow if negative: "
				+Ifcase.AboveZeroMinus(n2));
		System.out.println("Number is "
				+n3
				+"Add one if positive, minus tow if negative, replase by ten if zero: "
				+Ifcase.NumberManipulation1(n3));
		System.out.println("Find bigger nuber in set ("
				+n2
				+","
				+n3
				+") :"
				+Ifcase.BiggerNum(n2, n3));
		System.out.print("Numbers set is ("
				+n1
				+","
				+n2
				+","
				+n3
				+") ");
		Ifcase.NumOfAboveAndBelowZero(n1,n2, n3);
		int day_of_week=3;
		System.out.print("Number of week's day is "+day_of_week+". It is ");
		Ifcase.DayOfWeek(day_of_week);
		int number_of_month=8;
		System.out.print("The season of month number "+number_of_month+" is ");
		Ifcase.SeasonByMonth(number_of_month);
		System.out.println("-----------------------------------");
	}

}
