package main;

import account.Login;
import manager.ManagerComputer;
import manager.ManagerFoodDrink;
import menu.MenuInterface;
import model.FoodDrink;

import java.util.Scanner;

public class Main extends MenuInterface {
    public static void main(String[] args) {

        Login LG = new Login();
        LG.run();

        int choice;
        do {
            menuMain();
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            if (choice == 0)
                return;

            doAction(choice);
            System.out.println("Mời bạn chọn dịch vụ");
        } while (choice != 0);
    }



    }

