import java.util.*;

class ManishBank{
    HashMap<String, Person> customers;
    HashMap<Long, Account> accounts;
    ManishBank(){
        customers = new HashMap();
        accounts = new HashMap();
    }

    Person addCustomers(String name, String PAN, double balance, String pin){
        Account account = new Account(pin, PAN, balance, "XXXX");
        Person person = new Person(name, PAN, account.getAccountNumber());
        accounts.put(account.getAccountNumber(), account);
        customers.put(PAN, person);
        return person;
    }

    long getAccountNumber(String PAN) throws Exception{
        if(!customers.containsKey(PAN)){
            throw new Exception("Account with this PAN does not exist");
        }
        Person person = customers.get(PAN);
        return person.getAccountNumber();
    }

    double getBalance(long accountNumber) throws Exception{
        if(!accounts.containsKey(accountNumber)){
            throw new Exception("Acoount Number does not exist");
        }
        Account account = accounts.get(accountNumber);
        return account.getBalance();
    }

    double transferBalance(long accountNumber_sender, long accountNumber_receiver, double balance, String pin) throws Exception{
        if(!accounts.containsKey(accountNumber_sender)){
            throw new Exception("Sender Account Number does not exist");
        }
        if(!accounts.containsKey(accountNumber_receiver)){
            throw new Exception("Receiver Account Number does not exist");
        }
        Account sender = accounts.get(accountNumber_sender);
        Account receiver = accounts.get(accountNumber_receiver);
        try{
            sender.debit(balance, pin);
            receiver.credit(balance);
        }catch(Exception e){
            throw e;
        }
        System.out.println(sender.getBalance()+" "+receiver.getBalance());
        return sender.getBalance();
    }
}