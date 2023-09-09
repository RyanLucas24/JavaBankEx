public class Main {
    public static void main(String[] args) {
        Client Joao = new Client("Joao", "12345678901");
        Client Pedro = new Client("Pedro", "01234567890");

        Bank Santander = new Bank(1);
        Bank Bradesco = new Bank(2);

        Account FirstAccount = new Account(Joao, 2040, Santander, 1, 123456);
        Account SecondAccount = new Account(Pedro, 2050, Santander, 1, 123457);
        Account ThirdAccount = new Account(Joao, 3040, Bradesco, 2, 1234);

        FirstAccount.balance(123456);
        FirstAccount.deposit(200, 123456);
        FirstAccount.balance(123456);
        FirstAccount.withdraw(100, 123456);
        FirstAccount.balance(123456);

        Santander.listAccounts(1);
        Bradesco.listAccounts(2);

        ThirdAccount.increaseLimit(200, 1234);
        ThirdAccount.withdraw(100, 1234);
        ThirdAccount.balance(1234);

        SecondAccount.excludeAccount();

        Santander.listAccounts();

        Joao.listAccounts();
    }
}
