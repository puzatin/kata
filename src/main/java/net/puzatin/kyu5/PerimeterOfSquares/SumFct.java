package net.puzatin.kyu5.PerimeterOfSquares;

import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        n = n.add(BigInteger.ONE);
        if(n.intValue() == 1) return BigInteger.ONE;
        if(n.intValue() == 2) return BigInteger.TWO;
        BigInteger x = BigInteger.ONE;
        BigInteger y = BigInteger.ONE;
        BigInteger next;
        BigInteger sum = BigInteger.TWO;
        for (int i = 2; i < n.intValue(); i++) {
            next = x.add(y);
            x = y;
            y = next;
            sum = sum.add(next);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

}
