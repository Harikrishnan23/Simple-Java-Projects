public class Main {
    public static void main(String[] args) {
        VipCustomer Customer1 = new VipCustomer();
        System.out.println(Customer1.getName());

        VipCustomer Customer2 = new VipCustomer("Test1", 2000);
        System.out.println(Customer2.getName());

        VipCustomer Customer3 = new VipCustomer("HK", 20000,"mydefaultemail@email.com");
        System.out.println(Customer3.getName());
        System.out.println(Customer3.getEmailAddress());

    }
}
