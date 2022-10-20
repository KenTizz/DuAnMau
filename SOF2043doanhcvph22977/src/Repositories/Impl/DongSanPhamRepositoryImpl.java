package Repositories.Impl;

import DomainModels.DongSanPham;
import Repositories.IDongSanPhamRepository;
import Repositories.ISanPhamRepository;
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
public class DongSanPhamRepositoryImpl implements IDongSanPhamRepository {

    @Override
    public List<DongSanPham> getAll() {
        List<DongSanPham> listDSP = new ArrayList<>();
        String sql = "SELECT * FROM DongSP";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                DongSanPham dsp = new DongSanPham();
                dsp.setId(rs.getString(1));
                dsp.setMa(rs.getString(2));
                dsp.setTen(rs.getString(3));
                listDSP.add(dsp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDSP;
    }

    @Override
    public boolean insert(DongSanPham dsp) {
        String sql = "INSERT INTO [dbo].[DongSP]\n"
                + "([Ma]\n"
                + ",[Ten])\n"
                + "VALUES(?,?)";
        int check = 0;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, dsp.getMa());
            pr.setObject(2, dsp.getTen());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, DongSanPham dsp) {
        String sql = "UPDATE DongSP SET Ma = ?, Ten = ? WHERE Id = ?";
        int check = 0;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, dsp.getMa());
            pr.setObject(2, dsp.getTen());
            pr.setObject(3, dsp.getId());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        String sql = "DELETE DongSP WHERE Id = ?";
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
    public DongSanPham getOne(String ma) {
        String query = "SELECT* FROM DongSP WHERE Ma = ?";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                DongSanPham dsp = new DongSanPham(rs.getString(1), rs.getString(2), rs.getString(3));
                return dsp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
