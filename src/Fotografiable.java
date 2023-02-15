public interface Fotografiable {

        public default void fotografiar(Entidad ent){
                System.out.println( ent.getName() );
        };

}
