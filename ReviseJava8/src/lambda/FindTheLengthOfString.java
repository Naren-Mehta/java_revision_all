package lambda;

@FunctionalInterface
interface LengthInterf {
	public int length (String str);
}

public class FindTheLengthOfString {

	public static void main(String[] args) {

		LengthInterf i = str-> str.length();
		
		System.out.println(i.length("this is test"));
		
	}

}
