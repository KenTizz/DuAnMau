package ViewModels;

/**
 *
 * @author cvdoa
 */
public class QLSanPham {

    private String id;
    private String ma;
    private String ten;

    public QLSanPham() {
    }

    public QLSanPham(String id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
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

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return ten;
    }

    public Object[] toDataRow() {
        return new Object[]{id, ma, ten};
    }
}
