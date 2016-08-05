import java.util.Arrays;
import java.util.Scanner;

public class PrintLeastNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String number=scan.next();
		int len=number.length();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=Integer.parseInt(number.substring(i, i+1));
		}
		Arrays.sort(arr);
		int key=scan.nextInt();
		int m=len-key;
		int[] resultArr=new int[m];
		String result="";
		for(int i=0;i<m;i++) {
			resultArr[i]=arr[i];
			result+=resultArr[i];
		}
		System.out.println(result);
		
	}
}
