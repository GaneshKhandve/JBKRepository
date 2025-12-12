package com.tka.dec10;

public class Test {
    public static void main(String[] args) {
        String email="ganeshK1105@gmail.com" ;
        String password = "Ganesh@123";

        System.out.println(isValidEmail(email));      // true
        System.out.println(isValidPassword(password)); // true

    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()){
            return false;
        }

        if (email.contains(" ")) {
            return false;
        }

        int atIndex = email.indexOf('@');
        if (atIndex <= 0) return false; // '@' cannot be first char

        // must contain '.'
        int dotIndex = email.lastIndexOf('.');
        if (dotIndex <= atIndex + 1) return false; // '.' must come after '@'

        // '.' cannot be last char
        if (dotIndex == email.length() - 1) {
            return false;
        }
        return true;
    }

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSpecial = true;  // any non-alphanumeric considered special
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

}
