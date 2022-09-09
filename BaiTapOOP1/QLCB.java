package BaiTapOOP1;

import java.util.Objects;
import java.util.Scanner;

class QLCB {
    public CanBo[] canBo = new CanBo[50];
    private int size = 0;

    public void run() {
//        QLCB qlcb = new QLCB();
        int option;
        do {
            System.out.println("1. Them moi Cong Nhan");
            System.out.println("2. Them moi Ky Su");
            System.out.println("3. Them moi Nhan Vien");
            System.out.println("4. Tim kiem can bo theo ten");
            System.out.println("5. Hien thi danh sach can bo");
            System.out.println("0. Exit");
            System.out.println("Ban chon:");
            Scanner scanner = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            option = scanner.nextInt();

            if (option == 1) {
                CongNhan congNhan1 = new CongNhan();
                congNhan1.viTri = "Cong Nhan";
                System.out.println("Nhap ho ten:");
                congNhan1.hoTen = scanner2.nextLine();
                System.out.println("Nhap tuoi:");
                congNhan1.tuoi = scanner.nextInt();
                System.out.println("Nhap gioi tinh:");
                congNhan1.gioiTinh = scanner2.nextLine();
                System.out.println("Nhap dia chi:");
                congNhan1.diaChi = scanner2.nextLine();
                System.out.println("Nhap bac:");
                congNhan1.bac = scanner.nextInt();
                this.themCanBo(congNhan1);
            }
            if (option == 2) {
                KySu kySu1 = new KySu();
                kySu1.viTri = "Ky Su";
                System.out.println("Nhap ho ten:");
                kySu1.hoTen = scanner2.nextLine();
                System.out.println("Nhap tuoi:");
                kySu1.tuoi = scanner.nextInt();
                System.out.println("Nhap gioi tinh:");
                kySu1.gioiTinh = scanner2.nextLine();
                System.out.println("Nhap dia chi:");
                kySu1.diaChi = scanner2.nextLine();
                System.out.println("Nhap nganh:");
                kySu1.nganh = scanner2.nextLine();
                this.themCanBo(kySu1);
            }
            if (option == 3) {
                NhanVien nhanVien1 = new NhanVien();
                nhanVien1.viTri = "Nhan Vien";
                System.out.println("Nhap ho ten:");
                nhanVien1.hoTen = scanner2.nextLine();
                System.out.println("Nhap tuoi:");
                nhanVien1.tuoi = scanner.nextInt();
                System.out.println("Nhap gioi tinh:");
                nhanVien1.gioiTinh = scanner2.nextLine();
                System.out.println("Nhap dia chi:");
                nhanVien1.diaChi = scanner2.nextLine();
                System.out.println("Nhap cong viec:");
                nhanVien1.congViec = scanner2.nextLine();
                this.themCanBo(nhanVien1);
            }
            if (option == 4) {
                System.out.println("Nhap ten can tim:");
                String tenCanTim = scanner2.nextLine();
                this.timKiemCanBo(tenCanTim);
            }
            if (option == 5) {
                this.hienThiCanBo();
            }
        } while (option != 0);


    }

    public void themCanBo(CongNhan congNhan) {
        canBo[size] = congNhan;
        size++;
    }

    public void themCanBo(KySu kySu) {
        canBo[size] = kySu;
        size++;
    }

    public void themCanBo(NhanVien nhanVien) {
        canBo[size] = nhanVien;
        size++;
    }

    public void hienThiCanBo() {
        System.out.println("Danh sach can bo:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + canBo[i].hoTen);
        }
        System.out.println("==================");
    }

    public void timKiemCanBo(String ten) {
        boolean isTrung = false;
        for (int i = 0; i < size; i++) {
            if (canBo[i].hoTen.equals(ten)) {
                System.out.println("Ket qua:");
                System.out.println(canBo[i].hoTen + " - " + canBo[i].viTri);
                isTrung = true;
            }
        }
        if (!isTrung) {
            System.out.println("Khong co ket qua trung khop");
        }
        System.out.println("==================");
    }
}
