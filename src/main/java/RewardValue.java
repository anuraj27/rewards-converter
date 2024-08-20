public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Initialize milesValue using the conversion rate
        this.milesValue = (int) (cashValue / 0.0035);
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        // Initialize cashValue using the conversion rate
        this.cashValue = milesValue * 0.0035;
    }

    // Getter for cashValue
    public double getCashValue() {
        return cashValue;
    }

    // Getter for milesValue
    public int getMilesValue() {
        return milesValue;
    }

    // Method to convert miles to cash at a rate of 0.0035
    public double convertMilesToCash(double miles) {
        return miles * 0.0035;
    }

    // Method to convert cash to miles using the inverse of the rate
    public int convertCashToMiles(double cash) {
        return (int) (cash / 0.0035);
    }
}
