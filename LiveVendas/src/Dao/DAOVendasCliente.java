/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexoes.ConexaoMySql;
import Model.ModelCliente;
import Model.ModelPedidoVenda;
import Model.ModelVendas;
import Model.ModelVendasCliente;
import java.util.ArrayList;


/**
 *
 * @author Live Digital Center
 */
public class DAOVendasCliente extends ConexaoMySql {

    /**
     * recupera uma lista de Vendas return ArrayList
     */
    public ArrayList<ModelVendasCliente> getListaVendasClienteDAO() {
        ArrayList<ModelVendasCliente> listamodelVendasCliente = new ArrayList();
        ModelVendasCliente modelVendasCliente = new ModelVendasCliente();
        ModelVendas modelVendas = new ModelVendas();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tbl_pedido_vendas.pk_idvendas,"
                    + "tbl_pedido_vendas.fk_cliente,"
                    + "tbl_pedido_vendas.datavenda,"
                    + "tbl_pedido_vendas.valorliquido,"
                    + "tbl_pedido_vendas.valorbruto,"
                    + "tbl_pedido_vendas.desconto,"
                    + "tbl_pedido_vendas.n_pedido_venda,"
                    + "	tbl_cliente.pk_idcliente,"
                    + "	tbl_cliente.nome,"
                    + "	tbl_cliente.endereco,"
                    + "	tbl_cliente.bairro,"
                    + "	tbl_cliente.cidade,"
                    + "	tbl_cliente.provincia,"
                    + "	tbl_cliente.telefone,"
                    + "	tbl_cliente.email"
                    + " FROM"
                    + " tbl_pedido_vendas INNER JOIN tbl_cliente "
                    + "ON tbl_cliente.pk_idcliente = tbl_pedido_vendas.fk_cliente;"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasCliente = new ModelVendasCliente();
                modelVendas = new ModelVendas();
                modelCliente = new ModelCliente();

                //setando as os dados da venda
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
                modelVendas.setVenFormaPagamento(this.getResultSet().getString(7));

                //setando os dados do cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(8));
                modelCliente.setCliNome(this.getResultSet().getString(9));
                modelCliente.setCliEndereco(this.getResultSet().getString(10));
                modelCliente.setCliBairro(this.getResultSet().getString(11));
                modelCliente.setCliCidade(this.getResultSet().getString(12));
                modelCliente.setCliProvincia(this.getResultSet().getString(13));
                modelCliente.setCliTelefone(this.getResultSet().getString(14));
                modelCliente.setCliEmail(this.getResultSet().getString(15));

                modelVendasCliente.setModelVendas(modelVendas);
                modelVendasCliente.setModelClientes(modelCliente);

                listamodelVendasCliente.add(modelVendasCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendasCliente;
    }

     /**
     * recupera uma lista de Vendas return ArrayList
     */
    public ArrayList<ModelVendasCliente> getListaPedidoVendasClienteDAO() {
        ArrayList<ModelVendasCliente> listamodelVendasCliente = new ArrayList();
        ModelVendasCliente modelVendasCliente = new ModelVendasCliente();
        ModelPedidoVenda modelPedidoVendas = new ModelPedidoVenda();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "tbl_pedido_vendas.pk_idvendas,"
                    + "tbl_pedido_vendas.fk_cliente,"
                    + "tbl_pedido_vendas.datavenda,"
                    + "tbl_pedido_vendas.valorliquido,"
                    + "tbl_pedido_vendas.valorbruto,"
                    + "tbl_pedido_vendas.desconto,"
                    + "tbl_pedido_vendas.n_pedido_venda,"
                    + "	tbl_cliente.pk_idcliente,"
                    + "	tbl_cliente.nome,"
                    + "	tbl_cliente.endereco,"
                    + "	tbl_cliente.bairro,"
                    + "	tbl_cliente.cidade,"
                    + "	tbl_cliente.provincia,"
                    + "	tbl_cliente.telefone,"
                    + "	tbl_cliente.email"
                    + " FROM"
                    + " tbl_pedido_vendas INNER JOIN tbl_cliente "
                    + "ON tbl_cliente.pk_idcliente = tbl_pedido_vendas.fk_cliente;"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasCliente = new ModelVendasCliente();
                modelPedidoVendas = new ModelPedidoVenda();
                modelCliente = new ModelCliente();

                //setando as os dados da venda
                modelPedidoVendas.setIdvendas(this.getResultSet().getInt(1));
                modelPedidoVendas.setFk_cliente(this.getResultSet().getInt(2));
                modelPedidoVendas.setPvDatavenda(this.getResultSet().getDate(3));
                modelPedidoVendas.setPvValorliquido(this.getResultSet().getDouble(4));
                modelPedidoVendas.setPvValorbruto(this.getResultSet().getDouble(5));
                modelPedidoVendas.setPvDesconto(this.getResultSet().getDouble(6));
                modelPedidoVendas.setPvN_pedido_venda(this.getResultSet().getString(7));

                //setando os dados do cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(8));
                modelCliente.setCliNome(this.getResultSet().getString(9));
                modelCliente.setCliEndereco(this.getResultSet().getString(10));
                modelCliente.setCliBairro(this.getResultSet().getString(11));
                modelCliente.setCliCidade(this.getResultSet().getString(12));
                modelCliente.setCliProvincia(this.getResultSet().getString(13));
                modelCliente.setCliTelefone(this.getResultSet().getString(14));
                modelCliente.setCliEmail(this.getResultSet().getString(15));

                modelVendasCliente.setModelPedidoVendas(modelPedidoVendas);
                modelVendasCliente.setModelClientes(modelCliente);

                listamodelVendasCliente.add(modelVendasCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendasCliente;
    }

    
}
