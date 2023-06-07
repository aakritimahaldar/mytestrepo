class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Employee {
    String department;


    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Aakriti Mahaldar";
        employee.age = 20;
        employee.phoneNumber = "9492973645";
        employee.address = "123 Jammu";
        employee.salary = 500000.0;
        employee.specialization = "Web Development";

        //For Manager------------------------
        Manager manager = new Manager();
        manager.name = "Riya Gupta";
        manager.age = 20;
        manager.phoneNumber = "9546745783";
        manager.address = "35 Ahmedabad";
        manager.salary = 600000.0;
        manager.specialization = "Designing";
        manager.department = "IT";

        //Print all Employee Data--------------------------------
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary();
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("------------------------------------");

        //Print all Manager Data--------------------------------
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Specialization: " + manager.specialization);
        System.out.println("Department: " + manager.department);

        
    }
}