package controller;

import java.util.Locale;
import java.util.ResourceBundle;
import common.Utility;

public class ManageAccount {

    ResourceBundle bundle;

    public void setLocate(Locale locale) {
        bundle = ResourceBundle.getBundle("messages", locale);
        checkLogin(bundle);
    }

    public void checkLogin(ResourceBundle bundle) {
        // check account number
        while (true) {
            String account = Utility.getString(bundle.getString("messageUsername "));
            String error = checkAccountNumber(account);

            if (error == null) {
                break;
            } else {
                System.out.println(error);
            }
        }

        // check account password
        while (true) {
            String password = Utility.getString(bundle.getString("messagePassword"));
            String error = checkPassword(password);

            if (error == null) {
                break;
            } else {
                System.out.println(error);
            }
        }
    }

    private String checkAccountNumber(String account) {
        if (account.matches("\\d{10}")) {
            return null;
        } else {
            return bundle.getString("messageAccountError");
        }
    }

    private String checkPassword(String password) {
        if (password.matches("(?=.*\\d)(?=.*[a-zA-Z])\\S{8,31}")) {
            return null;
        } else {
            return bundle.getString("messagetPasswordError");
        }
    }
}

// // private void checkLogin() {
// Locale.setDefault(new Locale("vi", "VN"));
// ResourceBundle b = ResourceBundle.getBundle("messages");
// System.out.println(b.getString("messageUsername"));
