public class Player {

    private String name;
    private int score;
    private int queue;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Player(String name, int score, int queue) {
        this.name = name;
        this.score = score;
        this.queue = queue;
    }


    public void addToScore(int roll) {
        score += roll;
        System.out.println("Sinu skoor on " + score);
    }

    public void resetScore() {
        //TODO soutida skoor
        score = 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", queue=" + queue +
                '}';
    }

}
