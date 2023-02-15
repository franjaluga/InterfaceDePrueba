
public class Main {
    public static void main(String[] args) {

        Entidad e = new Entidad();
        Persona p = new Persona();
        Objeto o = new Objeto();

        p.setName("Nombre de persona");
        o.setName("Nombre de objeto");

        e.fotografiar( p );
        e.fotografiar( o );

    }
}