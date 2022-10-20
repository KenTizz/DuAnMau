package Services;

import ViewModels.QLKhachHang;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface IKhachHangService {

    List<QLKhachHang> getListKhach();

    String insert(QLKhachHang qlkh);

    String update(String id, QLKhachHang qlkh);

    String delete(String id);
    
    QLKhachHang getOne(String ma);
}
