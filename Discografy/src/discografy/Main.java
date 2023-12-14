package discografy;

import java.util.Scanner;
/**
 *
  * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class Main {
    public static void main(String[] args){
            //Declaración de datos.
        String userCancion = null, userAlbum = null, userArtista = null, tempString;
        double userDuracion = 0, tempInt;
        String userNombre = "Nombre del usuario";
        int userPin = 1234, seleccion, i=0;
        
            //Declaracion de objetos.
                //Clase canción --> Crear objeto.
        CancionDatos rola = new CancionDatos(userCancion, userAlbum, userArtista, userDuracion);
                //Clase usuario --> crear objeto.
        Usuario user = new Usuario(userNombre, userPin);
                //Crear escaner.
        Scanner sn = new Scanner(System.in);
        
        //CIclar.
            do{
                    //Comprobar si el usuario se ha registrado.
                if(userNombre == null){
                    System.out.println("No te has registrado.");
                }else{
                    user.Bienvenida();
                    System.out.print("(");
                        seleccion = sn.nextInt(); //Leer selección.
                    switch(seleccion){
                        case 1:
                            //Solicitar datos.
                                //Solcita y Almacena lo leido en la variable temporal, para despues asignarle su valor a la variable remota. Asi no hay necesidad de crear varios objetos.
                                    //Canción.
                            System.out.print("Ingresa el nombre de la canción: ");
                            tempString = sn.nextLine();
                                rola.set_nomCancion(tempString);
                                    //Album.
                            System.out.print("Ingresa el nombre del album: ");
                            tempString = sn.nextLine();
                                rola.set_nomAlbum(tempString);
                                    //Artista.
                            System.out.println("Ingresa el nombre del artista: ");
                            tempString = sn.nextLine();
                                rola.set_nomArtista(tempString);
                                    //Duración.
                            System.out.print("Ingresa la duración de tu canción: ");
                            tempInt = sn.nextInt();
                                rola.set_duracion(tempInt);
                                //Finalizar
                            System.out.print("Tu canción ha sido guardada con exito! \n ─┈──┈──┈──┈──┈──┈─\n");
                            i+=1;
                            break;
                        case 2:
                            if(i==0){
                                System.out.println("No has guardado ninguna canción.");
                            }else{
                                rola.reproducir();
                            }
                            break;
                        case 3:
                            if(i==0){
                                System.out.println("No has guardado ninguna canción.");
                            }else{
                                rola.mostrarDatos();
                            }
                            break;
                        case 4:
                            System.exit(0);
                            break;
                    }
                }            
            }while(i!=-1);
    }
}
