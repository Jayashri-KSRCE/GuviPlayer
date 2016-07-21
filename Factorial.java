public class Factorial {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("please enter the number");
		}
		else
		{
			long factorial=1;
			int number=Integer.parseInt(args[0]);
			int i=number;
			if(number==0)
			{
				System.out.println("The factorial of "+number+" is "+factorial);
			}
			else
			{
				do
				{
					factorial=factorial*i;
					i--;
				}while(i>1);
				System.out.println("The factorial of "+number+" is "+factorial);
			}
		}
	}

}
