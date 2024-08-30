package controller;

import com.parquesoftti.c26a.model.Customer;
import com.parquesoftti.c26a.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<Customer> findAll(){
        return  customerService.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable Long id){
        return  customerService.findById(id);
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return  customerService.save(customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        customerService.delete(id);
    }

    @PutMapping("/{id}")
    public Customer update(@PathVariable Long id, @RequestBody Customer customer){
        return   customerService.update(id,customer);
    }

    @GetMapping("/search")
    public Customer findByName(@RequestParam String name){
        return  customerService.findByName(name);
    }


}