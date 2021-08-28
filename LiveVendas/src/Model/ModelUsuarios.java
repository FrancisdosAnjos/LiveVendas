/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
*
* @author Live Digital
*/
public class ModelUsuarios {

    private int idusuario;
    private String usuNome;
    private String usuLogin;
    private String usuSenha;
    private String usuTipo;

    /**
    * Construtor
    */
    public ModelUsuarios(){}

    /**
    * seta o valor de idusuario
    * @param pIdusuario
    */
    public void setIdusuario(int pIdusuario){
        this.idusuario = pIdusuario;
    }
    /**
    * return pk_idusuario
    */
    public int getIdusuario(){
        return this.idusuario;
    }

    /**
    * seta o valor de usuNome
    * @param pUsuNome
    */
    public void setUsuNome(String pUsuNome){
        this.usuNome = pUsuNome;
    }
    /**
    * return usuNome
    */
    public String getUsuNome(){
        return this.usuNome;
    }

    /**
    * seta o valor de usuLogin
    * @param pUsuLogin
    */
    public void setUsuLogin(String pUsuLogin){
        this.usuLogin = pUsuLogin;
    }
    /**
    * return usuLogin
    */
    public String getUsuLogin(){
        return this.usuLogin;
    }

    /**
    * seta o valor de usuSenha
    * @param pUsuSenha
    */
    public void setUsuSenha(String pUsuSenha){
        this.usuSenha = pUsuSenha;
    }
    /**
    * return usuSenha
    */
    public String getUsuSenha(){
        return this.usuSenha;
    }

    /**
    * seta o valor de usuTipo
    * @param pUsuTipo
    */
    public void setUsuTipo(String pUsuTipo){
        this.usuTipo = pUsuTipo;
    }
    /**
    * return usuTipo
    */
    public String getUsuTipo(){
        return this.usuTipo;
    }

    @Override
    public String toString(){
        return "ModelUsuarios {" + "::idusuario = " + this.idusuario + "::usuNome = " + this.usuNome + "::usuLogin = " + this.usuLogin + "::usuSenha = " + this.usuSenha + "::usuTipo = " + this.usuTipo +  "}";
    }
}