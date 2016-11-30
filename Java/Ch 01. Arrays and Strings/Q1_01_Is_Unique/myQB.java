package Q1_01_Is_Unique;

public class myQB {
	
	public static boolean isUniqueChars(String string) {
		for (int i = 0; i < string.length() - 1; i++) {
			for (int j = i + 1; j < string.length(); j++) {
				if (string.charAt(i) == string.charAt(j)) return false;
			}
		}
		return true;
	}

}
