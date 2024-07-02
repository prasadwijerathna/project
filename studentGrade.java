import java.util.Scanner;
public class grade{
    public static void main(String args[]){
		 int tot=0;
        for(int i=0;i<=2;i++){
            System.out.println("enter subject marks");
            Scanner marks=new Scanner(System.in);
            int y = marks.nextInt();
           
            tot=tot+y;
        
            if (y>75)  {
                System.out.println("Grade A");
            }else if(y>65){
                System.out.println("Grade B");
            }else if (y>55) {
                System.out.println("Grade c");
            } else {
                System.out.println("Grade F");
            }
        }
		System.out.println("total marks ="+tot);
		System.out.println("average marks ="+tot/3);
        
    }
}