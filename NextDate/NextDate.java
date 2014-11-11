package tuan.tutorial;

public class NextDate {
	public static void main(String[] args) {
		
		try {
			CheckNextDate nextDate = new CheckNextDate(30, 2, 2014);
			nextDate.NextDate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
