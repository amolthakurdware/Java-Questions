
public class ArmstrongNumber {
	public static void main(String[] args) {
		int no=8208;
		if(isArmstrongNumber(no)) {
			System.out.println(no+" is Armstrong Number");
		}else {
			System.out.println(no+" is not Armstrong Number");
		}
		
	}

	private static boolean isArmstrongNumber(int no) {
		int[] digitArr=getDigitArray(no);
		int sum=0;
		for(int digit:digitArr) {
			sum=sum+power(digit,digitArr.length);
		}
		return sum==no;
	}

	private static int power(int digit, int power) {
		int result=digit;
		for(int i=1;i<power;i++) {
			result=result*digit;
		}
		return result;
	}

	private static int[] getDigitArray(int no) {
		String strNo=no+"";
		final char[] charArray = strNo.toCharArray();
		int[] digitArr=new int[charArray.length];
		for(int i=0;i<charArray.length;i++) {
			digitArr[i]=Integer.parseInt(charArray[i]+"");
		}
		return digitArr;
	}
}
