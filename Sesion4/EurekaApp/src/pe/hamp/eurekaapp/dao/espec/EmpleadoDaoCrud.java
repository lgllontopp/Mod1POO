package pe.hamp.eurekaapp.dao.espec;

import pe.hamp.eurekaapp.domain.EmpleadoBean;

/**
 *
 * @author Upao
 */
public interface EmpleadoDaoCrud extends AbstractCrud<EmpleadoBean>{
    EmpleadoBean validar(String usuario,String clave);
}
