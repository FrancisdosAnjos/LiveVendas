/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;




import Dao.DAOPedidoVendasProdutos;
import Model.ModelPedidoVendasProdutos;
import java.util.ArrayList;

/**
*
* @author Live Digital
*/
public class ControllerPedidoVendasProdutos {

    private DAOPedidoVendasProdutos daoVendasProdutos = new DAOPedidoVendasProdutos();

    /**
    * grava VendasProdutos
    * @param pModelPedidoVendasProdutos
    * return int
    */
    public int salvarVendasProdutosController(ModelPedidoVendasProdutos pModelPedidoVendasProdutos){
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelPedidoVendasProdutos);
    }

    /**
    * recupera VendasProdutos
    * @param pIdVendaProduto
    * return ModelPedidoVendasProdutos
    */
    public ModelPedidoVendasProdutos getVendasProdutosController(int pIdVendaProduto){
        return this.daoVendasProdutos.getVendasProdutosDAO(pIdVendaProduto);
    }

    /**
    * recupera uma lista deVendasProdutos
    * @param pIdVendaProduto
    * return ArrayList
    */
    public ArrayList<ModelPedidoVendasProdutos> getListaVendasProdutosController(){
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    /**
    * atualiza VendasProdutos
    * @param pModelPedidoVendasProdutos
    * return boolean
    */
    public boolean atualizarVendasProdutosController(ModelPedidoVendasProdutos pModelPedidoVendasProdutos){
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelPedidoVendasProdutos);
    }

    /**
    * exclui VendasProdutos
    * @param pIdVendaProduto
    * return boolean
    */
    public boolean excluirVendasProdutosController(int pIdVendaProduto){
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pIdVendaProduto);
    }

    public boolean salvarVendasProdutosController(ArrayList<ModelPedidoVendasProdutos> plistaModelPedidoVendasProdutos) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(plistaModelPedidoVendasProdutos);
    }
}