package Services;

import DomainModels.SanPham;
import ViewModels.QLSanPham;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface ISanPhamService {

    List<QLSanPham> getListSanPham();

    String insert(QLSanPham qlsp);

    String update(String id, QLSanPham qlsp);

    String delete(String id);
    
    SanPham getOne(String ma);
}
