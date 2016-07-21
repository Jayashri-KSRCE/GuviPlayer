public class PrimeOrNot {

	public static void main(String[] args) {
		int flag=0;
		if(args.length==0)
		{
			System.out.println("Please enter an integer number ");
		}
		else
		{
			int number=Integer.parseInt(args[0]);
			if(number==0||number==1)
			{
				System.out.println(number+" is neither prime nor composite");
			}
			else
			{
				for(int i=number-1;i>1;i--)
				{
					if(number%i==0)
					{
						System.out.println(number+" is not prime");
						System.exit(0);
					}
				}
				if(flag==0)
				{
					System.out.println(number+" is prime");
				}
			}
		}
	}

}
