/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import model.Fruit;


/**
 *
 * @author OS
 */
public class FruitShop {

    private ArrayList<Fruit> listFruit;
    private Validation val;
    private Hashtable<String, List<Fruit>> orderList;

    public FruitShop() {
        listFruit = new ArrayList();
        val = new Validation();                
        orderList = new Hashtable<>();
    }
 public void getMenu(){
    while(true){
            System.out.println("Fruit shop System");
        System.out.println("1. Create fruit ");
        System.out.println("2. View order");
        System.out.println("3. Shopping ");
        System.out.println("4. Exit");
        int choice = val.inputInt("Enter selection", 1, 4);
        switch(choice){
            case 1: createFruit();
                break;
            case 2:viewOrder();
                break;
            case 3:
             Shopping();
            case 4: 
                break;
        }
    }
  }
    public void createFruit() {
        //input fields of fruit
        // make instace Fruit
        //method add in araylist
        while (true) {
            String id = val.inputString("Enter fruit id:");
            String name = val.inputString("Enter fruit name:");
            int quantity = val.inputInt("Enter quantity:", 0, 1000);
            double price = val.inputDouble("Enter price:", 0, 1000);
            String origin = val.inputString("Enter origin:");
            Fruit fruit = new Fruit(id, name, quantity, price, origin);
            listFruit.add(fruit);
            String option = val.inputString("Do you want to continue(Y/N)");
            if (option.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
    }

    public void Shopping() {
        while (true) {
            ArrayList<Fruit> listBuy = new ArrayList<>();
            int count = 0;
            System.out.println("List of Fruit:");
            System.out.println("| ++ Item ++ | ++ FruitName ++ | ++ Origin ++ | ++ Price ++");
            for (Fruit fruit : listFruit) {
                System.out.printf("%-5s%-15s%-17s%-17s%-15s\n", "", count + 1, fruit.getName(), fruit.getOrigin(), fruit.getPrice() + "$\n");
                count++;
            }
            int item = val.inputInt("Select item:", 1, listFruit.size());
            Fruit itemSelect = listFruit.get(item - 1);

            System.out.println("You selected:" + itemSelect.getName());
            int quantity = val.inputInt("Enter quantity:", 0, 1000);

            Fruit eachBuy = new Fruit(itemSelect.getId(), itemSelect.getName(), quantity, itemSelect.getPrice(), itemSelect.getOrigin());
            listBuy.add(eachBuy);

            String option = val.inputString("Do you want to order now?(Y/N)");
            if (option.equalsIgnoreCase("n")) {
                continue;
            } else {
                count = 0;
                int total = 0;
                System.out.println("Product | Quantity | Price | Amount");
                for (Fruit bought : listBuy) {
                    int q = bought.getQuantity();
                    double price = bought.getPrice();
                    System.out.printf("%-13s%-10s%-7s%-5s", (count + 1) + "." + "coconut", q, price, q * price + "$");
                    System.out.println("");
                    total += (q * price);
                    count++;
                }
                System.out.println("Total:"+total+"$");
                String nameCustomer = val.inputString("Enter your name:");
                orderList.put(nameCustomer, listBuy);
                break;

            }

        }
    }
    public void viewOrder(){
        Enumeration<String> keys = orderList.keys();
        while (keys.hasMoreElements()){
            String nameCustomer =keys.nextElement();
            int count =0;
            int total= 0;
            //nameCustomer là keys
            System.out.println("Customer:" + nameCustomer);
              System.out.println("Product | Quantity | Price | Amount");
              
                for (Fruit bought : orderList.get(nameCustomer)) {
                    int q = bought.getQuantity();
                    double price = bought.getPrice();
                    
                    System.out.printf("%-13s%-10s%-7s%-5s", (count + 1) + "." + "coconut", q, price, q * price + "$");
                    System.out.println("");
                    total += (q * price);
                }
                System.out.println("\n\n");
                System.out.println("Total:"+total+"$");

            }
        }

   

    }

