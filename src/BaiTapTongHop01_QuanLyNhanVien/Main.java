package BaiTapTongHop01_QuanLyNhanVien;

public class Main {
    public static void main(String[] args) {

        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();

        while (true) {
            int function = ConsoleHelper.getMenu("Thêm mới","Tìm kiếm","Hiển thị");
            switch (function) {
                case 1: {
                   quanLyCanBo.nhapThongTinCanBo();
                   break;
                }
                case 2: {
                    String reSearch  = ConsoleHelper.inputString("Nhập họ tên cán bộ cần tìm: ");
                    quanLyCanBo.timKiemThongTinCanBo(reSearch);
                    break;
                }
                case 3: {
                    quanLyCanBo.hienThiThongTinCacNhanVien();
                    break;
                }
                case 4: {
                    return;
                }
                default:
                    System.out.println("Chức năng không hợp lệ!");
                    continue;
            }
        }
    }
}
