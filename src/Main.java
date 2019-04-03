import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Dice a = new D10();
        List<Player> players = createPlayers();
        Animations.animateDice(a);

        whoBegins(players);
//        System.out.println(players.get(alustab));
        for (Player player :
                players) {
            System.out.println(player);
        }


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

    public void turn() {
        System.out.println("");
    }

}
