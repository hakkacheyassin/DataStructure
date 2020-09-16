package collection.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

 
public class HashSetClass {

	public static void main(String args[]){  
		   
		  HashSet<String> al=new HashSet<String>();  
		  al.add("sdfdfs");  
		  al.add("xcxzcxzz");  
		  al.add("ewrewrrewew");  
		  al.add("asadasd");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		  
		  System.out.println("linked hash set");
		  // linked
		  LinkedHashSet<String> al2=new LinkedHashSet<String>();  
		  al2.add("Bxcvcvi");  
		  al2.add("Cixcvdfvf");  
		  al2.add("Bazxccxsxs");  
		  al2.add("vgfbfbg");  
		  
		  Iterator<String> itr2=al2.iterator();  
		  while(itr2.hasNext()){  
		   System.out.println(itr2.next());  
		  }  
		 } 
	  
}
