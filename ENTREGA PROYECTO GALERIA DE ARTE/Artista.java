/* CLASE					Artista
 * RESPONSABILIDAD			Crear un artista con una informacion dada
 * DESCRIPCION				Aplicacion que crea un artista
 * COLABORACION				Esta clase no recibe colaboracion
 */


public class Artista {
	
	 String nombre;
     String especialidad;
     String estado;
     long iprecio;//inicio del intervalo de precios
     long fprecio;//final del intervalo de precios
	

    public Artista(String nombre,String especialidad,String estado,long iprecio,long fprecio)
    {
    	this.nombre=nombre;
    	this.especialidad=especialidad;
    	this.estado=estado;
    	this.iprecio=iprecio;
    	this.fprecio=fprecio;
    }
    
    String getNombre()
    {
    	return nombre;
    }
    
    String getEspecialidad()
    {
    	return especialidad;
    }
    
    String getEstado()
    {
    	return estado;
    }
    
    long getIprecio()
    {
    	return iprecio;
    }
    
    long getFprecio()
    {
    	return fprecio;
    }
    

@Override
    public String toString()
    {
    	return ("Nombre: "+getNombre()+"\nEspecialidad: "+getEspecialidad()+"\nEstado: "+getEstado()+"\nIntervalo de precios: "+getIprecio()+"-"+getFprecio());
    }
}