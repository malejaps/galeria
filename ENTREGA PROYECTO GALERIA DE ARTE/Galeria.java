
/* CLASE					Galeria
 * RESPONSABILIDAD			Crear listas y metodos para ser utilizados en otras clases
 * DESCRIPCION				Aplicacion donde se crean los metodos para diferentes clases
 * COLABORACION				Trabaja con las clases:  Artista, Cliente, Eliminar, EliminarArtista, EliminarCliente, EliminarObra
 *							Foto, Fotografo, Inventario, InventarioActual, invListarFotos, invListarObras, ListarArtistasVivos
 *							ListarClientes, ListarCompras, MenuGaleria, MenuInventario, MenuListar, Modificar, ModificarArtista, ModificarCliente
 *							ModificarObra, MostrarArtistaVivo, MostrarClientes, MostrarCompras, Obra, Registrar, RegistarArtista, RegistrarCliente
 *							RegistrarObra, Vender
 */
import java.util.ArrayList;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Galeria {

private String nombre;
 ArrayList<Cliente> clientes;
 ArrayList<Obra> obras;
 ArrayList<Artista> artistas;
 ArrayList<Fotografo> fotografos;
 ArrayList<Foto> fotos;
 
 

    
    public Galeria() 
    {
   
    this.clientes=new ArrayList<Cliente>();	
    this.obras=new ArrayList<Obra>();
    this.artistas=new ArrayList<Artista>();
    this.fotografos=new ArrayList<Fotografo>();  
    this.fotos=new ArrayList<Foto>();  	
    }
    
    String getNombre()
    {
    	return nombre;
    }
    
   
   //agregar a galeria
    void agregarCliente(Cliente cliente)
    {
    this.clientes.add(cliente);
    }
    
    void agregarObra(Obra obra)
    {
    	this.obras.add(obra);
    }
    
    void agregarArtista(Artista artista)
    {
    	this.artistas.add(artista);
    }
    
     void agregarFotografos(Fotografo fotografo)
    {
    	this.fotografos.add(fotografo);
    }
    
     void agregarFoto(Foto foto)
    {
    	this.fotos.add(foto);
    }
    
    //eliminar de galeria
    void eliminarCliente(Cliente cliente)
    {
    	this.clientes.remove(cliente);
    }
    
    void eliminarObra(Obra obra)
    {
    	this.obras.remove(obra);
    }
    
    void eliminarArtista(Artista artista)
    {
    	this.artistas.remove(artista);
    }
    
     void eliminarFotografo(Fotografo fotografo)
    {
    	this.artistas.remove(fotografo);
    }
    
    
     void eliminarFoto(Foto foto)
    {
    	this.fotos.remove(foto);
    }
    
   
   /*//cantidades 
      int cantidadClientes()
  {
  	return this.clientes.size();
  }
  
  
        int cantidadObras()
  {
  	return this.obras.size();
  }
  
   
        int cantidadArtistas()
  {
  	return this.artistas.size();
  }*/
  
  
  
  //obtener
  Cliente obtenerCliente(int pos)
  {
  	
  	return this.clientes.get(pos);
  }
    
    
   Obra obtenerObra(int pos)
  {
  	
  	return this.obras.get(pos);
  }
  
  
   Artista obtenerArtista(int pos)
  {
  	
  	return this.artistas.get(pos);
  } 
   
 
  Fotografo obtenerFotografo(int pos)
  {
  	
  	return this.fotografos.get(pos);
  } 



Foto obtenerFoto(int pos)
  {
  	
  	return this.fotos.get(pos);
  } 

  
   
    /*//listar datos
    void listarClientes()
    {
    int i;
    for(i=0;i<cantidadClientes();i++)
    {
    Cliente cliente=obtenerCliente(i);
    JOptionPane.showMessageDialog(null,cliente.getNombre()+" "+cliente.getApellido()+" "+cliente.getTelefono()+" "+cliente.getDireccion()+" "+cliente.getObra()+" "+cliente.GetArtPref());}
    }
    
    
        void listarObras()
    {
    int i;
    for(i=0;i<cantidadObras();i++)
    {
    Obra obra=obtenerObra(i);
    JOptionPane.showMessageDialog(null,obra.getNombre());}
    }
    
    
    /* void listarArtistas()
    {
    int i;
    for(i=0;i<cantidadArtistas();i++)
    {
    Artista artista=obtenerArtista(i);
    this.artist.add(artista.getNombre());
    
    }
    //return this.artist;
    JOptionPane.showMessageDialog(null,""+cantidadArtistas());
    }*/
    
    
    
    
    //buscar datos
       public Cliente buscarCliente(String nombre, long telefono)
   {
   	
   	Cliente c=null;
   	for(int i=0;i<this.clientes.size();i++)
   	{
   		Cliente cliente=this.clientes.get(i);
   		
   		
   		if((cliente.getNombre().equalsIgnoreCase(nombre))&&(cliente.getTelefono()==telefono))
   		{
   			c=cliente;
   			
   		}
   		
   	}
   	return c;
   }
   	
   	
   	
   	   public boolean buscarCliente2(String nombre, long telefono)
   {
   	
   	boolean c=false;
   	for(int i=0;i<this.clientes.size();i++)
   	{
   		Cliente cliente=this.clientes.get(i);
   		
   		
   		if((cliente.getNombre().equalsIgnoreCase(nombre))&&(cliente.getTelefono()==telefono))
   		{
   			c=true;
   			
   		}
   		
   	}
   	return c;
   }
   
  
    
    
    
    
    Obra buscarObra(long codigo)
    {
    Obra o=null;
   	for(int i=0;i<this.obras.size();i++)
   	{
   		Obra obra=this.obras.get(i);
   		
   		
   		if((obra.getCodigo()==codigo)&&(obra.disponible==true))
   		{
   			o=obra;
   			
   			
   			
   		}
   		
   	}
   	return o;	
    }
    
    
    
    boolean buscarObra2(long codigo)
    {
    boolean o=false;
   	for(int i=0;i<this.obras.size();i++)
   	{
   		Obra obra=this.obras.get(i);
   		
   		
   		if((obra.getCodigo()==codigo)&&(obra.disponible==true))
   		{
   			o=true;
   			
   			
   			
   		}
   		
   	}
   	return o;	
    }
    
    
    
    
      
  public  Artista buscarArtista(String nombre)////para buscar el artista por nombre y devuelva toda la informacion del mismo
   {
   	    Artista art = null;
   	    for(int i = 0; i < this.artistas.size(); i++)
   	    {
   	    	Artista artista = this.artistas.get(i);
   	    	if(nombre.equalsIgnoreCase(artista.getNombre()))
   	    	{
   	    		art = artista;
   	    	}
   	    }
   	    return art;
   }
    
    
    
  
    boolean buscarArtista2(String nombre)
    {
    boolean a=false;
   	for(int i=0;i<this.artistas.size();i++)
   	{
   		Artista artista=this.artistas.get(i);
   		
   		
   		if(artista.getNombre().equalsIgnoreCase(nombre))
   		{
   			a=true;
   			
   			
   			
   		}
   		
   	}
   	return a;	
    }
    
    
    public  Fotografo buscarFotografo(String nombre)////para buscar el artista por nombre y devuelva toda la informacion del mismo
   {
   	    Fotografo art = null;
   	    for(int i = 0; i < this.fotografos.size(); i++)
   	    {
   	    	Fotografo fotografo = this.fotografos.get(i);
   	    	if(nombre.equalsIgnoreCase(fotografo.getNombre()))
   	    	{
   	    		art = fotografo;
   	    	}
   	    }
   	    return art;
   }
    
    
    
    
       boolean buscarFotografo2(String nombre)
    {
    boolean a=false;
   	for(int i=0;i<this.fotografos.size();i++)
   	{
   		Fotografo fotografo=this.fotografos.get(i);
   		
   		
   		if(fotografo.getNombre().equalsIgnoreCase(nombre))
   		{
   			a=true;
   			
   			
   			
   		}
   		
   	}
   	return a;	
    }
    
    
    
    
    
    boolean buscarFoto2(long codigo)
    {
    boolean f=false;
   	for(int i=0;i<this.fotos.size();i++)
   	{
   		Foto foto=this.fotos.get(i);
   		
   		
   		if((foto.getCodigo()==codigo)&&(foto.disponible==true))
   		{
   			f=true;
   			
   			
   			
   		}
   		
   	}
   	return f;	
    }
    
    
      Foto buscarFoto(long codigo)
    {
    Foto f=null;
   	for(int i=0;i<this.fotos.size();i++)
   	{
   		Foto foto=this.fotos.get(i);
   		
   		
   		if((foto.getCodigo()==codigo)&&(foto.disponible==true))
   		{
   			f=foto;
   			
   			
   			
   		}
   		
   	}
   	return f;	
    }
    
    
    
   //vender obras de arte 
    
     void Vender(String n,long t,long codigo)
    {
   // String n=JOptionPane.showInputDialog("Ingrese el nombre del cliente al que le desea vender");
    //long t=Long.parseLong(JOptionPane.showInputDialog("Ingerese el telefono del cliente al que le desea vender"));
    
    Cliente cliente=null;
    cliente=buscarCliente(n,t);
       
    
    if(buscarCliente2(n,t)==true)
    {
    	//long codigo;
    	String confirmacion="";
    	 Obra obrabuscada=null;
    	 Foto fotobuscada=null;
       // codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la obra"));
    
       if(buscarObra2(codigo)==true)
      {	
       
        
        obrabuscada=buscarObra(codigo);
        
        
   			 			
   		confirmacion=JOptionPane.showInputDialog("Desea comprar la obra de arte "+"\nNombre: "+obrabuscada.getNombre(),"\nCodigo: "+obrabuscada.getCodigo());
    	
    	if(confirmacion.equalsIgnoreCase("si"))
    	{
    		
    		obrabuscada.disponible=false;
    		cliente.agregarObras(obrabuscada);
    		JOptionPane.showMessageDialog(null,"La obra "+obrabuscada.getNombre()+" fue vendida al cliente "+cliente.getNombre()+" " +cliente.getApellido());
    		
    	}
    	else
    	{
    	
    	JOptionPane.showMessageDialog(null,"La obra "+obrabuscada.getNombre()+" no fue vendida al cliente "+cliente.getNombre()+" " +cliente.getApellido());
    	//Vender();
    	}}else if(buscarFoto2(codigo)==true)
    	  		
    	{
    	
       
        fotobuscada=buscarFoto(codigo);
        
   			 			
   		confirmacion=JOptionPane.showInputDialog("Desea comprar la obra de arte..."+"\nNombre: "+fotobuscada.getNombre(),"\nCodigo: "+fotobuscada.getCodigo());
    	
    	if(confirmacion.equalsIgnoreCase("si"))
    	{
    		
    		fotobuscada.disponible=false;
    		cliente.agregarFotos(fotobuscada);
    		JOptionPane.showMessageDialog(null,"La foto "+fotobuscada.getNombre()+" fue vendida al cliente "+cliente.getNombre()+" " +cliente.getApellido());
    		
    	}
    	else
    	{
    	
    	JOptionPane.showMessageDialog(null,"La foto "+fotobuscada.getNombre()+" no fue vendida al cliente "+cliente.getNombre()+" " +cliente.getApellido());
    	//Vender();
    	}}else
    	{
    	JOptionPane.showMessageDialog(null,"la obra no se encuentra en el inventario");	
    	}}	
    		
    	
    }
    
   
    
   
    
    //eliminar datos
    
    public void eliminarClienteSeleccionado(String nombre, long telefono)
   {
   	    
    	if(buscarCliente2(nombre,telefono) == true)
    	{
    	      eliminarCliente(buscarCliente(nombre,telefono));
    	      JOptionPane.showMessageDialog(null, "El cliente fue eliminado exitosamente");	
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null, "El cliente ingresado no existe");
    	}
   }
   

    
   public void eliminarArtistaSeleccionado(String nombre)
   {
   	    if(buscarArtista2(nombre) == true)
   	    {
   	    	 eliminarArtista(buscarArtista(nombre));
   	    	 JOptionPane.showMessageDialog(null, "El artista fue eliminado exitosamente");
   	    }
   	    else
   	    {
   	    	JOptionPane.showMessageDialog(null, "El artista ingresado no esta en esta galeria");
   	    }
   }
   
   
   public void eliminarFotografoSeleccionado(String nombre)
   {
   	    if(buscarFotografo2(nombre) == true)
   	    {
   	    	 eliminarFotografo(buscarFotografo(nombre));
   	    	 JOptionPane.showMessageDialog(null, "El fotografo fue eliminado exitosamente");
   	    }
   	    else
   	    {
   	    	JOptionPane.showMessageDialog(null, "El fotografo ingresado no esta en esta galeria");
   	    }
   }
   
   
   public void eliminarObraSeleccionada(long codigo)////////eliminar una obra
   {
   	 if(buscarObra2(codigo) == true)
   	 {
   	 	eliminarObra(buscarObra(codigo));
   	 	JOptionPane.showMessageDialog(null, "La obra fue eliminada exitosamente");
   	 }
   	 else
   	 {
   	 	JOptionPane.showMessageDialog(null, "La obra ingresada no esta en esta galeria");
   	 }
   	 	
   }
   
   
   public void eliminarFotoSeleccionada(long codigo)////////eliminar una foto
   {
   	 if(buscarFoto2(codigo) == true)
   	 {
   	 	eliminarFoto(buscarFoto(codigo));
   	 	JOptionPane.showMessageDialog(null, "La foto fue eliminada exitosamente");
   	 }
   	 else
   	 {
   	 	JOptionPane.showMessageDialog(null, "La fpto ingresada no esta en esta galeria");
   	 }
   	 	
   }
    
}