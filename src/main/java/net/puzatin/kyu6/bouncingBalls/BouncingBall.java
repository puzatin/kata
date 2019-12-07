package net.puzatin.kyu6.bouncingBalls;

public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {

        if (h <= 0 || (1 <= bounce || bounce <= 0) || window > h) return -1;

        int countSeenBall = 0;

        while (h > window) {
            h *= bounce;
            countSeenBall += 2;
        }

        return countSeenBall - 1;
    }
}
