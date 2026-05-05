package GameNight;
import java.util.*;

public class QuickDraw extends GameNight {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHowdy! Time to play Quick Draw!\n");
        System.out.println("The game is simple. \nWhen you see the word \'DRAW!\' on your screen, you have 0.5 seconds to press ENTER on your keyboard to draw your (imaginary) gun and win. \nToo fast or too slow, you lose. \nReady?");
        System.out.println("\nPress 'S' to start. Or 'Q' to quit.");
        
        Scanner input = new Scanner(System.in);

        if (input.nextLine().toLowerCase().equals("s")){
            draw();
            System.out.println("\nPress 'S' to play again. Or 'Q' to quit.");
        } else if (input.nextLine().toLowerCase().equals("q")){
            System.out.println("\nLater, cowpoke.");
            System.exit(0);
        }
    }

    public static void draw(){
        long startTime;
        long endTime;
        long reactionTime;

        Scanner input = new Scanner(System.in);

        System.out.println("It's high noon...");
            try {
                Thread.sleep((long)(Math.random() * 5000) + 2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("DRAW!");
            startTime = System.currentTimeMillis();
            input.nextLine();
            endTime = System.currentTimeMillis();
            reactionTime = endTime - startTime;

            if(reactionTime < 500){
                System.out.println("Congratulations! You win! Your reaction time was " + reactionTime + " milliseconds.");
                if(reactionTime < 250){
                    System.out.println("Wow, you're a quick draw!");
                }
            } else if (reactionTime < 100){
                System.out.println("You drew too fast! That's cheating where I'm from! Your reaction time was " + reactionTime + " milliseconds.");
            } else {
                System.out.println("You drew too slow! Your reaction time was " + reactionTime + " milliseconds.");
            }
    }
}