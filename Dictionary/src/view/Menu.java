/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Dictionary;
import java.io.IOException;
import controller.Dictionary;
import common.Validation;

/**
 *
 * @author OS
 */
public class Menu {
     static String [] ops = {
        "Add Word",
            "Delete Word",
            "Translate Word",
            "Exit"
    
    };
     Validation val = new Validation();
    
    public void display() throws IOException{
        Dictionary d = new Dictionary();
        int choice ;
        do {
            System.out.println("====Dictionary program======");
            for (int i = 0; i <ops.length;i++)
                System.out.println((i+1) + "."+ops[i]);
          choice = val.getInt("Choose:", 1, ops.length);
          switch (choice) {
              case 1:
                  d.addWord();
                  break;
              case 2:
                  d.removeWord();
                  break;
              case 3:
                  d.translate();
                  break;
              case 4:
                  break;
          }
        }while (choice != ops.length);
    }
}
