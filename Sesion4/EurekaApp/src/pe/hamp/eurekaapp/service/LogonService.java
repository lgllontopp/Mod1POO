package pe.hamp.eurekaapp.service;

import pe.hamp.eurekaapp.dao.espec.EmpleadoDaoCrud;
import pe.hamp.eurekaapp.dao.impl.EmpleadoDaoImpl;
import pe.hamp.eurekaapp.domain.EmpleadoBean;

/**
 *
 * @author Upao
 */
public class LogonService {

    public EmpleadoBean validar(String usuario, String clave) {

        if (usuario == null || usuario.isEmpty()) {
            throw new RuntimeException("Error, faltan datos");
        }
        if (clave == null || clave.isEmpty()) {
            throw new RuntimeException("Error, faltan datos");
        }
        EmpleadoDaoCrud empleadoDao=new EmpleadoDaoImpl();
        EmpleadoBean bean=empleadoDao.validar(usuario, clave);
        if(bean==null){
            throw new RuntimeException("Error, datos incorrectos");
        }
        return bean;
    }
}
