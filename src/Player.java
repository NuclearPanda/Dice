public class Player {

    private String name;
    private int score;
    private int queue;

    public String getName() {
        return name;
    }

    public int getQueue() {
        return queue;
    }

    public void setQueue(int queue) {
        this.queue = queue;
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
