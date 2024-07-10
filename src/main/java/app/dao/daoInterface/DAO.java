package app.dao.daoInterface;

import java.util.List;

public interface DAO<T> {
    T save(T t);
    boolean delete(T t);
    void deleteAll(List<T> entities);
    void saveAll(List<T> entities);
    List<T> findAll();
    boolean deleteById(long id);
    T getOne(long id);
}
