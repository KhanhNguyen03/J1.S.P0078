import java.util.Locale;
import java.util.ResourceBundle;

import common.Utility;
import controller.ManageAccount;

public class main {
    public static void main(String[] args) {
        Utility utility = new Utility();
        ManageAccount mn = new ManageAccount();

        while (true) {
            displayMenu();
            int choice = utility.getInt("Pls choice one option:", "Wrong", 1, 3);
            Locale locale;


            switch (choice) {
                case 1:
                Locale.setDefault(new Locale("vi", "VN"));
                ResourceBundle b = ResourceBundle.getBundle("messages");
                System.out.println(b.getString("messageUsername"));
               
                    break;
                case 2:
                locale = new Locale("en");
                mn.setLocate(locale);
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
        
    }
    
    private static void displayMenu() {
        System.out.println("1. vietnam");
        System.out.println("2. english");
        System.out.println("3. exit");
    }
}

