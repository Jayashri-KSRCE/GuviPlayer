import java.util.Scanner;

public class CountPrimeNumberInRange {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Interval");
		int start=s.nextInt();
		int end=s.nextInt();
		int count1=0;
		for(int i=start;i<=end;i++)
		{
			int count=0;
			for(int j=i;j>0;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				count1++;
				
			}
			
		}
		System.out.println(count1);
		s.close();
	}

}
