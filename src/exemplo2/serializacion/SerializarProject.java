
package exemplo2.serializacion;

/**
 *
 * @author dfernandezguerreiro
 */
public class SerializarProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obx=new Metodos();
        obx.escribirFicheiro("ordenadores.dat");
        obx.lerFicheiro("ordenadores.dat");
        obx.engadirFicheiro("ordenadores.dat");
        obx.lerFicheiro("ordenadores.dat");
    }
    
}
