public class Player {

    private String name;
    private int score = 0;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void addToScore(int roll) {
        score += roll;
        System.out.println("Sinu skoor on " + score);
    }

    public void restartScore() {
        score = 0;
    }

//    public int veeretus() {
//
//    }

}
