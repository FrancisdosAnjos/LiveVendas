/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexoes.ConexaoMySql;
import Model.ModelCliente;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Live Digital
 */
public class DAOCliente extends ConexaoMySql {

    /**
     * grava Cliente
     *
     * @param pModelCliente return int
     */
    public int salvarClienteDAO(ModelCliente pModelCliente) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_cliente ("
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "provincia,"
                    + "telefone,"
                    + "email,"
                    + "nif"
                    + ") VALUES ("
                    + "'" + pModelCliente.getCliNome() + "',"
                    + "'" + pModelCliente.getCliEndereco() + "',"
                    + "'" + pModelCliente.getCliBairro() + "',"
                    + "'" + pModelCliente.getCliCidade() + "',"
                    + "'" + pModelCliente.getCliProvincia() + "',"
                    + "'" + pModelCliente.getCliTelefone() + "',"
                    + "'" + pModelCliente.getCliEmail() + "',"
                    + "'" + pModelCliente.getCliNif() + "'"
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
     * recupera Cliente
     *
     * @param pIdCliente return ModelCliente
     */
    public ModelCliente getClienteDAO(int pIdCliente) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_idcliente,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "provincia,"
                    + "telefone,"
                    + "email,"
                    + "nif"
                    + " FROM"
                    + " tbl_cliente"
                    + " WHERE"
                    + " pk_idcliente = '" + pIdCliente + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliProvincia(this.getResultSet().getString(6));
                modelCliente.setCliTelefone(this.getResultSet().getString(7));
                modelCliente.setCliEmail(this.getResultSet().getString(8));
                modelCliente.setCliNif(this.getResultSet().getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
     * recupera Cliente
     *
     * @param pNomeCliente return ModelCliente
     */
    public ModelCliente getClienteDAO(String pNomeCliente) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_idcliente,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "provincia,"
                    + "telefone,"
                    + "email,"
                    + "nif"
                    + " FROM"
                    + " tbl_cliente"
                    + " WHERE"
                    + " nome = '" + pNomeCliente + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliProvincia(this.getResultSet().getString(6));
                modelCliente.setCliTelefone(this.getResultSet().getString(7));
                modelCliente.setCliEmail(this.getResultSet().getString(8));
                modelCliente.setCliNif(this.getResultSet().getString(9));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
     * recupera uma lista de Cliente return ArrayList
     */
    public ArrayList<ModelCliente> getListaClienteDAO() {
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_idcliente,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cidade,"
                    + "provincia,"
                    + "telefone,"
                    + "email,"
                    + "nif"
                    + " FROM"
                    + " tbl_cliente"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCliente = new ModelCliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setCliNome(this.getResultSet().getString(2));
                modelCliente.setCliEndereco(this.getResultSet().getString(3));
                modelCliente.setCliBairro(this.getResultSet().getString(4));
                modelCliente.setCliCidade(this.getResultSet().getString(5));
                modelCliente.setCliProvincia(this.getResultSet().getString(6));
                modelCliente.setCliTelefone(this.getResultSet().getString(7));
                modelCliente.setCliEmail(this.getResultSet().getString(8));
                modelCliente.setCliNif(this.getResultSet().getString(9));
                listamodelCliente.add(modelCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
     * atualiza Cliente
     *
     * @param pModelCliente return boolean
     */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_cliente SET "
                    + "pk_idcliente = '" + pModelCliente.getIdCliente() + "',"
                    + "nome = '" + pModelCliente.getCliNome() + "',"
                    + "endereco = '" + pModelCliente.getCliEndereco() + "',"
                    + "bairro = '" + pModelCliente.getCliBairro() + "',"
                    + "cidade = '" + pModelCliente.getCliCidade() + "',"
                    + "provincia = '" + pModelCliente.getCliProvincia() + "',"
                    + "telefone = '" + pModelCliente.getCliTelefone() + "',"
                    + "email = '" + pModelCliente.getCliEmail() + "',"
                    + "nif = '" + pModelCliente.getCliNif() + "'"
                    + " WHERE "
                    + "pk_idcliente = '" + pModelCliente.getIdCliente() + "'"
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
     * exclui Cliente
     *
     * @param pIdCliente return boolean
     */
    public boolean excluirClienteDAO(int pIdCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_cliente "
                    + " WHERE "
                    + "pk_idcliente = '" + pIdCliente + "'"
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
     * Gerar Relatório Cliente
     *
     * @param pIdCliente return ModelCliente
     */
    public boolean gerarRelatorioClienteDAO() {

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT"
                    + "     tbl_cliente.pk_idcliente,"
                    + "     tbl_cliente.nome,"
                    + "     tbl_cliente.endereco ,"
                    + "     tbl_cliente.bairro ,"
                    + "     tbl_cliente.cidade ,"
                    + "     tbl_cliente.provincia ,"
                    + "     tbl_cliente.telefone ,"
                    + "     tbl_cliente.email ,"
                    + "     tbl_cliente.nif"
                    + "FROM"
                    + "tbl_cliente;"
            );

            JRResultSetDataSource jrRs = new JRResultSetDataSource(getResultSet());

            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("Relatorios/relCliente.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRs);
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\RelHpVendas\\rel\\relCliente.pdf");

            File file = new File("C:\\RelHpVendas\\rel\\relCliente.pdf");
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
