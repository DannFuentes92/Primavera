package unitec.primavera;

import java.util.ArrayList;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author dannf
 */
public interface RepositorioMensajito extends MongoRepository<Mensajito, String>{
    
    
    ArrayList<Mensajito> findByTitulo (String titulo);
    
}
