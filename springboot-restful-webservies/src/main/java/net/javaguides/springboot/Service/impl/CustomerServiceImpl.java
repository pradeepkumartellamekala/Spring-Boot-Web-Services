package net.javaguides.springboot.Service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.Entity.Customer;
import net.javaguides.springboot.Repository.CustomerRepository;
import net.javaguides.springboot.Service.CustomerService;
import net.javaguides.springboot.dto.CustomerDto;
import net.javaguides.springboot.exception.ResponseNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service // --represents the service class that implements Service interface
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository custRepo;
    private ModelMapper modelMapper;
    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        //Customer addCustomer = new Customer(customerDto.getCustomer_id(),customerDto.getCustomer_name(),customerDto.getPhone(),customerDto.getEmail(),customerDto.getCity());
        Customer addCustomer = modelMapper.map(customerDto, Customer.class);

        Customer addedCustomer = custRepo.save(addCustomer);

        return modelMapper.map(addedCustomer, CustomerDto.class);
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
        List<Customer> allCustomers = custRepo.findAll();
        List<CustomerDto> allCustomerDto = allCustomers.stream().map((customer) -> modelMapper.map(customer, CustomerDto.class)).collect(Collectors.toList());
        return allCustomerDto;
    }

    @Override
    public CustomerDto getCustomer(int customer_id) {
        Customer getCustomer = custRepo.findById(customer_id).orElseThrow(() -> new ResponseNotFoundException("Customer", "ID", customer_id));
        CustomerDto getCustomerDto = modelMapper.map(getCustomer, CustomerDto.class);
        return getCustomerDto;
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        Customer getCustomer = custRepo.findById(customerDto.getCustomer_id()).orElseThrow(() -> new ResponseNotFoundException("Customer", "ID", customerDto.getCustomer_id()));
        Customer updateCustomer = modelMapper.map(customerDto, Customer.class);
        Customer updatedCustomer = custRepo.save(updateCustomer);
        CustomerDto updatedCustomerDto = modelMapper.map(updatedCustomer, CustomerDto.class);
        return updatedCustomerDto;
    }

    @Override
    public void deleteCustomer(int customer_id) {
        Customer getCustomer = custRepo.findById(customer_id).orElseThrow(() -> new ResponseNotFoundException("Customer", "ID", customer_id));
        custRepo.deleteById((customer_id));
    }
}
