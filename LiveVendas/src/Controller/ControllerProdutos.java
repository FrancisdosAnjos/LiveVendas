/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.DAOProdutos;
import Model.ModelProdutos;
import java.util.ArrayList;

/**
 *
 * @author Live Digital Center
 */
public class ControllerProdutos {
    
    private DAOProdutos daoProdutos = new DAOProdutos();
    
    public int salvarProdutoController(ModelProdutos pModelProdutos){
        
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }
    
    public boolean excluirProdutoController(int pcCodigo){
        return this.daoProdutos.excluirProdutoDAO(pcCodigo);
    }
    
    public boolean alterarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    
    public ModelProdutos retornaProdutoController(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    public ModelProdutos retornaProdutoController(String pNomeProduto){
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }
    
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }

    /**
     * Alterar lista de produtos no banco
     * @param pListaModelProdutos
     * @return 
     */
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> pListaModelProdutos) {
       return this.daoProdutos.alterarEstoqueProdutosDAO(pListaModelProdutos);
    }
}
