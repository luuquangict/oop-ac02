package BaiTapTongHop01_QuanLyNhanVien;

import java.util.ArrayList;

public class QuanLyCanBo {

    ArrayList<CanBo> canBos;

    public QuanLyCanBo() {
        this.canBos = new ArrayList<>();
    }

    public void themThongTinCoBan(CanBo canBo) {
        canBo.setHoTen(ConsoleHelper.inputString("Họ và tên: "));
        canBo.setSoTuoi(ConsoleHelper.inputInt("Tuổi: "));
        canBo.setGioiTinh(ConsoleHelper.inputAge("Giới tính (0.Nữ, 1.Nam, 2. Khác): "));
        canBo.setDiaChi(ConsoleHelper.inputString("Địa chỉ: "));
    }

    public NhanVien themNhanVien() {
        NhanVien nhanVien = new NhanVien();
        themThongTinCoBan(nhanVien);
        nhanVien.setCongViec(ConsoleHelper.inputString("Công việc"));
        return nhanVien;
    }

    public CongNhan themCongNhan() {
        CongNhan congNhan = new CongNhan();
        themThongTinCoBan(congNhan);
        congNhan.setCapBac(ConsoleHelper.inputInt("Cấp bậc: "));
        if (congNhan.getCapBac() < 0 || congNhan.getCapBac() > 10) {
            System.out.println("Cấp bậc không hợp lệ");
        }
        return congNhan;
    }

    public KySu themKySu() {
        KySu kySu = new KySu();
        themThongTinCoBan(kySu);
        kySu.setNganhDaoTao(ConsoleHelper.inputString("Ngành đào tạo: "));
        return kySu;
    }


    public void nhapThongTinCanBo() {
        String type = ConsoleHelper.inputString("Chọn loại cán bộ (a. Công nhân, b. Kỹ Sư, c. Nhân viên): ");
        CanBo canBo;
        switch (type.toUpperCase()) {
            case "A": {
                canBo = themCongNhan();
                break;
            }
            case "B": {
                canBo = themKySu();
                break;
            }
            case "C": {
                canBo = themNhanVien();
                break;
            }
            default:
                return;
        }
        canBos.add(canBo);
    }

    public CanBo timKiemThongTinCanBo(String tenCanBo) {
        for (int i = 0; i < canBos.size(); i++) {
            System.out.println(canBos.get(i).toString());
            CanBo ketQua = this.canBos.get(i);
            if (ketQua.getHoTen().contains(tenCanBo))
                return ketQua;
        }
        return null;
    }

    public void hienThiThongTinCacNhanVien() {
        for (int i = 0; i < canBos.size(); i++) {
            System.out.println(canBos.get(i).toString());
        }
    }

}
