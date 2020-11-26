package Henrique.Godoy.dao;

import java.util.List;

public interface DAO<T> {
List<T> getAll();
void update(T t);
void create(T t);
void delete(T t);
}
