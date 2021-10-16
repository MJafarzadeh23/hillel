package home.work12.loginUser;

public class LoginUser {

    public static void main(String[] args) {
        LoginUser user = new LoginUser();
        System.out.println(user.loginUser("Maria_7","123_Maria","123_Maria")); // valid data
        System.out.println(user.loginUser("123456789012345678_A","123_Maria","123_Maria"));
        System.out.println(user.loginUser("12345678901234567890_A","123_Maria","123_Maria"));
        System.out.println(user.loginUser("Maria___7","123__Maria","123__Maria"));
        System.out.println(user.loginUser("Mari@_10","123_Maria","123_Maria"));
        System.out.println(user.loginUser("Maria_10","123_MARIA","123_@Maria"));
        System.out.println(user.loginUser("Maria_10","123_MARIA","123_maria"));
        System.out.println(user.loginUser("Maria_10","123__Maria","123_Maria"));
    }

    public static boolean loginUser(String login, String password, String confirmPassword) {
        int expectedLoginLength = 20;
        int expectedPasswordLength = 20;

        try {
            if (login.length() > expectedLoginLength || // check length of login, not more than 20 symbols
                !login.contains("_") ||                 // login must contain underscore '_' symbol
                underscoreCounter(login) >= 2 ||        // login must contain 1 underscore '_' symbol
                !hasDigits(login) ||                    // login must contain digits
                !hasAlphabets(login) ||                 // login must contain latin alphabets
                hasSpecials(login)) {                   // login must not contain any special symbols except '_'
                throw new WrongLoginException(); // default constructor
            } else if (password.length() > expectedPasswordLength ||
                    !password.contains("_") ||
                    underscoreCounter(password) >= 2 ||
                    !hasDigits(password) ||
                    !hasAlphabets(password) ||
                    hasSpecials(password)) {
                    throw new WrongPasswordException("Invalid input. Password must contain alphabets, numbers, symbol '_' and be not longer than 20 symbols");
            } else if (password.equals(confirmPassword)) /*(password == confirmPassword)*/{
                System.out.println("Welcome, " + login + "!");
                return true;
            } else {
                System.out.println("The password confirmation does not match!");
                return false;
            }
        } catch (WrongLoginException e) {
            System.out.println("Invalid input. Login must contain alphabets, numbers, symbol '_' and be not longer than 20 symbols");
            /*e.printStackTrace();*/
        } catch (WrongPasswordException e) {
            System.out.println("Invalid input. Password must contain alphabets, numbers, symbol '_' and be not longer than 20 symbols");
            /*e.printStackTrace();*/
        }
        return false;
    }

    public static boolean hasDigits(String s) {
        if (s.matches(".*[0-9]+.*")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasAlphabets(String s) {
        if (s.matches(".*[a-zA-Z]+.*")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasSpecials(String s) {
        String specialChars = "!@#$%&*()'+,-./:;<=>?[]^`{|}"; // string of special symbols except '_'
        boolean checkSpecials = false;
        for (int i = 0; i < s.length(); i++) {
            String strSpecials = Character.toString(s.charAt(i));
            if (specialChars.contains(strSpecials)) {
                checkSpecials = true;
                break;
            } else {
                checkSpecials = false;
            }
        }
        return checkSpecials;
    }

    public static int underscoreCounter(String s) {  // method to count '_' symbols in login or password
        String underscore = "_";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            String strUnderscore = Character.toString(s.charAt(i));
            if (strUnderscore.contains(underscore)) {
                counter++;
            }
        }
        return counter;
    }
}
