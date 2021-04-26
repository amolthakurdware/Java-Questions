package solutions;
public class PrimeOrNot {

	public static void main(String[] args) {
		for(int number=2;number<=100;number++) {
			if(isPrime(number)) {
				System.out.println(number);
			}
		}
	}

	private static boolean isPrime(int number) {
		for(int i=number-1;i>1;i--) {
			int rem=number%i;
			if(rem==0) {
				return false;
			}
		}
		return true;
	}


}
