package MVT24SthlmCI;

public class User {
    private String userName;
    private String password;

    // Konstruktor
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // Getter för userName
    public String getUserName() {
        return userName;
    }

    // Setter för userName
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Getter för password
    public String getPassword() {
        return password;
    }

    // Setter för password
    public void setPassword(String password) {
        this.password = password;
    }

    // Kontrollera lösenordets styrka
    public boolean isPasswordStrong() {
        return password.matches(".*[a-zA-Z].*") && password.matches(".*\\d.*");
    }

    // Validera lösenord
    public boolean validatePassword() {
        return password.length() >= 8 && isPasswordStrong();
    }
}