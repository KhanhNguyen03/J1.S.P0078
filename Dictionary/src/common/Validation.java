/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Scanner;

public class Validation {
    private Scanner sc = new Scanner(System.in);
    
       public int getInt (String msg ,int min ,int max) {
        if (min > max){
            int temp =min;
        min = max;
        max =temp;
       }
        while (true) {
           try{
               System.out.println(msg);
               int  n =Integer.parseInt(sc.nextLine());
            if (min <= n && n <= max) return n;
               System.err.println("Pls input number in range " + min + " ->" +max);
           }catch (NumberFormatException ex) {
               System.err.println("Wrong Format !!");
           }
        }
              
    }
       
       
       public String getString (String msg) {
           while (true) {
               System.out.println(msg);
               String s = sc.nextLine();
               if (!s.isEmpty()) return s;
               System.err.println("Empty String is not allowed!");
           }
       }
       
       public boolean getYN (String msg) {
           while (true) {
               System.out.println(msg);
               String s = sc.nextLine();
               if (s.equalsIgnoreCase("n"))
                   return true;
               else if (s.equalsIgnoreCase("y"))
                   return false;
               System.err.println("Pls input only Y/N");
           }
       }
}
