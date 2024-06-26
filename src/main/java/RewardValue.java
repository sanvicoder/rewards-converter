public class RewardValue {
    double value;

    RewardValue(double value) {
        this.value = value;
    }

    public RewardValue(int milesValue) {
        this.value = convertToCash(milesValue);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * 0.0035;
    }

    public int getMilesValue() {
        return (int) (value / 0.0035);
    }

    public double getCashValue() {
        return value;
    }
}