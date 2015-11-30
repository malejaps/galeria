/* CLASE					Obra
 * RESPONSABILIDAD			Crear una obra con una informacion dada
 * DESCRIPCION				Aplicacion que crea una obra
 * COLABORACION				Esta clase no recibe colaboracion
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Obra {

String nombre;
String fecha;
Artista artista;
long codigo;
boolean disponible;
String tipoObra;

//PENDIENTE
long precio1;//precio original
long precio2;//precio de galeria

   
   
    public Obra(String nombre,String fecha,Artista artista,long codigo,String tipo) 
    {
    this.nombre=nombre;
    this.artista=artista;
    this.codigo=codigo;
    this.fecha=fecha;
    disponible=true;
    this.tipoObra=tipo;
    	
    
    }
    
    
    
    
    String getNombre()
    {
    	return nombre;
    }
    
    String getFecha()
    {
    	return fecha;
    }
        
    
    long getCodigo()
    {
    	return codigo;
    }
    
    @Override
    public String toString()
    {
    	SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    	Artista art=this.artista;
    	
    	
    	return ("Nombre: "+getNombre()+ "\nFecha de puesta en venta:"+ getFecha()+"\nArtista:\n" + "\nNombre: "+art.nombre+"\nEspecialidad: "+art.especialidad+"\nEstado: "+art.estado+"\nIntervalo de precios: "+art.iprecio+"-"+art.fprecio	);
    }
    
    
      
}
    
