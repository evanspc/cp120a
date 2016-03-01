package cp120a.evanspc.hw2;


/*
 * @Phil Evans
 * @HW2 1/27/2016
 * 
 * Mr Cheung,
 * I'm still having problems getting my programs to compile in Eclipse.  I will try to 
 * come in before class and get some help.  I wrote this in a text editor, and 
 * compiled and ran at the command line (javac and java).  I know this isn't in 
 * the correct format (I couldn't get a constructor method to work), but wanted to at 
 * least show that I could do the rest of the work.  Apologies...
 * Thanks,
 * Phil
 */

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter first number:");
		double num1 = input.nextInt();
		System.out.print("Please enter second number:");
		double num2= input.nextInt();

		Calculate calc = new Calculate();
		System.out.println("Add: " + calc.add(num1, num2));
		System.out.println("Subtract: " + calc.subtract(num1, num2));
		System.out.println("Multiply: " + calc.multiply(num1, num2));
		System.out.println("Divide: " + calc.divide(num1, num2));
		System.out.println("Memory Set: " + calc.setMemory(num1, num2));
		System.out.println("Memory Show: " + calc.showMemory(num1, num2));
		System.out.println("Memory Clear: " + calc.clearMemory());

		double first = Math.ceil(Math.random() * 99);
		double second = Math.ceil(Math.random() * 99);
		double third = Math.ceil(Math.random() * 99);
		double sample[] = {first, second, third};
		int i;
		for (i = 0; i < sample.length; i++)
		{
			System.out.println("Array Item " + i + ": " + sample[i]);
		}

		System.out.println("Average:" + calc.average(sample));
		System.out.println("Min:" + calc.min(sample, "min"));
		System.out.println("Max:" + calc.min(sample, "max"));

	}
}

class Calculate {

	private double memory;

	// won't compile with the following constructor
	/*
 public Calculate(double x, double y, double ary[], String z)
 {
 firstnum = x;
 secondnum = y;
 numary = ary;
 minmax = z;
 }
	 */

	public double clearMemory() {
		return 0.0;
	}
	public double showMemory(double a, double b) {
		return memory;
	}
	public double setMemory(double a, double b) {
		memory = a + b;
		return memory;
	}
	public double average(double[] sample) {
		double aver;
		double sum = 0;
		int counter = 0;
		while (counter < sample.length)
		{
			sum += sample[counter];
			counter++;
		}
		aver = sum / counter;
		return aver;
	}
	public double min(double[] sample, String minormax) {
		double min = 100;
		double max = 0;
		int j;
		for (j = 0; j < sample.length; j++)
		{
			min = (sample[j] < min) ? sample[j] : min;
			max = (sample[j] > max) ? sample[j] : max;
		}
		if (minormax == "min")
		{
			return min;
		}
		else
		{
			return max;
		}
	}
	/*     public double max(double[] sample) {
 double min = 100;
 double max = 0;
 int j;
 for (j = 0; j < sample.length; j++)
     {
	 min = (sample[j] < min) ? sample[j] : min;
	 max = (sample[j] > max) ? sample[j] : max;
     }
 return max;
 }
	 */
	public double add (double num1, double num2)
	{
		return num1 + num2;
	}
	public double subtract(double a, double b) {
		return a - b;
	}
	public double multiply(double a, double b) {
		return a * b;
	}
	public double divide(double a, double b) {
		return a / b;
	}
}
