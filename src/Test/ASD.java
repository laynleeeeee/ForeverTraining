package Test;

public class ASD {

	public static void main(String[] args) {
		int[] a = {1,100,201,900};
		int[] b = {10, 200, 210, 1000};
		int maxCycleLength = Integer.MIN_VALUE;
		int startPoint = a[0];
        int endPoint = b[0];

		for(int i = startPoint; i <= endPoint; i++) {
			int cycleLength = getCycle(i);
            if(maxCycleLength < cycleLength)
            {
                maxCycleLength = cycleLength;
            }
		}
		System.out.println(a[0] + " " + b[0] + " " + maxCycleLength);
	}

	private static int getCycle(int n) {
		if(n != 1){
			if(n % 2 == 1) {
				return 1 + getCycle(3*(n) + 1);
			} else {
				return 1 + getCycle(n/2);
			}
		} else {
			return 1;
		}
	}
}
