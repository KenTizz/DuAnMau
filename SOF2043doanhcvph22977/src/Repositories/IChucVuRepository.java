package Repositories;

import DomainModels.ChucVu;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface IChucVuRepository {

    List<ChucVu> getAll();

    boolean insert(ChucVu cv);

    boolean update(String id, ChucVu cv);

    boolean delete(String id);

    ChucVu getOne(String ma);

    ChucVu getBuyId(String id);

    ChucVu getObjectTen(String ten);
}
