package gen_day5;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> rr = new ArrayList<String>();
rr.add("java");
rr.add("datastructure");
rr.add("python");
rr.add("dbms");
Stream<String> name = rr.stream();
System.out.println(name);
	}

}
