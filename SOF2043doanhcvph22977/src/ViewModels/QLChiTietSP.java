package ViewModels;

import DomainModels.DongSanPham;
import DomainModels.MauSac;
import DomainModels.NhaSanXuat;
import DomainModels.SanPham;
import java.math.BigDecimal;

/**
 *
 * @author cvdoa
 */
public class QLChiTietSP {

    private String id;
    private String tenSanPham;
    private String tenNSX;
    private String tenMauSac;
    private String tenDongSP;
    private int namBH;
    private int soLuongTon;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;
    private String moTa;

    public QLChiTietSP() {
    }

    public QLChiTietSP(String id, String tenSanPham, String tenNSX, String tenMauSac, String tenDongSP, int namBH, int soLuongTon, BigDecimal giaNhap, BigDecimal giaBan, String moTa) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.tenNSX = tenNSX;
        this.tenMauSac = tenMauSac;
        this.tenDongSP = tenDongSP;
        this.namBH = namBH;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.moTa = moTa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
    }

    public String getTenDongSP() {
        return tenDongSP;
    }

    public void setTenDongSP(String tenDongSP) {
        this.tenDongSP = tenDongSP;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }


    public Object[] toDataRow() {
        return new Object[]{id, tenSanPham, tenNSX, tenMauSac, tenDongSP, namBH, soLuongTon, giaNhap, giaBan, moTa};
    }

}
