public class break_goto { // use break as a form of goto.
    public static void main(String[] args) {
        first:{
            System.out.println("First label");
            second:{
                if(true){
                    System.out.println("In second label");
                    break second;
                }
                else
                 System.out.println("end second label");
            }

            System.out.println("After second label");
        }
        
    }
    
}
