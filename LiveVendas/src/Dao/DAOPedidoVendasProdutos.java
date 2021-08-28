/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Conexoes.ConexaoMySql;
import Model.ModelPedidoVendasProdutos;

import java.util.ArrayList;

/**
 *
 * @author Live Digital
 */
public class DAOPedidoVendasProdutos extends ConexaoMySql {

    /**
     * grava VendasProdutos
     *
     * @param pModelPedidoVendasProdutos return int
     */
    public int salvarVendasProdutosDAO(ModelPedidoVendasProdutos pModelPedidoVendasProdutos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_pedido_vendas_produtos ("
                    + "fk_produto,"
                    + "fk_pedido_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                    + ") VALUES ("
                    + "'" + pModelPedidoVendasProdutos.getProduto() + "',"
                    + "'" + pModelPedidoVendasProdutos.getVendas() + "',"
                    + "'" + pModelPedidoVendasProdutos.getVenProValor() + "',"
                    + "'" + pModelPedidoVendasProdutos.getVenProQuantidade() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera VendasProdutos
     *
     * @param pIdVendaProduto return ModelPedidoVendasProdutos
     */
    public ModelPedidoVendasProdutos getVendasProdutosDAO(int pIdVendaProduto) {
        ModelPedidoVendasProdutos modelVendasProdutos = new ModelPedidoVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_pe_venda_produto,"
                    + "fk_produto,"
                    + "fk_pedido_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                    + " FROM"
                    + " tbl_pedido_vendas_produtos"
                    + " WHERE"
                    + " pk_id_pe_venda_produto = '" + pIdVendaProduto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(3));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendasProdutos;
    }

    /**
     * recupera uma lista de VendasProdutos return ArrayList
     */
    public ArrayList<ModelPedidoVendasProdutos> getListaVendasProdutosDAO() {
        ArrayList<ModelPedidoVendasProdutos> listamodelVendasProdutos = new ArrayList();
        ModelPedidoVendasProdutos modelVendasProdutos = new ModelPedidoVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_id_pe_venda_produto,"
                    + "fk_produto,"
                    + "fk_pedido_vendas,"
                    + "ven_pro_valor,"
                    + "ven_pro_quantidade"
                    + " FROM"
                    + " tbl_pedido_vendas_produtos"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos = new ModelPedidoVendasProdutos();
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(3));
                modelVendasProdutos.setVenProValor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVenProQuantidade(this.getResultSet().getInt(5));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendasProdutos;
    }

    /**
     * atualiza VendasProdutos
     *
     * @param pModelPedidoVendasProdutos return boolean
     */
    public boolean atualizarVendasProdutosDAO(ModelPedidoVendasProdutos pModelPedidoVendasProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_pedido_vendas_produtos SET "
                    + "pk_id_pe_venda_produto = '" + pModelPedidoVendasProdutos.getIdVendaProduto() + "',"
                    + "fk_produto = '" + pModelPedidoVendasProdutos.getProduto() + "',"
                    + "fk_pedido_vendas = '" + pModelPedidoVendasProdutos.getVendas() + "',"
                    + "ven_pro_valor = '" + pModelPedidoVendasProdutos.getVenProValor() + "',"
                    + "ven_pro_quantidade = '" + pModelPedidoVendasProdutos.getVenProQuantidade() + "'"
                    + " WHERE "
                    + "pk_id_pe_venda_produto = '" + pModelPedidoVendasProdutos.getIdVendaProduto() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui VendasProdutos
     *
     * @param pIdVendaProduto return boolean
     */
    public boolean excluirVendasProdutosDAO(int pIdVendaProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_pedido_vendas_produtos "
                    + " WHERE "
                    + "	fk_pedido_vendas = '" + pIdVendaProduto + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     *
     * @param plistaModelPedidoVendasProdutos
     * @return
     */
    public boolean salvarVendasProdutosDAO(ArrayList<ModelPedidoVendasProdutos> plistaModelPedidoVendasProdutos) {
        try {
            this.conectar();
            int cont = plistaModelPedidoVendasProdutos.size();
            for (int i = 0; i < cont; i++) {

                this.insertSQL(
                        "INSERT INTO tbl_pedido_vendas_produtos ("
                        + "fk_produto,"
                        + "fk_pedido_vendas,"
                        + "ven_pro_valor,"
                        + "ven_pro_quantidade"
                        + ") VALUES ("
                        + "'" + plistaModelPedidoVendasProdutos.get(i).getProduto() + "',"
                        + "'" + plistaModelPedidoVendasProdutos.get(i).getVendas() + "',"
                        + "'" + plistaModelPedidoVendasProdutos.get(i).getVenProValor() + "',"
                        + "'" + plistaModelPedidoVendasProdutos.get(i).getVenProQuantidade() + "'"
                        + ");"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
