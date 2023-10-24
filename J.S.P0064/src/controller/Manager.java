/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Data;
import common.Input;
import common.Validator;
import java.util.ArrayList;
/**
 *
 * @author OS
 */
public class Manager {
   

    public Manager() {
    }

    ;
    Input input = new Input();
    Validator validator = new Validator();

    public void addData(ArrayList<Data> datas) {
        String phoneNumber = input.enterString("Phone Number", validator.REGEX_PHONE_NUMBER);
        String email = input.enterString("Email", validator.REGEX_EMAIL);
        String date = input.enterDate("Date");
    }

  

}

