package discografia;
/**
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Cancion {
    private String nombreCancion, album, artista;
    private double duracion;
        //Declaracion de los atributos de la clase.
    public Cancion(String nombreCancion, String album, String artista, double duracion){
        this.nombreCancion = nombreCancion;
        this.album = album;
        this.artista = artista;
        this.duracion = duracion;
    }
    public void mostrarCancion(){
      System.out.println("─┈──┈──┈──┈──┈──┈─\n" +
        "\n" +
        "< B I E N V E N I D O ! >\n" +
        "\n" +
        "\t \t ♫♪" + nombreCancion + "♫♪\n" +
        "\n \t \t " + album + " -- " + artista + "\n" + 
        "\t \t 00:00 ━━━━>─────── " + "00:" + duracion + "\n" +
        "\n" +
        "\t \t ---           <<    ||     >>         ---\n" +
        "\n");
    }
        //Getter's y setter's.
            //Nombre.
    public String getNombre()
        {return nombreCancion;}
    public void setNombre(String nombreCancion)
        {this.nombreCancion = nombreCancion;}
            //Album.
    public String getAlbum()
        {return album;}
    public void setAlbum(String album)
        {this.album = album;}
            //Duracion.
    public double getDuracion()
        {return duracion;}
    public void duracion(double duracion)
        {this.duracion = duracion;}
}
