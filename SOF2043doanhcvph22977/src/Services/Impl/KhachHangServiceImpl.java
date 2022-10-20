package Services.Impl;

import DomainModels.KhachHang;
import Repositories.IKhachHangRepository;
import Repositories.Impl.KhachHangRepositoryImpl;
import Services.IKhachHangService;
import ViewModels.QLKhachHang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public class KhachHangServiceImpl implements IKhachHangService {

    private IKhachHangRepository repo = new KhachHangRepositoryImpl();

    @Override
    public List<QLKhachHang> getListKhach() {
        List<QLKhachHang> list = new ArrayList<>();
        for (KhachHang kh : repo.getAll()) {
            list.add(new QLKhachHang(kh.getId(), kh.getMa(), kh.getHo(), kh.getTenDem(), kh.getTen(), kh.getNgaySinh(), kh.getsDT(), kh.getDiaChi(), kh.getThanhPho(), kh.getQuocGia(), kh.getMatKhau()));
        }
        return list;
    }

    @Override
    public String insert(QLKhachHang qlkh) {
        boolean insert = repo.insert(new KhachHang("", qlkh.getMa(), qlkh.getHo(), qlkh.getTenDem(), qlkh.getTen(), qlkh.getNgaySinh(), qlkh.getsDT(), qlkh.getDiaChi(), qlkh.getThanhPho(), qlkh.getQuocGia(), qlkh.getMatKhau()));
        if (insert) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(String id, QLKhachHang qlkh) {
        KhachHang kh = new KhachHang(id, qlkh.getMa(), qlkh.getHo(), qlkh.getTenDem(), qlkh.getTen(), qlkh.getNgaySinh(), qlkh.getsDT(), qlkh.getDiaChi(), qlkh.getThanhPho(), qlkh.getQuocGia(), qlkh.getMatKhau());
        boolean update = repo.update(id, kh);
        if (update) {
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }

    @Override
    public String delete(String id) {
        boolean delete = repo.delete(id);
        if (delete) {
            return "Xóa thành công";
        }
        return "xóa thất bại";
    }

    @Override
    public QLKhachHang getOne(String ma) {
        var x = repo.getOne(ma);
        return new QLKhachHang(x.getId(), x.getMa(), x.getHo(), x.getTenDem(), x.getTen(), x.getNgaySinh(), x.getsDT(), x.getDiaChi(), x.getThanhPho(), x.getQuocGia(), x.getMatKhau());
    }

}
