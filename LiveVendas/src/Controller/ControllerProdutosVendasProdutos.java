/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.DAOProdutosVendasProdutos;
import Model.ModelProdutosVendasProdutos;
import java.util.ArrayList;

/**
 *
 * @author Live Digital Center
 */
public class ControllerProdutosVendasProdutos {
    
    private DAOProdutosVendasProdutos daoProdutosVendasProdutos = new DAOProdutosVendasProdutos();
    
    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosController(int pCodigoVenda){
        return this.daoProdutosVendasProdutos.getListaProdutosVendasProdutosDao(pCodigoVenda);
    }
    
}
