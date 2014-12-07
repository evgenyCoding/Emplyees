import com.luxoft.training.lab2.employees.*;
import com.luxoft.training.utils.Date;


public class EmployeesDemo {

    public static void main(String[] args) {

        Worker[] workers = new Worker[4];

        BaseSalaryCommWorker w1 = new BaseSalaryCommWorker();
        w1.setFirstName("Edward");
        w1.setLastName("Norton");
        w1.setBirthday(new Date(12, 11, 1970));
        w1.setPosition("Developer");
        w1.setCommission(30);
        w1.setSalary(300);
        w1.setSales(32);
        workers[0] = w1;


        MonthlySalaryWorker w2 = new MonthlySalaryWorker();
        w2.setFirstName("John");
        w2.setLastName("Doe");
        w2.setBirthday(new Date(01, 04, 1984));
        w2.setPosition("CEO");
        w2.setSalary(100000);
        workers[1] = w2;

        HourlyRateWorker w3 = new HourlyRateWorker();
        w3.setFirstName("Adam");
        w3.setLastName("Smith");
        w3.setBirthday(new Date(04, 01, 1990));
        w3.setPosition("Manager");
        w3.setHours(120);
        w3.setRate(12);
        workers[2] = w3;

        CommissionWorker w4 = new CommissionWorker();
        w4.setFirstName("Antony");
        w4.setLastName("White");
        w4.setBirthday(new Date(03, 11, 1995));
        w4.setPosition("Designer");
        w4.setSales(4);
        w4.setCommission(32);
        workers[3] = w4;

        for (Worker worker : workers) { worker.printInfo(); }



    }

}
