public class Bank {
    private static final int MAX = 100;
    private final int number;
    private final Account[] accountsOfBank = new Account[MAX];
    private int numberOfAccountsOfBank;

    public void addToAccountsOfBank(Account account){
        accountsOfBank[numberOfAccountsOfBank] = account;
        numberOfAccountsOfBank++;
    }

    public void listAccounts(){
        for(int i = 0; i < numberOfAccountsOfBank; i++) {
            System.out.println(accountsOfBank[i].showAccount());;
        }
    }

    public void listAccounts(long agency){
        if(agency == number){
            for (int i = 0; i < numberOfAccountsOfBank; i++) {
                System.out.println(accountsOfBank[i].showAccount());
            }
        }
    }

    public double approveLimit(double amount, int accountTime){
        double limitBase = 200 + 300*accountTime;
        if(amount < limitBase){
            return amount;
        }
        return limitBase;
    }

    public Bank(int number) {
        this.number = number;
    }
}
