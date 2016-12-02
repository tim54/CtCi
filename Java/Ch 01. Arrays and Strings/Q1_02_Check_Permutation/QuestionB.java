package Q1_02_Check_Permutation;

public class QuestionB {
	private static int ALPHABET_NUM = 62;
	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) return false; // Permutations must be same length
		
		int[] letters = new int[128]; // Assumption: ASCII
		for (int i = 0; i < s.length(); i++) {
			letters[s.charAt(i)]++;
		}
		  
		for (int i = 0; i < t.length(); i++) {
			letters[t.charAt(i)]--;
		    if (letters[t.charAt(i)] < 0) {
		    	return false;
		    }
		}
		  
		return true; // letters array has no negative values, and therefore no positive values either
	}
	
	public static boolean myPermutation(String s, String t) {
		if (s.length() != t.length()) return false;
		
		int[] masS = new int[ALPHABET_NUM];
		int[] masT = new int[ALPHABET_NUM];
		
		for (int i = 0; i < s.length(); i++){
			int elemNumS = s.charAt(i) - 'a';
			int elemNumT = t.charAt(i) - 'a';
			
			if (elemNumS < 0 || elemNumS > ALPHABET_NUM) throw new ArrayIndexOutOfBoundsException();
			if (elemNumT < 0 || elemNumT > ALPHABET_NUM) throw new ArrayIndexOutOfBoundsException();
			
			masS[elemNumS]++;
			masT[elemNumT]++;
		}
		
		for (int i = 0; i < ALPHABET_NUM; i++) {
			if (masS[i] == masT[i]) continue;
			else return false;
		}

		return true;
	}
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			// boolean anagram = permutation(word1, word2);
			boolean anagram = myPermutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}
