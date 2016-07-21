public class Palindrome {

	public static void main(String[] args) {
		String str1=args[0];
		StringBuffer str2=new StringBuffer(str1);
		str2=str2.reverse();
		String str=str2.toString();
		int number1=Integer.parseInt(str1);
		int number2=Integer.parseInt(str);
		if(number1==number2)
		{
			System.out.println(number1+" is a palindrome");
		}
		else
		{
			System.out.println(number1+" is not a palindrome");
		}
	}

}
