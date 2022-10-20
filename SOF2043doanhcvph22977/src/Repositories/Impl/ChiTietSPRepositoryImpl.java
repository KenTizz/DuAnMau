package Repositories.Impl;

import DomainModels.ChiTietSP;
import Repositories.IChiTietSPRepository;
import Repositories.IDongSanPhamRepository;
import Repositories.IMauSacRepository;
import Repositories.INhaSanXuatRepository;
import Repositories.ISanPhamRepository;
import Utilities.DBConnection;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author cvdoa
 */
public class ChiTietSPRepositoryImpl implements IChiTietSPRepository {

    @Override
    public List<ChiTietSP> getAll() {
        List<ChiTietSP> list = new ArrayList<>();
        String sql = "SELECT    dbo.ChiTietSP.Id, dbo.SanPham.Ten, dbo.NSX.Ten AS Expr1, dbo.MauSac.Ten AS Expr2, dbo.DongSP.Ten AS Expr3, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, \n"
                + "                      dbo.ChiTietSP.GiaBan, dbo.ChiTietSP.MoTa\n"
                + "FROM         dbo.ChiTietSP INNER JOIN\n"
                + "                      dbo.DongSP ON dbo.ChiTietSP.IdDongSP = dbo.DongSP.Id INNER JOIN\n"
                + "                      dbo.MauSac ON dbo.ChiTietSP.IdMauSac = dbo.MauSac.Id INNER JOIN\n"
                + "                      dbo.NSX ON dbo.ChiTietSP.IdNsx = dbo.NSX.Id INNER JOIN\n"
                + "                      dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                ChiTietSP sp = new ChiTietSP();
                sp.setId(rs.getString(1));
                sp.setIdSanPham(rs.getString(2));
                sp.setIdNSX(rs.getString(3));
                sp.setIdMauSac(rs.getString(4));
                sp.setIdDongSP(rs.getString(5));
                sp.setNamBH(rs.getInt(6));
                sp.setSoLuongTon(rs.getInt(7));
                sp.setGiaNhap(rs.getBigDecimal(8));
                sp.setGiaBan(rs.getBigDecimal(9));
                sp.setMoTa(rs.getString(10));
                list.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(ChiTietSP ctsp) {
        int check = 0;
        String sql = "INSERT INTO [dbo].[ChiTietSP]\n"
                + "([IdSP],[IdNsx],[IdMauSac],[IdDongSP],[NamBH],[SoLuongTon],[GiaNhap],[GiaBan],[MoTa])\n"
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setObject(1, ctsp.getIdSanPham());
            pr.setObject(2, ctsp.getIdNSX());
            pr.setObject(3, ctsp.getIdMauSac());
            pr.setObject(4, ctsp.getIdDongSP());
            pr.setObject(5, ctsp.getNamBH());
            pr.setObject(6, ctsp.getSoLuongTon());
            pr.setObject(7, ctsp.getGiaNhap());
            pr.setObject(8, ctsp.getGiaBan());
            pr.setObject(9, ctsp.getMoTa());
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean update(String id, ChiTietSP ctsp) {
        int check = 0;
        String sql = "UPDATE [dbo].[ChiTietSP]\n"
                + "   SET [IdSP] = ?\n"
                + "      ,[IdNsx] = ?   \n"
                + "	  ,[IdMauSac] = ? \n"
                + "      ,[IdDongSP] = ?\n"
                + "      ,[NamBH] = ?\n"
                + "      ,[SoLuongTon] = ? \n"
                + "      ,[GiaNhap] = ?\n"
                + "      ,[GiaBan] = ?\n"
                + "	  ,[MoTa] = ?\n"
                + " WHERE [Id] = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setObject(1, ctsp.getIdSanPham());
            pr.setObject(2, ctsp.getIdNSX());
            pr.setObject(3, ctsp.getIdMauSac());
            pr.setObject(4, ctsp.getIdDongSP());
            pr.setObject(5, ctsp.getNamBH());
            pr.setObject(6, ctsp.getSoLuongTon());
            pr.setObject(7, ctsp.getGiaNhap());
            pr.setObject(8, ctsp.getGiaBan());
            pr.setObject(9, ctsp.getMoTa());
            pr.setObject(10, id);
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        int check = 0;
        String sql = "DELETE ChiTietSP WHERE Id = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement pr = conn.prepareStatement(sql);) {
            pr.setObject(1, id);
            check = pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

}
