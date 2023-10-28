
package repository;

import dataAccess.DaoEBank;
import java.util.Locale;


public class BankRespository implements IBankRespository{

    @Override
    public void setLocate(Locale locale) {
        DaoEBank.Instance().setLanguage(locale);
    }

    @Override
    public void checkAccountNumber() {
        DaoEBank.Instance().getAccount();
    }

    @Override
    public void checkPassword() {
        DaoEBank.Instance().getPassword();
        DaoEBank.Instance().getCaptcha();
    }  
}
