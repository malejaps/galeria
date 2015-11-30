/* CLASE					Fotografo
 * RESPONSABILIDAD			Crear un fotografo con informacion dada
 * DESCRIPCION				Aplicacion que crea un fotografo con una informacion dada
 * COLABORACION				Trabaja con las clases: Foto
 */


public class Fotografo {
	
	 String nombre;
     String especialidad;
     String estado;
     long iprecio;//inicio del intervalo de precios
     long fprecio;//final del intervalo de precios
	

    public Fotografo(String nombre,String especialidad,String estado,long iprecio,long fprecio)
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