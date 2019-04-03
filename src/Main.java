import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Dice a = new D10();
        run(a);
        }

    public static List<Player> createPlayers() {
        List<Player> players = new ArrayList<>();
        Scanner info = new Scanner(System.in);
        System.out.print("Sisesta mängijate arv: ");
        int playerCount = info.nextInt();

        for (int i = 0; i < playerCount; i++) {
            System.out.print("Sisesta " + (i + 1) + ". mängija nimi: ");
            String name = info.next();
            players.add(new Player(name, 0, 0));
        }
        return players;
    }

    public static void whoBegins(List<Player> players) {
        if (players.size() == 0) {
            return;
        }
        Collections.shuffle(players);
        System.out.println("Alustab " + players.get(0).getName() + ".");
    }

    private static void run(Dice dice) throws InterruptedException { // Tehtud paarisprogrammerimisega
        List<Player> players = Main.createPlayers();
        Main.whoBegins(players);
        Scanner input = new Scanner(System.in);
        Player winner = players.get(0);
        boolean running = true;
        boolean rolled1;
        int index = 0;
        while (running) {
            System.out.println("\nNüüd on " + players.get(index).getName() + " kord.");
            rolled1 = false;
            System.out.print("Mitu korda tahad veeretada: ");
            int mituKorda = input.nextInt();
            if (mituKorda == 0) {
                if (index >= players.size() - 1) {
                    index = 0;
                } else index++;
                continue;
            }
            System.out.print("\n");
            for (int i = 0; i < mituKorda; i++) {
                int roll = Animations.animateDice(dice);
                if (roll == 1) {
                    rolled1 = true;
                    players.get(index).resetScore();
                    break;
                } else {
                    players.get(index).addToScore(roll);
                    if (players.get(index).getScore() >= 91){
                        running = false;
                        winner = players.get(index);
                        break;
                    }
                }

            }
            if (rolled1) {
                if (index >= players.size() - 1) {
                    index = 0;
                } else {
                    index++;
                    System.out.println("-------------------------------------");
                }
            }
        }
        System.out.println("Võitja on " + winner.getName() + " skooriga " + winner.getScore() + "!!!");
    }

}
