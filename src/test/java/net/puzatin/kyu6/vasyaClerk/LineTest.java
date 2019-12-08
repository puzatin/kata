package net.puzatin.kyu6.vasyaClerk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    public void test1() {
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
        assertEquals("NO", Line.Tickets(new int[] {50, 25, 50}));
        assertEquals("NO", Line.Tickets(new int[] {25, 50, 50}));
        assertEquals("NO", Line.Tickets(new int[] {25, 25, 50, 100, 50}));

    }


}