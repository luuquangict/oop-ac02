package BaiTapTongHop01_QuanLyNhanVien;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String hoTen, String gioiTinh, String diaChi, int soTuoi, String nganhDaoTao) {
        super(hoTen, gioiTinh, diaChi, soTuoi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu() {

    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo +
                "Ngành đào tạo: " + this.nganhDaoTao;
    }
}
