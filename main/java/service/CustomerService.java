package service;

import com.parquesoftti.c26a.model.Customer;
import java.util.List;

public interface CustomerService {

    public List<Customer> findAll();
    public Customer findById(Long id);
    public Customer save(Customer customer);
    public Customer update(Customer customer);
    public void delete(Long id);

}