package Interview;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AAABCCCCCCCD";
		System.out.println(compress(str));
	}

	public static String compress(String str) {
		char[] charArr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		int counter = 1;
		char compare = charArr[0];
		for(int i = 1; i< charArr.length; i++) {
			if(charArr[i] == compare) {
				counter++;
			} else {
				sb.append(compare);
				if(counter > 1) {
					sb.append(counter);
				}
				compare = charArr[i];
				counter = 1;
			}
		}
		sb.append(compare);
		if(counter > 1) {
			sb.append(counter);
		}
		return sb.toString();
	}
}
