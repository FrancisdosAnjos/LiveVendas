/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Dao.DAOUsuarios;
import Model.ModelUsuarios;
import java.util.ArrayList;

/**
*
* @author Live Digital
*/
public class ControllerUsuarios {

    private DAOUsuarios daoUsuarios = new DAOUsuarios();

    /**
    * grava Usuarios
    * @param pModelUsuarios
    * return int
    */
    public int salvarUsuariosController(ModelUsuarios pModelUsuarios){
        return this.daoUsuarios.salvarUsuariosDAO(pModelUsuarios);
    }

    /**
    * recupera Usuarios
    * @param pIdusuario
    * return ModelUsuarios
    */
    public ModelUsuarios getUsuariosController(int pIdusuario){
        return this.daoUsuarios.getUsuariosDAO(pIdusuario);
    }
    
        /**
    * recupera Usuarios
    * @param pLogin
    * return ModelUsuarios
    */
    public ModelUsuarios getUsuariosController(String pLogin){
        return this.daoUsuarios.getUsuariosDAO(pLogin);
    }
    
       /**
    * recupera Usuarios
    * @param pLogin
    * return ModelUsuarios
    */
    public ModelUsuarios getUsuarioController(String pTipo){
        return this.daoUsuarios.getUsuarioDAO(pTipo);
    }
    

    /**
    * recupera uma lista deUsuarios
    * @param pIdusuario
    * return ArrayList
    */
    public ArrayList<ModelUsuarios> getListaUsuariosController(){
        return this.daoUsuarios.getListaUsuariosDAO();
    }

    /**
    * atualiza Usuarios
    * @param pModelUsuarios
    * return boolean
    */
    public boolean atualizarUsuariosController(ModelUsuarios pModelUsuarios){
        return this.daoUsuarios.atualizarUsuariosDAO(pModelUsuarios);
    }

    /**
    * exclui Usuarios
    * @param pIdusuario
    * return boolean
    */
    public boolean excluirUsuariosController(int pIdusuario){
        return this.daoUsuarios.excluirUsuariosDAO(pIdusuario);
    }

    public boolean getValidarUsuariosController(ModelUsuarios modelUsuario) {
       return this.daoUsuarios.getValidarUsuariosDAO(modelUsuario);
    }
}