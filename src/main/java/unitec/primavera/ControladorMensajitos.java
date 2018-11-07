package unitec.primavera;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
@CrossOrigin(origins = {"https://angular-bw4xtm.stackblitz.io"})

public class ControladorMensajitos {
    @Autowired RepositorioMensajito mensa;
    
    
    //Mi primer "Hola mundo" desde REST API con Spring
    @GetMapping(path="/hola")
    public String hola ()
    {
        return "Hola Mundo";
    }
    
    //buscamos todos
  @GetMapping (path="/mensaje")  
  public List<Mensajito> todos ()
  {
      return mensa.findAll ();
      
  }
  //Bucamos por ID
  @GetMapping (path="/mensaje/{id}")
  
      public Mensajito buscarPorId(@PathVariable String id)
      {
          return mensa.findById(id).get();
          
      }
      
}

              
  
  
