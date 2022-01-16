package gen_day7;

import java.util.Map;
public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer , Book> map = new TreeMap<Integer , Book>();

Book b1 = new Book(101,"Let us C",8);
Book b2 = new Book(102,"Java",10);
Book b3 = new Book(103,"operating system",6);
Book b4 = new Book(104,"DBMS", 5);
map.put(1,b1); map.put(2,b3); map.put(3,b4); map.put(4,b2);
for(Map.Entry<Integer , Book> entry :map.entrySet()) {
    int key = entry.getKey();
    Book b = entry.getValue();
    System.out.println(key+" Deatils");
    System.out.println(b.id+"  "+b.name+"   "+b.quantity);

	}


	}
}
