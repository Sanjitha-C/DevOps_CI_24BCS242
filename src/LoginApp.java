public class LoginApp {
    private static final String VALID_USERNAME = "sanjitha";
    private static final String VALID_PASSWORD = "12345";

    public static boolean login(String username, String password) {
        return VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password);
    }

    public static void main(String[] args) {
        boolean successfulLogin = login("sanjitha", "12345");
        System.out.println("Login successful: " + successfulLogin);
    }
}