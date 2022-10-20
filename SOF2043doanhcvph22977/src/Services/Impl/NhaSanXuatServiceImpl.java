package Services.Impl;

import DomainModels.NhaSanXuat;
import Repositories.INhaSanXuatRepository;
import Repositories.Impl.NhaSanXuatRepositoryImpl;
import Services.INhaSanXuatService;
import ViewModels.QLNhaSanXuat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public class NhaSanXuatServiceImpl implements INhaSanXuatService {

    private INhaSanXuatRepository repo = new NhaSanXuatRepositoryImpl();

    @Override
    public List<QLNhaSanXuat> getListNSX() {
        List<QLNhaSanXuat> list = new ArrayList<>();
        for (NhaSanXuat nsx : repo.getAll()) {
            list.add(new QLNhaSanXuat(nsx.getId(), nsx.getMa(), nsx.getTen()));
        }
        return list;
    }

    @Override
    public String insert(QLNhaSanXuat qlnsx) {
        boolean insert = repo.insert(new NhaSanXuat("", qlnsx.getMa(), qlnsx.getTen()));
        if (insert) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, QLNhaSanXuat qlnsx) {
        NhaSanXuat nsx = new NhaSanXuat(id, qlnsx.getMa(), qlnsx.getTen());
        boolean update = repo.update(id, nsx);
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
    public NhaSanXuat getOne(String ma) {
        return repo.getOne(ma);
    }
}
