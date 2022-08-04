package manager;

import model.Bill;
import model.Computer;

public class ManagerBill extends Computer {

public static int CashBill(Computer computer){
    int cash = computer.getPrice()*computer.getMinute();
    return cash;
}
    public static void displayBill(ManagerBill cash){
        System.out.println("Số tiền phải thanh toán "+ cash );
    }
}
