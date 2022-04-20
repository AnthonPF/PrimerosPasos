package BankProject2;

public class Account {
    private double number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //CONSTRUCTOR
    public Account(double number, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    //CONSTRUCTOR CON PARAMETROS POR DEFECTO
    public Account(){
        this(45667, 2.5, "pepe", "mail@mail", "2222");
        System.out.println("Empty constructor called");
    }

    public void deposit(double depositAmount){
        this.balance=this.balance+depositAmount;
        System.out.println("Deposit of " + depositAmount + " credited, current balance = " + this.balance);

    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance>= withdrawalAmount) {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " made, current balance = " + this.balance);
        }else{
            System.out.println("Unsufficient funds, withdrawal not processed");
        }
    }


    public void setNumber(double number){
        this.number=number;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public double getNumber(){
        return number;
    }

    public double getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
