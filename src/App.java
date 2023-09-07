

import java.util.List;

import org.hibernate.query.Query;

import entity.CustomerEntity;
import repository.CustomerRepository;

public class App {
    public static void main(String[] args) throws Exception {
        CustomerRepository customerRepository = new CustomerRepository();
        List<CustomerEntity> custEntities=customerRepository.getAllCustomers();
        custEntities.forEach(e->{
            System.out.println(e.toString());
        });
    }
    
}
