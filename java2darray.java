public class java2darray{

    public static void main(String[] args) {
    //     int [][]a=new int[4][5];//way to delcare array.

    // System.out.println("length of a[0] is "+a[0].length+"\n");

    // for(int i=0;i<a.length;i++){
    //     for(int j=0;j<a[i].length;j++){
    //         a[i][j]=j+1;
    //         System.out.println(a[i][j]+" ");
    //     }
    //     System.out.println();
    // }

    // int [][]a=new int[][]; error
    // int arr[][]=new int[4][];//it will give not error
    // int arr2[][]=new int [][4];//error

    // int [][]b=new int[][]{{1,2,3},{2,3,4}};
    // for(int i=0;i<b.length;i++){
    //     for(int j=0;j<b[i].length;j++){
        
    //         System.out.println(b[i][j]+" ");
    //     }
    //     System.out.println();
    // }

    // int [][]c={{1,2,3},{4,5,6},{7,8,9}};
    // for(int i=0;i<c.length;i++){
    //     for(int j=0;j<c[i].length;j++){
        
    //         System.out.println(c[i][j]+" ");
    //     }
    //     System.out.println();
    // }

    // int [][]d=new int[4][];
    // System.out.println("d[0][0]"+d[0][0]);//null pointer exception
    // System.out.println("d[0] => "+d[0]);
    // System.out.println("length of d[0]=> "+d.length);
    // System.out.println("length = "+d[0].length);//null pointer exception

    //JAGGED ARRAY
    int [][]e=new int[4][];
    e[0]=new int[2];
    e[1]=new int[3];
    e[2]=new int[4];
    e[3]=new int[5];

    System.out.println(e[0].length);
    System.out.println(e[1].length);
    System.out.println(e[2].length);
 }

}