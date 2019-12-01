package net.puzatin.kyu7.square;

public class Square {

    public static boolean isSquare(int n) {

        if(n == 0) return true;
        if (n == 3) return false;

        int next = 3;
        int sumOdd = 1; // The sum of the first odd integers, beginning with one, is a perfect square: 1, 1 + 3, 1 + 3 + 5, 1 + 3 + 5 + 7, etc.
            while (sumOdd < n) {
                sumOdd += next;
                next += 2;
                if (sumOdd == n) return true;
    }
        return false;
}


}
