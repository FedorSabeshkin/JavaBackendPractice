package main.dao;

import java.util.List;

public interface Dao<T> {
    void save(T t);

    void delete(T t);

    List<T> getAll();

    T get(int id);
}
