public class Feeder {
    private int currentFood;
    public Feeder(int food) {
        currentFood = food;
    }
    public int getCurrentFood() {
        return currentFood;
    }
    public void simulateOneDay(int numBirds) {
        if (Math.random() < 0.05) currentFood = 0;
    }
    public int simulateManyDays(int numBirds, int numDays) {

    }
}
