package Dao;



import Conexoes.ConexaoMySql;
import Model.ModelPedidoVenda;
import java.util.ArrayList;
/**
*
* @author Live Digital
*/
public class DAOPedidoVenda extends ConexaoMySql {

    /**
    * grava PedidoVenda
    * @param pModelPedidoVenda
    * return int
    */
    public int salvarPedidoVendaDAO(ModelPedidoVenda pModelPedidoVenda){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_pedido_vendas ("
                    + "fk_cliente,"
                    + "datavenda,"
                    + "valorliquido,"
                    + "valorbruto,"
                    + "desconto,"
                    + "n_pedido_venda"
                + ") VALUES ("
                    + "'" + pModelPedidoVenda.getFk_cliente() + "',"
                    + "'" + pModelPedidoVenda.getPvDatavenda() + "',"
                    + "'" + pModelPedidoVenda.getPvValorliquido() + "',"
                    + "'" + pModelPedidoVenda.getPvValorbruto() + "',"
                    + "'" + pModelPedidoVenda.getPvDesconto() + "',"
                    + "'" + pModelPedidoVenda.getPvN_pedido_venda() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera PedidoVenda
    * @param pIdvendas
    * return ModelPedidoVenda
    */
    public ModelPedidoVenda getPedidoVendaDAO(int pIdvendas){
        ModelPedidoVenda modelPedidoVenda = new ModelPedidoVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_idvendas,"
                    + "fk_cliente,"
                    + "datavenda,"
                    + "valorliquido,"
                    + "valorbruto,"
                    + "desconto,"
                    + "n_pedido_venda"
                 + " FROM"
                     + " tbl_pedido_vendas"
                 + " WHERE"
                     + " pk_idvendas = '" + pIdvendas + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelPedidoVenda.setIdvendas(this.getResultSet().getInt(1));
                modelPedidoVenda.setFk_cliente(this.getResultSet().getInt(2));
                modelPedidoVenda.setPvDatavenda(this.getResultSet().getDate(3));
                modelPedidoVenda.setPvValorliquido(this.getResultSet().getDouble(4));
                modelPedidoVenda.setPvValorbruto(this.getResultSet().getDouble(5));
                modelPedidoVenda.setPvDesconto(this.getResultSet().getDouble(6));
                modelPedidoVenda.setPvN_pedido_venda(this.getResultSet().getString(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelPedidoVenda;
    }

    /**
    * recupera uma lista de PedidoVenda
        * return ArrayList
    */
    public ArrayList<ModelPedidoVenda> getListaPedidoVendaDAO(){
        ArrayList<ModelPedidoVenda> listamodelPedidoVenda = new ArrayList();
        ModelPedidoVenda modelPedidoVenda = new ModelPedidoVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_idvendas,"
                    + "fk_cliente,"
                    + "datavenda,"
                    + "valorliquido,"
                    + "valorbruto,"
                    + "desconto,"
                    + "n_pedido_venda"
                 + " FROM"
                     + " tbl_pedido_vendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelPedidoVenda = new ModelPedidoVenda();
                modelPedidoVenda.setIdvendas(this.getResultSet().getInt(1));
                modelPedidoVenda.setFk_cliente(this.getResultSet().getInt(2));
                modelPedidoVenda.setPvDatavenda(this.getResultSet().getDate(3));
                modelPedidoVenda.setPvValorliquido(this.getResultSet().getDouble(4));
                modelPedidoVenda.setPvValorbruto(this.getResultSet().getDouble(5));
                modelPedidoVenda.setPvDesconto(this.getResultSet().getDouble(6));
                modelPedidoVenda.setPvN_pedido_venda(this.getResultSet().getString(7));
                listamodelPedidoVenda.add(modelPedidoVenda);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelPedidoVenda;
    }

    /**
    * atualiza PedidoVenda
    * @param pModelPedidoVenda
    * return boolean
    */
    public boolean atualizarPedidoVendaDAO(ModelPedidoVenda pModelPedidoVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_pedido_vendas SET "
                    + "pk_idvendas = '" + pModelPedidoVenda.getIdvendas() + "',"
                    + "fk_cliente = '" + pModelPedidoVenda.getFk_cliente() + "',"
                    + "datavenda = '" + pModelPedidoVenda.getPvDatavenda() + "',"
                    + "valorliquido = '" + pModelPedidoVenda.getPvValorliquido() + "',"
                    + "valorbruto = '" + pModelPedidoVenda.getPvValorbruto() + "',"
                    + "desconto = '" + pModelPedidoVenda.getPvDesconto() + "',"
                    + "n_pedido_venda = '" + pModelPedidoVenda.getPvN_pedido_venda() + "'"
                + " WHERE "
                    + "pk_idvendas = '" + pModelPedidoVenda.getIdvendas() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui PedidoVenda
    * @param pIdvendas
    * return boolean
    */
    public boolean excluirPedidoVendaDAO(int pIdvendas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_pedido_vendas "
                + " WHERE "
                    + "pk_idvendas = '" + pIdvendas + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}