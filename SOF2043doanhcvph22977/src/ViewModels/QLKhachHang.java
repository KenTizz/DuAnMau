package ViewModels;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cvdoa
 */
public class QLKhachHang {

    private String id;
    private String ma;
    private String ho;
    private String tenDem;
    private String ten;
    private Date ngaySinh;
    private String sDT;
    private String diaChi;
    private String thanhPho;
    private String quocGia;
    private String matKhau;

    public QLKhachHang() {
    }

    public QLKhachHang(String id, String ma, String ho, String tenDem, String ten, Date ngaySinh, String sDT, String diaChi, String thanhPho, String quocGia, String matKhau) {
        this.id = id;
        this.ma = ma;
        this.ho = ho;
        this.tenDem = tenDem;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.sDT = sDT;
        this.diaChi = diaChi;
        this.thanhPho = thanhPho;
        this.quocGia = quocGia;
        this.matKhau = matKhau;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Object[] toDataRow() {
        return new Object[]{id, ma, ho+" "+tenDem+" "+ten, ngaySinh, sDT, diaChi, thanhPho, quocGia, matKhau};
    }

    @Override
    public String toString() {
        return "QLKhachHang{" + "id=" + id + ", ma=" + ma + ", ho=" + ho + ", tenDem=" + tenDem + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", sDT=" + sDT + ", diaChi=" + diaChi + ", thanhPho=" + thanhPho + ", quocGia=" + quocGia + ", matKhau=" + matKhau + '}';
    }
    
}
