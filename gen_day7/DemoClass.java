package gen_day7;

import java.util.TreeSet;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer> eve = new TreeSet<Integer>();
eve.add(2);
eve.add(4);
eve.add(6);
System.out.println(eve);
TreeSet<Integer> num = new TreeSet<Integer>();
num.add(1);
num.add(6);
num.add(11);
num.add(3);
eve.addAll(num);
System.out.println(eve);
System.out.println(eve.first());
System.out.println(eve.last());
//higher element
System.out.println(eve.higher(4));
//lower element
System.out.println(eve.lower(4));
System.out.println(eve.ceiling(4));
System.out.println(eve.floor(3));
System.out.println(eve.headSet(5));
System.out.println(eve.headSet(5,true));
System.out.println(eve.tailSet(4));
System.out.println(eve.subSet(4, 11));
System.out.println(eve.subSet(4, false,11,true));
//set operations
//union,intersection,diff
eve.addAll(num);
System.out.println(eve);
eve.retainAll(num);
System.out.println(eve);
eve.removeAll(num);
System.out.println(eve);

	}

}
