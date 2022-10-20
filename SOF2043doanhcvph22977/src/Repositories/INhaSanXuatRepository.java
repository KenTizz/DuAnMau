package Repositories;

import DomainModels.NhaSanXuat;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface INhaSanXuatRepository {

    List<NhaSanXuat> getAll();

    boolean insert(NhaSanXuat nsx);

    boolean update(String id, NhaSanXuat nsx);

    boolean delete(String id);

    NhaSanXuat getOne(String ma);

}
