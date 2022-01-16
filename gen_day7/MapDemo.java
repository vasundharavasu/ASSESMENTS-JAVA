package gen_day7;

import java.util.LinkedHashMap;

public class MapDemo {

	public static void main(String[] args) {
// TODO Auto-generated method stub
LinkedHashMap<String , String> ln = new LinkedHashMap<String , String>();
ln.put("A", "Albert");
ln.put("B","Bobo");
ln.put("C","Coco");
ln.put("D","Doddle");
ln.put("E","Dobby");
System.out.println(ln);
System.out.println("getting value of key:" + ln.get("B"));
System.out.println(ln.size());
System.out.println("check key :" + ln.containsKey("D"));
System.out.println("contains value of key:" + ln.containsValue("Bobo"));
System.out.println("Remove :" +  ln.remove("C"));
System.out.println(ln);
System.out.println("key/value mapping :" + ln.entrySet());
System.out.println("keys :" + ln.keySet());
System.out.println("values of keys :" + ln.values());
System.out.println("values of the key =" + ln.getOrDefault("X" , "X-Max"));

	}

}
