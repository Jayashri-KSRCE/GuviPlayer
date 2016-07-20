import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int year=scanner.nextInt();
		if(year%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("Not leap year");
		}
		scanner.close();
	}

}
