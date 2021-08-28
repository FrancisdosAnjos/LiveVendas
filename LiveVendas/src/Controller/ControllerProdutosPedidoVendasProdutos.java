/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;



import Dao.DAOProdutosPedidoVendasProdutos;
import Model.ModelProdutosPedidoVendasProdutos;
import java.util.ArrayList;

/**
 *
 * @author Live Digital Center
 */
public class ControllerProdutosPedidoVendasProdutos {
    
    private DAOProdutosPedidoVendasProdutos daoProdutosPedidoVendasProdutos = new DAOProdutosPedidoVendasProdutos();
    
    public ArrayList<ModelProdutosPedidoVendasProdutos> getListaProdutosPedidoVendasProdutosController(int pCodigoVenda){
        return this.daoProdutosPedidoVendasProdutos.getListaProdutosPedidoVendasProdutos(pCodigoVenda);
    }
    
}
