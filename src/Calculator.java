//package cp120a.evanspc.hw1;


public class Calculator {
	public static void main(String[] args) {
		int sample[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		{
			// use a for loop to print out the content of the sample integer
			// array
			/*
			 * simple incrementing counter
			 */
			System.out.println("	Problem 1");
			int i;
			for (i = 0; i < sample.length; i++) {
				System.out.println("Array Item " + i + ": " + sample[i]);
			}
			// use while loop to find average value of the sample integer array,
			// and print it out
			/*
			 * counter vs array length
			 */
			System.out.println("	Problem 2");
			float aver;
			// if sum is an int rather than float, variable aver gets turned into an int
			float sum = 0;
			int counter = 0;
			while (counter < sample.length) {
				sum += sample[counter];
				counter++;
			}
			aver = sum / counter;
			System.out.println("Average of array: " + aver);

			// use do while loop to find the max and min value of the sample
			// array , and print it out
			/*
			 * why do I get an java.lang.ArrayIndexOutOfBoundsException when I
			 * use for (int j : sample) ?
			 */
			System.out.println("	Problem 3");
			int min = 0;
			int max = 0;
			int j;
			for (j = 0; j < sample.length; j++) {
				min = (sample[j] < min) ? sample[j] : min;
				max = (sample[j] > max) ? sample[j] : max;
			}
			System.out.println("Min: " + min);
			System.out.println("Max: " + max);
			// use for loop to find the first value larger than 5 in the sample
			// array , print it out and exit the loop immediately
			/*
			 * use break to exit loop at ary item > 5
			 */
			System.out.println("	Problem 4");

			for (int f : sample) {
				if (sample[f] > 5) {
					System.out.println("Larger than 5: " + sample[f]);
					break;
				}
			}

		}

	}

}

