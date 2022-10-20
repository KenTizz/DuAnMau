package ViewModels;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cvdoa
 */
public class QLNhanVien {

    private String id;
    private String ma;
    private String ho;
    private String tenDem;
    private String ten;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String sDT;
    private String tenChucVu;
    private String tenCuaHang;
    private String matKhau;
    private int trangThai;

    public QLNhanVien() {
    }

    public QLNhanVien(String id, String ma, String ho, String tenDem, String ten, String gioiTinh, Date ngaySinh, String diaChi, String sDT, String tenChucVu, String tenCuaHang, String matKhau, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sDT = sDT;
        this.tenChucVu = tenChucVu;
        this.tenCuaHang = tenCuaHang;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public String getTenCuaHang() {
        return tenCuaHang;
    }

    public void setTenCuaHang(String tenCuaHang) {
        this.tenCuaHang = tenCuaHang;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    public Object[] toDataRow(){
        return new Object[]{id,ma,ho+" "+tenDem+" "+ten,gioiTinh, ngaySinh, diaChi, sDT, tenChucVu, tenCuaHang, matKhau, trangThai==1 ? "Đang Làm" : "Nghỉ Làm"};
    }
}
