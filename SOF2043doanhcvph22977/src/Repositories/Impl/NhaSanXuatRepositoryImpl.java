package Repositories.Impl;

import DomainModels.NhaSanXuat;
import DomainModels.SanPham;
import Repositories.INhaSanXuatRepository;
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
public class NhaSanXuatRepositoryImpl implements INhaSanXuatRepository {

    @Override
    public List<NhaSanXuat> getAll() {
        List<NhaSanXuat> listNSX = new ArrayList<>();
        String sql = "SELECT * FROM NSX ORDER BY Ma";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                NhaSanXuat nsx = new NhaSanXuat();
                nsx.setId(rs.getString(1));
                nsx.setMa(rs.getString(2));
                nsx.setTen(rs.getString(3));
                listNSX.add(nsx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNSX;
    }

    @Override
    public boolean insert(NhaSanXuat nsx) {
        String sql = "INSERT INTO [dbo].[NSX]\n"
                + "([Ma]\n"
                + ",[Ten])\n"
                + "VALUES(?,?)";
        int check = 0;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, nsx.getMa());
            pr.setObject(2, nsx.getTen());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, NhaSanXuat nsx) {
        String sql = "UPDATE NSX SET Ma = ?, Ten = ? WHERE Id = ?";
        int check = 0;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, nsx.getMa());
            pr.setObject(2, nsx.getTen());
            pr.setObject(3, nsx.getId());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        String sql = "DELETE NSX WHERE Id = ?";
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
    public NhaSanXuat getOne(String ma) {
        String sql = "SELECT * FROM NSX WHERE Ma = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setObject(1, ma);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                NhaSanXuat nsx = new NhaSanXuat(rs.getString(1), rs.getString(2), rs.getString(3));
                return nsx;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
