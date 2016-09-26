
public class CheckSubArray {

	public static void main(String[] args) {
		int[] arr1={2,5,6,3,4,78};
		int[] arr2={5,6,9};
		int[] flag=new int[arr2.length];
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr2[i]==arr1[j]) {
					flag[i]=1;
				}
			}
		}
		int temp=0;
		for(int i=0;i<flag.length;i++) {
			if(flag[i]!=1) {
				temp=1;
			}
		}
		if(temp==0) {
			System.out.println("subset");
		}
		else {
			System.out.println("not subset");
		}
	}

}
