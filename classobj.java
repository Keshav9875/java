import java.util.Scanner;

class Box{
    private int l,b,h;
    
    public void setdim(int l, int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }

    public void getdim(){
        System.out.println("length"+"="+this.l);
        System.out.println("breadth"+"="+this.b);
        System.out.println("height"+"="+this.h);
    }

}

class box1{
    private int x=4;

    public void hello(){
        System.out.println("hello ji box1");
    }
}

public class classobj{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Box bx=new Box();
        int l, b,h;
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();

        bx.setdim(l, b, h);
        bx.getdim();
        // System.out.println(bx.l); //It give error
        bx=new Box();
        bx.getdim();
        // bx=new box1();// This will give error box1 cannot converted to box;

    }
}