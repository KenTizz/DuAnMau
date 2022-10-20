package Repositories;

import DomainModels.CuaHang;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface ICuaHangRepository {

    List<CuaHang> getAll();

    boolean insert(CuaHang ch);

    boolean update(String id, CuaHang ch);

    boolean delete(String id);
    
    CuaHang getOne(String ma);
}
