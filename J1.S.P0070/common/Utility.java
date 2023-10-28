package common;


import java.util.Scanner;

public class Utility{
    static Scanner scanner = new Scanner(System.in);
    public final String REGEX_DATE = "\\d{2}[-]\\d{2}[-]\\d{4}";
    public final String REGEX_PASSWORD="(?=.*\\d.*)(?=.*[a-zA-z].*).{8,31}";
    public final String REGEX_USERNAME= "\\d{10}";

    public int getInt(String message, String firstError
            , int min, int max) {
        //Exception : dai dien cho moi loai loi ... 
        //tioen doan duoc cai loi la se xay ra loi nao
        while (true) {
            try {
                System.out.print(message);
                int number = Integer.parseInt(scanner.nextLine());
                if (number < min) {
                    System.out.println("Wrong");
                } else if (number > max) {
                    System.out.println("Wrong");
                } else {
                    return number;
                }
            } catch (Exception e) {
                System.out.println(firstError);
            }
        }
    }


    public  double getDouble(String message, String firstError,
            String secondError, String thirdError, double min, double max) {
        //loop unti get number double
        while (true) {
            try {
                System.out.print(message);
                double number = Double.parseDouble(scanner.nextLine());
                if (number < min) {
                    System.out.println(firstError);
                } else if (number > max) {
                    System.out.println(secondError);
                } else {
                    return number;
                }
            } catch (Exception e) {
                System.out.println(thirdError);
            }
        }
    }

    public  float getFloat(String message, String firstError,
            String secondError, String thirdError, float min, float max) {
        //loop unti get number double
        while (true) {
            try {
                System.out.print(message);
                float number = Float.parseFloat(scanner.nextLine());
                if (number < min) {
                    System.out.println(firstError);
                } else if (number > max) {
                    System.out.println(secondError);
                } else {
                    return number;
                }
            } catch (Exception e) {
                System.out.println(thirdError);
            }
        }
    }

    public static String getString(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            return input;
        }

    }
   

   

}

