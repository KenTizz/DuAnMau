package Services.Impl;

import DomainModels.CuaHang;
import Repositories.Impl.CuaHangRepositoryImpl;
import ViewModels.QLCuaHang;
import java.util.ArrayList;
import java.util.List;
import Repositories.ICuaHangRepository;
import Services.ICuaHangService;

/**
 *
 * @author cvdoa
 */
public class CuaHangServiceImpl implements ICuaHangService {

    private ICuaHangRepository repo = new CuaHangRepositoryImpl();

    @Override
    public List<QLCuaHang> getAllCuaHang() {
        List<QLCuaHang> ds = new ArrayList<>();
        List<CuaHang> list = this.repo.getAll();
        for (CuaHang ch : list) {
            QLCuaHang qlch = new QLCuaHang(ch.getId(), ch.getMa(), ch.getTen(), ch.getDiaChi(), ch.getThanhPho(), ch.getQuocGia());
            ds.add(qlch);
        }
        return ds;
    }

    @Override
    public String insert(QLCuaHang qlch) {
//        CuaHang ch = new CuaHang();
        boolean insert = repo.insert(new CuaHang("", qlch.getMa(), qlch.getTen(), qlch.getDiaChi(), qlch.getThanhPho(), qlch.getQuocGia()));
        if (insert) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, QLCuaHang qlch) {
        CuaHang ch = new CuaHang(id, qlch.getMa(), qlch.getTen(), qlch.getDiaChi(), qlch.getThanhPho(), qlch.getQuocGia());
        boolean update = repo.update(id, ch);
        if (update) {
            return "Sửa thành công id :  " + id;
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        boolean delete = repo.delete(id);
        if (delete) {
            return "Xóa thành công id :" + id;
        }
        return "Xóa thất bại";
    }

    @Override
    public CuaHang getOne(String ma) {
        return repo.getOne(ma);
    }

}
