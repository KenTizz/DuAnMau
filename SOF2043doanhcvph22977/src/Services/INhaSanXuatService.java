package Services;

import DomainModels.NhaSanXuat;
import ViewModels.QLNhaSanXuat;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface INhaSanXuatService {

    List<QLNhaSanXuat> getListNSX();

    String insert(QLNhaSanXuat qlnsx);

    String update(String id, QLNhaSanXuat qlnsx);

    String delete(String id);
    
    NhaSanXuat getOne(String ma);
}
