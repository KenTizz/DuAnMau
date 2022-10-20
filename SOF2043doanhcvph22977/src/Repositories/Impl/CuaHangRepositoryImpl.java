package Repositories.Impl;

import DomainModels.CuaHang;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Repositories.ICuaHangRepository;

/**
 *
 * @author cvdoa
 */
public class CuaHangRepositoryImpl implements ICuaHangRepository {

    @Override
    public List<CuaHang> getAll() {
        List<CuaHang> list = new ArrayList<>();
        String sql = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "      ,[DiaChi]\n"
                + "      ,[ThanhPho]\n"
                + "      ,[QuocGia]\n"
                + "  FROM [dbo].[CuaHang] ORDER BY Ma";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                CuaHang ch = new CuaHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                list.add(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(CuaHang ch) {
        int check = 0;
        String sql = "INSERT INTO [dbo].[CuaHang]\n"
                + "([Ma]\n"
                + ",[Ten]\n"
                + ",[DiaChi]\n"
                + ",[ThanhPho]\n"
                + ",[QuocGia])"
                + "VALUES(?, ?, ?, ?, ?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setObject(1, ch.getMa());
            pr.setObject(2, ch.getTen());
            pr.setObject(3, ch.getDiaChi());
            pr.setObject(4, ch.getThanhPho());
            pr.setObject(5, ch.getQuocGia());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, CuaHang ch) {
        int check = 0;
        String sql = "UPDATE [dbo].[CuaHang]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[ThanhPho] = ?\n"
                + "      ,[QuocGia] = ?\n"
                + " WHERE Id = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setObject(1, ch.getMa());
            pr.setObject(2, ch.getTen());
            pr.setObject(3, ch.getDiaChi());
            pr.setObject(4, ch.getThanhPho());
            pr.setObject(5, ch.getQuocGia());
            pr.setObject(6, ch.getId());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        int check = 0;
        String sql = "DELETE FROM [dbo].[CuaHang]\n"
                + "      WHERE Id = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setObject(1, id);
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public CuaHang getOne(String ma) {
        String sql = "SELECT * FROM CuaHang WHERE Ma = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, ma);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                CuaHang ch = new CuaHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                return ch;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
