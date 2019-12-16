package net.puzatin.kyu6.vasyaClerk;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

class TicketBoxTest {

    TicketBox ticketBox;

    @BeforeEach
    void init(){
        ticketBox = new TicketBox();
    }


    @Test
    void canSellTicketsTest1() {
        assertEquals("YES", ticketBox.canSellTickets(new int[]{25, 25, 50}));

    }

    @Test
    void canSellTicketsTest2() {
        assertEquals("YES", ticketBox.canSellTickets(new int[]{25, 25, 50, 100}));

    }

    @Test
    void canSellTicketsTest3() {
        assertEquals("NO", ticketBox.canSellTickets(new int[]{25,25,100}));

    }

    @Test
    void canSellTicketsTest4() {
        assertEquals("NO", ticketBox.canSellTickets(new int[]{50,25,50}));
    }


}