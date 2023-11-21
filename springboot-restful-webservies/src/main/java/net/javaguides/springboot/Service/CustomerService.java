package net.javaguides.springboot.Service;

import net.javaguides.springboot.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    public CustomerDto addCustomer(CustomerDto customerDto);
    public List<CustomerDto> getAllCustomer();
    public CustomerDto getCustomer(int customer_id);
    public CustomerDto updateCustomer(CustomerDto customer);
    public void deleteCustomer(int customer_id);
}
