import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Dice a = new D10();
        List<Player> players = createPlayers();
        //Animations.animateDice(a);


//        int alustab = whoBegins(players);
//        System.out.println(players.get(alustab));


    }

    //TODO Meetod add players?
    public static List<Player> createPlayers() {
        List<Player> players = new ArrayList<>();
        Scanner info = new Scanner(System.in);
        System.out.print("Sisesta mängijate arv: ");
        int playerCount = info.nextInt();

        for (int i = 0; i < playerCount; i++) {
            System.out.print("Sisesta " + (i + 1) + ". mängija nimi: ");
            String name = info.next();
            players.add(new Player(name, 0));
        }
        return players;
    }

    public static void whoBegins(List<Player> players) {
        if (players.size()==0){
            return;
        }
        int playerCount = players.size();
        int randIndex = Dice.randIntWithRange(0, playerCount - 1);
        String name = players.get(randIndex).getName();
        System.out.println(name + " saab otsustada, kes alustab. ");
        System.out.print("Kas soovid ise alustada? Vasta Jah või Ei: ");
        Scanner info = new Scanner(System.in);
        String answer = info.nextLine();
        System.out.print("\n");
        if (answer.toLowerCase().equals("jah")) {
            System.out.println(name + " alustab mängu!");
        } else if (answer.toLowerCase().equals("ei")) {
            System.out.println("Valime uue mängija, kes alustab!");
            whoBegins(players);
            //TODO Vb võtta välja see kes ütles ei
        } else {
            System.out.println("Pole sobiv vastus");
            whoBegins(players);
        }
    }

    public void turn() {
        System.out.println();
    }

}
