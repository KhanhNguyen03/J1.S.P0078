/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;
import controller.HouseHoldManagement;
import model.Truck;


public class HouseHoldRepository implements IHouseHoldRepository {
    @Override
    public void calculateCost(Truck truck) {
        HouseHoldManagement.Instance().calculateCost(truck);
    }

    @Override
    public void calculateTime(Truck truck) {
        HouseHoldManagement.Instance().calculateTime(truck);
    }
}

