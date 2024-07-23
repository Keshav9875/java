public class stringbf_build {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("navin");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" rowdy");
        System.out.println(sb);

        sb.insert(0,"hello !");
        System.out.println(sb);

        sb.replace(2, 7,"welcome");
        System.out.println(sb);

        sb.delete(0,7);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        System.out.println("-----------------------------------------------");
        StringBuilder bu=new StringBuilder("navin");
        System.out.println(bu.capacity());
        System.out.println(bu.length());

        bu.append(" rowdy");
        System.out.println(bu);

        bu.insert(0,"hello !");
        System.out.println(bu);

        bu.replace(2, 7,"welcome");
        System.out.println(bu);

        bu.delete(0,7);
        System.out.println(bu);
        
        bu.reverse();
        System.out.println(bu);

    }
    
}
