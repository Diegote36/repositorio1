
package programa;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPelicula extends JFrame implements ActionListener{
    JLabel lbltitulo, lblpa, lblpad, lblaño, lbldirector, lblinterpretes,lblgenero,lblalquilado;
    JTextField txttitulo, txtpa, txtpad, txtaño, txtdirector, txtinterpretes;
    JButton btnsi, btnno, btncerrar, btnatras;
    JComboBox cmbgenero;
    Metodos met = new Metodos ();
    
    public VentanaPelicula(){
        
        this.setSize(500, 300);
        this.setLayout(null);
        this.setTitle("Alquiler Pelicula");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        lbltitulo=new JLabel("Titulo");
        lblpa=new JLabel("Precio");
        lblpad=new JLabel("Plazo");
        lblalquilado = new JLabel("Alquilado");
        lblgenero = new JLabel("Genero");
        lblaño=new JLabel("Año");
        lbldirector=new JLabel("Director");
        lblinterpretes=new JLabel("Interpretes");
        
        
        lbltitulo.setBounds(15, 5, 100, 20);
        this.add(lbltitulo);
        lblgenero.setBounds(250,5,100, 20);
        this.add(lblgenero);
        lblpa.setBounds(15, 30, 100, 20);
        this.add(lblpa);
        lblpad.setBounds(15, 55, 100, 20);
        this.add(lblpad);
        lblaño.setBounds(15, 80, 100, 20);
        this.add(lblaño);
        lbldirector.setBounds(15, 105, 100, 20);
        this.add(lbldirector);
        lblalquilado.setBounds(15,180,100,20);
        this.add(lblalquilado);
        lblinterpretes.setBounds(15,130, 100, 20);
        this.add(lblinterpretes);
        
        txttitulo = new JTextField("");
        txtpa=new JTextField("");
        txtpad=new JTextField("");
        txtaño=new JTextField("");
        txtdirector=new JTextField("");
        txtinterpretes=new JTextField("");
        
        
        txttitulo.setBounds(80, 5, 110, 20);
        this.add(txttitulo);
        txtpa.setBounds(80, 30, 110, 20);
        this.add(txtpa);
        txtpad.setBounds(80, 55, 110, 20);
        this.add(txtpad);
        txtaño.setBounds(80, 80, 110, 20);
        this.add(txtaño);
        txtdirector.setBounds(80, 105, 110, 20);
        this.add(txtdirector);
        txtinterpretes.setBounds(80, 130, 110, 20);
        this.add(txtinterpretes);
        
        
        cmbgenero=new JComboBox();
        cmbgenero.setBounds(310, 5, 110, 20);
        this.add(cmbgenero);
        cmbgenero.addItem("Acción");
        cmbgenero.addItem("Fantasía");
        cmbgenero.addItem("Drama");
        cmbgenero.addItem("Aventuras");
        cmbgenero.addItem("Puzzle");
        cmbgenero.addItem("Infantil");
        cmbgenero.addActionListener(this);
        
        
        btnsi = new JButton("Si");
        btnsi.setBounds(80,180, 50, 20);
        this.add(btnsi);
        btnsi.addActionListener(this);
        
        btnno = new JButton("No"); 
        btnno.setBounds(140,180, 50, 20);
        this.add(btnno);
        btnno.addActionListener(this);
        
        btnatras = new JButton("Atras");
        btnatras.setBounds(280,105, 80, 20);
        this.add(btnatras);
        btnatras.addActionListener(this);
        
        btncerrar = new JButton("Cerrar");
        btncerrar.setBounds(370,105, 80, 20);
        this.add(btncerrar);
        btncerrar.addActionListener(this);

            
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int item = cmbgenero.getSelectedIndex();
        if(e.getSource() == btnsi){
            if (txttitulo.getText().equals("")||txtpa.getText().equals("")||txtpad.getText().equals("")||
            txtaño.getText().equals("")||txtdirector.getText().equals("")||txtinterpretes.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane,"Datos inconpletos");
            }else {
            String cad2 =(String) cmbgenero.getSelectedItem();
            String titulo = txttitulo.getText();
            String genero = cad2;
            int pa = Integer.parseInt(txtpa.getText());
            int pad = Integer.parseInt(txtpad.getText());
            int año = Integer.parseInt(txtaño.getText());
            String director = txtdirector.getText();
            String interprete = txtinterpretes.getText();
            met.agregarpelicula(titulo, genero, pa, pad, año, director, interprete);
            
           limpiar();
           
           txttitulo.requestFocus();
           this.setVisible(false);
           VentanaCliente c = new VentanaCliente();
            c.setVisible(rootPaneCheckingEnabled);
            
            }
            
        }
        if(e.getSource() == btnno){
            this.setVisible(false);
            Interfaz n = new Interfaz ();
            n.setVisible(rootPaneCheckingEnabled);
            
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
    
    public void limpiar(){
    txttitulo.setText("");
    txtpa.setText("");
    txtpad.setText("");
    txtaño.setText(""); 
    txtdirector.setText("");
    txtinterpretes.setText("");
    }
    
    public void cerrar(){
        int msj = JOptionPane.showConfirmDialog(null, "Seguro que deseas salir?");
        if(msj == JOptionPane.YES_OPTION){
            this.setVisible(false);
            System.exit(0);
        }
    }
}
