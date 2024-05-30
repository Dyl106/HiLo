import java.util.Scanner;

public class HiLo {
    // Index of 0 to 51 : ♦2 to ♣A
    private static final String[] cards = { 
        "♦2", "♥2", "♠2", "♣2", "♦3", "♥3", "♠3", "♣3", "♦4", "♥4",  
        "♠4", "♣4", "♦5", "♥5", "♠5", "♣5", "♦6", "♥6", "♠6", "♣6", 
        "♦7", "♥7", "♠7", "♣7", "♦8", "♥8", "♠8", "♣8", "♦9", "♥9", 
        "♠9", "♣9", "♦10", "♥10", "♠10", "♣10", "♦J", "♥J", "♠J", 
        "♣J", "♦Q", "♥Q", "♠Q", "♣Q", "♦K", "♥K", "♠K", "♣K", "♦A", 
        "♥A", "♠A", "♣A"
    };

    private static final int[] cardValue = {
        2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 
        6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 
        10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 
        13, 13, 13, 13, 14, 14, 14, 14
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentIndex = (int) (Math.random() * 52);
        String currentCard = cards[currentIndex];
        int currentValue = cardValue[currentIndex];

        System.out.println("Welcome to HiLo, good luck!");
        System.out.println("Your starting card is " + currentCard);

        boolean activeGame = true;

        while (activeGame) {
            System.out.println("Higher or lower? (Enter H for higher and L for lower).");
            String guess = scanner.nextLine().toLowerCase();

            int nextCardIndex = (int) (Math.random() * 52);
            String nextCard = cards[nextCardIndex];
            int nextCardValue = cardValue[nextCardIndex];

            boolean guessCorrect = (guess.equals("h") && nextCardValue > currentValue) || 
                                       (guess.equals("l") && nextCardValue < currentValue);
    
            if (guessCorrect) {
                System.out.println("Correct!");
                currentCard = nextCard;
                currentValue = nextCardValue;
                System.out.println("The next card is " + currentCard);
            } else {
                System.out.println("Incorrect. The next card is " + nextCard + ". Game over!");
                activeGame = false;
            }
 
        }
    }
}
