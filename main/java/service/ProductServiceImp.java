package service;


import com.parquesoftti.c26a.model.Customer;
import com.parquesoftti.c26a.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServicesImp implements ProductService{

    final ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return ProductRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return ProductRepository.findById(id).orElse(null);
    }

    @Override
    public Product save(Product product) {
        return ProductRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return ProductRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        ProductRepository.deleteById(id);
    }

