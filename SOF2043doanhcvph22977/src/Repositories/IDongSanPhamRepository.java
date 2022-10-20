package Repositories;

import DomainModels.DongSanPham;
import DomainModels.SanPham;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface IDongSanPhamRepository {

    List<DongSanPham> getAll();

    boolean insert(DongSanPham dsp);

    boolean update(String id, DongSanPham dsp);

    boolean delete(String id);

    DongSanPham getOne(String ma);

}
