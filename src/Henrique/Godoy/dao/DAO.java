package Henrique.Godoy.dao;

import java.util.List;

/** Interface que contem os métodos de criar, fazer update, deletar
 * e exibir, referentes a dados do banco de dados.
 * @param <T> parâmetro genérico
 */
public interface DAO<T> {
List<T> getAll();
void update(T t);
void create(T t);
void delete(T t);
}
