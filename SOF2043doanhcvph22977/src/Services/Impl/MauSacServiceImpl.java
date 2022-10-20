 package Services.Impl;

import Repositories.Impl.MauSacRepositoryImpl;
import DomainModels.MauSac;
import Repositories.IMauSacRepository;
import Services.IMauSacService;
import ViewModels.QLMauSac;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public class MauSacServiceImpl implements IMauSacService {

    private IMauSacRepository repo = new MauSacRepositoryImpl();

    @Override
    public List<QLMauSac> getListMauSac() {
        List<QLMauSac> list = new ArrayList<>();
        for (MauSac ms : repo.getAll()) {
            list.add(new QLMauSac(ms.getId(), ms.getMa(), ms.getTen()));
        }
        return list;
    }

    @Override
    public String insert(QLMauSac qlms) {
        boolean insert = repo.insert(new MauSac("", qlms.getMa(), qlms.getTen()));
        if (insert) {
            return "Thêm hành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, QLMauSac qlms) {
        MauSac ms = new MauSac(id, qlms.getMa(), qlms.getTen());
        boolean update = repo.update(id, ms);
        if (update) {
            return "Sửa hành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        boolean delete = repo.delete(id);
        if (delete) {
            return "Xóa hành công";
        }
        return "Xóa thất bại";
    }

    @Override
    public MauSac getOne(String ma) {
        return repo.getOne(ma);
    }

}
