public class constructor {
    private int l, b,h;

    public void get(){
        System.out.println(l+" "+b+" "+h);
    }
    public constructor(){
        System.out.println("this is constructor...");
    }
    public constructor(int l , int b , int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public constructor(int a, int b){
        this.l=a;
        this.b=b;
    }
    public static void main(String[] args) {
        constructor obj =new constructor();
        constructor obj1=new constructor(12,3,4);
        obj1.get();
        obj.get();





    }
}
