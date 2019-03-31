public class D10 extends Dice {
    @Override
    int roll() {
        return randInt(1, 10);
    }

    @Override
    int getMax() {
        return 10;
    }
}
