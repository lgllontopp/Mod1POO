package pe.hamp.eurekaapp.service;

import java.util.List;
import pe.hamp.eurekaapp.dao.espec.ClienteDaoCrud;
import pe.hamp.eurekaapp.dao.impl.ClienteDaoImpl;
import pe.hamp.eurekaapp.domain.ClienteBean;

/**
 *
 * @author Upao
 */
public class ClienteService {
   
    private ClienteDaoCrud clienteDao;
    
    //Por Constructor ==> Composicion
    public ClienteService(){
        clienteDao=new ClienteDaoImpl();
    }
    
    public List<ClienteBean> traerCliente(ClienteBean bean){
        return clienteDao.taerLista(bean);
    }
    
    public void insertar(ClienteBean bean){
        clienteDao.insertar(bean);
    }
    
}
