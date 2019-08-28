/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.botoes;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author rafae
 */
public class FabricaBotaoIcone extends FabricaAbstrataBotoes{

    @Override
    public JButton criaBotaoOK() {
          JButton ok = null;
        try {
            Image img = ImageIO.read(getClass().getResource("Icones/ok-icon.png"));
            ok.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            Logger.getLogger(FabricaBotaoIcone.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        ok.setText("OK");
        
        return ok;
    }

    @Override
    public JButton criaBotaoCancel() {
                JButton cancel = null;
        try {
            Image img = ImageIO.read(getClass().getResource("Icones/Cancel-icon.png"));
           cancel.setIcon(new ImageIcon(img));
        } catch (IOException ex) {
            Logger.getLogger(FabricaBotaoIcone.class.getName()).log(Level.SEVERE, null, ex);
        }
          
       cancel.setText("OK");
        
        return cancel;
    }
    
}
