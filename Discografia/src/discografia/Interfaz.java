package discografia;
/**
 *
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Interfaz  {
    private String usuario;
    private int contraseña;
    public Interfaz(String usuario, int contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
  
    public void reproductorMusica(){
        System.out.println("─┈──┈──┈──┈──┈──┈─\n" +
        "\n" +
        "< B I E N V E N I D O ! >\n" +
        "\n" +
        "♫♪" + "nombre" + "♫♪\n" +
        "\n" +
        "00:00 ━━━━>─────── " + "00:" + "duracion" + "\n" +
        "\n" +
        "---           <<    ||     >>         ---\n" +
        "\n"
        );
    }
}
