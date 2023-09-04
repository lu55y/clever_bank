package org.example.repository;

import java.util.List;

public interface BaseDAO <T> {
    void create (T t);
    T find (int id);
    List<T> findAll();
    void update(T t);
    void delete(int id);
}
