import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EmployeePojo employeePojo = new EmployeePojo("arkam","ahamed", LocalDate.now());
        System.out.println(employeePojo);

    }
}
