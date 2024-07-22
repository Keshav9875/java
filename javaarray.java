public class javaarray {
    public static void main(String[] args) {
        
        int arr[]=new int[5];

        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }

        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }
        //another way to declare single 1d array
        int arr1[]={2,4,5,4556};

        System.out.println(arr1.length);

        for(int i=0;i<arr1.length;i++){
           System.out.println(arr1[i]);
        }

        //Another way 
        int arr2[]=new int[]{122,4444,6666};

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
         }

         // you can intialize first then give values 
         int []arr3=new int[4];

         arr3[0]=0;
         arr3[1]=1;
         arr3[2]=2;
         arr3[3]=3;

    }
}
