class Static_Ex{  
  static int data=47;  
  static class Inner{  
   void msg(){System.out.println("data is "+data);}  
  }  
  public static void main(String args[]){  
  Static_Ex.Inner obj=new Static_Ex.Inner();  
  obj.msg();  }
}