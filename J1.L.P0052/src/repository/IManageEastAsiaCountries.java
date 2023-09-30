
package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import model.Country;


public interface IManageEastAsiaCountries {
    
    void addCountry(ArrayList<Country> country);
    
    List<Country> showCountries();

    void searchCountry(ArrayList<Country> countries);

    void sortCountry(ArrayList<Country> countries);
}