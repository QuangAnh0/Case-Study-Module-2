package manager;

import model.Drink;
import model.Food;
import model.FoodDrink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerFoodDrink {
    private static List<FoodDrink> list;

    public static List<FoodDrink> getList() {
        return list;
    }

    public void setList(List<FoodDrink> list) {
        this.list = list;
    }

    public static ManagerFoodDrink getManager() {
        return manager;
    }

    public static void setManager(ManagerFoodDrink manager) {
        ManagerFoodDrink.manager = manager;
    }

    {list =new ArrayList<>();
      FoodDrink foodDrink1 = new Food("Mỳ xào",25000);
      FoodDrink foodDrink2 = new Food("Cơm rang",30000);
      FoodDrink foodDrink3 = new Food("Bim bim",5000);
       FoodDrink foodDrink4 = new Drink("Sting",10000);
       FoodDrink foodDrink5 = new Drink("Trà sữa",20000);
       FoodDrink foodDrink6 = new Drink("Bò húc",15000);
       list.add(foodDrink1);
       list.add(foodDrink2);
       list.add(foodDrink3);
       list.add(foodDrink4);
       list.add(foodDrink5);
       list.add(foodDrink6);
    }
    private static ManagerFoodDrink manager = new ManagerFoodDrink();
public static int inputKind() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Xin chọn dịch vụ");
    System.out.println("1. Đồ ăn");
    System.out.println("2. Đồ uống");
    return scanner.nextInt();
}
//    @Override
//    public void create() {
//        System.out.println("HIHI");
//    int kind = inputKind();
//    if (kind==1){
//        FoodDrink foodDrink = new Food();
//    }
//else if (kind == 2){
//    FoodDrink foodDrink= new Drink();}
//        Scanner scanner =   new Scanner(System.in);
//        System.out.println("Nhập tên đồ ");
//        String name = scanner.nextLine();
//        System.out.println("Nhập giá");
//        int price = scanner.nextInt();
//
//        }



    public static void displayFoodDrink() {
        System.out.println(getList());
    }
}
