import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		
	HashSet<String> employee = new HashSet<String>();
	employee.add("Abhish");
	employee.add("Neha");
	employee.add("Rahul");
	employee.add("Vijay");
	
	Iterator<String> i = employee.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}
	
}
