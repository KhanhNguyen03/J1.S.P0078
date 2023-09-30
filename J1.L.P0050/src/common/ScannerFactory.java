
package common;

import java.util.Scanner;

public class ScannerFactory {
    
    private Scanner SCANNER;
    
    public Scanner getScanner(){
        if(SCANNER == null){
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }
    
    public double getNumber(String title){
        String input;
        while (true) {  
            System.out.println(title);
            input = getScanner().nextLine();
            if(!input.isEmpty()  &&checkin(input)){
                break;
            }else {
                System.out.println("Please input number...");
            }
        }
        return Double.parseDouble(input);
    }
    
    public int getInt(){
        String input;
        while (true) {            
            input = getScanner().nextLine();
            if(input.matches("^[\\d]+")){
                break;
            }else {
                System.out.println("Number only....");
            }
        }
        return Integer.parseInt(input);
    }
    
    public boolean checkin(String floatString) {
        for (char i : floatString.toCharArray()) {
            if (!Character.isDigit(i)){
                return false;
            }
        }
        return true;
    }
    
    public String getYN(){
        String input;
        while(true){
            input = getScanner().nextLine();
            if(input.matches("^[YyNn]")){
                break;
            }
        }
        return input;
    }
}
