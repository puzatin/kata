package net.puzatin.kyu6.ValidPhoneNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPhoneNumberTest {

    @Test
    public void tests() {
        assertEquals(false, ValidPhoneNumber.isValid("098123567"));
        assertEquals(true, ValidPhoneNumber.isValid("(123) 456-7890"));
        assertEquals(false, ValidPhoneNumber.isValid("(1111)555 2345"));
        assertEquals(false, ValidPhoneNumber.isValid("(098) 123 456788"));
        assertEquals(false, ValidPhoneNumber.isValid("(O98) 123-4567"));
        assertEquals(false, ValidPhoneNumber.isValid("(O98) 123-4567"));
        assertEquals(false, ValidPhoneNumber.isValid(null));
    }

}