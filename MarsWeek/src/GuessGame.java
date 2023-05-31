import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        int guess = 0;
        int count = 0;
        System.out.print("Howdy, what's your name? ");
        String name = input.nextLine();
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 100.");
        System.out.println("Try to guess my number.");
        while(guess != number){
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            count++;
            if(guess > number){
                System.out.println("Too high!");
            }
            else if(guess < number){
                System.out.println("Too low!");
            }
            else{
                System.out.println("You got it!");
                System.out.println("It took you " + count + " guesses.");
            }
        }
    }
}