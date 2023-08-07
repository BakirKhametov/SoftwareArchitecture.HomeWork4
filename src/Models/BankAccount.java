package Models;

//import javax.smartcardio.Card;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {
    private int card;
    public int oldCard;
    public int balance;

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    
    public int getOldCard() {
        return oldCard;
    }

    public void setOldCard(int oldCard) {
        this.oldCard = oldCard;
    }

    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}
