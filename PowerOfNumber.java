import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number and its power");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int result=(int) Math.pow(n1, n2);
		System.out.println("The Result:"+result);
		sc.close();
	}

}
