import java.util.Scanner;

public class CheckSubInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String str1 = String.valueOf(a);
		String Str2 = String.valueOf(b);
		if(str1.contains(Str2)) {
			System.out.println(b+" is a subInteger of "+a);
		}
		else {
			System.out.println(b+" is not a subInteger of "+a);
		}
	}
}
