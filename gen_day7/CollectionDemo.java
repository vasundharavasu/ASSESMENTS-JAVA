package gen_day7;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<String>();
list.add("Java"); list.add("core java"); list.add("Servlet"); list.add("adv java");list.add("php");
Collections.addAll(list, "JSP","Spring");
System.out.println(list);
String [] s1 = {"c#",".Net"};
Collections.addAll(list,s1);
Collections.sort(list);
System.out.println(list);
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);

	}

}
