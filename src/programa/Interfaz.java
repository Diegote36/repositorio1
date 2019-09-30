
package programa;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Interfaz extends JFrame implements ActionListener{
    JLabel titulo;
    JButton pelicula, videojuego, atras, cerrar;
    public Interfaz(){
        this.setSize(300, 200);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        titulo=new JLabel("Bienvenido, ¿Que desea alquilar?");
        titulo.setBounds(15, 5, 200, 20);
        this.add(titulo);
        
        pelicula=new JButton("Pelicula");
        pelicula.setBounds(30, 50, 100, 20);
        this.add(pelicula);
        pelicula.addActionListener(this);
        
        videojuego=new JButton("Videojuego");
        videojuego.setBounds(150, 50, 100, 20);
        this.add(videojuego);
        videojuego.addActionListener(this);
        
        atras=new JButton("Atras");
        atras.setBounds(10, 100, 80, 20);
        this.add(atras);
        atras.addActionListener(this);
        
        cerrar=new JButton("Cerrar");
        cerrar.setBounds(195, 100, 80, 20);
        this.add(cerrar);
        cerrar.addActionListener(this);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pelicula){
            this.setVisible(false);
            VentanaPelicula ventana1=new VentanaPelicula();
            ventana1.setVisible(rootPaneCheckingEnabled);
        }
        
        if(e.getSource() == videojuego){
            this.setVisible(false);
            VentanaVideojuegos ventana2=new VentanaVideojuegos();
            ventana2.setVisible(rootPaneCheckingEnabled);
        }   
        if(e.getSource() == atras){
            this.setVisible(false);
            VentanaMenu m = new  VentanaMenu();
            m.setVisible(rootPaneCheckingEnabled);
            
        }
        if(e.getSource() == cerrar){
            cerrar();
            
        }
    }
        public void cerrar(){
        int msj = JOptionPane.showConfirmDialog(null, "Seguro que deseas salir?");
        if(msj == JOptionPane.YES_OPTION){
            this.setVisible(false);
            System.exit(0);
        }
    }
}
