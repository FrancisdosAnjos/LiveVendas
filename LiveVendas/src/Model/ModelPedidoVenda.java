package Model;

import java.sql.Date;

/**
*
* @author Live Digital
*/
public class ModelPedidoVenda {

    private int idvendas;
    private int fk_cliente;
    private Date pvDatavenda;
    private double pvValorliquido;
    private double pvValorbruto;
    private double pvDesconto;
    private String pvN_pedido_venda;

    /**
    * Construtor
    */
    public ModelPedidoVenda(){}

    /**
    * seta o valor de idvendas
    * @param pIdvendas
    */
    public void setIdvendas(int pIdvendas){
        this.idvendas = pIdvendas;
    }
    /**
    * return pk_idvendas
    */
    public int getIdvendas(){
        return this.idvendas;
    }

    /**
    * seta o valor de fk_cliente
    * @param pFk_cliente
    */
    public void setFk_cliente(int pFk_cliente){
        this.fk_cliente = pFk_cliente;
    }
    /**
    * return fk_cliente
    */
    public int getFk_cliente(){
        return this.fk_cliente;
    }

    /**
    * seta o valor de pvDatavenda
    * @param pPvDatavenda
    */
    public void setPvDatavenda(Date pPvDatavenda){
        this.pvDatavenda = pPvDatavenda;
    }
    /**
    * return pvDatavenda
    */
    public Date getPvDatavenda(){
        return this.pvDatavenda;
    }

    /**
    * seta o valor de pvValorliquido
    * @param pPvValorliquido
    */
    public void setPvValorliquido(double pPvValorliquido){
        this.pvValorliquido = pPvValorliquido;
    }
    /**
    * return pvValorliquido
    */
    public double getPvValorliquido(){
        return this.pvValorliquido;
    }

    /**
    * seta o valor de pvValorbruto
    * @param pPvValorbruto
    */
    public void setPvValorbruto(double pPvValorbruto){
        this.pvValorbruto = pPvValorbruto;
    }
    /**
    * return pvValorbruto
    */
    public double getPvValorbruto(){
        return this.pvValorbruto;
    }

    /**
    * seta o valor de pvDesconto
    * @param pPvDesconto
    */
    public void setPvDesconto(double pPvDesconto){
        this.pvDesconto = pPvDesconto;
    }
    /**
    * return pvDesconto
    */
    public double getPvDesconto(){
        return this.pvDesconto;
    }

    /**
    * seta o valor de pvN_pedido_venda
    * @param pPvN_pedido_venda
    */
    public void setPvN_pedido_venda(String pPvN_pedido_venda){
        this.pvN_pedido_venda = pPvN_pedido_venda;
    }
    /**
    * return pvN_pedido_venda
    */
    public String getPvN_pedido_venda(){
        return this.pvN_pedido_venda;
    }

    @Override
    public String toString(){
        return "ModelPedidoVenda {" + "::idvendas = " + this.idvendas + "::fk_cliente = " + this.fk_cliente + "::pvDatavenda = " + this.pvDatavenda + "::pvValorliquido = " + this.pvValorliquido + "::pvValorbruto = " + this.pvValorbruto + "::pvDesconto = " + this.pvDesconto + "::pvN_pedido_venda = " + this.pvN_pedido_venda +  "}";
    }
}