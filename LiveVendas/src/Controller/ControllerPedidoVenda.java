package Controller;


import Dao.DAOPedidoVenda;
import Model.ModelPedidoVenda;
import java.util.ArrayList;

/**
*
* @author Live Digital
*/
public class ControllerPedidoVenda {

    private DAOPedidoVenda daoPedidoVenda = new DAOPedidoVenda();

    /**
    * grava PedidoVenda
    * @param pModelPedidoVenda
    * return int
    */
    public int salvarPedidoVendaController(ModelPedidoVenda pModelPedidoVenda){
        return this.daoPedidoVenda.salvarPedidoVendaDAO(pModelPedidoVenda);
    }

    /**
    * recupera PedidoVenda
    * @param pIdvendas
    * return ModelPedidoVenda
    */
    public ModelPedidoVenda getPedidoVendaController(int pIdvendas){
        return this.daoPedidoVenda.getPedidoVendaDAO(pIdvendas);
    }

    /**
    * recupera uma lista dePedidoVenda
    * @param pIdvendas
    * return ArrayList
    */
    public ArrayList<ModelPedidoVenda> getListaPedidoVendaController(){
        return this.daoPedidoVenda.getListaPedidoVendaDAO();
    }

    /**
    * atualiza PedidoVenda
    * @param pModelPedidoVenda
    * return boolean
    */
    public boolean atualizarPedidoVendaController(ModelPedidoVenda pModelPedidoVenda){
        return this.daoPedidoVenda.atualizarPedidoVendaDAO(pModelPedidoVenda);
    }

    /**
    * exclui PedidoVenda
    * @param pIdvendas
    * return boolean
    */
    public boolean excluirPedidoVendaController(int pIdvendas){
        return this.daoPedidoVenda.excluirPedidoVendaDAO(pIdvendas);
    }
}