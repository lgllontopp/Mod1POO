package pe.hamp.eurekaapp.controller;

import java.util.List;
import pe.hamp.eurekaapp.domain.ClienteBean;
import pe.hamp.eurekaapp.service.ClienteService;
import pe.hamp.eurekaapp.util.EurekaUtil;

/**
 *
 * @author Upao
 */
public class ClienteController {

    private ClienteService clienteService;

    //Por Constructor ==> Composicion
    public ClienteController() {
        clienteService = new ClienteService();
    }

    public List<ClienteBean> traerCliente(ClienteBean bean) {
        return clienteService.traerCliente(bean);
    }

    public void procesar(String accion, ClienteBean bean) {
        switch(accion){
            case EurekaUtil.CRUD_NUEVO:
                clienteService.insertar(bean);
                break;
            case EurekaUtil.CRUD_EDITAR:
                
                break;
        }
    }
}
