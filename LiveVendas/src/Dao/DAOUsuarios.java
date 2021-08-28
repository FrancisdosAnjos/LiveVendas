/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexoes.ConexaoMySql;
import Model.ModelUsuarios;
import java.util.ArrayList;

/**
 *
 * @author Live Digital
 */
public class DAOUsuarios extends ConexaoMySql {

    /**
     * grava Usuarios
     *
     * @param pModelUsuarios return int
     */
    public int salvarUsuariosDAO(ModelUsuarios pModelUsuarios) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_usuario ("
                    + "pk_idusuario,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha,"
                    + "usu_tipo"
                    + ") VALUES ("
                    + "'" + pModelUsuarios.getIdusuario() + "',"
                    + "'" + pModelUsuarios.getUsuNome() + "',"
                    + "'" + pModelUsuarios.getUsuLogin() + "',"
                    + "'" + pModelUsuarios.getUsuSenha() + "',"
                    + "'" + pModelUsuarios.getUsuTipo() + "'"
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
     * recupera Usuarios
     *
     * @param pIdusuario return ModelUsuarios
     */
    public ModelUsuarios getUsuariosDAO(int pIdusuario) {
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_idusuario,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha,"
                    + "usu_tipo"
                    + " FROM"
                    + " tbl_usuario"
                    + " WHERE"
                    + " pk_idusuario = '" + pIdusuario + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuarios.setIdusuario(this.getResultSet().getInt(1));
                modelUsuarios.setUsuNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuLogin(this.getResultSet().getString(3));
                modelUsuarios.setUsuSenha(this.getResultSet().getString(4));
                modelUsuarios.setUsuTipo(this.getResultSet().getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuarios;
    }

        /**
     * recupera Usuarios
     *
     * @param pLogin return ModelUsuarios
     */
    public ModelUsuarios getUsuariosDAO(String pLogin) {
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_idusuario,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha,"
                    + "usu_tipo"
                    + " FROM"
                    + " tbl_usuario"
                    + " WHERE"
                    + " usu_login = '" + pLogin + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuarios.setIdusuario(this.getResultSet().getInt(1));
                modelUsuarios.setUsuNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuLogin(this.getResultSet().getString(3));
                modelUsuarios.setUsuSenha(this.getResultSet().getString(4));
                modelUsuarios.setUsuTipo(this.getResultSet().getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuarios;
    }
    
            /**
     * recupera Usuarios
     *
     * @param pTipo
     * @param pLogin return ModelUsuarios
     * @return 
     */
    public ModelUsuarios getUsuarioDAO(String pTipo) {
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_idusuario,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha,"
                    + "usu_tipo"
                    + " FROM"
                    + " tbl_usuario"
                    + " WHERE"
                    + " usu_tipo = '" + pTipo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuarios.setIdusuario(this.getResultSet().getInt(1));
                modelUsuarios.setUsuNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuLogin(this.getResultSet().getString(3));
                modelUsuarios.setUsuSenha(this.getResultSet().getString(4));
                modelUsuarios.setUsuTipo(this.getResultSet().getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelUsuarios;
    }
    
    /**
     * recupera uma lista de Usuarios return ArrayList
     */
    public ArrayList<ModelUsuarios> getListaUsuariosDAO() {
        ArrayList<ModelUsuarios> listamodelUsuarios = new ArrayList();
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_idusuario,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha,"
                    + "usu_tipo"
                    + " FROM"
                    + " tbl_usuario"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelUsuarios = new ModelUsuarios();
                modelUsuarios.setIdusuario(this.getResultSet().getInt(1));
                modelUsuarios.setUsuNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuLogin(this.getResultSet().getString(3));
                modelUsuarios.setUsuSenha(this.getResultSet().getString(4));
                modelUsuarios.setUsuTipo(this.getResultSet().getString(5));
                listamodelUsuarios.add(modelUsuarios);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelUsuarios;
    }

    /**
     * atualiza Usuarios
     *
     * @param pModelUsuarios return boolean
     */
    public boolean atualizarUsuariosDAO(ModelUsuarios pModelUsuarios) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_usuario SET "
                    + "pk_idusuario = '" + pModelUsuarios.getIdusuario() + "',"
                    + "usu_nome = '" + pModelUsuarios.getUsuNome() + "',"
                    + "usu_login = '" + pModelUsuarios.getUsuLogin() + "',"
                    + "usu_senha = '" + pModelUsuarios.getUsuSenha() + "',"
                    + "usu_tipo = '" + pModelUsuarios.getUsuTipo() + "'"
                    + " WHERE "
                    + "pk_idusuario = '" + pModelUsuarios.getIdusuario() + "'"
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
     * exclui Usuarios
     *
     * @param pIdusuario return boolean
     */
    public boolean excluirUsuariosDAO(int pIdusuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_usuario "
                    + " WHERE "
                    + "pk_idusuario = '" + pIdusuario + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean getValidarUsuariosDAO(ModelUsuarios pModelUsuario) {

        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "pk_idusuario,"
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha,"
                    + "usu_tipo"
                    + " FROM"
                    + " tbl_usuario"
                    + " WHERE"
                    + " usu_login = '" + pModelUsuario.getUsuLogin() + "' AND usu_senha = '" + pModelUsuario.getUsuSenha() + "'"
                    + ";"
            );

            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
