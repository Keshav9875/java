 import java.util.*;
 class method2{
    int a=20;
    public int add(int a,int b){
        return this.a+a+b;
    }
    void setavalue(int a){
        this.a=a;
    }
}




public class Method
{
   
    
    public static void main(String[] args) {//jvm invokes the main method automatically.
        Method obj=new Method();
        method2 obj1=new method2();
        Scanner sc =new Scanner(System.in);
        
        System.out.println("This is main method Which doesn't need any object to called");
        obj.greet("keshav");
        System.out.print("Give the value of no.:- ");
        obj1.setavalue(sc.nextInt());
        int c=obj1.add(2,3);
        System.out.println(c);

    }
    public void greet(String name){
        System.out.println("Hello!"+" "+name);
    }
}

