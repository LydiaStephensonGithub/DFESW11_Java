package string_manipulation;

public class StringManipulation {
	public static void wordCount(String message) {
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			if (message.substring(i, i + 1).equals(" ")) {
				count++;
			} else {
				continue;
			}
		}
		System.out.println(count + 1);
	}
	
	public static void print(String message) {
		String word = "";
		for (int i = 0; i < message.length(); i++) {
			if (message.substring(i, i + 1).equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word += message.substring(i, i + 1);
			}
		}
		System.out.println(word);
	}
	
	public static void reverse(String message) {
		String word = "";
		for (int i = message.length(); i > 0; i--) {
			if (message.substring(i - 1, i).equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word = message.substring(i - 1, i) + word;
			}
		}
		System.out.println(word);
	}
	
	public static boolean search(String message, String str) {
		for (int i = 0; i < message.length() - str.length(); i++) {
			if (message.substring(i, i + str.length()).equals(str)) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String message = "The cat sat on the mat";
		
		//wordCount(message);
		//print(message);
		//reverse(message);
		System.out.println(search(message, "cat"));
	}
}
