package pe.hamp.eurekaapp.dao.espec;

import java.util.List;

/**
 *
 * @author Upao
 * @param <T>
 */
public interface AbstractCrud<T> {

    T traerPorCodigo(String codigo);

    List<T> taerLista(T bean);

    void insertar(T bean);

    void actualizar(T bean);

    void eliminar(String codigo);
}
