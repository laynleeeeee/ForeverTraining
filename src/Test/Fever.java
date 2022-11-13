package Test;

class Fever extends Cancer{
	public static void main(String[] args) {
		System.out.println("G");
		new Fever();
		System.out.println("H");
	}
}


class Cancer extends Disease{
	static {
		System.out.println("C");
	}
	public Cancer() {
		System.out.println("D");
	}
	{
		System.out.println("E");
	}
	static {
		System.out.println("F");
	}
}

class Disease{
	{
		System.out.println("A");
	}
	public Disease() {
		System.out.println("B");
	}
}

