class Employee {
    String name,designation,companyName;
    int empId;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        
        employee.setName("Sohana");
        employee.setEmpId(1);
        employee.setDesignation("Software Engineer");
        employee.setCompanyName("Microsoft");

        System.out.println("Name: " + employee.getName());
        System.out.println("Emp ID: " + employee.getEmpId());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Company Name: " + employee.getCompanyName());
    }
}
