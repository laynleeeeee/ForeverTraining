package Test;

public class Custom {
	static class CustomException extends Exception{
		int num;
		public CustomException(int n) {
			// TODO Auto-generated constructor stub
			num = n;
		}
		public String toString() {
			return Integer.toString(num);
		}
	}
	static class ExecutingClass{
		static void calculate(int n) throws CustomException{
			throw new CustomException(n);
		}
		public static void main(String args[]) {
			try {
				calculate(42);
			} catch (Exception e) {
				System.out.println("Catchh22");
			}
		}
	}
}
