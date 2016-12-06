package Q1_03_URLify;

import java.util.ArrayList;
import java.util.List;

import CtCILibrary.AssortedMethods;

public class Question {
	// Assume string has sufficient free space at the end
	public static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;
		if (trueLength < str.length) str[trueLength] = '\0';
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}
	
	public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {
				return i;
			}
		}
		return -1;
	}
	
	public static char[] myReplaceSpaces(char[] str){
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < str.length; i++){
			if (str[i] == ' '){
				list.add('%');
				list.add('2');
				list.add('0');
			} else {
				list.add(str[i]);
			}
		}
		
		char[] retChars = new char[list.size()];
		int i = 0;
		for (char ch : list){
			retChars[i++] = ch;
		}
		
		return retChars;
	}
	
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		char[] arr = str.toCharArray();
		int trueLength = findLastCharacter(arr) + 1;
		// replaceSpaces(arr, trueLength);
		// System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
		System.out.println("\"" + AssortedMethods.charArrayToString(myReplaceSpaces(arr)) + "\"");
	}
}
