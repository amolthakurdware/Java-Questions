package solutions;

public class ReverseWords {

	public static void main(String[] args) {
			String str1="I Love Java";
			String[] words=str1.split(" ");
			for(int i=words.length-1;i>=0;i--) {
				System.out.print(words[i]+" ");
			}
	}

}
