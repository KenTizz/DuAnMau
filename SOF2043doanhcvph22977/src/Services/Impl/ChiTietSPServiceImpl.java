package Services.Impl;

import DomainModels.ChiTietSP;
import Repositories.IChiTietSPRepository;
import Repositories.Impl.ChiTietSPRepositoryImpl;
import Services.IChiTietSPService;
import ViewModels.QLChiTietSP;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public class ChiTietSPServiceImpl implements IChiTietSPService {

    private IChiTietSPRepository repo = new ChiTietSPRepositoryImpl();

    @Override
    public List<QLChiTietSP> getListChiTietSP() {
        List<QLChiTietSP> list = new ArrayList<>();
        for (ChiTietSP ctsp : repo.getAll()) {
            list.add(new QLChiTietSP(ctsp.getId(), ctsp.getIdSanPham(), ctsp.getIdNSX(), ctsp.getIdMauSac(), ctsp.getIdDongSP(), ctsp.getNamBH(), ctsp.getSoLuongTon(), ctsp.getGiaNhap(), ctsp.getGiaBan(), ctsp.getMoTa()));
        }
        return list;
    }

    @Override
    public String insert(QLChiTietSP ctsp) {
        boolean insert = repo.insert(new ChiTietSP(null, ctsp.getTenSanPham(), ctsp.getTenNSX(), ctsp.getTenMauSac(), ctsp.getTenDongSP(), ctsp.getNamBH(), ctsp.getSoLuongTon(), ctsp.getGiaNhap(), ctsp.getGiaBan(), ctsp.getMoTa()));
        if (insert) {
            return "Them Thanh Cong";
        }
        return "Them That Bai";

    }

    @Override
    public String update(String id, QLChiTietSP ctsp) {
        ChiTietSP ct = new ChiTietSP(id, ctsp.getTenSanPham(), ctsp.getTenNSX(), ctsp.getTenMauSac(), ctsp.getTenDongSP(), ctsp.getNamBH(), ctsp.getSoLuongTon(), ctsp.getGiaNhap(), ctsp.getGiaBan(), ctsp.getMoTa());
        boolean update = repo.update(id, ct);
        if (update) {
            return "Sửa thành công id : " + id;
        }
        return "Sửa thất bại id : " + id;
    }

    @Override
    public String delete(String id) {
        boolean insert = repo.delete(id);
        if (insert) {
            return "Xoa Thanh Cong";
        }
        return "Xoa That Bai";
    }

}
