package GameNight;
import java.util.*;

public class QuickDraw extends GameNight {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHowdy! Time to play Quick Draw!\n");
        System.out.println("The game is simple. \nWhen you see the word \'DRAW!\' on your screen, you have 0.5 seconds to press ENTER on your keyboard to draw your (imaginary) gun and win. \nToo fast or too slow, you lose. \nReady?");
        System.out.println("\nPress ENTER to start.");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
}