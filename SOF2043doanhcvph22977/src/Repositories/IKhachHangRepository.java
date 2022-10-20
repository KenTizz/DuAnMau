package Repositories;

import DomainModels.KhachHang;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface IKhachHangRepository {
    List<KhachHang> getAll();
    
    boolean insert(KhachHang kh);
    
    boolean update(String id, KhachHang kh);
    
    boolean delete(String id);
    
    KhachHang getOne(String ma);
}
