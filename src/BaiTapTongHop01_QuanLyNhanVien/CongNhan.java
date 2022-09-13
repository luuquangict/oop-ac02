package BaiTapTongHop01_QuanLyNhanVien;

public class CongNhan extends CanBo {
    private int capBac;

    public CongNhan(String hoTen, String gioiTinh, String diaChi, int soTuoi, int capBac) {
        super(hoTen, gioiTinh, diaChi, soTuoi);
        this.capBac = capBac;
    }

    public CongNhan() {
        super();
    }

    public int getCapBac() {
        return capBac;
    }

    public void setCapBac(int capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo +
                "Cấp bậc: " + this.capBac;
    }
}
