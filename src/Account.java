import java.sql.SQLOutput;

public class Account {
    private final long number;
    private final long agency;
    private double balance;
    private double availableCredit;
    private final int password;
    private int accountTime;
    private final Client client;
    private final Bank bank;

    public String showAccount(){
        return String.format("Account: %d\n Agency: %d\n Client: %s\n",
                number, agency, client.getName());
    }
    public boolean withdraw(double amount, int passwordOfAccount){
        if(passwordOfAccount == password && amount <= balance + availableCredit){
            balance -= amount;
            accountTime++;
            return true;
        }
        return false;
    }

    public boolean deposit(double amount, int passwordOfAccount){
        if(passwordOfAccount == password){
            balance += amount;
            accountTime++;
            return true;
        }
        return false;
    }

    public double increaseLimit(double amount, int passwordOfAccount){
        if(passwordOfAccount == password){
            availableCredit += bank.approveLimit(amount, accountTime);
            accountTime++;
        }
        return 0;
    }

    public double balance(int passwordOfAccount){
        if(passwordOfAccount == password){
            System.out.println("Account Balance = " + balance + "\n");
        }
        return 0;
    }

    public Account(Client client, long number, Bank bank, long agency, int password) {
        this.password = password;
        this.number = number;
        this.agency = agency;
        this.client = client;
        this.bank = bank;
        this.balance = 0;
        this.availableCredit = 0;
        this.accountTime = 0;
        client.addToAccountsOfClient(this);
        bank.addToAccountsOfBank(this);
    }
}
