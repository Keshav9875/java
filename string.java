import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        // String str="keshav";
        // String str2="keshav";
        // String str3=new String("keshav");
        // String str4=new String("keshav");

        // System.out.println(str==str2);//comparing references.
        // System.out.println(str.equals(str2));//comparing values.
        // System.out.println(str==str3);//comparing references.
        // System.out.println(str3==str4);//comparing references.
        // System.out.println(str.equals(str3));


        //STRING METHODS
        // String lstr=str.toLowerCase();
        // String ustr=str.toUpperCase();
        // System.out.println(lstr);
        // System.out.println(ustr);

        // int i =str.indexOf('k');
        // System.out.println(i);//0
        // i=str.indexOf('a',5);
        // System.out.println(i);//-1
        // i=str.indexOf("shav");
        // System.out.println(i);//2
        // i=str.indexOf("sh", 2);
        // System.out.println(i);//2

        //LAST indexOf() method
        // String str= "keshkv";
        // String str2="Keshkv";

        // int i =str.lastIndexOf('k');
        // System.out.println(i);//0
        // i=str.lastIndexOf('v',4);
        // System.out.println(i);//-1
        // i=str.lastIndexOf("es",2);
        // System.out.println(i);//1

        // System.out.println(str.equalsIgnoreCase(str2));// It ignores the case sensitive values.
        // System.out.println(str.compareTo(str2));//unicode difference if same then give 0.

        // //substring 
        // System.out.println(str.substring(2,4));
        
        // //Input by scanner;
        // Scanner sc =new Scanner(System.in);
        // String str3=sc.nextLine();
        // System.out.println(str3);

        // String str= "keshavgarg";
        // System.out.println(str.trim());

        // System.out.println(str.startsWith("k"));
        // System.out.println(str.endsWith("rg"));
        // System.out.println(str.charAt(0));
        // System.out.println(str.contains("garg"));

        // //valueof() convert anytype->string
        // int age=10;
        // String Age=String.valueOf(age);

        // System.out.println(Age+"hellopaaji");

        String str= "keshav garg";
        System.out.println(str.replace("keshav", "piyush"));
        
        String arr[]=str.split(" ");
        for(String s:arr){
            System.out.println(s);
        }

        char ch[]=str.toCharArray();

        for(char c:ch){
            System.out.println(c);
        }

        String s=" ";
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());

    }
}
