
public class String3 {
	public static void main(String[] args) {
		String s[] = { "sameer", "sohail", "mudassir" };

		for (String i : s) {
			char[] charArray = i.toCharArray();
	
			System.out.println(charArray[0] + " " + charArray[charArray.length - 1]);
		}

	}
}
