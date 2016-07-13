# GuviPlayer
package github.level.one;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String result="";
		if(n>0)
		{
			result+="positive";
		}
		else
		{
			result+="negative";
		}
		System.out.println(result);
	}

}
