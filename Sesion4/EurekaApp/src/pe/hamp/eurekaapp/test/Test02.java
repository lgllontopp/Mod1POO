/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.hamp.eurekaapp.test;

import pe.hamp.eurekaapp.dao.espec.EmpleadoDaoCrud;
import pe.hamp.eurekaapp.dao.impl.EmpleadoDaoImpl;
import pe.hamp.eurekaapp.domain.EmpleadoBean;

/**
 *
 * @author luigu
 */
public class Test02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmpleadoBean bean = new EmpleadoBean();
        
        bean.setPaterno("Llontop");
        bean.setMaterno("Peña");
        bean.setNombre("Alfonso");
        bean.setCiudad("Trujillo");
        bean.setDireccion("Trupal K-3");
        bean.setUsuario("alfonso");
        bean.setClave("alfonso");
        
        EmpleadoDaoCrud empleadoDao = new EmpleadoDaoImpl();
        empleadoDao.insertar(bean);
        
        System.out.println("TODO OK. codigo: "+bean.getCodigo());
        
        bean = empleadoDao.traerPorCodigo("0009");
        if(bean == null)
            System.out.println("NO EXISTE");
        else
            System.out.println("El Cliente es: ");
    
    }
    
}
