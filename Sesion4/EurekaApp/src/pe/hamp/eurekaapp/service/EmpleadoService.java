/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.hamp.eurekaapp.service;

import java.util.List;
import pe.hamp.eurekaapp.dao.espec.EmpleadoDaoCrud;
import pe.hamp.eurekaapp.dao.impl.EmpleadoDaoImpl;
import pe.hamp.eurekaapp.domain.EmpleadoBean;

/**
 *
 * @author luigu
 */
public class EmpleadoService {
    
    private EmpleadoDaoCrud empleadoDao;
    
    public EmpleadoService(){
        empleadoDao = new EmpleadoDaoImpl();
    }
    
    public List<EmpleadoBean> traerEmpleado(EmpleadoBean bean){
        return empleadoDao.taerLista(bean);
    }
    
    public void insertar(EmpleadoBean bean){
        empleadoDao.insertar(bean);
    }
}
