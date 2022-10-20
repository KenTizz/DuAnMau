package Services.Impl;

import DomainModels.NhanVien;
import Repositories.INhanVienRepository;
import Repositories.Impl.NhanVienRepositoryImpl;
import Services.INhanVienService;
import ViewModels.QLNhanVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public class NhanVienServiceImpl implements INhanVienService {

    private INhanVienRepository repo = new NhanVienRepositoryImpl();

    @Override
    public List<QLNhanVien> getListNhanVien() {
        List<QLNhanVien> list = new ArrayList<>();
        for (NhanVien nv : repo.getAll()) {
            list.add(new QLNhanVien(nv.getId(), nv.getMa(), nv.getHo(), nv.getTenDem(), nv.getTen(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getDiaChi(), nv.getsDT(), nv.getIdChucVu(), nv.getIdCuaHang(), nv.getMatKhau(), nv.getTrangThai()));
        }
        return list;
    }

    @Override
    public String insert(QLNhanVien qlnv) {
        NhanVien nv = new NhanVien("", qlnv.getMa(), qlnv.getHo(), qlnv.getTenDem(), qlnv.getTen(), qlnv.getGioiTinh(), qlnv.getNgaySinh(), qlnv.getDiaChi(), qlnv.getsDT(), qlnv.getTenChucVu(), qlnv.getTenCuaHang(), qlnv.getMatKhau(), qlnv.getTrangThai());
        boolean insert = repo.insert(nv);
        if (insert) {
            return "Them thanh cong";
        }
        return "Them that bai";
    }

    @Override
    public String update(String id, QLNhanVien qlnv) {
        NhanVien nv = new NhanVien(id, qlnv.getMa(), qlnv.getHo(), qlnv.getTenDem(), qlnv.getTen(), qlnv.getGioiTinh(), qlnv.getNgaySinh(), qlnv.getDiaChi(), qlnv.getsDT(), qlnv.getTenChucVu(), qlnv.getTenCuaHang(), qlnv.getMatKhau(), qlnv.getTrangThai());
        boolean insert = repo.update(id, nv);
        if (insert) {
            return "Sua thanh cong";
        }
        return "Sua that bai";
    }

    @Override
    public String delete(String id) {
        boolean delete = repo.delete(id);
        if (delete) {
            return "Xoa thanh cong";
        }
        return "Xoa that bai";
    }

    @Override
    public QLNhanVien getOne(String ma) {
        var x = repo.getOne(ma);
        return new QLNhanVien(x.getId() ,x.getMa(), x.getHo(), x.getTenDem(), x.getTen(), x.getGioiTinh(), x.getNgaySinh(), x.getDiaChi(), x.getsDT(), x.getIdChucVu(), x.getIdCuaHang(), x.getMatKhau(), x.getTrangThai());
    }

}
