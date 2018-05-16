
package exemplo2.serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author dfernandezguerreiro
 */
public class Metodos {
    
    public void escribirFicheiro(String ficheiro){
        ObjectOutputStream fich=null;

        try {
            fich=new ObjectOutputStream(new FileOutputStream(ficheiro));
            
            for(int i=0;i<3;i++){
                Ordenador ordena=new Ordenador(new Cpu(enteiro("velocidade: "),enteiro("memoria: ")),new Pantalla(cadea("carca: "),enteiro("pulgadas: ")),new Raton(cadea("tipo rato: ")));
                fich.writeObject(ordena);
            }
            
        } catch (Exception e){
            e.printStackTrace();
        } 
        finally{
            if(fich!=null)
                try {
                    fich.close();
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    public String cadea(String s){
        return JOptionPane.showInputDialog(s);
    }
    public int enteiro(String s){
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }
    
    public void engadirFicheiro(String ficheiro){
        MeuObjectOutputStream esc=null;
        ObjectOutputStream fich=null;
        
        try {
            esc=new MeuObjectOutputStream(new FileOutputStream(ficheiro,true));
            
            for(int i=0;i<2;i++){
                Ordenador ordena=new Ordenador(new Cpu(enteiro("velocidade: "),enteiro("memoria: ")),new Pantalla(cadea("carca: "),enteiro("pulgadas: ")),new Raton(cadea("tipo rato: ")));
                esc.writeObject(ordena);
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(esc!=null)
                try{
                    esc.close();
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void lerFicheiro(String ficheiro){
        ObjectInputStream ler=null;
        Ordenador aux=null;
        
        try {
            ler=new ObjectInputStream(new FileInputStream(ficheiro));
            
            aux=(Ordenador)ler.readObject();
            while(aux!=null){
                System.out.println(aux.toString());
                aux=(Ordenador)ler.readObject();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(ler!=null)
                try {
                    ler.close();
            } catch (IOException ex) {
                    System.out.println("error de peche "+ex.getMessage());
            }
        }
    }
    
}
