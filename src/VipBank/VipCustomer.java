package VipBank;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    //1st Constructor
    public VipCustomer(){
        this("Pepe", 10000, "pepe@mail.com");
        System.out.println("First constructor called");
    }

    //2nd Constructor
    public VipCustomer(String name, double creditLimit){
        this(name,creditLimit,"unknown@email.com");
        System.out.println("Second constructor called");
    }


    //3rd Constructor
    public VipCustomer(String name, double creditLimit, String emailAddress){
        System.out.println("Third constructor called");
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }



    public String getName(){
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress(){
        return emailAddress;
    }
}
