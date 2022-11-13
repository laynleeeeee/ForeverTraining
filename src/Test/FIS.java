package Test;

public class FIS {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		String x = "abcde";
		StringBuffer y = new StringBuffer("abcde");
		
		if((Object) x == y) {System.out.println("x==y");}
		if(x.equals(y)) {System.out.println("x.equals y");}
		if(y.equals(x)) {System.out.println("y.equal x");}
		System.out.println("test");
	}
}