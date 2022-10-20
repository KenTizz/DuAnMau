package Repositories;

import DomainModels.MauSac;
import java.util.List;

/**
 *
 * @author cvdoa
 */
public interface IMauSacRepository {

    List<MauSac> getAll();

    boolean insert(MauSac ms);

    boolean update(String id, MauSac ms);

    boolean delete(String id);

    MauSac getOne(String ma);

}
