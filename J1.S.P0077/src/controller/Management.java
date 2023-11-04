/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Management {

    Scanner sc = new Scanner(System.in);

    public int countWordInFile(File file, String word) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                if (line.replaceAll("\\W", "").equals(word)) {
                    count++;
                }
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return count;
    }

    public void searchFile(File folder, String word) {
        System.out.println("--------File Name --------");
        try {
            File arr[] = folder.listFiles();
            for (int i = 0; i < arr.length; i++) {
                if (countWordInFile(arr[i], word) > 0) {
                    System.out.println(arr[i].getName());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
