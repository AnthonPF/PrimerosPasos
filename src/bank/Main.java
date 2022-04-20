package bank;

public class Main {
    public static void main(String[] args) {
        account bobsAccount = new account();
        bobsAccount.withdrawal(100);
        bobsAccount.deposit(50);
        bobsAccount.withdrawal(100);
        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100);

    }
}
