package net.puzatin.kyu6.vasyaClerk;

import java.util.*;

public class TicketBox {

    private CashBox cashBox;

    public TicketBox() {
        this.cashBox = new CashBox();
    }



    public String canSellTickets(int[] billInLine) {

        for (int bill : billInLine){
            cashBox.addBill(bill);
            if (!giveChange(bill - 25)) return "NO";
        }

        return "YES";

    }

    public boolean giveChange(int amount) {
        List<Integer> denominations = new ArrayList<>(cashBox.keySet());
        Collections.sort(denominations);
        Collections.reverse(denominations);

        for (int denomination : denominations) {
            while (denomination <= amount && cashBox.getBillCount(denomination) > 0) {
                cashBox.removeBill(denomination);
                amount -= denomination;
            }
        }

        return amount == 0;
    }

}
