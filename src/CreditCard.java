public class CreditCard {
    // Instance variables
    private Person person;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person person, Money creditLimit) {
        this.person = person;
        this.creditLimit = creditLimit;
        balance = new Money();
    }

    // Getters
    public Person getPersonals() {
        return person;
    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    // Methods for charging and paying
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) > 0) {
            System.out.println("Charge denied");
        } else {
            balance = balance.add(amount);
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}
