
import java.util.Scanner;

public class Something{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10:");
        int userInput = scanner.nextInt();
        
        int randomNumber = getNumber();
        boolean guess = false;
        int count = 3;
        while(count !=0){
        while(!guess){ 
            if (userInput == randomNumber) {
            System.out.println("You guessed it right!");
            guess = true;
        } else {
            System.out.println("Wrong guess! You have " + count + " attempts left.");
            System.out.println("Enter a number between 1 and 10:");
             userInput = scanner.nextInt();
            count--;
            break;
        }}
    }
        if (count == 0) {
            System.out.println("You have used all your attempts. The correct number was " + randomNumber);
            scanner.close();
        }
        
    }  
    public static int getNumber(){
        return
         (int)(Math.random()*10) + 1;
    }
} 