import java.util.Random;

/**
 * Created by SERAFIM on 07.11.2017.
 */
public class SalariedEmployee extends Employee implements IAudit {



    public SalariedEmployee(String socialSecurityNumber, String employeeld, int timeWork){
        super(employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.timeWork = timeWork;
        this.salary = calculatepay(timeWork);
    }
    private int timeWork;
    private int salary;
    private String socialSecurityNumber;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getTimeWork() {
        return timeWork;
    }

    public int getSalary() {
        return salary;
    }


    Random r = new Random();
    @Override
    public int calculatepay(int time) {
        int salary = r.nextInt(10);
        return salary * time;
    }

    @Override
    public String toString() {
        return "SalariedEmployee";
    }
}
