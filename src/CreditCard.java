public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = creditLimit;
        balance = new Money();
    }

    public Person getPersonals() {
        return owner;
    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

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
