public class Pyramid {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scanner.nextInt();
		int a=1;
		int b;
		for(int i=1;i<=n;i++)
		{ 
			b=a;
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{ 
				System.out.print(b);
				b++;
				if(b>9)
				{
					b=0;
				}
				
			}
			
				a=b;
				b--;
				for(int k=1;k<i;k++)
				{
					b--;
					if(b<0)
					{
						b=9;
					}
				System.out.print(b);
				}
			System.out.println();

		}
		scanner.close();
	}

}
