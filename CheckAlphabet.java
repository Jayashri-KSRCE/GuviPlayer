# GuviPlayer
import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		System.out.println(Character.isLetter(c));
		sc.close();
	}

}
