package Test;

import java.util.Arrays;

public class Adaface {
	public static boolean ifCriteriaMet(String str) {
		boolean hasCons = false;
		boolean hasFour = false;
		char[] strChar = str.toCharArray();
		//Time complexity: o(n)
		for(int i = 0; i < strChar.length-3; i++) {
			if(strChar[i] == strChar[i+1] && strChar[i] == strChar[i+2]) {
				hasCons = true;
			}
		}
		//Time complexity: o(log n)
//		Arrays.sort(strChar);
		//Time complexity: o(n)
//		for(int i = 0; i < strChar.length - 4; i++) {
//			if(strChar[i] == strChar[i+1] && strChar[i] == strChar[i+2] && strChar[i] == strChar[i+3]) {
//				hasFour = true;
//			}
//		}
		//Time complexity: o(n^2)
		for(int i = 0; i < strChar.length ; i++) {
			int counter = 0;
			for(int j = 0; j < strChar.length; j++) {
				if(i != j) {
					if(strChar[i] == strChar[j]) {
						counter++;
						if(counter == 3) {
							hasFour = true;
							break;
						}
					}
				}
			}
		}
		if(hasCons || hasFour) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {
		String[] arr = {"9088897541","9167121391","1234567890"};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println(ifCriteriaMet(arr[i]));
		}
	}
}
