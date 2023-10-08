package atm;

public class Atm {
    int bill20 ;
    int bill50;
    int bill100;
    int allMoney;

    public Atm () {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }
    public int addBanknotes20(int number) { // методы для добавления денег в банкомат
        return bill20 += number;
    }
    public int addBanknotes50(int number) {
        return bill50 += number;
    }
    public int addBanknotes100(int number) {
        return bill100 += number;
    }
    public boolean isPossibleIssue(int amount) { // функция снимающая деньги
        int amountBanknotes20 = bill20;
        int amountBanknotes50 = bill50;
        int amountBanknotes100 = bill100;
        int banknotes20 = 20;
        int banknotes50 = 50;
        int banknotes100 = 100;
        int amountAllBanknotes = banknotes20 * amountBanknotes20 + banknotes50 * amountBanknotes50
                + banknotes100 * amountBanknotes100;
        boolean check;
        System.out.println("Amount all banknotes: " + amountAllBanknotes + " BYN");
        if (amountAllBanknotes < amount || amount % 10 != 0 || amount == 0) {
            check = false;
        } else {
            while (amount > 0 && amountBanknotes100 > 0) {
                amount -= banknotes100;
                amountBanknotes100--;
            }
            if (amount < 0) {
                amount += banknotes100;
                amountBanknotes100++;
            }
            while (amount > 0 && amountBanknotes50 > 0) {
                amount -= banknotes50;
                amountBanknotes50--;
            }
            if (amount < 0) {
                amount += banknotes50;
                amountBanknotes50++;
            }
            while (amount > 0 && amountBanknotes20 > 0) {
                amount -= banknotes20;
                amountBanknotes20--;
            }
            check = true;
        }
        return check;
    }

}
