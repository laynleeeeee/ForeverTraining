package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class TurtlePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{2,3,7},
						{5,4,2},
						{3,7,11}};
		System.out.println(arr.length);

		HashMap<Integer, Integer[]> arrMap = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(isPrime(arr[i][j])) {
					arrMap.put(arr[i][j], new Integer[] {i,j});
				}
			}
		}
		System.out.println(arrMap);
	}

	private static boolean isPrime(int num) {
		boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }
	    return !flag;
	}

}
