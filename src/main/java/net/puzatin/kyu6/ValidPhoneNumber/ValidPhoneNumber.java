package net.puzatin.kyu6.ValidPhoneNumber;



public class ValidPhoneNumber {
    public static boolean isValid(String phoneNumber) {
       return phoneNumber != null && phoneNumber.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$");
    }
}
