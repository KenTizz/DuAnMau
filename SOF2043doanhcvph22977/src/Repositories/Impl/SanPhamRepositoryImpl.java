package Repositories.Impl;

import DomainModels.SanPham;
import Repositories.ISanPhamRepository;
import Utilities.DBConnection;
import ViewModels.QLSanPham;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author cvdoa
 */
public class SanPhamRepositoryImpl implements ISanPhamRepository {

    @Override
    public List<SanPham> getAll() {
        List<SanPham> listSP = new ArrayList<>();
        String sql = "SELECT * FROM SanPham ORDER BY Ma";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setId(rs.getString(1));
                sp.setMa(rs.getString(2));
                sp.setTen(rs.getString(3));
                listSP.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSP;
    }

    @Override
    public boolean insert(SanPham sp) {
        String sql = "INSERT INTO [dbo].[SanPham]\n"
                + "([Ma]\n"
                + ",[Ten])\n"
                + "VALUES(?,?)";
        int check = 0;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, sp.getMa());
            pr.setObject(2, sp.getTen());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, SanPham sp) {
        String sql = "UPDATE SanPham SET Ma = ?, Ten = ? WHERE Id = ?";
        int check = 0;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, sp.getMa());
            pr.setObject(2, sp.getTen());
            pr.setObject(3, sp.getId());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        String sql = "DELETE SanPham WHERE Id = ?";
        int check = 0;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, id);
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public SanPham getOne(String ma) {
        String query = "SELECT* FROM SanPham WHERE Ma = ?";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                SanPham sp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3));
                return sp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
