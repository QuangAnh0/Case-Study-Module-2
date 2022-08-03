package main;

import manager.ManagerComputer;
import manager.ManagerFoodDrink;
import model.FoodDrink;

public class Main {
    public static void main(String[] args) {
        ManagerComputer managerComputer =new ManagerComputer();
        ManagerFoodDrink managerFoodDrink = new ManagerFoodDrink();

//        managerComputer.create();
//        managerComputer.delete();
//        managerComputer.edit();
//        managerComputer.delete();
            managerComputer.display();
        managerFoodDrink.displayFoodDrink();






    }
}
