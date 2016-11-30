package Q1_01_Is_Unique;

import java.util.HashSet;
import java.util.Set;

public class myQA {

	public static boolean isUniqueChars(String string) {
		Set<Character> charSet = new HashSet<>();
		for (Character ch : string.toCharArray()){ if (!charSet.add(ch)) { return false; } }
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
