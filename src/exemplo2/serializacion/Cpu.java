
package exemplo2.serializacion;

import java.io.Serializable;

/**
 *
 * @author dfernandezguerreiro
 */
public class Cpu implements Serializable{
    private int velocidade;
    private int memoria;

    public Cpu() {
    }

    public Cpu(int velocidade, int memoria) {
        this.velocidade=velocidade;
        this.memoria=memoria;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade=velocidade;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria=memoria;
    }

    @Override
    public String toString() {
        return "velocidade: "+velocidade+", memoria: "+memoria;
    }
}
