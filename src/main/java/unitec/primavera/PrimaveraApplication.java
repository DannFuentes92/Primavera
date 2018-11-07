package unitec.primavera;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaveraApplication implements CommandLineRunner {
    
   // @Autowired RepositorioPagos repoPagos;
    @Autowired RepositorioMensajito repoMensa;
    
    public static void main(String[] args) {
		SpringApplication.run(PrimaveraApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception{
    System.out.println("Hola Mundo");
    //repoPagos.servicioPagar();
        
        //repoMensa.save(new Mensajito("Luis", "Luis Ortega", LocalDate.now()));
      //Guarda un mensaje
      
    /*  for (Mensajito Mensa:
              repoMensa.findAll() )
      {
          System.out.println(Mensa); 
      }
      //Buscamos todos los mensajes.
*/
    
    
        repoMensa.save(new Mensajito ("Malo","Yo","Topoyiya", LocalDate.now()));
        System.out.println(repoMensa.findByTitulo ("Yo"));
        //Actualizar
    
    }
}
