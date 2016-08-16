import java.util.Scanner;

public class FindprefixString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 Strings");
		String[] str=new String[5];
		for(int i=0;i<5;i++) {
			str[i]=sc.next();
		}
		int[] len=new int[5];
		for(int i=0;i<str.length;i++) {
			len[i]=str[i].length();
		}
		int min=len[0];
		String minStr = str[0];
		for(int i=0;i<5;i++) {
			if(min>len[i]) {
				minStr=str[i];
				min=len[i];
			}
		}
		int temp=min;
		String output="";
		int t=temp;
		while(t>0) {
			int count=0;
			for(int i=0;i<5;i++) {
				if(minStr.equals(str[i].substring(0, temp))) {
					count++;
				}
			}
			if(count==5) {
				output=str[0].substring(0, temp);
				break;
			}
			else {
				temp--;
				t--;
				minStr=minStr.substring(0, temp);
			}
		}
		if(output.length()==0) {
			System.out.println("There is no common prefix");
		}
		else {
			System.out.println(output);
		}
		
		sc.close();
	}

}
