public class printAlphabet {

	public static void main(String[] args) {
		String s="a2 ";
		char[] a=new char[s.length()/2];
		int[] b=new int[s.length()/2];
		char[] input=s.toCharArray();
		int i1=0;
		int i2=0;
		int f1=0;
		int f2=0;
		for(int i=0;i<input.length;i++) {
			if(Character.isAlphabetic(input[i])) {
				a[i1++]=input[i];
				f1++;
			}
			else {
				if(f1>f2) {
					b[i2]=Integer.parseInt(s.substring(i, i+1));
					f2++;
				}
				else if(f1==f2) {
					i2=i2-1;
					b[i2]*=10;
					b[i2]+=Integer.parseInt(s.substring(i,i+1));
				}
				i2++;
			}
		}
		int a1=0;
		while(a1<i1) {
			for(int i=0;i<b[a1];i++) {
				System.out.print(a[a1]);
			}
			a1++;
		}
	}
}
