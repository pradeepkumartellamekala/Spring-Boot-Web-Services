package net.javaguides.springboot.Repository;

import net.javaguides.springboot.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
