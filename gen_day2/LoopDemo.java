package gen_day2;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number, sum=0, num=1;
Scanner sc = new Scanner(System.in);
System.out.println("enter any int number lessthan 10");
number=sc.nextInt();
while(number<=10)
{
	sum=sum+number;
	number++;
}
	System.out.println(sum);
do {
	System.out.println("value of number"+ num);
	num++;
	System.out.println("n");
}while(num<11);
}
}
	



