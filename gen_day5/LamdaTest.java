package gen_day5;
interface ArrayProcessor{
	double apply(double[]array);
}
public class LamdaTest {
public static ArrayProcessor counter(double value) {
	return array -> {
		int count = 0;
		for(int i =0;i<array.length;i++) {
			if(array[i] == value)
			{
				count++;
			}
		}
		return count;
	};
	}
public static final ArrayProcessor maxer = array -> {
	double max = array[0];
	for(int i = 0;i<array.length;i++) {
		if(array[i]>max) {
			max = array[i];		}
	}
	return max;
};
public static final ArrayProcessor miner = array -> {
	double min = array[0];
	for(int i = 0;i<array.length;i++) {
		if(array[i]<min) {
			min = array[i];		}
	}
	return min;
};
public static final ArrayProcessor summer = array -> {
	double total = array[0];
	for(int i = 1;i<array.length;i++) {
		total +=array[i];		
	}
	return total;
};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[] firstList = {1,2,3,4,5,6,7,8,9,10};
double[] secondList = {17,3.14,17.0,-3.4,17.0,42.0,29.2,3.14};	
System.out.println(summer.apply(firstList));
System.out.println(summer.apply(secondList));
System.out.println(miner.apply(firstList));
System.out.println(miner.apply(secondList));
System.out.println(maxer.apply(firstList));
System.out.println(maxer.apply(secondList));
System.out.println(counter(5.0).apply(firstList));
System.out.println(counter(17.0).apply(secondList));

	};
}
