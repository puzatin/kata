package net.puzatin.kyu6.vasyaClerk;

import java.util.HashMap;

public class CashBox extends HashMap<Integer,Integer> {

    public int getBillCount(int bill) {
        if (!containsKey(bill)) return 0;
        return get(bill);
    }

    public void addBill (int bill) {
        if(!containsKey(bill)) put(bill,1);
        else put(bill, getBillCount(bill) + 1);
    }

    public boolean removeBill (int bill) {
        if (getBillCount(bill) == 0) return false;
        else put(bill,getBillCount(bill) - 1);
        return true;
    }

}
