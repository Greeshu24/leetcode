interface ATMOperations {
    void deposit(int[] banknotesCount);
    int[] withdraw(int amount);
}

class ATM implements ATMOperations {
    private long[] notes;
    private final int[] values = {20, 50, 100, 200, 500};
    public ATM() {
        notes = new long[5];
    }
    public void deposit(int[] banknotesCount) {

        for (int i = 0; i < 5; i++) {
            notes[i] += banknotesCount[i];
        }
    }
    public int[] withdraw(int amount) {
        int[] result = new int[5];
        for (int i = 4; i >= 0; i--) {

            long canTake = Math.min(notes[i], amount / values[i]);

            result[i] = (int) canTake;
            amount -= canTake * values[i];
        }
        if (amount != 0) {
            return new int[]{-1};
        }
        for (int i = 0; i < 5; i++) {
            notes[i] -= result[i];
        }
        return result;
    }
}