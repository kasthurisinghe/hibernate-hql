package repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.CustomerEntity;
import util.SessionFactoryConfiguration;

public class CustomerRepository {
    Session session = SessionFactoryConfiguration.getInstance().getSession();

    public CustomerEntity getCustomer(String id) {
        CustomerEntity customerEntity = session.get(CustomerEntity.class, id);
        return customerEntity;
    }

    // hibernate queries;
    public List<CustomerEntity> getAllCustomers() {
        String hql = "FROM CustomerEntity";
        Query query = session.createQuery(hql);
        List<CustomerEntity> customerEntities = query.list();
        return customerEntities;
    }

    // as the follows we can use native mysql queries in hibernate;
    public List<Object[]> getAllCustomerNativeQuery() {
        String sql = "select* from Customer";
        Query query = session.createSQLQuery(sql);
        List<Object[]> data = query.list();
        return data;
    }

    public List<Object[]> getAllCustomerNameAndDob() {
        String hql = "select c.id,c.name,c.dob from CustomerEntity as c";
        // the above c.id,c.name,c.dob ar according to the column names in the customerEntity class
        // the reason for the table name "CustomerEntity" is here we named the class name as customerEntity
        Query query = session.createQuery(hql);
        List<Object[]> data = query.list();
        return data;
    }
    // to get a customer details after passing the id of a customer;
    public CustomerEntity findCustomerById(String id){
        String hql = "FROM CustomerEntity WHERE id ='"+id+"'";
        Query query=session.createQuery(hql);
        CustomerEntity customerEntity = (CustomerEntity) query.uniqueResult();
        return customerEntity;
    }

    public CustomerEntity findCustomerByIdUsingNameParameters(String id){
        String hql="From CustomerEntity Where id=:id";
        Query query=session.createQuery(hql);
        query.setParameter("id",id);

        CustomerEntity customerEntity = (CustomerEntity) query.uniqueResult();
        return customerEntity;
    }
}
