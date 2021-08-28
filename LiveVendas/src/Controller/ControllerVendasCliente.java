/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.DAOVendasCliente;
import Model.ModelVendasCliente;
import java.util.ArrayList;

/**
 *
 * @author Live Digital Center
 */
public class ControllerVendasCliente {

    private DAOVendasCliente daoVendasCliente = new DAOVendasCliente();
    
    public ArrayList<ModelVendasCliente> getListaVendasClienteController() {
       return this.daoVendasCliente.getListaVendasClienteDAO();
    }
    public ArrayList<ModelVendasCliente> getListaPedidoVendasClienteController() {
       return this.daoVendasCliente.getListaPedidoVendasClienteDAO();
    }
    
}
