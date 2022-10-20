package Repositories;

import DomainModels.ChiTietSP;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface IChiTietSPRepository {

    List<ChiTietSP> getAll();

    boolean insert(ChiTietSP ctsp);

    boolean update(String id, ChiTietSP ctsp);

    boolean delete(String id);
}
