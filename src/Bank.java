public class Bank {

    private static final int MAX = 100;

    private final int number;
    private final Account[] accountsOfBank = new Account[MAX];
    private int numberOfAccountsOfBank;

    public Bank(int number) {
        this.number = number;
    }

    public void addToAccountsOfBank(Account account){
        this.accountsOfBank[this.numberOfAccountsOfBank] = account;
        this.numberOfAccountsOfBank++;
    }

    public void excludeAccountsOfBank(Account account){
        for(int i = 0; i < numberOfAccountsOfBank; i++){
            if(account == accountsOfBank[i]){
                for (int j = i; j < numberOfAccountsOfBank; j++)
                    this.accountsOfBank[j] = this.accountsOfBank[j+1];
                this.accountsOfBank[this.numberOfAccountsOfBank] = null;
                this.numberOfAccountsOfBank--;
            }
        }
    }

    public void listAccounts(){
        for(int i = 0; i < this.numberOfAccountsOfBank; i++) {
            System.out.println(this.accountsOfBank[i].showAccount());
        }
    }

    public void listAccounts(long agency){
        if(agency == this.number){
            for (int i = 0; i < this.numberOfAccountsOfBank; i++) {
                System.out.println(this.accountsOfBank[i].showAccount());
            }
        }
    }

    public double approveLimit(double amount, int accountTime){
        final double limitBase = 200 + 300*accountTime;
        if(amount < limitBase){
            return amount;
        }
        return limitBase;
    }
}
