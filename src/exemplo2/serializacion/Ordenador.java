
package exemplo2.serializacion;

import java.io.Serializable;

/**
 *
 * @author dfernandezguerreiro
 */
public class Ordenador implements Serializable{
    private Cpu procesador;
    private Pantalla pantalla;
    private Raton raton;
    
    public Ordenador(Cpu proce,Pantalla pantalla,Raton raton){
        procesador=proce; //valor inicial= null
        this.pantalla=pantalla; //valor inicial= null
        this.raton=raton; //valor inicial= null
    }
    
    public Ordenador(){
        procesador=new Cpu(); //creo un obxeto de tipo procesador
        pantalla=new Pantalla(); //creo un obxeto de tipo pantalla
        raton=new Raton(); //creo un obxeto de tipo raton
    }

    public Cpu getProcesador() {
        return procesador;
    }

    public void setProcesador(Cpu procesador) {
        this.procesador=procesador;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla=pantalla;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton=raton;
    }

    @Override
    public String toString() {
        return "PROCESADOR: "+procesador+", PANTALLA: "+pantalla+", RATÓN: "+raton;
    }
}
