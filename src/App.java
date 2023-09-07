

import entity.CustomerEntity;
import repository.CustomerRepository;

public class App {
    public static void main(String[] args) throws Exception {
        CustomerRepository customerRepository = new CustomerRepository();
        CustomerEntity customerEntity=customerRepository.getCustomer("C005");
        System.out.println(customerEntity.toString());
    }
}
