public class FindZeroInFactorial {

	public static long factorial(int n) {
		if(n==1 || n==0)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		long n=factorial(20);
		System.out.println(n);
		String s=String.valueOf(n);
		System.out.println(s);
		int count=0;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)=='0') {
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(count);
	}

}
