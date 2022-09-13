package BaiTapTongHop01_QuanLyNhanVien;

import java.util.Scanner;

public class ConsoleHelper {
    public static int getMenu(String... menuItems) {
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println(String.format("%d. %s", i + 1, menuItems[i]));
        }
        System.out.println("0. Exit");
        System.out.print("---->");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String inputString(String label) {
        System.out.print(label);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public static int inputInt(String label) {
        System.out.print(label);
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    public static String inputAge(String label) {
        System.out.print(label);
        Scanner scanner = new Scanner(System.in);
        int sex = scanner.nextInt();
        String gioiTinh = null;
        if (sex == 0) {
            gioiTinh = "Nữ";
        } else if (sex == 1) {
            gioiTinh = "Nam";
        } else if (sex == 2) {
            gioiTinh = "Khác";
        } else gioiTinh = null;
        return gioiTinh;
    }
}
