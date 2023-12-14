package discografy;
/**
 *
  * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class CancionDatos {
        //Declarar variables (nom = nombre).
    private String nomCancion, nomAlbum, nomArtista;
    private double duracion;
    public CancionDatos(String nomCancion, String nomAlbum, String nomArtista, double duracion){
        this.nomCancion = nomCancion;
        this.nomAlbum = nomAlbum;
        this.nomArtista = nomArtista;
        this.duracion = duracion;
    }
        //Getter's y setter's.
    public String get_nomCancion(){ return nomCancion; }
    public String get_nomAlbum(){ return nomAlbum; }
    public String get_nomArtista(){ return nomArtista; }
    public double get_duracion(){ return duracion; }
        //...
    public void set_nomCancion(String nomCancion){ this.nomCancion = nomCancion;}
    public void set_nomAlbum(String nomAlbum){ this.nomAlbum = nomAlbum;}
    public void set_nomArtista(String nomArtista){ this.nomArtista = nomArtista;}
    public void set_duracion(Double duracion){ this.duracion = duracion;}
        //Método que muestra el reproductor de una canción.
    public void reproducir(){
      System.out.println("─┈──┈──┈──┈──┈──┈─\n" +
        "\n" +
        "\n" +
        "\t \t \t ♫♪ " + get_nomCancion() + " ♫♪\n" +
        "\t \t \t " + get_nomArtista() + " -- " + get_nomAlbum() + "\n" + 
        "\t \t \t 00:00 ━━━━>─────── " + "" + get_duracion() + "\n" +
        "\n" +
        "\t \t ---           <<    ||     >>         ---\n" +
        "\n");
    }
        //Método que muestra todas las canciones con su respectiva información almacenada.
    public void mostrarDatos(){
        System.out.println("─┈──┈──┈──┈──┈──┈─\n" +
                            "Cancion: " + get_nomCancion() + " - " +
                            "Artista: " + get_nomArtista() + " \n " +
                            "Album: " + get_nomAlbum() + " - " +
                            "Duracion: "+ get_duracion() + "\n" +
                            "─┈──┈──┈──┈──┈──┈─");
    }
        //Método que enlista canciones.
    public void enlistarDatos(){
        System.out.println("─┈──┈──┈──┈──┈──┈─\n" +
                           "1.- " + get_nomCancion());
    }
}
