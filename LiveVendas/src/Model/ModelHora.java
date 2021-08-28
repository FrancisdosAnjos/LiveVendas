/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Live Digital Center
 */
public class ModelHora {
    public String hora;
    SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
    
    public void lerhora(){
        Date horaActual = new Date();
        hora= horaFormatada.format(horaActual);
    }
}
