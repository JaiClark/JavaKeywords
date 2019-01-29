/**
 * JavaKeywords
 */
public class JavaKeywords {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("This is an expression!");
        }

        // In the following code below, write down what parts of the code are
        // expressions

        // score = 100 is an expression
        int score = 100;

        // score > 99 is an expression
        if (score > 99) {
            System.out.println("You got the high score!");

            // score = 0 is an expression
            score = 0;

            // Example of a statement
            int myVariable = 50;
            myVariable++;
            myVariable--;
            System.out.println("This is a test.");
            System.out.println(myVariable);

            boolean gameOver = true;
            int userScore = 800;
            int levelCompleted = 5;
            int bonus = 100;

            int userSecond = 10000;
            int secondCompleted = 8;
            int secondBonus = 200;

            // if (userScore < 5000 && userScore > 1000) {
            // System.out.println("Your score was less than 5000 but greater than 1000");
            // } else if (userScore < 1000) {
            // System.out.println("Your score was less than 1000");
            // } else {
            // System.out.println("Got here");
            // }

            if (gameOver == true) {
                int finalScore = userScore + (levelCompleted * bonus);
                System.out.println("Your final score was " + finalScore);

            }

            if (gameOver == true) {
                int secondFinal = userSecond + (secondCompleted * secondBonus);
                System.out.println("Your final score was " + secondFinal);
            }
        }
    }
}