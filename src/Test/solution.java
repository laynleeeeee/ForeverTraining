package Test;
import java.util.*;

public class solution {
	public static void main(String[] args) {
//		int[] arr = {1,5,6,2,4,1};
//		System.out.println(solution(arr));
		String[] str = {"a","aab","abb","abab","abaaaba"};
		List<Integer> res = adjacency(str);
		for (Integer integer : res) {
			System.out.println(integer);
		}
	}

    public static int solution(int[] arr) {
        Arrays.sort(arr);

        int smallest = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallest) {
                smallest++;
            }
        }
        return smallest;
    }
   
  
    
    public String reshape(int n, String str) {
    	StringBuilder sb = new StringBuilder();

        char[] c = str.replaceAll(" " , "").toCharArray();
            int count = 0;
            for (int i = 0; i < c.length; i++) {
                if(count != n){
                    sb.append(c[i]);
                    count++;
                 }else {
                    count = 1;
                    sb.append("\n").append(c[i]);
                }
            }
        return sb.toString();
    }
    
    public static List<Integer> adjacency(String[] words){
    	List<Integer> result = new ArrayList<>();
    	for(int i = 0; i < words.length; i++) {
    		char[] wordsChar = words[i].toCharArray();
    		Integer count = 0;
    		int j = -1;
    		while(++j < wordsChar.length - 1)
    		{
    		    if (wordsChar[j] == wordsChar[j + 1])
    		    {
    		        count++;
    		        j++;
    		    }
    		}
    		result.add(count);
    	}
    	return result;
    }
}
