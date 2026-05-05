package GameNight;
import java.util.*;

public class GameNight {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int game_choice;

        System.out.println("Welcome to Game Night!");
        System.out.println("Come in, settle down, and pick a game.");
    
        String [] games = new String[8];
        games[0] = ("Magic 8 Ball");
        games[1] = ("Blackjack");
        games[2] = ("Hangman");
        games[3] = ("Bagels");
        games[4] = ("Vignere Cipher");
        games[5] = ("Quick Draw");
        games[6] = ("Terminal Hacker");
        games[7] = ("Quit");

        for(int i = 0; i < games.length; i++){
            System.out.println((i+1) + ": " + games[i]);
        }

        System.out.print("Enter the number of the game you want to play: ");
        game_choice = input.nextInt();

        switch(game_choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                System.out.println("See ya later!");
                System.exit(0);
            default:
                System.out.println("Invalid choice.");
                main(args);
        }
    }
}
