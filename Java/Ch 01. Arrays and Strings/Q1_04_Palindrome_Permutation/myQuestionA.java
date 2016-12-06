package Q1_04_Palindrome_Permutation;

public class myQuestionA {

	public static boolean isPermutation(String first, String second){

		if (first.length() != second.length()) return false;

		return true;
	}
	
	// TOOD this method does not check for ',' etc symbols
	public static boolean isPermutationOfPalindrome(String str) {

		char[] chars = str.toLowerCase().toCharArray();
		int length = chars.length;
		boolean found = false;
		boolean even = (length % 2 == 0)? true: false;
		boolean flag = false;

		for (int i = 0; i < length / 2; i++) {
			System.out.println("Looking for: " + chars[i]);
			if (chars[i] != chars[length - 1 - i]) {
				for (int j = i + 1; j < length - 1 - i; j++) {
					if (chars[j] == chars[length - 1 - i]) {
						swap(chars[j], chars[length - 1 - i]);
						found = true;
						break;
					}
				}
				if (found) continue;
				else if (!even && !flag) { flag = true; continue; }
				return false;
			}
			found = false;
		}

		return true;
	}

	private static void swap(char ch1, char ch2) {
		char tmp = ch1;
		ch1 = ch2;
		ch2 = tmp;
	}

	public static void main(String[] args) {

		String[] strings = {"A man, a plan, a canal, panama",
				"Rats live on no evil star",
				"Lleve",
				"Tacotac",
				"asda"};

		for (String s : strings) {
			boolean result = myQuestionA.isPermutationOfPalindrome(s);

			System.out.println(s);
			System.out.println("result: " + result);
			System.out.println();
		}
	}
}
