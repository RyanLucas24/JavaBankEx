public class Client {
    private static final int MAX = 100;
    private final String name;
    private final String cpf;
    private Account[] accountsOfClient = new Account[MAX];
    private int numberOfAccountsOfClient;

    public void addToAccountsOfClient(Account account){
        accountsOfClient[numberOfAccountsOfClient] = account;
        numberOfAccountsOfClient++;
    }

    public void listAccounts() {
        for(int i = 0; i < numberOfAccountsOfClient; i++) {
            System.out.println(accountsOfClient[i].showAccount());
        }
    }

    public String getName() {
        return name;
    }

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }
}
