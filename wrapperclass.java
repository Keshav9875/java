public class wrapperclass {
    public static void main(String[] args) {
        Integer obj=Integer.valueOf("12"); //boxing
        System.out.println(obj);

        int age=20;
        Integer obj2=12; //autoboxing
        Integer obj3=age;
        System.out.println(obj2+" "+obj3);

        // unboxing 
        int uage=obj3;
        System.out.println(uage);
        

        Boolean b=Boolean.valueOf(false);
        System.out.println(b);
    }
    
}
