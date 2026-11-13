
public class Team {

    private String teamName;
    private int totalScore;

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.totalScore = 0;
    }

    // Add points
    public void addPoints(int points) {
        totalScore += points;
    }

    // Display team information
    public void displayTeam() {
        System.out.println("Team: " + teamName);
        System.out.println("Score: " + totalScore);
    }

    // Getters
    public String getTeamName() {
        return teamName;
    }

    public int getTotalScore() {
        return totalScore;
    }
}
