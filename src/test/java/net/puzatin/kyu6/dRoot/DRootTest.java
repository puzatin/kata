package net.puzatin.kyu6.dRoot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DRootTest {

    @Test
    public void Tests() {
        assertEquals( 7, DRoot.digital_root(16));
        assertEquals( 4, DRoot.digital_root(4));
        assertEquals( 0, DRoot.digital_root(0));
        assertEquals( 1, DRoot.digital_root(127));
        assertEquals( 6, DRoot.digital_root(456));
    }

}