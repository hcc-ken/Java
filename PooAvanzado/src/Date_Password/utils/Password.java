package Date_Password.utils;

import java.util.Random;

public class Password {
    private int length;
    private String password;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Password() {
        length = 0;
        password = "";
    }

    public Password(int length) {
        this.length = length;
        generatePassword();
    }

    public boolean isStrong() {
        int upperCount = 0, lowerCount = 0, numberCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c >= 'a' && c <= 'z') {
                lowerCount++;
            } else if (c >= 'A' && c <= 'Z') {
                upperCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }

        return upperCount > 2 && lowerCount > 1 && numberCount > 2;
    }

    public String generatePassword() {
        Random generator = new Random();
        char character;
        String characters = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ;,.:-_()[]{}0123456789";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            character = characters.charAt(generator.nextInt(characters.length()));
            sb.append(character);
        }

        password = sb.toString();
        return password;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Password other = (Password) obj;
        if (password == null) {
            return other.password == null;
        }
        return password.equals(other.password);
    }

}
