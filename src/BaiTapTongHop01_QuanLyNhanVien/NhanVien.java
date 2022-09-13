package BaiTapTongHop01_QuanLyNhanVien;

public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien(String hoTen, String gioiTinh, String diaChi, int soTuoi, String congViec) {
        super(hoTen, gioiTinh, diaChi, soTuoi);
        this.congViec = congViec;
    }

    public NhanVien() {

    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo +
                "Công việc: " + this.congViec;
    }
}
