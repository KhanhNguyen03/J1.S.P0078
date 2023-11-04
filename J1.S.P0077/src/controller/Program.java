/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.util.Scanner;
import view.Menu;

public  class Program extends Menu {
    private Management mn;
    private Scanner sc;
    static String[] mChon = { "Count word in file", "Find file By Word", "Exit" };
    public Program() {
        super("Word Program", mChon);
        mn = new Management();
        sc = new Scanner(System.in);
    }
 
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.print("Enter Path: ");
                String path = sc.nextLine();
                System.out.print("Enter Word: ");
                String wordCount = sc.nextLine();
                File file1 = new File(path);
                System.out.print("Count: " + mn.countWordInFile(file1, wordCount));
                System.out.println();
                break;
                
            case 2:
                System.out.println("Enter Folder: ");
                String folder = sc.nextLine();
                System.out.print("Enter Word: ");
                String wordFind = sc.nextLine();
                File file2 = new File(folder);
                mn.searchFile(file2, wordFind);
                break;
            case 3:
                System.exit(0);
        }
    }

    
}
