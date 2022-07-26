package slassistedproject6;

import java.util.*;
public class Mapsinjava {

	public static void main(String[] args) {
		// map
		
		//Hashmap in java
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"sai");    
	      hm.put(2,"siva");    
	      hm.put(3,"kumar");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable in java
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"sai");  
	      ht.put(5,"ram");  
	      ht.put(6,"praneeth");  
	      ht.put(7,"vamsi");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap in java
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"rakesh");    
	      map.put(9,"reddy");    
	      map.put(10,"monish");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
