package Repositories;

import DomainModels.SanPham;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface ISanPhamRepository {

    List<SanPham> getAll();

    boolean insert(SanPham sp);

    boolean update(String id, SanPham sp);

    boolean delete(String id);

    SanPham getOne(String ma);

}
