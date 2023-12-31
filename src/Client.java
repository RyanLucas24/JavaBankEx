public class Client {

    private static final int MAX = 100;

    private final String name;
    private final String cpf;
    private final Account[] accountsOfClient = new Account[MAX];
    private int numberOfAccountsOfClient;

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public void addToAccountsOfClient(Account account){
        accountsOfClient[numberOfAccountsOfClient] = account;
        numberOfAccountsOfClient++;
    }

    public void excludeAccountsOfClient(Account account){
        for (int i = 0; i <= numberOfAccountsOfClient; i++) {
            if(account == accountsOfClient[i]){
                for (int j = i; j <= numberOfAccountsOfClient; j++)
                    accountsOfClient[j] = accountsOfClient[j + 1];
                accountsOfClient[numberOfAccountsOfClient] = null;
                numberOfAccountsOfClient--;
            }
        }
    }

    public void listAccounts() {
        for (int i = 0; i < numberOfAccountsOfClient; i++) {
            System.out.println(accountsOfClient[i].showAccount());
        }
    }
    public String getName() {
        return name;
    }

}
