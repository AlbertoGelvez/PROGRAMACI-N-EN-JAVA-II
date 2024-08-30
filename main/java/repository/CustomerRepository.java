package repository;

import com.parquesoftti.c26a.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository<Customer> extends JpaRepository<Customer,Long> {
}