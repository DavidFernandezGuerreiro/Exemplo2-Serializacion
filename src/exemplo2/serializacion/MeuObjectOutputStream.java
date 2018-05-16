
package exemplo2.serializacion;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author David
 */
public class MeuObjectOutputStream extends ObjectOutputStream{
    
    public MeuObjectOutputStream() throws IOException{
        
    }
    
    public MeuObjectOutputStream(OutputStream ou) throws IOException{
        super(ou);
    }
    
    //Este método sobreescribe a cabeceira.
    @Override
    protected void writeStreamHeader() throws IOException{
        
    }
}
