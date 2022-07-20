public class Userdefine_Method_Ex  
{  
//user-defined static method  
static void showMessage()   
{  
System.out.println("The static method invoked.");  
}  
//user-defined non-static method  
void displayMessage()   
{  
System.out.println("Non-static method invoked.");  
}  
public static void main(String[] args)   
{  
//calling static method without using the object  
showMessage(); //called method  
//creating an object of the class  
Userdefine_Method_Ex me=new Userdefine_Method_Ex();  
//calling non-static method  
me.displayMessage(); //called method  
}  
}  
