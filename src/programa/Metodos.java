package programa;

import java.util.ArrayList;

class pelicula {
private String titulo ; 
    private String genero; 
    private int pa; 
    private int pad; 
    private int año;
    private String director; 
    private  String interprete; 
    
    public pelicula(String titulo,String genero ,int pa,int pad,int año , String director , String interprete){
        this.titulo = titulo; 
        this.genero = genero;
        this.pa  = pa; 
        this.pad = pad; 
        this.año = año;
        this.director = director; 
        this.interprete = interprete; 
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public int getPad() {
        return pad;
    }

    public void setPad(int pad) {
        this.pad = pad;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    @Override
    public String toString() {
        return  titulo + "\t" + genero + "\t" + pa + "\t" + pad + "\t" + año + "\t" + director + "\t" + interprete ;
    }
}
class peliculav {
 private String titulo ; 
    private String genero; 
    private int pa; 
    private int pad; 
    private String plataforma ;

    public peliculav(String titulo, String genero, int pa, int pad, String plataforma) {
        this.titulo = titulo;
        this.genero = genero;
        this.pa = pa;
        this.pad = pad;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public int getPad() {
        return pad;
    }

    public void setPad(int pad) {
        this.pad = pad;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }



    

    @Override
    public String toString() {
        return  titulo + "\t" + genero + "\t" + pa + "\t" + pad + "\t"  + plataforma;
    }

}

class cliente {
    private int numero =0 ; 
    private String nombre;
    private String direccion ;
    private int movil ; 

    public cliente(String nombre, String direccion, int movil) {
        numero++;
        this.nombre = nombre;
        this.direccion = direccion;
        this.movil = movil;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMovil() {
        return movil;
    }

    public void setMovil(int movil) {
        this.movil = movil;
    }

    @Override
    public String toString() {
        return  numero + "\t" + nombre + "\t" + direccion + "\t" + movil ;
    }

   

}


public class Metodos {
    ArrayList <pelicula> p = new ArrayList<>();
    ArrayList <peliculav> p2 = new ArrayList<>();
    ArrayList <cliente> c = new ArrayList<>();
public void agregarpelicula(String titulo,String genero ,int pa,int pad,int año , String director , String interprete){
    p.add(new pelicula(titulo, genero , pa , pad , año,director , interprete));
}
 public String listarpelicula(){
     String cad = ""; 
     for(int i =0; i< p.size() ; i++){
         cad  = cad+"\n"+(p.get(i)).toString();
     }    
     return cad;
     }
 public void agregarvideojuego(String titulo,String genero,int pa,int pad, String plataforma){
    p2.add(new peliculav(titulo, genero, pa, pad, plataforma));
}
 public String listarvideojuego(){
     String cad = ""; 
     for(int i =0; i< p2.size() ; i++){
         cad  = cad+"\n"+(p2.get(i)).toString();
     }    
     return cad;
     }
 public void agregarcliente(String nombre, String direccion, int movil){
     c.add(new cliente ( nombre ,direccion, movil));
 }
 public String listarcliente(){
     String cad = ""; 
     for(int i =0; i< c.size() ; i++){
         cad  = cad+"\n"+(c.get(i)).toString();
     }    
     return cad;
     }
}