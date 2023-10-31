/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;
import model.Truck;

/**
 *
 * @author OS
 */
public interface IHouseHoldRepository {
    void calculateCost(Truck truck);

    void calculateTime(Truck truck);
}
