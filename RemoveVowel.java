public class RemoveVowel {

	public static void main(String[] args) {
		String s="ReverseMe";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s1=sb.toString();
		System.out.println(s1);
		String res="";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			char c1=Character.toLowerCase(c);
			if(!(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u'))
			{
				res+=c;
			}
		}
		System.out.println(res);
	}

}
