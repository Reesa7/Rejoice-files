import java.util.*;  
public class Map_Ex{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Guava");  //Put elements in Map  
   map.put(2,"Mango");    
   map.put(3,"Papaya");   
   map.put(4,"Apple");  
   map.put(5,"DragonFruit");
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
} 
}