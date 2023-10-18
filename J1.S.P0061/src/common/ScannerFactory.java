
package common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class ScannerFactory {

    private Scanner SCANNER;

    public Scanner getScanner() {
        if (SCANNER == null) {
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }

    public int getInt() {
        String input;
        while (true) {
            input = getScanner().nextLine();
            if (input.matches("^[\\d]+")) {
                break;
            }
        }
        return Integer.parseInt(input);
    }


   

    public double getDouble(String title) {
        String floatRegexp = "^(\\d+\\.)?\\d+$";
        String input;
        while (true) {
            System.out.println(title);
            input = getScanner().nextLine();
            if (input.matches(floatRegexp) && Double.parseDouble(input) > 0) {
                break;
            }
        }
        return Double.parseDouble(input);
    }

  


   
}
