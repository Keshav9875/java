import java.util.Scanner;

public class dtob {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n;
    System.out.print("Enter the value of n:-> ");
    n=sc.nextInt();
    int rem=0;
    int placevalue=1;
    int binaryno=0;

    while(n!=0){
        rem=n%2;
        binaryno=binaryno+rem*placevalue;
        placevalue*=10;
        n=n/2;
    }
    System.out.println(binaryno);
  }
    
}
