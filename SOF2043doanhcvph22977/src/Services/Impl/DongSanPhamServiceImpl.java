package Services.Impl;

import DomainModels.DongSanPham;
import Repositories.IDongSanPhamRepository;
import Repositories.Impl.DongSanPhamRepositoryImpl;
import Services.IDongSanPhamService;
import ViewModels.QLDongSanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public class DongSanPhamServiceImpl implements IDongSanPhamService {

    private IDongSanPhamRepository repo = new DongSanPhamRepositoryImpl();

    @Override
    public List<QLDongSanPham> getListDongSanPham() {
        List<QLDongSanPham> list = new ArrayList<>();
        for (DongSanPham dsp : repo.getAll()) {
            list.add(new QLDongSanPham(dsp.getId(), dsp.getMa(), dsp.getTen()));
        }
        return list;
    }

    @Override
    public String insert(QLDongSanPham qldsp) {
        DongSanPham dsp = new DongSanPham();
        boolean insert = repo.insert(new DongSanPham("", qldsp.getMa(), qldsp.getTen()));
        if (insert) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, QLDongSanPham qldsp) {
        DongSanPham dsp = new DongSanPham(id, qldsp.getMa(), qldsp.getTen());
        boolean update = repo.update(id, dsp);
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
    public DongSanPham getOne(String ma) {
        return repo.getOne(ma);
    }

}
