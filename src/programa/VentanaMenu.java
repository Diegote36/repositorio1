/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class VentanaMenu extends JFrame implements ActionListener{
    JButton listaP, añadirP, FichaP, ListaC, añadirC, fichaC, alquiler, salir;
    JTextArea respuesta;
    JScrollPane scroll;
    public VentanaMenu(){
        this.setSize(500,500);
        this.setLayout(null);
        this.setTitle("Menu");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        respuesta=new JTextArea("");
        
        //NIGGER
        scroll=new JScrollPane(respuesta);
        scroll.setBounds(20, 120, 430, 300);
        this.add(scroll);
        
        listaP=new JButton("Lista Producto");
        listaP.setBounds(55, 15, 120, 20);
        this.add(listaP);
        
        añadirP=new JButton("Añadir Producto");
        añadirP.setBounds(180, 15, 120, 20);
        this.add(añadirP);
        
        FichaP=new JButton("Ficha Producto");
        FichaP.setBounds(305, 15, 120, 20);
        this.add(FichaP);
        
        ListaC=new JButton("Lista Cliente");
        ListaC.setBounds(55, 55, 120, 20);
        this.add(ListaC);
        ListaC.addActionListener(this);
        
        añadirC=new JButton("Añadir Cliente");
        añadirC.setBounds(180, 55, 120, 20);
        this.add(añadirC);
        
        fichaC=new JButton("Ficha Cliente");
        fichaC.setBounds(305, 55, 120, 20);
        this.add(fichaC);
        
        alquiler=new JButton("Alquiler");
        alquiler.setBounds(190, 90, 100, 20);
        this.add(alquiler);
        alquiler.addActionListener(this);
        
        salir = new JButton("Salir");
        salir.setBounds(350,430, 80, 20);
        this.add(salir);
        salir.addActionListener(this);
    }
    
    public void cerrar(){
        int msj = JOptionPane.showConfirmDialog(null, "Seguro que deseas salir?");
        if(msj == JOptionPane.YES_OPTION){
            this.setVisible(false);
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        VentanaMenu m=new VentanaMenu();
        m.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==alquiler){
            this.setVisible(false);
            Interfaz i=new Interfaz();
            i.setVisible(rootPaneCheckingEnabled);
                }
        if(e.getSource() == salir){
            cerrar();
        }
        
    }
    
    
}
