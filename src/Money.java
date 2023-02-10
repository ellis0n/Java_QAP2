public class Money {
    // Instance variables
    private int dollars;
    private int cents;

    // Constructors
    public Money() {
        dollars = 0;
        cents = 0;
    }

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money(int dollars) {
        this.dollars = dollars;
        this.cents = 0;
    }

    public Money(double amount) {
            dollars = (int) amount;
            cents = (int) Math.round((amount - dollars) * 100);
    }

    // Getters
    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    // Methods for adding and subtracting money
    public Money add(Money otherAmount) {
        Money sum = new Money();
        sum.cents = this.cents + otherAmount.cents;
        int carryDollars = sum.cents / 100;
        sum.cents = sum.cents % 100;
        sum.dollars = this.dollars + otherAmount.dollars + carryDollars;
        return sum;
    }

    public Money subtract(Money otherAmount) {
        Money difference = new Money();
        if (this.cents < otherAmount.cents) {
            this.dollars = this.dollars - 1;
            this.cents = this.cents + 100;
        }
        difference.dollars = this.dollars - otherAmount.dollars;
        difference.cents = this.cents - otherAmount.cents;
        return difference;
    }

    // Method for comparisons (used to check credit limit)
    public int compareTo(Money otherAmount) {
        int value1 = this.dollars * 100 + this.cents;
        int value2 = otherAmount.dollars * 100 + otherAmount.cents;
        if (value1 < value2) {
            return -1;
        } else if (value1 == value2) {
            return 0;
        } else {
            return 1;
        }
    }

    // toString method
    public String toString() {
        String centsStr = String.valueOf(cents);
        if (cents < 10) {
            centsStr = "0" + centsStr;
        }
        return "$" + dollars + "." + centsStr + "0";
    }
}
