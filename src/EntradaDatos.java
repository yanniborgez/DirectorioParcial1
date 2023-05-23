import java.util.*;
public class EntradaDatos {
    String nombre;
    String numero;
    String direccion;
    String correo;
    String catTemp;

    EntradaDatos(String n, String num, String dir, String mail, String catTemp){
        this.nombre = n;
        this.numero = num;
        this.direccion = dir;
        this.correo = mail;
        this.catTemp = catTemp;
    }
}