package collection.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapClass {
	 public static void main(String args[]){  
		   
		  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"yasssn");  
		  hm.put(101,"hakkache");  
		  hm.put(99,"tazza");  
		  
		for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 } 
}
