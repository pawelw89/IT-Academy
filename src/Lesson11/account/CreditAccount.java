package Lesson11.account;

import Lesson11.Withdrawable;
import Lesson11.Wplatomat;
import Lesson11.exceptions.NotEnoughMoney;
import java.math.BigDecimal;

public class CreditAccount extends Account implements Wplatomat, Withdrawable {

    private BigDecimal balance;

    public CreditAccount() {
        super();
        balance = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal topUp(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Cant top up on negative amount");
        }
        return balance;
    }

    @Override
    public BigDecimal withDraw(BigDecimal amount) throws NotEnoughMoney {
        if(balance.compareTo(amount) >= 0) {
            return balance.subtract(amount);
        }
        throw new NotEnoughMoney("Not enough money! Current balance: " + balance);
    }
}
