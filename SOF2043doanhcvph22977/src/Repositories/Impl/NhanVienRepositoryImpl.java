package Repositories.Impl;

import DomainModels.NhanVien;
import Repositories.INhanVienRepository;
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
public class NhanVienRepositoryImpl implements INhanVienRepository {

    @Override
    public List<NhanVien> getAll() {
        List<NhanVien> listNhanVien = new ArrayList<>();
        String sql = "SELECT    A.Id, A.Ma, A.Ho, A.TenDem, A.Ten, A.GioiTinh, A.NgaySinh, A.DiaChi, A.Sdt, \n"
                + "                      B.Ten AS Expr1, C.Ten AS Expr2, A.MatKhau, A.TrangThai\n"
                + "FROM  NhanVien A JOin ChucVu B ON A.IdCV = B.Id JOIN CuaHang C ON A.IdCH = C.Id";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setId(rs.getString(1));
                nv.setMa(rs.getString(2));
                nv.setHo(rs.getString(3));
                nv.setTenDem(rs.getString(4));
                nv.setTen(rs.getString(5));
                nv.setGioiTinh(rs.getString(6));
                java.sql.Date ngaySinh = rs.getDate(7);
                nv.setNgaySinh(ngaySinh);
                nv.setDiaChi(rs.getString(8));
                nv.setsDT(rs.getString(9));
                nv.setIdChucVu(rs.getString(10));
                nv.setIdCuaHang(rs.getString(11));
                nv.setMatKhau(rs.getString(12));
                nv.setTrangThai(rs.getShort(13));
                listNhanVien.add(nv);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNhanVien;
    }

    @Override
    public boolean insert(NhanVien nv) {
        int check = 0;
        String sql = "INSERT INTO [dbo].[NhanVien]\n"
                + "           ([Ma]\n"
                + "		   ,[Ho]\n"
                + "		   ,[TenDem]\n"
                + "           ,[Ten]\n"
                + "           ,[GioiTinh]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[DiaChi]\n"
                + "           ,[Sdt]\n"
                + "           ,[IdCV]\n"
                + "		   ,[IdCH]\n"
                + "		   ,[MatKhau]\n"
                + "           ,[TrangThai])\n"
                + "     VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setObject(1, nv.getMa());
            pr.setObject(2, nv.getHo());
            pr.setObject(3, nv.getTenDem());
            pr.setObject(4, nv.getTen());
            pr.setObject(5, nv.getGioiTinh());
            pr.setObject(6, nv.getNgaySinh());
            pr.setObject(7, nv.getDiaChi());
            pr.setObject(8, nv.getsDT());
            pr.setObject(9, nv.getIdChucVu());
            pr.setObject(10, nv.getIdCuaHang());
            pr.setObject(11, nv.getMatKhau());
            pr.setObject(12, nv.getTrangThai());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, NhanVien nv) {
        int check = 0;
        String sql = "UPDATE [dbo].[NhanVien]\n"
                + "   SET [Ma] = ?      \n"
                + "   ,[Ho] = ?  \n"
                + "   ,[TenDem] = ?\n"
                + "      ,[Ten] = ?    \n"
                + "      ,[GioiTinh] = ?\n"
                + "      ,[NgaySinh] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[Sdt] = ?\n"
                + "	  ,[IdCV] = ?\n"
                + "      ,[IdCH] = ?\n"
                + "      ,[MatKhau] = ?      \n"
                + "      ,[TrangThai] = ?\n"
                + " WHERE [Id] = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setObject(1, nv.getMa());
            pr.setObject(2, nv.getHo());
            pr.setObject(3, nv.getTenDem());
            pr.setObject(4, nv.getTen());
            pr.setObject(5, nv.getGioiTinh());
            pr.setObject(6, nv.getNgaySinh());
            pr.setObject(7, nv.getDiaChi());
            pr.setObject(8, nv.getsDT());
            pr.setObject(9, nv.getIdChucVu());
            pr.setObject(10, nv.getIdCuaHang());
            pr.setObject(11, nv.getMatKhau());
            pr.setObject(12, nv.getTrangThai());
            pr.setObject(13, id);
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        int check = 0;
        String sql = "DELETE NhanVien WHERE Id = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setObject(1, id);
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public NhanVien getOne(String ma) {
        String sql = "SELECT * FROM NhanVien WHERE Ma = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement pr = conn.prepareStatement(sql)){
            pr.setObject(1, ma);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setId(rs.getString(1));
                nv.setMa(rs.getString(2));
                nv.setHo(rs.getString(5));
                nv.setTenDem(rs.getString(4));
                nv.setTen(rs.getString(3));
                nv.setGioiTinh(rs.getString(6));
                java.sql.Date ngaySinh = rs.getDate(7);
                nv.setNgaySinh(ngaySinh);
                nv.setDiaChi(rs.getString(8));
                nv.setsDT(rs.getString(9));
                nv.setMatKhau(rs.getString(10));
                nv.setIdChucVu(rs.getString(11));
                nv.setIdCuaHang(rs.getString(12));
                nv.setTrangThai(rs.getShort(13));
                return nv;
            }
        } catch (Exception e) {
        }
        return null;
    }

}
