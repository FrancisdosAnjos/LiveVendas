/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Live Digital Center
 */
public class ModelVendasCliente {
    private ModelVendas modelVendas;
    private ModelPedidoVenda modelPedidoVendas;
    private ModelCliente modelClientes;
    private ArrayList<ModelVendasCliente> listaModelVendasClientes;

    /**
     * @return the modelVendas
     */
    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    /**
     * @param modelVendas the modelVendas to set
     */
    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    /**
     * @return the modelClientes
     */
    public ModelCliente getModelClientes() {
        return modelClientes;
    }

    /**
     * @param modelClientes the modelClientes to set
     */
    public void setModelClientes(ModelCliente modelClientes) {
        this.modelClientes = modelClientes;
    }

    /**
     * @return the listaModelVendasClientes
     */
    public ArrayList<ModelVendasCliente> getListaModelVendasClientes() {
        return listaModelVendasClientes;
    }

    /**
     * @param listaModelVendasClientes the listaModelVendasClientes to set
     */
    public void setListaModelVendasClientes(ArrayList<ModelVendasCliente> listaModelVendasClientes) {
        this.listaModelVendasClientes = listaModelVendasClientes;
    }

    /**
     * @return the modelPedidoVendas
     */
    public ModelPedidoVenda getModelPedidoVendas() {
        return modelPedidoVendas;
    }

    /**
     * @param modelPedidoVendas the modelPedidoVendas to set
     */
    public void setModelPedidoVendas(ModelPedidoVenda modelPedidoVendas) {
        this.modelPedidoVendas = modelPedidoVendas;
    }
    
}
