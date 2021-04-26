package solutions;

public class Factorial {

	public static void main(String[] args) {
		int number=3;
		System.out.println(factorial(number));
	}

	private static int factorial(int number) {
		int factorial=1;
		for(int i=number;i>=1;i--) {
			factorial=factorial*i;
		}
		return factorial;
	}


}
