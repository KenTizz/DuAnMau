package Repositories.Impl;

import DomainModels.MauSac;
import Repositories.IMauSacRepository;
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
public class MauSacRepositoryImpl implements IMauSacRepository {

    @Override
    public List<MauSac> getAll() {
        List<MauSac> listMauSac = new ArrayList<>();
        String sql = "SELECT * FROM MauSac";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                listMauSac.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMauSac;
    }

    @Override
    public boolean insert(MauSac ms) {
        int check = 0;
        String sql = "INSERT INTO MauSac "
                + "(Ma, Ten)"
                + "VALUES(?, ?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setString(1, ms.getMa());
            pr.setString(2, ms.getTen());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, MauSac ms) {
        int check = 0;
        String sql = "UPDATE MauSac SET Ma = ?, Ten = ? WHERE Id = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setString(1, ms.getMa());
            pr.setString(2, ms.getTen());
            pr.setString(3, id);
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        int check = 0;
        String sql = "DELETE MauSac WHERE Id = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setString(1, id);
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public MauSac getOne(String ma) {
        String sql = "SELECT * FROM MauSac WHERE Ma = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setObject(1, ma);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                return ms;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
