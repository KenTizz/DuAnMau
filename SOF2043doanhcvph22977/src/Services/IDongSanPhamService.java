package Services;

import DomainModels.DongSanPham;
import ViewModels.QLDongSanPham;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface IDongSanPhamService {

    List<QLDongSanPham> getListDongSanPham();

    String insert(QLDongSanPham qldsp);

    String update(String id, QLDongSanPham qldsp);

    String delete(String id);

    DongSanPham getOne(String ma);
}
