package net.javaguides.springboot.Entity;

public class Employee {
    private String empName;
    private int empID;
    private String role;
    private String MGR;
    public Employee(String empName, int empID, String role, String MGR) {
        this.empName = empName;
        this.empID = empID;
        this.role = role;
        this.MGR = MGR;
    }
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }



    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMGR() {
        return MGR;
    }

    public void setMGR(String MGR) {
        this.MGR = MGR;
    }
}
