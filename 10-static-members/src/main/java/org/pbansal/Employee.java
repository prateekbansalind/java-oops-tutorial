package org.pbansal;

public class Employee {

    private int baseSalary;
    private int hourlyPay;

    public static int noOfEmployees;

    public Employee(int baseSalary, int hourlyPay){
        setBaseSalary(baseSalary);
        setHourlyPay(hourlyPay);
        noOfEmployees++;
    }
    public Employee(int baseSalary){
        this(baseSalary, 0);
    }

    public static void getNoOfEmployees(){
        System.out.println(noOfEmployees);
        // calculateWage(); // this won't work we cannot call instantiated members directly into static methods even though you are calling in the same class.
        // new Employee(50_000).calculateWage(); // we need to first create the object and then call the instantiated methods or fields.
    }

    public int calculateWage(int extraHours)
    {
        return getBaseSalary() + (extraHours * getHourlyPay());

    }
    public int calculateWage()
    {
        // return getBaseSalary();
        return calculateWage(0);
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("base salary cannot be 0 or either -ve.");
        this.baseSalary = baseSalary;
    }

    private int getHourlyPay() {
        return hourlyPay;
    }

    private void setHourlyPay(int hourlyPay) {
        if (hourlyPay < 0)
            throw new IllegalArgumentException("hourly pay cannot be 0 or either -ve.");
        this.hourlyPay = hourlyPay;
    }
}

// Static members
// 1. Static members are not a part of instantiated object whereas they are directly a part and can be called from the class.
// 2. They are help to count the instances of a particular object.
// 3. We cannot directly call the instantiated methods in static method instead first we need to create an object then call the instantiated method in it.
// 4. The reason in Main class we have static main method is because we want java runtime to directly call the method without creating an object.

