package VipBank;

public class Main {
    public static void main(String[] args) {
        VipCustomer tonyVip=new VipCustomer("Tony", 10000);
        VipCustomer inmaVip=new VipCustomer();
        VipCustomer hugoVip=new VipCustomer("Hugo", 15000, "hugo@email.com");
        System.out.println(inmaVip.getCreditLimit());
        System.out.println(hugoVip.getEmailAddress());
        System.out.println(tonyVip.getEmailAddress());


    }
}
