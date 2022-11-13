package Test;

public class MainFestival {
	public static class MusicFestival{
		public int price;
	}
	public static void changeString(String month) {
		month = "january";
	}
	public static void changeHoliday(String holidays) {
		holidays = "15";
	}
	public static void changeObject(MusicFestival ms) {
		ms.price = 32;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month = "february";
		changeString(month);
		System.out.println(month);
		MusicFestival ms = new MusicFestival();
		ms.price = 40;
		changeObject(ms);
		System.out.println(ms.price);
	}

}
