package demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Test{

	public static void main(String[] args) {

		
		List list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		
		for(int i=0;i<list.size();i++){
			
			int s = list.size();
			Object o = list.remove(i);
			i--;
			System.out.println(s     +    "        "+o);
		}
	}
	
}



