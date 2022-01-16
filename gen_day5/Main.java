package gen_day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> m = new ArrayList<>();
m.add("amitabh");
m.add("raj");
m.add("aman");
m.add("rahul");
m.add("salman");
m.add("rajkumar");

m.stream().filter((s)->s.startsWith("a")).forEach(System.out::println);

m.stream().filter((s)->s.startsWith("r")).map(String::toUpperCase).forEach(System.out::println);

m.stream().sorted().forEach(System.out::println);

List<String> m2 = m.stream().distinct().collect(Collectors.toList());
System.out.println(m2);

List<Integer> list1 = Arrays.asList(1,2,3);

List<Integer> list2 = Arrays.asList(4,5,6);

List<Integer> list3 = Arrays.asList(7,8,9);

m.forEach(system.out::println);
	}

}
