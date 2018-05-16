
package exemplo2.serializacion;

import java.io.Serializable;

/**
 *
 * @author dfernandezguerreiro
 */
public class Raton implements Serializable{
    private String tipo;

    public Raton() {
    }

    public Raton(String tipo) {
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo=tipo;
    }

    @Override
    public String toString() {
        return "tipo: "+tipo;
    }
}
