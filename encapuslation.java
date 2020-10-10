public class encapuslation {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.baseSalary =50_000;
        employee.hourlyRate = 20;

        //the idea behind encapuslation is that we should bundle together the data and methods that operate on the data in a single unit
        int wage = employee.calculateWage(10); //passing in ten to signify the extra hours worked
        System.out.println(wage);

    }
}