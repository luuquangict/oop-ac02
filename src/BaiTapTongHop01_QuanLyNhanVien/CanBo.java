package BaiTapTongHop01_QuanLyNhanVien;

public class CanBo {
    private String hoTen, diaChi, gioiTinh;
    private int soTuoi;

    public CanBo(String hoTen, String gioiTinh, String diaChi, int soTuoi) {
        this.diaChi = diaChi;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.soTuoi = soTuoi;
    }

    public CanBo() {

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setSoTuoi(int soTuoi) {
        this.soTuoi = soTuoi;
    }

    public int getSoTuoi() {
        return soTuoi;
    }

    public String toString() {
        return "Họ tên: " + hoTen + "     " +
                "Số tuổi: " + soTuoi + "     " +
                "Giới tính: " + gioiTinh + "     " +
                "Địa chỉ: " + diaChi + "     ";
    }
}
