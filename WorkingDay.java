public class WorkingDay {

	public static boolean Workingday(String s) {
		if(s.equalsIgnoreCase("Monday") || s.equalsIgnoreCase("Tuesday") || s.equalsIgnoreCase("Wednesday") || s.equalsIgnoreCase("Thursday") || s.equalsIgnoreCase("Friday")) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(Workingday("monday"));
		System.out.println(Workingday("sunday"));
	}

}
