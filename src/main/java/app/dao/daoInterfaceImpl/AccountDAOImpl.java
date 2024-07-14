package app.dao.daoInterfaceImpl;

import app.dao.daoInterface.AccountDAO;
import app.entities.Account;
import app.entities.Customer;
import app.entities.enums.Currency;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Component
public class AccountDAOImpl implements AccountDAO {
    @Override
    public Optional<List<Account>> getAccountByEmail(String email) {
        return null;
    }

    @Override
    public List<Account> getAccountByCustomer(Customer customer) {
        List<Account> accounts = customer.getAccounts();
        return accounts;
    }

    @Override
    public Optional<Account> findByNumber(String number) {
        return null;
    }

    @Override
    public Optional<Account> save(Account obj) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Account obj) {
        return false;
    }

    @Override
    public void deleteAll(List<Account> entities) {

    }

    @Override
    public Optional<List<Account>> saveAll(List<Account> entities) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Account>> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<Boolean> deleteById(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Account> getOne(long id) {
        return Optional.empty();
    }

    public Optional<Account> createAccount(Currency currency, Customer customer) {
        if (customer != null) {
            Account newAccount = new Account(currency, customer);
            customer.getAccounts().add(newAccount);
        }
        return Optional.empty();
    }
}