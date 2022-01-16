package gen_day1;

public class Student {
int roll_no;
int phone_no;
String address;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student Sam = new Student();
Student John = new Student();
Sam.roll_no = 20;
Sam.phone_no = 976565678;
Sam.address = "Banglore";
John.roll_no = 98;
John.phone_no = 7686543;
John.address = "Chennai";
System.out.println(Sam.roll_no + " " + Sam.phone_no + " "+ Sam.address + " " + John.roll_no + " " + John.phone_no + ""+John.address);
	}

}
