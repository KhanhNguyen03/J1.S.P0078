package controller;

import model.Truck;
import repository.HouseHoldRepository;

import validate.Validator;

public class Program {
    Validator valid;
    HouseHoldRepository hhr;
    Truck truck;

    public Program(){
        valid = new Validator();
        hhr = new HouseHoldRepository();
        truck = new Truck();
    }

    public void run(){
        System.out.println("===== Collecting Household Waste ====");
        hhr.calculateTime(truck);
        hhr.calculateCost(truck);

    }
}
