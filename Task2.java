
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int NoOfSub;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no of Subjects");
        NoOfSub = sc.nextInt();
        int marks;
        int totalmarks = 0;

        for(int i=1; i<=NoOfSub; i++){
            System.out.println("Enter marks obtained in Subject "+ i +":");
            marks = sc.nextInt();
            totalmarks += marks;
            

            
            
        }
        double percentage = (double) totalmarks / NoOfSub;
        System.out.println("Obtained Total marks are : "+totalmarks);
        System.out.println("Obtained Percentage is : "+percentage);
        if(percentage > 90){
            System.out.println("Grade O");
        }
        else if(percentage > 80){
            System.out.println("Grade A");

        }
        else if(percentage > 65){
            System.out.println("Grade B");
        }
        else if(percentage > 50){
            System.out.println("Grade C");
        }
        else if(percentage > 35){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Sorry! You failed");
        }
        
    }
}
