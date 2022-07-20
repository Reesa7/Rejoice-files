class Member_Ex{  
 private int data=78;  
 class Inner{  
  void msg(){System.out.println("data is "+data);}  
 }  
 public static void main(String args[]){  
  Member_Ex obj=new Member_Ex();  
  Member_Ex.Inner in=obj.new Inner();  
  in.msg();  
 }  
}  
