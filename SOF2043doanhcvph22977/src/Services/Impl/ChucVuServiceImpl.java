package Services.Impl;

import DomainModels.ChucVu;
import Repositories.Impl.ChucVuRepositoryImpl;
import ViewModels.QLChucVu;
import java.util.ArrayList;
import java.util.List;
import Services.IChucVuService;
import Repositories.IChucVuRepository;

/**
 *
 * @author cvdoa
 */
public class ChucVuServiceImpl implements IChucVuService {

    private IChucVuRepository repo = new ChucVuRepositoryImpl();

    @Override
    public List<QLChucVu> getAllChucVu() {
        List<QLChucVu> listQL = new ArrayList<>();
        for (ChucVu cv : repo.getAll()) {
            listQL.add(new QLChucVu(cv.getId(), cv.getMa(), cv.getTen()));
        }
        return listQL;
    }

    @Override
    public String insert(QLChucVu qlcv) {
        boolean insert = repo.insert(new ChucVu("", qlcv.getMa(), qlcv.getTen()));
        if (insert) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, QLChucVu qlcv) {
        ChucVu cv = new ChucVu(id, qlcv.getMa(), qlcv.getTen());
        boolean update = repo.update(id, cv);
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
    public QLChucVu getOne(String ma) {
        var x = repo.getOne(ma);
        return new QLChucVu(x.getId(), x.getMa(), x.getTen());
    }

    @Override
    public ChucVu getObjectTen(String ten) {
        return repo.getObjectTen(ten);
    }
}
