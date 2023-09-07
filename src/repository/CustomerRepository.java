package repository;

import org.hibernate.Session;

import entity.CustomerEntity;
import util.SessionFactoryConfiguration;

public class CustomerRepository {
    Session session=SessionFactoryConfiguration.getInstance().getSession();

    public CustomerEntity getCustomer(String id){
        CustomerEntity customerEntity=session.get(CustomerEntity.class,id);
        return customerEntity;
    }
}
