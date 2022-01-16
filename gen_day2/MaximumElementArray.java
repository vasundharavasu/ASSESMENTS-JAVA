package gen_day2;

public class MaximumElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {10, 20,30,40};
int max = arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i]>max)
		max = arr[i];
}
	System.out.println(max);
	
	}

}
