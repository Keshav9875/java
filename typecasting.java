import java.lang.Math;
public class typecasting {
    public static void main(String[] args) {
        //widening  conversion(smaller data type to larger data type.)
        int y=3;
        float x=y;
        System.out.println(x);
        //narrowing conversion (larger to smaller data type.)
        float z=3.4f;
        int a=(int)z;
        System.out.println(a);

        float k=(float)3.5;
        System.out.println(k);

        float w=3.5f;  
        long q=3;
        int o=(int )q;
        System.out.println(o);  

        //The range of byte data type is (0-255)
        byte p=10;
        int n=p;
        System.out.println(n);

        int var=257;
        byte by=(byte)var;
        System.out.println(by);

        //type promotion
        // byte b=10;
        // byte c=30;
        // int ve=b*c;

        // System.out.println(ve);

        byte b=10;
        byte c=30;
        int ve=b*c*(int)Math.pow(2,17);

        System.out.println(ve);

    }
    
}
