package payroll;

public class Boss {
    public void PayEmployee(Employee e) {
        e.mailCheck();
    }

    public static void main(String args[]) {
        Boss pay = new Boss();
        pay.PayEmployee(0);
    }
}
