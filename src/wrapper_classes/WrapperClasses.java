package wrapper_classes;

import java.util.ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {
	int a = 5;
	Integer b = 7;
	
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.compare(10, 10));
	String number = "15";
	int c = Integer.parseInt(number); //take number from the string - 15
	System.out.println(c * c); //multiple c =15
	System.out.println(Integer.max(7, 12));//find max in two numbers, print out max value - 12
	
	Character d = '$';
	char e = '%';//both are the same
	
	System.out.println(Character.isDigit('5')); //boolean digit or not
	String str2 = Character.toString('c');//Character to string
	
	Double.parseDouble("25.56");// from string to double for calculations
	
	ArrayList<Integer> myArr = new ArrayList<Integer>();// cannot use primitive type - int, need use class type - Integer
	
	Integer g = 15;// g is an object
	int f = g;//f - is primitive type //Unboxing, object is like a box and we unboxing it
	System.out.println(f);// Java convert class type to primitive type
	
	int t = 45;
	Integer r = t;//Autoboxing 
	System.out.println(r);
	
	

	}

}
