import java.util.Random;

public abstract class Dice {
    abstract int roll();

    abstract int getMax();

    static int randIntWithRange(int min, int max) {
        Random generaator = new Random();
        return generaator.nextInt(max - min + 1) + 1;
    }

}
