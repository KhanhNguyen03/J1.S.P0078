/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class Validator {

    public String inputString(String title) {
        String s = "";
        while ( s.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.println(title + ": ");
            s = sc.nextLine();
        }
        return s;
    }
}
