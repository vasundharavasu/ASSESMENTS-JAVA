package gen_day2;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
int length = arr.length;
int sum = 0;
for(int i=0;i<arr.length;i++) {
	sum +=arr[i];
}
double average = sum / length;
System.out.println("average of an array"+average);


	}

}
