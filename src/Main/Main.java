package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ruang.Balok;

/**
 *
 * @author Dimas
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        
        view.bcount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    double length, width, height;                 
                    length = Double.valueOf(view.getFlength());
                    width = Double.valueOf(view.getFwidth());
                    height = Double.valueOf(view.getFheight());
                    
                    Balok balok = new Balok(height, length, width);
                    view.larea.setText("Square Area          : " + balok.area());
                    view.lcircumference.setText("Square Circumference : " + balok.circumference());
                    view.lvolume.setText("Cuboid Volume        : " + balok.volume());
                    view.lsurface.setText("Cuboid Surface Area  : " + balok.surfaceArea());
                } catch (NumberFormatException nfe) {
                    if(nfe.getMessage() == "empty String"){
                        JOptionPane.showMessageDialog(null, "Cannot be empty");             
                    }else{
                        JOptionPane.showMessageDialog(null, nfe.getMessage());
                    }
                }
            }
        });
        
        view.breset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                view.larea.setText("");
                view.lcircumference.setText("");
                view.lvolume.setText("");
                view.lsurface.setText("");
                view.fheight.setText("");
                view.flength.setText("");
                view.fwidth.setText("");
            }
        });
    }
}
