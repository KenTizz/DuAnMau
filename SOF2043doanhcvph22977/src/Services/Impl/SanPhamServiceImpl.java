package Services.Impl;

import DomainModels.SanPham;
import Repositories.Impl.SanPhamRepositoryImpl;
import Services.ISanPhamService;
import ViewModels.QLSanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public class SanPhamServiceImpl implements ISanPhamService {

    private SanPhamRepositoryImpl repo = new SanPhamRepositoryImpl();

    @Override
    public List<QLSanPham> getListSanPham() {
        List<QLSanPham> list = new ArrayList<>();
        for (SanPham sp : repo.getAll()) {
            list.add(new QLSanPham(sp.getId(), sp.getMa(), sp.getTen()));
        }
        return list;
    }

    @Override
    public String insert(QLSanPham qlsp) {
        SanPham sp = new SanPham();
        boolean insert = repo.insert(new SanPham("", qlsp.getMa(), qlsp.getTen()));
        if (insert) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, QLSanPham qlsp) {
        SanPham sp = new SanPham(id, qlsp.getMa(), qlsp.getTen());
        boolean update = repo.update(id, sp);
        if (update) {
            return "Sửa thành công id :" + id;
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
    public SanPham getOne(String ma) {
        return repo.getOne(ma);
    }

}
