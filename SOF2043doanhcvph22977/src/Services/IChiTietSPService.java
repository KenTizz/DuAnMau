package Services;

import DomainModels.ChiTietSP;
import ViewModels.QLChiTietSP;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface IChiTietSPService {

    List<QLChiTietSP> getListChiTietSP();

    String insert(QLChiTietSP ctsp);

    String update(String id, QLChiTietSP ctsp);

    String delete(String id);
}
