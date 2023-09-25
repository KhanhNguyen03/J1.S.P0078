/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;


/**
 *
 * @author OS
 */
public class Validation {
    private static final Scanner sc = new Scanner(System.in);
    
    
    public String inputString (String msg) {
        System.out.println(msg);
        //nếu người dùng ko nhập thì yêu cầu nhập lại
        while (true) {
            String result= sc.nextLine().trim();
            if(result.length()==0 || result == null) {
                System.out.println("Not allowed input a empty string ! Pls input again");
                continue;
            }
            return result;
        }
    }
    
    // input int
    public int inputInt (String msg, int min, int max) {
        System.out.println(msg);       
        while (true) {
            String result_raw=sc.nextLine().trim();
            try{
                int result =Integer.parseInt(result_raw);
                if (result < min || result > max){
                    System.out.println("Must be from " + min +"to" + max +"Pls input again");
                    continue;
                }
                return result;
            }catch (NumberFormatException e) {
                System.out.println("Must be number! Pls input again");
            }
            
        }
    }
    
    //input double
      public double inputDouble (String msg, int min, int max) {
        System.out.println(msg);       
        while (true) {
            String result_raw=sc.nextLine().trim();
            try{
                double result =Double.parseDouble(result_raw);
                if (result < min || result > max){
                    System.out.println("Must be from " + min +"to" + max +"Pls input again");
                    continue;
                }
                return result;
            }catch (NumberFormatException e) {
                System.out.println("Must be number! Pls input again");
            }
            
        }
    }
      
      
}
