package part13_3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이가을", 29, 100);
        TravelCustomer customerNa = new TravelCustomer("나유리", 27, 100);
        TravelCustomer customerChoi = new TravelCustomer("최정현", 13, 50);

        List<TravelCustomer> travelCustomerList = new ArrayList<>();
        travelCustomerList.add(customerLee);
        travelCustomerList.add(customerNa);
        travelCustomerList.add(customerChoi);

        // 명단 출력
        travelCustomerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
        System.out.println();

        // 총 여행 비용
        System.out.println(travelCustomerList.stream().mapToInt(c -> c.getPrice()).sum());
        System.out.println();

        // 20세 이상 고객 정렬 명단
        travelCustomerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
    }
}
