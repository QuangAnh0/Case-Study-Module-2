package manager;

import model.Computer;

import java.util.*;

public class ManagerComputer extends ManagerFoodDrink {
    private static List<Computer> computerList = new ArrayList<>();
    private static Set<Integer> numberList = new HashSet<>();
    {
    Computer computer1 =new Computer("Nomal",1,5000);
    Computer computer2 =new Computer("Nomal",2,5000);
    Computer computer3 =new Computer("Nomal",3,5000);
    Computer computer4 =new Computer("Vip",4,8000);
    Computer computer5 =new Computer("Vip",5,8000);
    Computer computer6 =new Computer("Vip",6,8000);
    computerList.add(computer1);
    computerList.add(computer2);
    computerList.add(computer3);
    computerList.add(computer4);
    computerList.add(computer5);
    computerList.add(computer6);
    }
    public static List<Computer> getComputerList() {
        return computerList;
    }


    public static void create() {
        System.out.println("Bạn đang tạo thêm máy tính");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập loại máy tính");
        String type = scanner.nextLine();
        System.out.println("Nhập số máy");
        int numberComputer = scanner.nextInt();
        checkNumberComputer(numberComputer);
        System.out.println("Nhập giá giờ chơi");
        int price = scanner.nextInt();
        Computer computer = new Computer(type, numberComputer, price);
        System.out.println("Bạn đã tạo thành công máy tính số " + numberComputer);
        computerList.add(computer);
        numberList.add(computer.getNumberComputer());
        System.out.println(computer);

    }

    public  static void checkNumberComputer(int number) {
        for (Computer computer : computerList) {
            while (number == computer.getNumberComputer()) {
                System.out.println("Mời sếp nhập lại số máy vì đã có rồi");
                System.out.println("Nhập số máy");
                Scanner scanner = new Scanner(System.in);
                int numberComputer = scanner.nextInt();
                break;
            }
        }
    }


    public static void delete() {
        System.out.println("Bạn đang loại bỏ máy tính");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số máy muốn bỏ");
        int type = scanner.nextInt();
        checkToDelete(type);

    }


    public static void checkToDelete(int numberDelete) {
        while (!numberList.contains(numberDelete)) {
            System.out.println("Không tồn tại máy tính muốn xoá");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số máy tính muốn xoá");
            numberDelete = scanner.nextInt();
        }
        for (int j = 0; j < computerList.size(); j++) {
            if (numberDelete == computerList.get(j).getNumberComputer()) {
                computerList.remove(j);
                System.out.println("Xoá thành công máy tính số " + numberDelete);
            }
        }
    }


    public static void edit() {
        System.out.println("Bạn đang chỉnh sửa máy tính");
        Scanner scanner = new Scanner(System.in);
        System.out.println(numberList);
        System.out.println("Nhập số máy tính muốn sửa");
        int numberComputer = scanner.nextInt();
        for (int i = 0; i < computerList.size(); i++) {
            if (numberComputer == computerList.get(i).getNumberComputer()) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Sửa loại máy tính");
                String type = scanner1.nextLine();
                System.out.println("Sửa giá giờ chơi");
                int price = scanner1.nextInt();
                computerList.get(i).setType(type);
                computerList.get(i).setPrice(price);
            }
        }
    }

    public static void checkNumberToEdit(int numberEdit) {
        while (!numberList.contains(numberEdit)) {
            System.out.println("Không tồn tại máy tính cần sửa");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số máy tính muốn sửa");
            numberEdit = scanner.nextInt();
        }

    }


    public static void display() {
        System.out.println(getComputerList());
    }



}
