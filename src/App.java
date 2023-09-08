
import java.util.Arrays;
import java.util.List;

import org.hibernate.query.Query;

import entity.CustomerEntity;
import repository.CustomerRepository;

public class App {
    public static void main(String[] args) throws Exception {

        CustomerRepository customerRepository = new CustomerRepository();
        ///////////////////////////////////////////////////////////////////////////
        /*
         * List<CustomerEntity> custEntities=customerRepository.getAllCustomers();
         * custEntities.forEach(e->{
         * System.out.println(e.toString());
         * });
         */
        ///////////////////////////////////////////////////////////////////////////
        /*
         * List<Object[]> data = customerRepository.getAllCustomerNativeQuery();
         * for (Object[] row : data) {
         * System.out.println(Arrays.toString(row));
         * }
         */
        ///////////////////////////////////////////////////////////////////////////
        /*
         * List<Object[]> data = customerRepository.getAllCustomerNameAndDob();
         * for (Object[] row : data) {
         * System.out.println(Arrays.toString(row));
         * }
         */
        ///////////////////////////////////////////////////////////////////////////
        /*
         * CustomerEntity customerEntity=customerRepository.findCustomerById("C005");
         * System.out.println(customerEntity.toString());
         */

        ///////////////////////////////////////////////////////////////////////////
        /*
         * CustomerEntity customerEntity =
         * customerRepository.findCustomerByIdUsingNameParameters("C005");
         * System.out.println(customerEntity.toString());
         */
        ///////////////////////////////////////////////////////////////////////////
        /*
         * List<CustomerEntity> custEntities =
         * customerRepository.getAllOrderByCustomersNameDesc();
         * custEntities.forEach(System.out ::println);
         */
        ///////////////////////////////////////////////////////////////////////////
        /*
         * Object[] data = customerRepository.getCustomerSummery();
         * System.out.println(Arrays.toString(data));
         */
        ///////////////////////////////////////////////////////////////////////////
        List<Object[]> data = customerRepository.getCustomerSummeryByProvince();
        for (Object[] row : data) {
            System.out.println(Arrays.toString(row));
        }
        ///////////////////////////////////////////////////////////////////////////

    }

}
