import java.util.Random;

/**
 * Created by SERAFIM on 07.11.2017.
 */
public class App {

    public static void main(String[] args){

        Random random = new Random();

        SalariedEmployee salariedEmployee = new SalariedEmployee("someSocialNomber","someIDqwerty", random.nextInt(12));
        ContractEmployee contractEmployee = new ContractEmployee("someFeDeralTaxIdmember", "someIDasdfg", 8);

        System.out.println(salariedEmployee + " salary: " + salariedEmployee.getSalary() + "  SocialSecurity: " + salariedEmployee.getSocialSecurityNumber() + "  Average:  " + Controller.averageMonthlySalary(salariedEmployee));
        System.out.println(contractEmployee + " salary: " + contractEmployee.getSalary() + "  FederalID: " + contractEmployee.getFederalTaxIdmember() + "  Average:  " + Controller.averageMonthlySalary(contractEmployee));


    }
}
