package lotto;

public enum Rank {
    THREE(3, 5000),
    FOUR(4, 50000),
    FIVE(5, 1500000),
    FIVE_BONUS(5, 30000000),
    SIX(6, 2000000000);

    private int matchingNumbers;
    private int prize;
    private int total;

    Rank(int matchingNumbers, int prize) {
        this.matchingNumbers = matchingNumbers;
        this.prize = prize;
        this.total = 0;
    }

    public void increaseTotal(Rank rank, int numberOfMatch) {
        if (rank == Rank.FIVE_BONUS) {
            return;
        }
        if (rank.matchingNumbers == numberOfMatch) {
            rank.total++;
        }
    }

    public void increaseBonusTotal(Rank rank) {
        rank.total++;
    }

    public int getMatchingNumbers() {
        return matchingNumbers;
    }

    public int getPrize() {
        return prize;
    }

    public int getTotal() {
        return total;
    }

    public int getTotalPrize() {
        return prize * total;
    }
}
