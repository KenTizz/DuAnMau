package Services;

import DomainModels.CuaHang;
import ViewModels.QLCuaHang;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface ICuaHangService {

    List<QLCuaHang> getAllCuaHang();

    String insert(QLCuaHang qlch);

    String update(String id, QLCuaHang qlch);

    String delete(String id);
    
    CuaHang getOne(String ma);
}
