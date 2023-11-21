package net.javaguides.springboot.Controller;

import net.javaguides.springboot.Entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("employee")
public class EmployeeController {
    @GetMapping("employee/testAPI")
    public String testAPI(){
        return "this is a test API";
    }
//
    @GetMapping("get")
    public Employee getEmployee(){
        Employee emp = new Employee("pradeep", 123, "dev", "boss");
        return emp;
    }

    @GetMapping("all-employees")
    public List<Employee> getEmployees(){
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("sai", 1, "dev", "boss"));
        emps.add(new Employee("sun",2, "dev", "boss"));

        return emps;
    }

    @PostMapping("/createByPathVariables/myID-{ID}/myName-{Name}/duty-{Role}/Manager-{mgnr}")
    public Employee createEmployeeByParams(@PathVariable("ID") int id, @PathVariable("Name") String name, @PathVariable("Role") String role, @PathVariable("mgnr") String mgr){
        Employee emp;
        emp = new Employee(name,id,role,mgr);
        return emp;
    }

    @PostMapping("createByRequestParams")
    public Employee createEmployee(@RequestParam int empID, @RequestParam("Name") String name, @RequestParam String mgr, @RequestParam String role){
        Employee employee;
        employee = new Employee(name, empID, role,mgr);
        return employee;
    }

    @PostMapping("createByBody")
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Employee> createByBody(@RequestBody Employee emp){
        Employee employee;
        employee = new Employee(emp.getEmpName(),emp.getEmpID(),emp.getRole(),emp.getMGR());
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @PutMapping("update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Employee> updateUsingPathVariable(@RequestBody Employee emp, @PathVariable int id){
        Employee employee;
        employee = new Employee(emp.getEmpName(),id, emp.getRole(),emp.getMGR());
        return ResponseEntity.ok(employee);
    }


}
