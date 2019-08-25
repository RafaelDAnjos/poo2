/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata;

/**
 *
 * @author rafae
 */
public class FabricaClaro extends FabricaAbstrataEnvios{
 
 
    @Override
    public Cobranca criaCobranca(){
        return new CobrancaClaro();
    }
    public EnvioSMS criaEnvio(){
        return new EnvioSMSClaro(" ");
    }
   
}
