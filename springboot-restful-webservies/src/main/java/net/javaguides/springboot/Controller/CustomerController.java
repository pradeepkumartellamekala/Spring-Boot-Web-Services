package net.javaguides.springboot.Controller;

import jakarta.validation.Valid;
//import lombok.AllArgsConstructor;
//import lombok.RequiredArgsConstructor;
import net.javaguides.springboot.Service.CustomerService;
//import net.javaguides.springboot.Service.impl.CustomerServiceImpl;
import net.javaguides.springboot.Service.DummyService;
import net.javaguides.springboot.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cust")
public class CustomerController {
    @Autowired
    private CustomerService custService;

//    @Autowired
//    public CustomerController(CustomerService custService){
//        this.custService = custService;
//    }
//
//    @Autowired
//    public void setCustomerService(CustomerService custService){
//        this.custService = custService;
//    }

    @PostMapping("/create")
    public ResponseEntity<CustomerDto> createCustomer(@Valid @RequestBody CustomerDto customerDto){
        CustomerDto createdCustomerDto = custService.addCustomer(customerDto);
        return new ResponseEntity<>(createdCustomerDto, HttpStatus.CREATED);
    }
    @GetMapping("/customer/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("id") int customer_id){
        CustomerDto getCustomeDto = custService.getCustomer(customer_id);
        return ResponseEntity.ok(getCustomeDto);
    }
    @GetMapping("/allcustomers")
    public ResponseEntity<List<CustomerDto>> getAllCustomers(){
        List<CustomerDto> allCustomersDto = custService.getAllCustomer();
        return ResponseEntity.ok(allCustomersDto);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable("id") int customer_id, @RequestBody @Valid CustomerDto updateCustomerDto){
        updateCustomerDto.setCustomer_id(customer_id);
        CustomerDto updatedCustomerDto = custService.updateCustomer(updateCustomerDto);
        return new ResponseEntity<>(updatedCustomerDto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") int customer_id){
        custService.deleteCustomer(customer_id);
        return new ResponseEntity<>("Customer deleted successfully", HttpStatus.OK);
    }


}
