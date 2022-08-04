package menu;

import controller.ManagerUser;
import manager.ManagerBill;
import manager.ManagerComputer;
import model.Computer;

import java.util.Scanner;

public class MenuInterface  extends ManagerComputer {
   private static ManagerComputer managerComputer = new ManagerComputer();
    public static void menuMain() {
        System.out.println("1. Hiển thị máy");
        System.out.println("2. Thêm máy tính");
        System.out.println("3. Xoá máy tính");
        System.out.println("4. Sửa máy tính");
        System.out.println("5. Hiển thị đồ ăn uống");
        System.out.println("6. Tính tiền");
        System.out.println("7. Doanh thu");
        System.out.println("0. Thoát");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        doAction(choice);
    }

    public static void doAction(int choice) {
        switch (choice) {
            case 1:
            managerComputer.display();
                break;
            case 2:
                create();
                break;
            case 3:
                delete();
                break;
            case 4:
                edit();
                break;
            case 5:
                displayFoodDrink();
                break;
            case 6:
                break;
             case 7:
                break;

            case 0:
                break;
        }
    }
}
