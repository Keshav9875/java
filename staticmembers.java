class staticclass{
    static int var=4;
    int z=3;
    static{
        var=34;
        System.out.println("in static block of staticclass");
    }

    public static void f1(staticclass obj){
        System.out.println(obj.z+" "+var);
    }
}


public class staticmembers{
    int x;
    static int y;
    static{
        y=34;
        System.out.println("in static block of staticmember");
    }
    public void f1(){
        System.out.println("f1 instance member func called...");
    }
    public static void f2(int x){
       y=x;
    }

   static class Test{ // inner static class.
        public static String country="India";
        public void f1(){
            System.out.println("I am staticclass non static method...");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        staticmembers obj= new staticmembers();
        staticmembers obj2= new staticmembers();
        // staticclass obj1=new staticclass();
        // System.out.println(staticmembers.y);
        // System.out.println(y);

        // staticmembers.f2(4);
        // System.out.println(y);
        // f2(5);
        // System.out.println(y);
        // obj.y=78;
        // System.out.println(y);
        // obj2.y=79;
        // System.out.println(y+" "+obj.y+" "+obj2.y);
        // System.out.println(staticclass.var);// you cannot access the static var without classname outside of his class.
        // staticclass.f1(obj1);
        // System.out.println(staticmembers.Test.country);

        // //access static inner class non static method.
        // staticmembers.Test t=new staticmembers.Test();

        // t.f1();

        // Test t2= new Test();
        // t2.f1();

        Class.forName("staticclass");


        

    }
    
}

