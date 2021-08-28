/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.DaoDataVencimento;
import Model.ModelDataVencimento;

/**
 *
 * @author Live Digital Center
 */
public class ControllerDataVencimento {
     private DaoDataVencimento daoVencimento = new DaoDataVencimento();
     
         public int salvarDataVencimento(ModelDataVencimento pModelDataVencimento){
        
        return this.daoVencimento.salvarDataVencimentoDao(pModelDataVencimento);
    }
}
