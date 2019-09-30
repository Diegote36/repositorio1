package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class VentanaCliente extends JFrame implements ActionListener{
    JLabel nombre, direccion, telefono;
    JTextField txtnombre, txtdireccion, txtelefono;
    JButton btnregistrar, btnatras, btncerrar;
    public Metodos met1 = new Metodos(); 
    public VentanaCliente(){
        
        this.setSize(360, 200);
        this.setLayout(null);
        this.setTitle("Datos del cliente");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        nombre=new JLabel("Nombre");
        nombre.setBounds(15, 30, 200, 20);
        this.add(nombre);
        
        direccion=new JLabel("Direccion");
        direccion.setBounds(15, 55, 200, 20);
        this.add(direccion);
        
        telefono=new JLabel("Telefono");
        telefono.setBounds(15, 80, 200, 20);
        this.add(telefono);
        
        txtnombre=new JTextField("");
        txtnombre.setBounds(80, 30, 100, 20);
        this.add(txtnombre);
        
        
        txtdireccion=new JTextField("");
        txtdireccion.setBounds(80, 55, 100, 20);
        this.add(txtdireccion);
        
        txtelefono=new JTextField("");
        txtelefono.setBounds(80, 80, 100, 20);
        this.add(txtelefono);
        
        btnregistrar = new JButton("Registrar");
        this.add(btnregistrar);
        btnregistrar.setBounds(210, 5, 100,20 );
        btnregistrar.addActionListener(this);
        
        btnatras = new JButton("Atras");
        btnatras.setBounds(150, 120, 80, 20);
        this.add(btnatras);
        btnatras.addActionListener(this);
        
        btncerrar = new JButton("Cerrar");
        btncerrar.setBounds(240, 120, 80, 20);
        this.add(btncerrar);
        btncerrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnregistrar){
            if(txtnombre.getText().equals("")||txtdireccion.getText().equals("")||txtelefono.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane,"Faltan Ingresar datos ");
            }else {
             //int numero = Integer.parseInt(txtnumero.getText());
            String nombre = txtnombre.getText(); 
            String direccion = txtdireccion.getText();
            int movil = Integer.parseInt(txtelefono.getText());
            met1.agregarcliente(nombre, direccion, movil);
            JOptionPane.showMessageDialog(rootPane,"Datos ingresados corectamente");
            this.setVisible(false);
            VentanaMenu v=new VentanaMenu();
            v.setVisible(rootPaneCheckingEnabled);
            
            }
        }
        if(e.getSource() == btnatras){
            this.setVisible(false);
            VentanaPelicula p=new VentanaPelicula();
            p.setVisible(rootPaneCheckingEnabled);
        }
        if(e.getSource() == btncerrar){
            cerrar();
        }
    }
    
    public void cerrar(){
        int msj = JOptionPane.showConfirmDialog(null, "Seguro que deseas salir?");
        if(msj == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    
}
