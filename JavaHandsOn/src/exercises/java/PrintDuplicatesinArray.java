package exercises.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] items = {10,25,36,10,58,74,36};
		int arraysize;
		arraysize=items.length;
		int count;
		for(int i=0;i<arraysize-1;i++ ) {
			count=1;			
			for(int j=i+1; j<arraysize;j++) {
				if(items[i]==items[j])
					count++;
			}
			if(count>1)
				System.out.println(items[i]);
		}

		//UsingSetApproach
		usingSet();

		//UsingHashMapApproach
		usingHashMap();

	}

	public static void usingSet(){
		int [] items = {10,25,36,10,58,74,36};
		Set<Integer> s = new HashSet<Integer>() ;
		for(int item: items){
			if(!s.add(item)){
				System.out.println("Duplicate: "+item);
			}
		}
	}


	public static void usingHashMap(){
		String [] items = {"Java", "Js", "Java", "Python"};
		Map<String,Integer> m = new HashMap<>();
		for(String item: items){
			Integer count = m.get(item);
			if(count==null)
				m.put(item,1);
			else
				m.put(item,count+1);
		}

		//Print the values from HashMap
		Set<Map.Entry<String, Integer>> entries = m.entrySet();
			for (Map.Entry<String, Integer> entry : entries) {
				if(entry.getValue()>1)
					System.out.println("Duplicate: "+entry.getKey());
			}
	}

}
