/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Conexoes.ConexaoMySql;
import Model.ModelPedidoVendasProdutos;
import Model.ModelProdutos;
import Model.ModelProdutosPedidoVendasProdutos;
import java.util.ArrayList;

/**
 *
 * @author Live Digital Center
 */
public class DAOProdutosPedidoVendasProdutos extends ConexaoMySql{
    
     public ArrayList<ModelProdutosPedidoVendasProdutos> getListaProdutosPedidoVendasProdutos(int pCodigoVenda){
         ArrayList<ModelProdutosPedidoVendasProdutos> listaProdutosPedidoVendasProdutos = new ArrayList<>();
         
         ModelProdutosPedidoVendasProdutos modelProdutosPedidoVendasProdutos = new ModelProdutosPedidoVendasProdutos();
         ModelProdutos modelProdutos = new ModelProdutos();
         ModelPedidoVendasProdutos modelPedidoVendasProdutos = new ModelPedidoVendasProdutos();
         
          try {
            this.conectar();
            this.executarSQL("SELECT "
            + " tbl_produto.pk_idproduto,"
            + " tbl_produto.cod_produto,"
            + " tbl_produto.nome,"
            + " tbl_produto.valor,"
            + " tbl_produto.estoque,"
            + " tbl_produto.fornecedor,"
            + " tbl_pedido_vendas_produtos.pk_id_pe_venda_produto,"
            + " tbl_pedido_vendas_produtos.fk_produto,"
            + " tbl_pedido_vendas_produtos.fk_pedido_vendas,"
            + " tbl_pedido_vendas_produtos.ven_pro_valor,"
            + " tbl_pedido_vendas_produtos.ven_pro_quantidade"
            + " FROM tbl_pedido_vendas_produtos "
            + " INNER JOIN tbl_produto ON tbl_produto.pk_idproduto = " 
            + " tbl_pedido_vendas_produtos.fk_produto "
            + " WHERE tbl_pedido_vendas_produtos.fk_pedido_vendas = '"+pCodigoVenda+"';");

            while (this.getResultSet().next()) {
                modelProdutosPedidoVendasProdutos = new ModelProdutosPedidoVendasProdutos();
                modelProdutos = new ModelProdutos();
                modelPedidoVendasProdutos = new ModelPedidoVendasProdutos();

                modelProdutos.setIdProduto(this.getResultSet().getInt(1));
                modelProdutos.setCodProduto(this.getResultSet().getString(2));
                modelProdutos.setProNome(this.getResultSet().getString(3));
                modelProdutos.setProValor(this.getResultSet().getDouble(4));
                modelProdutos.setProEstoque(this.getResultSet().getInt(5));
                modelProdutos.setProFornecedor(this.getResultSet().getString(6));

                modelPedidoVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(7));
                modelPedidoVendasProdutos.setProduto(this.getResultSet().getInt(8));
                modelPedidoVendasProdutos.setVendas(this.getResultSet().getInt(9));
                modelPedidoVendasProdutos.setVenProValor(this.getResultSet().getDouble(10));
                modelPedidoVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(11));

                modelProdutosPedidoVendasProdutos.setModelProdutos(modelProdutos);
                modelProdutosPedidoVendasProdutos.setModelPedidoVendasProdutos(modelPedidoVendasProdutos);
                

                listaProdutosPedidoVendasProdutos.add(modelProdutosPedidoVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaProdutosPedidoVendasProdutos;
    }

     }

