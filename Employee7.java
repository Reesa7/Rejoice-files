class Employee7{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Employee7(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
 
    public static void main(String args[]){  
    //creating objects and passing values  
    Employee7 s1 = new Employee7(1056,"Reesma");    
    //calling method to display the values of object  
    s1.display();    
   }  
}  
