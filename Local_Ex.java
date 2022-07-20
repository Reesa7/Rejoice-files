public class Local_Ex{  
 private int data=77;//instance variable  
 void display(){  
  class Local{  
   void msg(){System.out.println(data);}  
  }  
  Local l=new Local();  
  l.msg();  
 }  
 public static void main(String args[]){  
  Local_Ex obj=new Local_Ex();  
  obj.display();  
 }  
}  