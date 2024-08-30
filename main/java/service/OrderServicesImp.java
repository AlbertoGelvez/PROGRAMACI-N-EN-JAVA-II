package service;


import com.parquesoftti.c26a.model.Customer;
import com.parquesoftti.c26a.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServicesImp implements OrderService{

    final OrderRepository OrderRepository;

    @Override
    public List<Order> findAll() {
        return OrderRepository.findAll();
    }

    @Override
    public Order findById(Long id) {
        return OrderRepository.findById(id).orElse(null);
    }

    @Override
    public Order save(Order customer) {
        return OrderRepository.save(customer);
    }

    @Override
    public Order update(Order customer) {
        return OrderRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        OrderRepository.deleteById(id);
    }

