/* CLASE					Foto
 * RESPONSABILIDAD			Crear una foto con informacion dada
 * DESCRIPCION				Aplicacion que crea una foto con una informacion dada
 * COLABORACION				Trabaja con las clases: Fotografo
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Foto {

String nombre;
String fecha;
Fotografo fotografo;
long codigo;
boolean disponible;
String tipoObra;

   
   
    public Foto(String nombre,String fecha,Fotografo fotografo,long codigo,String tipo) 
    {
    this.nombre=nombre;
    this.fotografo=fotografo;
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
    	Fotografo art=this.fotografo;
    	
    	
    	return ("Nombre: "+getNombre()+ "\nFecha de puesta en venta:"+ getFecha()+"\nArtista:\n" + "\nNombre: "+art.nombre+"\nEspecialidad: "+art.especialidad+"\nEstado: "+art.estado+"\nIntervalo de precios: "+art.iprecio+"-"+art.fprecio	);
    }
    
    
      
}
    
