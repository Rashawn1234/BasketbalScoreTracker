
public class Game {

    // Static variable
    public static int gameCount = 0;

    // Constructor
    public Game() {
        gameCount++;
    }

    // Static method
    public static void displaySport() {
        System.out.println("Sport: Basketball");
    }

    // Determine the winner
    public void findWinner(Team team1, Team team2) {

        System.out.println("\n----- FINAL SCOREBOARD -----");

        team1.displayTeam();

        System.out.println();

        team2.displayTeam();

        // Determine winner using if/else
        if (team1.getTotalScore() > team2.getTotalScore()) {

            System.out.println("\nWinner: " + team1.getTeamName());

        } else if (team2.getTotalScore() > team1.getTotalScore()) {

            System.out.println("\nWinner: " + team2.getTeamName());

        } else {

            System.out.println("\nThe game ended in a tie!");
        }

        System.out.println("Games Played: " + gameCount);
    }
}
