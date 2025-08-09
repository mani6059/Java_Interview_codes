package Interview_Programs.Employee;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Mani", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Keyush", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
/*
        // How many male and female employees are there in the organization?
        Map<String, Long> noOfMaleAndFemaleEmployees= employeeList.stream()
        .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);*/

       /* //Print the name of all departments in the organization?
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
*/
        /*//What is the average age of male and female employees?
        Map<String, Double>  avg = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avg);*/

       /* // Get the details of highest paid employee in the organization?
        Employee highestPaidEmployee = employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);
        if (highestPaidEmployee != null) {
            System.out.println("Highest paid employee: " + highestPaidEmployee.getName());
            System.out.println("Salary: $" + highestPaidEmployee.getSalary());
        } else {
            System.out.println("No employees found.");
        }*/

  /*  //Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(emp->emp.getYearOfJoining()>2015)
                                .map(Employee::getName)
                                .forEach(System.out::println);*/

       /* //Count the number of employees in each department?
        Map<String, Long> count = employeeList.stream()
                                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        Set<Map.Entry<String, Long>> entrySet = count.entrySet();

        for (Map.Entry<String, Long> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }*/

        /*//What is the average salary of each department?
        Map<String,Double> avg = employeeList.stream()
                                 .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String,Double>> set = avg.entrySet();
        for(Map.Entry<String,Double> entry:set){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }*/

      /*  // Get the details of the youngest male employee in the product development department?
        Optional<Employee> young = employeeList.stream()
                            .filter(emp->emp.getGender()=="Male" && emp.getDepartment()== "Product Development")
                            .min(Comparator.comparingInt(Employee::getAge));
        young.ifPresent(employee -> {System.out.println("Age"+employee.getAge());
                                    System.out.println("Gender"+employee.getGender());
                                    System.out.println("Department"+employee.getDepartment());
                                });*/
    /*    //Who has the most working experience in the organization?
        Optional<Employee> most = employeeList.stream()
                                .sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        Employee exp = most.get();
        System.out.println(exp.getName());
        System.out.println(exp.getYearOfJoining());*/

/*        // How many male and female employees are there in the sales and marketing team?
Map<String, Long> hp = employeeList.stream()
                        .filter(e->e.getDepartment()=="Sales And Marketing")
                        .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(hp);*/

        /*//What is the average salary of male and female employees?
        Map<String, Double> avgSal = employeeList.stream()
                                     .collect(Collectors.groupingBy(Employee::getGender,
                                     Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSal);*/

       /*// List down the names of all employees in each department?
        Map<String, List<Employee>> employeeListByDepartment=
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();

        for (Map.Entry<String, List<Employee>> entry : entrySet)
        {
            System.out.println("--------------------------------------");

            System.out.println("Sample In "+entry.getKey() + " : ");

            System.out.println("--------------------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list)
            {
                System.out.println(e.getName());
            }}*/

        // What is the average salary and total salary of the whole organization?
        // use the DoubleSummaryStatistics class
       /* DoubleSummaryStatistics sal = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average salary: "+sal.getAverage());
        System.out.println("Total salary: "+sal.getSum());*/

/*
// Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
Map<Boolean,List<Employee>> partitionEmployeesByAge = employeeList.stream()
                                       .collect(Collectors.partitioningBy(e->e.getAge()>25));
        Set<Map.Entry<Boolean,List<Employee>>> entrySet = partitionEmployeesByAge.entrySet();
            for(Map.Entry<Boolean, List<Employee>> entry:entrySet){
                if(entry.getKey()){
                    System.out.println("----------------------");
                    System.out.println("employees who are older than 25 years");
                }
                else {
                    System.out.println("-------------------------");
                    System.out.println("employees who are younger or equal to 25 years");
                }
                List<Employee> list = entry.getValue();
                for(Employee e:list){
                    System.out.println(e.getName());
                }
            }*/

/*// Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> oldestEmployeeWrapper= employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee = oldestEmployeeWrapper.get();

        System.out.println("Name : "+oldestEmployee.getName());

        System.out.println("Age : "+oldestEmployee.getAge());

        System.out.println("Department : "+oldestEmployee.getDepartment());*/

        //Find second-largest salary
        /*Optional<Double> secondLargestSalary = employeeList.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        secondLargestSalary.ifPresent(salary-> System.out.println("Second largest salary: " +salary));
*/
        //find 1st three employee details based on highest salary
       /* List<Employee> threeEmployeesSalary = employeeList.stream()
                                               .sorted(Comparator.comparingDouble(Employee::getSalary)
                                                       .reversed())
                                                .limit(3)
                                                .collect(Collectors.toList());
        threeEmployeesSalary.forEach(emp-> System.out.println("Name: "+emp.getName()+"Salary: "+emp.getSalary()));*/

       /* //How to find the highest salary in each department
    Map<String, Optional<Employee>> highestSalByDepartment =
            employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                                               Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
            ));

    System.out.println("Highest salary in each department:");

    highestSalByDepartment.forEach((department,maxSalary)->{
    System.out.println("Department: "+department+"Highest salary: "+maxSalary);
});*/

}}


