public class CamelCase {
	public static void main(String[] args) {
		String s="hai this is the example program";
		String[] a = s.split(" ");
		String result="";
		for(int i=0;i<a.length;i++) {
			String str=a[i].toUpperCase();
			String ns=str.substring(0, 1);
			ns+=str.substring(1, a[i].length()).toLowerCase();
			result+=ns+" ";
		}
		System.out.println(result);
	}
}
