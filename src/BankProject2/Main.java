package BankProject2;

public class Main {
    public static void main(String[] args) {
        Account pepeAccount=new Account();
        Account tonyAccount=new Account(12345, 0.00,"tony","pepe@pepe.com", "66666" );
        Account timsAccount=new Account("Tim", "tim@email.com", "123445");
        tonyAccount.deposit(3000);
        tonyAccount.withdrawal(3000);
        System.out.println(tonyAccount.getNumber());
        System.out.println(tonyAccount.getPhoneNumber());
        System.out.println(timsAccount.getBalance());

    }
}
