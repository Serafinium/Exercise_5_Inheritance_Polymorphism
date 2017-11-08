/**
 * Created by SERAFIM on 08.11.2017.
 */
public class Controller {

    public static int averageMonthlySalary(Employee e){
        int time = 0;
        if (e instanceof SalariedEmployee){
            time = ((SalariedEmployee) e).getTimeWork();
            return time * 25;
        } else {
            time = ((ContractEmployee) e).getTimeWork();
            return time * 25;
        }

    }
}
