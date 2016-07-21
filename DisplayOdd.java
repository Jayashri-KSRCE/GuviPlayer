import java.util.Scanner;

public class DisplayOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Interval");
		int start=s.nextInt();
		int end=s.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}

	}

}
