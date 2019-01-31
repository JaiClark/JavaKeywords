/**
 * JavaKeywords
 */
public class JavaKeywords {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        // double kilometers = (100 * 1.609344);
        // int highScore = 50;

        // if (highScore == 50) {
        //     System.out.println("This is an expression!");
        // }

        // // In the following code below, write down what parts of the code are
        // // expressions

        // // score = 100 is an expression
        // int score = 100;

        // // score > 99 is an expression
        // if (score > 99) {
        //     System.out.println("You got the high score!");

        //     // score = 0 is an expression
        //     score = 0;

        //     // Example of a statement
        //     int myVariable = 50;
        //     myVariable++;
        //     myVariable--;
        //     System.out.println("This is a test.");
        //     System.out.println(myVariable);

            boolean gameOver = true;
            int userScore = 800;
            int levelCompleted = 5;
            int bonus = 100;

            int highScore = calculateScore(gameOver, userScore, levelCompleted, bonus);
            System.out.println("Your final score was " + highScore);

            userScore = 10000;
            levelCompleted = 8;
            bonus = 200;


            highScore = calculateScore(gameOver, userScore, levelCompleted, bonus);
            System.out.println("Your final score was " + highScore);

            int highScorePosition = calculateHighScorePosition(1500);
            displayHighScorePosition("Tim", highScorePosition);

            highScorePosition = calculateHighScorePosition(900);
            displayHighScorePosition("Bob", highScorePosition);

            highScorePosition = calculateHighScorePosition(400);
            displayHighScorePosition("Percy", highScorePosition);

            highScorePosition = calculateHighScorePosition(50);
            displayHighScorePosition("Lucy", highScorePosition);

            highScorePosition = calculateHighScorePosition(1000);
            displayHighScorePosition("Besk", highScorePosition);

        }

    public static int calculateScore(boolean gameOver, int userScore, int levelCompleted, int bonus){


            if (gameOver) {
                int finalScore = userScore + (levelCompleted * bonus);
                finalScore += 2000;
                return finalScore;
            } 
            // -1 is used to show an error in programming
                return -1;
            
        
    }
    

    public static void displayHighScorePosition( String userName, int userPosition){

      System.out.println(userName + " managed to get in position " + userPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if(playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if(playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}