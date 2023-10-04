
package repository;

import dataAccess.CalculatorDao;


public class CalculateManager implements ICalculateManager {

    @Override
    public void calculate() {
        CalculatorDao.Instance().normalCalculator();
    }

    @Override
    public void calculateBMI() {
        CalculatorDao.Instance().BMICalculator();
    }

}
