package Repositories;

import DomainModels.NhanVien;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface INhanVienRepository {

    List<NhanVien> getAll();

    boolean insert(NhanVien nv);

    boolean update(String id, NhanVien nv);

    boolean delete(String id);
    
    NhanVien getOne(String ma);
}
