/* CLASE					Cliente
 * RESPONSABILIDAD			Crear un cliente con una informacion dada
 * DESCRIPCION				Aplicacion que crea un Cliente
 * COLABORACION				Esta clase no recibe colaboracion
 */

import java.util.ArrayList;
import javax.swing.*;
public class Cliente {

     String nombre;
     String apellido;
     long telefono;
     String direccion;
     String obra;
     String artpref;
    ArrayList<Obra> comprasObra;
     ArrayList<Foto> comprasFoto;
     String cobras[];
     String cfotos[];
    
    
    public Cliente(String nombre, String apellido, long telefono,String direccion,String obra,String artpref)
    	 
    {
    	this.nombre=nombre;
    	this.apellido=apellido;
    	this.telefono=telefono;
    	this.direccion=direccion;
    	this.obra=obra;
    	this.artpref=artpref;
    	this.comprasObra=new ArrayList<Obra>(); 
    	this.comprasFoto=new ArrayList<Foto>(); 
    }
    
    
     
     void listarComprasObra()
     {
     	cobras = new String[comprasObra.size()];
    		for(int i = 0; i < comprasObra.size(); i++)
    		{
    			Obra obra = comprasObra.get(i);
    			cobras[i] = obra.getNombre() ;
    			
    		}
    		
     	
     	
     }
     
     
       void listarComprasFoto()
     {
     	cfotos = new String[comprasFoto.size()];
    		for(int i = 0; i < comprasFoto.size(); i++)
    		{
    			Foto foto = comprasFoto.get(i);
    			cfotos[i] = foto.getNombre() ;
    			
    		}
    		
     	
     	
     }
     
     
     void agregarObras(Obra obra)
    {
    this.comprasObra.add(obra);
    }
    
     
     void agregarFotos(Foto foto)
    {
    this.comprasFoto.add(foto);
    }
    
    String getNombre()
    {
    return nombre;	
    	
    	}
 
    
    String getApellido()
    {
    return apellido;
    
    }
    
    long getTelefono()
    {
    return telefono;
    
    }   
    	
    String getDireccion()
    {
    	return direccion;
    } 
    
    String getObra()
    {
    	return obra;
    	
    }
    
    String GetArtPref()
    {
    	return artpref;
    }
    
       

    void setNombre(String n)
    {
    	this.nombre=n;
    }
    
    
    @Override
    public String toString()
    {
    	return ("Nombre: "+getNombre()+" "+getApellido()+"\nTelefono: "+getTelefono()+"\nDireccion: "+getDireccion()+"\nObra: "+getObra()+"\nArtista preferido "+GetArtPref());
    }	
    	
}

