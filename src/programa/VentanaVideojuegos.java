
package programa;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
/**
 *
 * @author PROPIETARIO
 */
public class VentanaVideojuegos extends JFrame implements  ActionListener{
    JComboBox genero, plataforma, alquilado;
    JLabel titulo, pa, pad, lblalquilado, lblgenero, lblplataforma;
    JTextField txtitulo, txtpa, txtpad;
    JButton  btnsi, btnno, btnatras, btncerrar;
    Metodos met = new Metodos();
    public VentanaVideojuegos(){
        
        this.setSize(450, 210);
        this.setLayout(null);
        this.setTitle("Alquiler Videojuegos");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        titulo=new JLabel("Titulo");
        titulo.setBounds(15, 5, 100, 20);
        this.add(titulo);
        
        pa=new JLabel("Precio");
        pa.setBounds(15, 30, 100, 20);
        this.add(pa);
        
        pad=new JLabel("Plazo");
        pad.setBounds(15, 55, 100, 20);
        this.add(pad);
       
        
        lblalquilado=new JLabel("Alquilado");
        lblalquilado.setBounds(15, 90, 100, 20);
        this.add(lblalquilado);  
        
        lblgenero=new JLabel("Genero");
        lblgenero.setBounds(230, 5, 100, 20);
        this.add(lblgenero);
        
        lblplataforma=new JLabel("Plataforma");
        lblplataforma.setBounds(230, 30, 100, 20);
        this.add(lblplataforma);
        
        txtitulo=new JTextField("");
        txtitulo.setBounds(80, 5, 100, 20);
        this.add(txtitulo);
        
        txtpa=new JTextField("");
        txtpa.setBounds(80, 30, 100, 20);
        this.add(txtpa);
        
        txtpad=new JTextField("");
        txtpad.setBounds(80, 55, 100, 20);
        this.add(txtpad);

        genero=new JComboBox();
        genero.setBounds(300, 5, 100, 20);
        this.add(genero);
        genero.addItem("Acción");
        genero.addItem("Deportes");
        genero.addItem("Aventuras");
        genero.addItem("Puzzle");
        genero.addItem("Infantil");
        genero.addActionListener(this);
        
        plataforma=new JComboBox();
        plataforma.setBounds(300, 30, 100, 20);
        this.add(plataforma);
        plataforma.addItem("XBox");
        plataforma.addItem("PlayStation");
        plataforma.addItem("Wii");
        plataforma.addActionListener(this);
        
        btnsi=new JButton("Si");
        btnsi.setBounds(70, 90, 50, 20);
        this.add(btnsi);
        btnsi.addActionListener(this);
        
        btnno=new JButton("No");
        btnno.setBounds(125, 90, 50, 20);
        this.add(btnno);
        btnno.addActionListener(this);
        
        btnatras = new JButton("Atras");
        btnatras.setBounds(250, 130, 80, 20);
        this.add(btnatras);
        btnatras.addActionListener(this);
        
        btncerrar = new JButton("Cerrar");
        btncerrar.setBounds(340, 130, 80, 20);
        this.add(btncerrar);
        btncerrar.addActionListener(this);
        
        
    }
    public void limpiar(){
        txtitulo.setText("");
        txtpa.setText("");
        txtpad.setText("");
    }
    public void cerrar(){
        int msj = JOptionPane.showConfirmDialog(null, "Seguro que deseas salir?");
        if(msj == JOptionPane.YES_OPTION){
            this.setVisible(false);
            System.exit(0);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int item = genero.getSelectedIndex();
        int item2 = plataforma.getSelectedIndex();
         if(e.getSource() == btnsi){
            if(txtitulo.getText().equals("")||txtpa.getText().equals("")||txtpad.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Datos incompletos");
            }else{
            String cad2 =(String) genero.getSelectedItem();
            String cad3 =(String) plataforma.getSelectedItem();
            String titulo = txtitulo.getText();
            String genero = cad2;
            String plataforma = cad3;
            int pa = Integer.parseInt(txtpa.getText());
            int pad = Integer.parseInt(txtpad.getText());
            
            met.agregarvideojuego(titulo, genero, pa, pad, plataforma);
            
            limpiar();
            txtitulo.requestFocus();
            this.setVisible(false);
            VentanaCliente2 c = new VentanaCliente2();
            c.setVisible(rootPaneCheckingEnabled);
            }
        }
         
         if(e.getSource() == btnatras){
             this.setVisible(false);
             Interfaz i=new Interfaz();
             i.setVisible(rootPaneCheckingEnabled);
         }
         if(e.getSource() == btncerrar){
             cerrar();
         }
    }
}
