import java.util.*;  
public class Collections_Ex{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Myuri");  
v.add("Narendra");  
v.add("Singh");  
v.add("Nuthan"); 
v.add("Riyza");
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  