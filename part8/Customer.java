public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer() 생성자 호출");
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;

        return price;
    }

    public String getCustomerInfo() {
        StringBuilder sb = new StringBuilder();

        sb.append(customerName + "님의 정보입니다. \n");
        sb.append("등급 : " + customerGrade + "\n");
        sb.append("보너스 포인트 : " + bonusPoint + "\n");

        return sb.toString();
    }
}

class VIPCustomer extends Customer {
    private int agentId;
    double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출");
    }

    public int getAgentId() {
        return agentId;
    }
}

class CustomerMain {
    public static void main(String[] args) {
        Customer lee = new Customer();
        lee.setCustomerId(1000);
        lee.setCustomerName("이가을");
        lee.bonusPoint = 1000;
        System.out.println(lee.getCustomerInfo());

        VIPCustomer na = new VIPCustomer();
        na.setCustomerId(1010);
        na.setCustomerName("나유리");
        na.bonusPoint = 100000;
        System.out.println(na.getCustomerInfo());
    }
}
