package net.puzatin.kyu6.bouncingBalls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BouncingBallTest {

    @Test
    void bouncingBall() {
        assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
        assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
        assertEquals(1, BouncingBall.bouncingBall(30.0, 0.2, 15));
        assertEquals(-1, BouncingBall.bouncingBall(10, -1, 1.5));
        assertEquals(-1, BouncingBall.bouncingBall(30.0, 1.1, 1.5));
        assertEquals(-1, BouncingBall.bouncingBall(9, 0.6, 10));
        assertEquals(-1, BouncingBall.bouncingBall(0, 0.6, 10));
        assertEquals(-1, BouncingBall.bouncingBall(-1, 0.6, 10));
    }


}