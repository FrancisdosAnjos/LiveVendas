/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Conexoes.ConexaoMySql;
import Model.ModelProdutos;
import Model.ModelProdutosVendasProdutos;
import Model.ModelVendasProdutos;
import java.util.ArrayList;

/**
 *
 * @author Live Digital Center
 */
public class DAOProdutosVendasProdutos extends ConexaoMySql {

    public ArrayList<ModelProdutosVendasProdutos> getListaProdutosVendasProdutosDao(int pCodigoVenda) {
        ArrayList<ModelProdutosVendasProdutos> listaProdutosVendasProdutoses = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProdutos modelProdutos = new ModelProdutos();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();

        try {
            this.conectar();
            this.executarSQL("SELECT "
            + " tbl_produto.pk_idproduto,"
            + " tbl_produto.cod_produto,"
            + " tbl_produto.nome,"
            + " tbl_produto.valor,"
            + " tbl_produto.estoque,"
            + " tbl_produto.fornecedor,"
            + " tbl_vendas_produtos.pk_id_venda_produto,"
            + " tbl_vendas_produtos.fk_produto,"
            + " tbl_vendas_produtos.fk_vendas,"
            + " tbl_vendas_produtos.ven_pro_valor,"
            + " tbl_vendas_produtos.ven_pro_quantidade"
            + " FROM tbl_vendas_produtos "
            + " INNER JOIN tbl_produto ON tbl_produto.pk_idproduto = " 
            + " tbl_vendas_produtos.fk_produto "
            + " WHERE tbl_vendas_produtos.fk_vendas = '"+pCodigoVenda+"';");

            while (this.getResultSet().next()) {
                modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
                modelProdutos = new ModelProdutos();
                modelVendasProdutos = new ModelVendasProdutos();

                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setCodProduto(this.getResultSet().getString(2));
                modelProdutos.setProNome(this.getResultSet().getString(3));
                modelProdutos.setProValor(this.getResultSet().getDouble(4));
                modelProdutos.setProEstoque(this.getResultSet().getInt(5));
                modelProdutos.setProFornecedor(this.getResultSet().getString(6));

                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(7));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(8));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(9));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(10));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(11));

                modelProdutosVendasProdutos.setModelProdutos(modelProdutos);
                modelProdutosVendasProdutos.setModelVendasProdutos(modelVendasProdutos);

                listaProdutosVendasProdutoses.add(modelProdutosVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaProdutosVendasProdutoses;
    }
}
