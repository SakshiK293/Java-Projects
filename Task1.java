import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inpNumber;
    public int NoOfGuess =0;
    
    
    public int getNoOfGuess() {
        return NoOfGuess;
    }
    public void setNoOfGuess(int NoOfGuess) {
        this.NoOfGuess = NoOfGuess;
        
    }
    Game(){
        Random rand = new Random();
        this.number=rand.nextInt(100);
    }
    void UserInput() {
        System.out.println("Guess the number");
        Scanner sc =new Scanner(System.in);
        inpNumber = sc.nextInt(); 
       
    }
    boolean isCorrect() {
        NoOfGuess++;
        if(inpNumber == number){
            System.out.format("Good one! Guesssed it right. It was %d\n You gessed it in %d attempts",number,NoOfGuess);
            return true;
        }
        else if(inpNumber<number){
            System.out.println("Too low...");
        }
        else if(inpNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}


public class Task1{
    public static void main(String[] args) 
    {
        
        
            Game g = new Game();
            boolean b=false;
            while(!b){
                g.UserInput();
                b = g.isCorrect();
            }
            

    }
}