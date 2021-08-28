/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexoes.ConexaoMySql;
import Model.ModelDataVencimento;

/**
 *
 * @author Live Digital Center
 */
public class DaoDataVencimento extends ConexaoMySql{
        public int salvarDataVencimentoDao(ModelDataVencimento pModelDataVencimento) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tb_vencimento (data_vencimento) VALUES ("
                    + "'" + pModelDataVencimento.getData()+ "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }
}
