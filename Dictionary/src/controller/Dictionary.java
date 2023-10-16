/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.Validation;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author OS
 */
public class Dictionary {
    private Map<String, String > dict;
     private Validation val;
    
               
    public Dictionary () throws IOException {
        dict = new HashMap<>();
        val = new Validation();
        loadData();
        System.out.println(dict);
    }
    
    private void loadData () throws  IOException{
        File f =new File ("dictionary.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        
        while (true){
            String line =br.readLine();
            if (line == null || line.isEmpty() ) break;
            String [] words =line.split("[-]");
            String eng = words[0].trim(), vi = words[1].trim();
            dict.put(eng, vi);
        }
        br.close();
        fr.close();
    }
    
     
    private void saveData () throws  IOException{
        File f =new File ("dictionary.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Map.Entry<String , String > entry : dict.entrySet())
            bw.write(entry.getKey() + "-" + entry.getValue() + "\n");
     bw.close();
        fw.close();
    }
    
    public void addWord () throws IOException{
        System.out.println("-------Add-------");
        String eng =val.getString ("Enter English:");
        if (dict.containsKey(eng) &&  val.getYN(eng + "is already existed in dictionary , do you want to update(Y/N)?"))
            return ;
        
      String vi =  val.getString("Enter VietNamese:");
      dict.put(eng, vi);
      saveData();
        System.out.println("Add Successful!!");
    }
    
    
    public void removeWord() throws IOException{
         System.out.println("-------Delete-------");
         String eng =val.getString ("Enter English:");
         if (!dict.containsKey(eng)) {
             System.err.println("Not Found");
             return;
         }
         dict.remove(eng);
        saveData();
        System.out.println("Delete Successful!");
    }
    public void translate(){
         System.out.println("-------Translate-------");
         String eng =val.getString ("Enter English:");
         if (!dict.containsKey(eng)) {
             System.err.println("Not Found");
             return;
         }
         System.out.println("Vietnamese:" +dict.get(eng));
    }
}
