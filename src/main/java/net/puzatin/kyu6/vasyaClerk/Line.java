package net.puzatin.kyu6.vasyaClerk;

public class Line {
    public static String Tickets(int[] peopleInLine)
    {
       if (peopleInLine[0] != 25) return "NO";
        int bill25 = 1;
        int bill50 = 0;
        String canSell = "YES";
        for (int i = 1; i < peopleInLine.length; i++) {

            if (peopleInLine[i] == 25) {
                bill25++;
            }
            else if (peopleInLine[i] == 50 && bill25 > 0) {
                bill25--;
                bill50++;
            }
            else if (peopleInLine[i] == 100 && (bill50 > 0 && bill25 > 0)) {
                bill25--;
                bill50--;
            }
            else if (peopleInLine[i] == 100 && (bill25 >= 3)) {
                bill25 = bill25 - 3;
            } else canSell = "NO";
        }

        return canSell;

    }
}