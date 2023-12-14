package discografy;

import java.util.ArrayList;

/**
 *
  * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Usuario {
    private String nomUser;
    private int pin;
        //Método para agregar un usuario.
    public void registrarUsuario(){
        
    }
        //Clase.
    public Usuario(String nombre, int pin){
        this.nomUser = nomUser;
        this.pin = pin;
    }
        //Getter's y setter's.
    public String get_nomUser(){ return nomUser; }
    public void set_nomUser(String nomUser){ this.nomUser = nomUser;}
    public int get_pin(){ return pin;}
    public void get_pin(int pin){ this.pin = pin;}
        //Método para cuando el usuario inicio sesión.
    public void Bienvenida(){
        System.out.println("< B I E N V E N I D O ! >\n");
        System.out.println("¿Que deseas hacer el día de hoy? \n" +
                            "1) Agregar canciones. \n" + 
                            "2) Escuchar canciones. \n" +
                            "3) Enlistar canciones. \n" +
                            "4) Salir. \n" +
                            "─┈──┈──┈──┈──┈──┈─\n");
    }
}
