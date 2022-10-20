package Services;

import DomainModels.ChucVu;
import ViewModels.QLChucVu;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface IChucVuService {

    List<QLChucVu> getAllChucVu();

    String insert(QLChucVu qlcv);

    String update(String id, QLChucVu qlcv);

    String delete(String id);

    QLChucVu getOne(String ma);

    ChucVu getObjectTen(String ten);
}
