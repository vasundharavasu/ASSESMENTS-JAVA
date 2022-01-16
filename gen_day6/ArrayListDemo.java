package gen_day6;

import java.util.List;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = new ArrayList<String>();
		list.add("Delhi");
		list.add("Mumbai");
		list.add("Pune");
		list.add("Kolkata");
		//print element
		System.out.println(list);
		//add element
		list.add(3,"bangalore");
		System.out.println(list);
		list.remove(4);
		list.remove("Kolkata");
		System.out.println(list);
ArrayList<String> li = new ArrayList<String>();
		li.add("chennai");
		li.add("delhi");
		System.out.println(li);
		//adding list element in list1
		list.addAll(li);
		System.out.println(list);
		
	    }

	 

	
	}


