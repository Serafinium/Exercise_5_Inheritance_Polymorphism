/**
 * Created by SERAFIM on 07.11.2017.
 */
public class ContractEmployee extends Employee implements IAudit {

    public ContractEmployee(String federalTaxIdmember, String employeeld, int timeWork) {
        super(employeeld);
        this.federalTaxIdmember = federalTaxIdmember;
        this.timeWork = timeWork;
        this.salary = calculatepay(timeWork);
    }

    private int salary;
    private int timeWork;
    private String federalTaxIdmember;

    public int getSalary() {
        return salary;
    }

    public int getTimeWork() {
        return timeWork;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    @Override
    public int calculatepay(int time) {
        int salary;
        salary = 15;
        return salary * time;
    }

    @Override
    public String toString() {
        return "ContractEmployee";
    }
}
