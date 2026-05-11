package GameNight;
import java.util.*;

public class QuickDraw extends GameNight {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String playerChoice;

        System.out.println("\nHowdy! Time to play Quick Draw!\n");
        System.out.println("The game is simple. \nWhen you see the word \'DRAW!\' on your screen, you have 0.5 seconds \nto press ENTER on your keyboard to draw your (imaginary) gun and win. \nToo fast or too slow, you lose. \nReady?");
        System.out.println("\nPress 'S' to start. Or 'Q' to quit.");
        playerChoice = input.nextLine().toLowerCase();
        
        if (playerChoice.equals("q")){
            System.out.println("See ya, cowpoke.");
            System.exit(0);
        }
        while (playerChoice.toLowerCase().equals("s")){
            draw();
            System.out.println("\nPress 'S' to play again. Or 'Q' to quit.");
            if(input.next().toLowerCase().equals("q")){
                System.out.println("See ya, cowpoke.");
                System.exit(0);
            }
        }
    }

    public static void draw(){
        long startTime;
        long endTime;
        double reactionTime;

        Scanner input = new Scanner(System.in);

        System.out.println("It's high noon...");

        try {
            Thread.sleep((long)(Math.random() * 5000) + 2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("An error occurred. Please try again.");
            e.printStackTrace();
        }
        
        System.out.println("DRAW!");
        startTime = System.currentTimeMillis();
        input.nextLine();
        endTime = System.currentTimeMillis();
        reactionTime = (endTime - startTime) / 1000.00;

        if(reactionTime < 0.5){
            System.out.printf("Congratulations! You win! Your reaction time was %.2f seconds.", reactionTime);
            if(reactionTime < 0.3){
                System.out.println("\nWow, you're a quick draw!");
            } else if (reactionTime < 0.4){
                System.out.println("\nNot bad, but you can do better!");
            }
        } else {
            System.out.printf("You drew too slow! Your reaction time was %.2f seconds. \nBetter luck next time!", reactionTime);
        }
        System.out.println("\n");
    }
}