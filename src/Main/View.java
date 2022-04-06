package Main;
import javax.swing.*;

public class View extends JFrame {
    JLabel ltitle = new JLabel("Cuboid Calculator");
    JLabel lresult = new JLabel("Result :");
    
    JLabel llength = new JLabel("Length");
    JTextField flength = new JTextField();
    
    JLabel lwidth = new JLabel("Width");
    JTextField fwidth = new JTextField();
    
    JLabel lheight = new JLabel("Heigth");
    JTextField fheight = new JTextField();
    
    JButton bcount = new JButton("count");
    JButton breset = new JButton("reset");
    
    JLabel larea = new JLabel("");
    JLabel lcircumference = new JLabel("");
    JLabel lvolume = new JLabel("");
    JLabel lsurface = new JLabel("");
    
    public View(){
        setTitle("Cuboid Calculator");
        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(ltitle);
        add(lresult);
        add(llength);
        add(flength);
        add(lwidth);
        add(fwidth);
        add(lheight);
        add(fheight);
        add(bcount);
        add(breset);
        add(larea);
        add(lcircumference);
        add(lvolume);
        add(lsurface);
        
        ltitle.setBounds(200, 20, 150, 20);
        llength.setBounds(50, 80, 100, 20);
        flength.setBounds(175, 80, 250, 20);
        lwidth.setBounds(50, 120, 100, 20);
        fwidth.setBounds(175, 120, 250, 20);
        lheight.setBounds(50, 160, 100, 20);
        fheight.setBounds(175, 160, 250, 20);
        lresult.setBounds(175, 190, 100, 20);
        larea.setBounds(50, 230, 400, 20);
        lcircumference.setBounds(50, 270, 400, 20);
        lvolume.setBounds(50, 310, 400, 20);
        lsurface.setBounds(50, 350, 400, 20);
        bcount.setBounds(125, 380, 100, 20);
        breset.setBounds(275, 380, 100, 20);
    }

    public String getFlength() {
        return flength.getText();
    }

    public String getFwidth() {
        return fwidth.getText();
    }

    public String getFheight() {
        return fheight.getText();
    }
}
