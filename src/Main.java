import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Dice a = new D10();
        List<Player> players = addPlayers();
//        Animations.animateDice(a);


        whoBegins(players);


    }

    //TODO Meetod add players?
    public static List<Player> addPlayers() {
        List<Player> players = new ArrayList<>();
        Scanner info = new Scanner(System.in);
        System.out.println("Sisesta mängijate arv: ");
        int playerCount = info.nextInt();

        for (int i = 0; i < playerCount; i++) {
            System.out.println("Sisesta " + (i+1) + ". mängija nimi");
            String name = info.next();
            players.add(new Player(name, 0));
        }
        return players;
    }

    public static void whoBegins(List<Player> players) {
        int playerCount = players.size();
        int who = Dice.randIntWithRange(0, playerCount-1);
        String name = players.get(who-1).getName();
        System.out.println(name + " saab otsustada, kes alustab. ");
        System.out.println("Kas soovid ise alustada? Vasta Jah või Ei");
        Scanner info = new Scanner(System.in);
        String answer = info.nextLine();
        if (answer.equals("Jah")) {
            System.out.println(name + " alustab mängu!");
        } else if (answer.equals("Ei")) {
            System.out.println("Valime uue mängija, kes alustab!");
            whoBegins(players);
            //TODO Vb võtta välja see kes ütles ei
        } else {
            System.out.println("Pole sobiv vastus");
            whoBegins(players);
        }
    }


}
