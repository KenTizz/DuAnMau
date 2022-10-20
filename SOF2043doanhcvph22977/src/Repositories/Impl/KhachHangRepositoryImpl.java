package Repositories.Impl;

import DomainModels.KhachHang;
import Repositories.IKhachHangRepository;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author cvdoa
 */
public class KhachHangRepositoryImpl implements IKhachHangRepository {

    @Override
    public List<KhachHang> getAll() {
        List<KhachHang> listKhachHang = new ArrayList<>();
        String sql = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ho]\n"
                + "      ,[TenDem]\n"
                + "      ,[Ten]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[Sdt]\n"
                + "      ,[DiaChi]\n"
                + "      ,[ThanhPho]\n"
                + "      ,[QuocGia]\n"
                + "      ,[MatKhau]\n"
                + "  FROM [dbo].[KhachHang]";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setId(rs.getString(1));
                kh.setMa(rs.getString(2));
                kh.setHo(rs.getString(3));
                kh.setTenDem(rs.getString(4));
                kh.setTen(rs.getString(5));
                java.sql.Date ngaySinh = rs.getDate(6);
                kh.setNgaySinh(ngaySinh);
                kh.setsDT(rs.getString(7));
                kh.setDiaChi(rs.getString(8));
                kh.setThanhPho(rs.getString(9));
                kh.setQuocGia(rs.getString(10));
                kh.setMatKhau(rs.getString(11));
                listKhachHang.add(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKhachHang;
    }

    @Override
    public boolean insert(KhachHang kh) {
        int check = 0;
        String sql = "INSERT INTO [dbo].[KhachHang]\n"
                + "           ([Ma]\n"
                + "           ,[Ho]\n"
                + "           ,[TenDem]\n"
                + "           ,[Ten]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[Sdt]\n"
                + "           ,[DiaChi]\n"
                + "           ,[ThanhPho]\n"
                + "           ,[QuocGia]\n"
                + "           ,[MatKhau])\n"
                + "     VALUES(?,?,?,?,?,?,?,?,?,?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, kh.getMa());
            pr.setObject(2, kh.getHo());
            pr.setObject(3, kh.getTenDem());
            pr.setObject(4, kh.getTen());
            pr.setObject(5, kh.getNgaySinh());
            pr.setObject(6, kh.getsDT());
            pr.setObject(7, kh.getDiaChi());
            pr.setObject(8, kh.getThanhPho());
            pr.setObject(9, kh.getQuocGia());
            pr.setObject(10, kh.getMatKhau());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, KhachHang kh) {
        int check = 0;
        String sql = "UPDATE [dbo].[KhachHang]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ho] = ?\n"
                + "      ,[TenDem] = ?\n"
                + "      ,[Ten] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[Sdt] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[ThanhPho] = ?\n"
                + "      ,[QuocGia] = ?\n"
                + "      ,[MatKhau] = ?\n"
                + " WHERE [Id] = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, kh.getMa());
            pr.setObject(2, kh.getHo());
            pr.setObject(3, kh.getTenDem());
            pr.setObject(4, kh.getTen());
            pr.setObject(5, kh.getNgaySinh());
            pr.setObject(6, kh.getsDT());
            pr.setObject(7, kh.getDiaChi());
            pr.setObject(8, kh.getThanhPho());
            pr.setObject(9, kh.getQuocGia());
            pr.setObject(10, kh.getMatKhau());
            pr.setObject(11, id);
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        int check = 0;
        String sql = "DELETE KhachHang WHERE Id = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, id);
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public KhachHang getOne(String ma) {
        String sql = "SELECT * FROM KhachHang WHERE Ma = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, ma);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setId(rs.getString(1));
                kh.setMa(rs.getString(2));
                kh.setHo(rs.getString(5));
                kh.setTenDem(rs.getString(4));
                kh.setTen(rs.getString(3));
                java.sql.Date ngaySinh = rs.getDate(6);
                kh.setNgaySinh(ngaySinh);
                kh.setsDT(rs.getString(7));
                kh.setDiaChi(rs.getString(8));
                kh.setThanhPho(rs.getString(9));
                kh.setQuocGia(rs.getString(10));
                kh.setMatKhau(rs.getString(11));
                return kh;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
