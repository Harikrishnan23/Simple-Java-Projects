public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("abc",2000.0,"myemail@email.com");
        System.out.println("Constructor with no parameter called");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
