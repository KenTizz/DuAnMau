package Services;

import ViewModels.QLNhanVien;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface INhanVienService {

    List<QLNhanVien> getListNhanVien();

    String insert(QLNhanVien qlnv);

    String update(String id, QLNhanVien qlnv);

    String delete(String id);
    
    QLNhanVien getOne(String ma);

}
