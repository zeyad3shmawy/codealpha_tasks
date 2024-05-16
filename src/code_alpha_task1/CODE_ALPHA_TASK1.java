
package code_alpha_task1;
import java.util.Scanner;
public class CODE_ALPHA_TASK1 {

    public static void main(String[] args) {
         //declare scanner//
     Scanner input=new Scanner (System.in);
     System.out.println("welcome to word counter\nwrite your paragraph: ");
     
     //take the paragraph from user//
     String paragraph=input.nextLine();
     
     //print number of  words//
     System.out.println("words num= "+paragraph.split(" ").length);
     
     //we add an option to choose the number of printed words//
     String []arr=new String[paragraph.split(" ").length];
     arr=paragraph.split(" ", 0);
     System.out.println("enter num of words you want to print: ");
     int num=input.nextInt();
     for(int i=0;i<num;i++){
         System.err.print(arr[i]+" ");
     }
    } 
}
