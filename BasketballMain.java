
import java.util.Scanner;

public class BasketballMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Display sport
        Game.displaySport();

        System.out.println("BASKETBALL SCORE TRACKER");

        // Enter team names
        System.out.print("\nEnter Team 1 name: ");
        String name1 = input.nextLine();

        System.out.print("Enter Team 2 name: ");
        String name2 = input.nextLine();

        // Create Team objects
        Team team1 = new Team(name1);
        Team team2 = new Team(name2);

        // Create Game object
        Game basketballGame = new Game();

        // Collect scores for four quarters
        for (int quarter = 1; quarter <= 4; quarter++) {

            System.out.println("\nQuarter " + quarter);

            System.out.print("Enter points for " + name1 + ": ");
            int score1 = input.nextInt();

            System.out.print("Enter points for " + name2 + ": ");
            int score2 = input.nextInt();

            // Update scores
            team1.addPoints(score1);
            team2.addPoints(score2);
        }

        // Display final scoreboard
        basketballGame.findWinner(team1, team2);

        input.close();
    }
}
