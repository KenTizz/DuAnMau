package Repositories.Impl;

import DomainModels.ChucVu;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Repositories.IChucVuRepository;

/**
 *
 * @author cvdoa
 */
public class ChucVuRepositoryImpl implements IChucVuRepository {

    @Override
    public List<ChucVu> getAll() {
        List<ChucVu> listChucVu = new ArrayList<>();
        String sql = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[CHUCVU]";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                ChucVu cv = new ChucVu();
                cv.setId(rs.getString(1));
                cv.setMa(rs.getString(2));
                cv.setTen(rs.getString(3));
                listChucVu.add(cv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listChucVu;
    }

    @Override
    public boolean insert(ChucVu cv) {
        int check = 0;
        String sql = "INSERT INTO [dbo].[ChucVu]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, cv.getMa());
            pr.setObject(2, cv.getTen());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, ChucVu cv) {
        int check = 0;
        String sql = "UPDATE [dbo].[ChucVu]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + " WHERE [Id] =?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, cv.getMa());
            pr.setObject(2, cv.getTen());
            pr.setObject(3, cv.getId());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        int check = 0;
        String sql = "DELETE [dbo].[ChucVu]\n"
                + " WHERE [Id] =?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql)) {
            pr.setObject(1, id);
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public ChucVu getOne(String ma) {
        String query = "SELECT Id, Ma, Ten\n"
                + "FROM [dbo].[ChucVu]"
                + "WHERE Ma = ?";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(1), rs.getString(2), rs.getString(3));
                return cv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ChucVu getObjectTen(String ten) {
        String sql = "SELECT Id, Ma, Ten FROM ChucVu LIKE Ten = '%" + ten + "%'";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setObject(1, ten);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(1), rs.getString(2), rs.getString(3));
                return cv;
            }
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public ChucVu getBuyId(String id) {
        String query = "SELECT Id, Ma, Ten\n"
                + "FROM [dbo].[ChucVu]"
                + "WHERE Id = ?";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(1), rs.getString(2), rs.getString(3));
                return cv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
