/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.botoes;

import javax.swing.JButton;

/**
 *
 * @author rafae
 */
public class FabricaPadrao extends FabricaAbstrataBotoes {

   
    @Override
    public JButton criaBotaoOK(){
        JButton ok = null;
        ok.setText("OK");
        
    return ok;
    }
    @Override
    public JButton criaBotaoCancel(){
        JButton cancel = null;
        cancel.setText("Cancel");
        return cancel;
    }
    
    
}
