/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexoes.ConexaoMySql;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Live Digital Center
 */
public class DaoValidacao extends ConexaoMySql {

    int valida;

    public void validaDao(String senha) {
        this.conectar();
        this.executarSQL("select * from tb_vencimento");
        try {
            this.getResultSet().last();
            valida = Integer.parseInt(this.getResultSet().getString("data_vencimento"));
            int operacao = (valida + 132) / 4;
            int senhaValidacao = Integer.parseInt(senha);
            if (operacao == senhaValidacao) {
                int dia, mes, ano;
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date hoje = new Date();
                String data = df.format(hoje);
                char[] senhachar = data.toCharArray();
                String AcertaMes, AcertaDia, ProximaSenha;
                dia = Integer.parseInt("" + senhachar[0] + senhachar[1]);
                mes = Integer.parseInt("" + senhachar[3] + senhachar[4]);
                ano = Integer.parseInt("" + senhachar[6] + senhachar[7] + senhachar[8] + senhachar[9]);
                //JOptionPane.showMessageDialog(null, ""+ano);
                if (mes < 12) {
                    mes++;
                    if (mes < 10) {
                        AcertaMes = "0" + mes;
                    } else {
                        AcertaMes = "" + mes;
                    }
                } else {
                    mes = 1;
                    ano++;
                    AcertaMes = "0" + mes;
                }
                if (dia < 10) {
                    AcertaDia = "0" + dia;
                } else {
                    AcertaDia = "" + dia;
                }
                ProximaSenha = AcertaDia+AcertaMes+ano;
                PreparedStatement pst = this.conectar().prepareStatement("insert into tb_vencimento(data_vencimento)value(?)");
                pst.setString(1, ProximaSenha);
                pst.execute();
//                JOptionPane.showMessageDialog(null, ""+ProximaSenha);
            } else {
                JOptionPane.showMessageDialog(null, "Senha Errada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao vslidar o sistema\nErro: " + ex);
        }
        this.fecharConexao();
    }
}
