package Test;

import java.util.HashMap;
import java.util.Map;

public class DoctorHashMap {
	public static void main(String args[]) {
		Map<Integer,String> symphony = new HashMap<>();
		symphony.put(109, "amy");
		symphony.put(null, "pond");
		symphony.put(null, null);
		
		System.out.println(symphony);
	}
}
