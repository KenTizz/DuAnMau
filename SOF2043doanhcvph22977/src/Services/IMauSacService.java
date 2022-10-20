package Services;

import DomainModels.MauSac;
import ViewModels.QLMauSac;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface IMauSacService {

    List<QLMauSac> getListMauSac();

    String insert(QLMauSac qlms);

    String update(String id, QLMauSac qlms);

    String delete(String id);

    MauSac getOne(String ma);
}
