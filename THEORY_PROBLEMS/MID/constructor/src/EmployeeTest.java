public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Minions", "Male", 23);
        Employee e3 = new Employee("Tom", "Male", 72, 12000);

        // print the values
        System.out.println("Name: " + e2.name +" Gender: "+e2.gender+ " Age: " + e2.age );
        System.out.println("Name: " + e3.name +" Gender: "+e3.gender+ " Age: " + e3.age + " Salary: " + e3.salary);

    }
}
