package cp120a.evanspc.hw2;
/***
 * 
 * @author philevans
 * @param
 */
public class Fibonacci {
	public static void main(String[] args) {
		//fibonacci series
		int num1 = 0;
		int num2 = 1;
		int fibo = 0;
		fibo = num1 + num2;

		CreateFibo fibomaker = new CreateFibo();
			while (fibo < 100){
			  //  System.out.println("fibo " + fibo);
		System.out.println("Fibo: " + fibomaker.createFibo(num1, num2));
			    fibo = num1 + num2;
			    num1 = num2;
			    num2 = fibo;
			}

		


		
		
	}
}
class CreateFibo
{
	private int number1;
	private int number2;
	private int fibo;

	//  public CreateFibo(int x, int y, int z)
	//  {
	//  number1 = x;
	//  number2 = y;
	//  fibo = z;
	//  }
	public int createFibo(int number1, int number2)
	{
		int fibo = number1 + number2;
		number1 = number2;
		number2 = fibo;
		return fibo;
	}
}

