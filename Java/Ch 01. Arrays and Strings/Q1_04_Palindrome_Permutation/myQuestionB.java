package Q1_04_Palindrome_Permutation;

public class myQuestionB {
	public static boolean isPermutationOfPalindrome(String str) {
		boolean[] codes = new boolean[128];
		char[] chars = str.toCharArray();
		
		for (char ch : chars){
			codes[ch] = !codes[ch];
		}

		return true;
	}

	public static void main(String[] args) {
		String[] strings = {"A man, a plan, a canal, panama",
				"Rats live on no evil star",
				"Lleve",
				"Tacotac",
				"asda"};

		for (String s : strings) {
			boolean result = myQuestionB.isPermutationOfPalindrome(s);

			System.out.println(s);
			System.out.println("result: " + result);
			System.out.println();
		}
	}

}
