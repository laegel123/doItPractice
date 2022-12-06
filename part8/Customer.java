import java.util.ArrayList;

public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer() {
        initCustomer();
    }

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        initCustomer();
    }

    private void initCustomer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
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

    public VIPCustomer(int customerId, String customerName, int agentId) {
        super(customerId, customerName);
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentId = agentId;
    }

    public int calcPrice(int price) {
        bonusPoint += price + bonusRatio;
        return price - (int) (price * saleRatio);
    }

    public String getCustomerInfo() {
        return super.getCustomerInfo() + "담당 상담원 번호는 " + agentId + "입니다";
    }

    public int getAgentId() {
        return agentId;
    }
}

class GoldCustomer extends Customer {
    double saleRatio;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    public int calcPrice(int price) {
        bonusPoint += price + bonusRatio;
        return price - (int) (price * saleRatio);
    }
}

class CustomerMain {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer lee = new Customer(10010, "이가을");
        Customer na = new GoldCustomer(10011, "나유리");
        Customer kim = new VIPCustomer(10012, "김예슬", 123);

        customerList.add(lee);
        customerList.add(na);
        customerList.add(kim);

        System.out.println("=== 고객 정보 출력 === ");
        for (Customer customer : customerList) {
            System.out.println(customer.getCustomerInfo());
        }

        System.out.println("=== 할인율과 보너스 포인트 계산 ===");
        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
        }
    }
}
