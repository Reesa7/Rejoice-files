abstract class Member{  
  abstract void review();  
}  
class AnonymousInner{  
 public static void main(String args[]){  
  Member m=new Member(){  
  void review(){System.out.println("remarkable");}  
  };  
  m.review();  
 }  

void review(){System.out.println("remarkable");}  
};  
class Anonymous_Ex extends Member 
{  
   Anonymous_Ex(){}  
   void review()  
    {  
        System.out.println("remarkable");  
    }  
}  