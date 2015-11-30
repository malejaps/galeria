/* NOMBRE DEL PROGRAMA		EGaleriaDeArte.java
 * FECHA DE CREACION		Noviembre 10 de 2010
 * FECHA DE MODIFICACION	Noviembre de 2010
 * VERSION					0.1
 * AUTOR					Victor Camilo Jimenez
 *							Jairo Andres Leyton
 *							Maria Alejandra Pabon
 *
 * DESCRIPCION				Aplicacion que permite visualizar la aplicacion de Galeria de Arte
 *							
 */

/* CLASE					EGaleriaDeArte
 * RESPONSABILIDAD			Generar la aplicacion Galeria de Arte
 * COLABORACION				Trabaja con las clases:Acercade, Artista, Cliente, Eliminar, EliminarArtista, EliminarCliente, EliminarObra
 *							Foto, Fotografo, Galeria, Inicio, Inventario, InventarioActual, invListarFotos, invListarObras, ListarArtistasVivos
 *							ListarClientes, ListarCompras, MenuGaleria, MenuInventario, MenuListarm Modificar, ModificarArtista, ModificarCliente
 *							ModificarObra, MostrarArtistaVivo, MostrarClientes, MostrarCompras, Obra, Registrar, RegistarArtista, RegistrarCliente
 *							RegistrarObra, Vender
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EGaleriaDeArte{
	
	Galeria galeria = new Galeria();
	RegistrarArtista obj;
	int a=0;
	String artistas[];
	String obras[];
	String nombres[];
	String fotos[];
	String artistasvivos[];
		String fotografos[];
	
	Artista art;
	Fotografo fot;
	


static Cliente c1=new Cliente("Maleja","Pabon",12345,"Calle 1, cra 20","Obra de arte","artista");
static Cliente c2=new Cliente("Ana","Chavez",12345,"Calle 4 cra 34","obra de arte","artista");
static Cliente c3=new Cliente("Martha","Pabon",12345,"Calle 1, cra 20","Obra de arte","artista");
static Cliente c4=new Cliente("Sandra","Pabon",12345,"Calle 1, cra 20","Obra de arte","artista");
static Cliente c5=new Cliente("Sonia","Pabon",12345,"Calle 1, cra 20","Obra de arte","artista");

static Artista a1=new Artista("Fernando Botero","Pintor de figuras humanas robustas","Vivo",100000,500000);
static Artista a2=new Artista("Enrique Grau","Pintor de la presencia humana","Muerto",150000,600000);
static Artista a3=new Artista("Roberto Angulo","Pintor del agua","Vivo",200000,700000);
static Artista a4=new Artista("Jaime Correa","Pintor del misticismo y espiritualidad","Vivo",50000,100000);
static Artista a5=new Artista("Omar Rayo","Pintor abstracto","Muerto",300000,500000);

static Fotografo fot1=new Fotografo("Cédric Tanguy","Fotografo de collages digitales","Vivo",100000,500000);
static Fotografo fot2=new Fotografo("Oleg Duryagin","Fotografo de rostros","Vivo",150000,600000);
static Fotografo fot3=new Fotografo("Nigel Harniman","Fotografo paisajista","Vivo",200000,700000);
static Fotografo fot4=new Fotografo("Chris Anthony","Fotografo gótico","Vivo",50000,100000);
static Fotografo fot5=new Fotografo("Mat Blamires","Fotografo publicitario","Vivo",300000,500000);


//cambiar nombres a obras (son 50/ 5 por cada pintor o artista)
static Obra o1=new Obra("Colombiana","03/10/2010",a1,0,"a");
static Obra o2=new Obra("El Balcón","04/10/2010",a1,1,"b");
static Obra o3=new Obra("Masacre en Colombia","05/09/2010",a1,2,"c");
static Obra o4=new Obra("Mujer Bebiendo","10/09/2010",a1,3,"d");
static Obra o5=new Obra("Mujer Fumando","03/08/2010",a1,4,"r");
static Obra o6=new Obra("Echadora de Cartas","03/10/2010",a2,5,"a");
static Obra o7=new Obra("El Compromiso","03/10/2010",a2,6,"a");
static Obra o8=new Obra("Henry Laguado","04/10/2010",a2,7,"b");
static Obra o9=new Obra("Las Tres Gracias","05/09/2010",a2,8,"c");
static Obra o10=new Obra("Mulata Cartagenera","10/09/2010",a2,9,"d");
static Obra o11=new Obra("Atlántida","03/08/2010",a3,10,"r");
static Obra o12=new Obra("Bebedero","03/10/2010",a3,11,"a");
static Obra o13=new Obra("Canoa","04/10/2010",a3,12,"b");
static Obra o14=new Obra("Jonas","05/09/2010",a3,13,"c");
static Obra o15=new Obra("Proa","10/09/2010",a3,14,"d");//
static Obra o16=new Obra("Castillo de Salgar","03/08/2010",a4,15,"r");
static Obra o17=new Obra("Desnudo","03/10/2010",a4,16,"a");
static Obra o18=new Obra("Extasis de Santa Teresa","04/10/2010",a4,17,"b");
static Obra o19=new Obra("Homenaje a Bernini","05/09/2010",a4,18,"c");
static Obra o20=new Obra("Taller de Piero della Francesca","10/09/2010",a4,19,"d");
static Obra o21=new Obra("Corteza del Arcoiris","03/10/2010",a5,20,"a");
static Obra o22=new Obra("El Pájaro del Río","04/10/2010",a5,21,"b");
static Obra o23=new Obra("Embrión de Dragón XXII","05/09/2010",a5,22,"c");
static Obra o24=new Obra("Embrión de Dragón XXVIII","10/09/2010",a5,23,"d");
static Obra o25=new Obra("Trama para una Metáfora","03/08/2010",a5,24,"r");



static Foto f1=new Foto("David Guetta II","03/08/2010",fot1,25,"a");
static Foto f2=new Foto("La Dernière Part en Pendentif","03/08/2010",fot1,26,"a");
static Foto f3=new Foto("Le Revue de Troupe","03/08/2010",fot1,27,"a");
static Foto f4=new Foto("Maryvonne & Michel Fleury","03/08/2010",fot1,28,"a");
static Foto f5=new Foto("Toy,David Guetta & Henri Maurel","03/08/2010",fot1,29,"a");
static Foto f6=new Foto("Cheburashka","03/08/2010",fot2,30,"a");
static Foto f7=new Foto("Minimal Black","03/08/2010",fot2,31,"a");
static Foto f8=new Foto("Nurse 2","03/08/2010",fot2,32,"a");
static Foto f9=new Foto("Sergei","03/08/2010",fot2,33,"a");
static Foto f10=new Foto("Swimmer","03/08/2010",fot2,34,"a");
static Foto f11=new Foto("Dry Lake Bed","03/08/2010",fot3,35,"a");
static Foto f12=new Foto("Indian Boy Walking","03/08/2010",fot3,36,"a");
static Foto f13=new Foto("Indian Lake and Fishermen","03/08/2010",fot3,37,"a");
static Foto f14=new Foto("Lake Palace India","03/08/2010",fot3,38,"a");
static Foto f15=new Foto("Pier and Lake","03/08/2010",fot3,39,"a");
static Foto f16=new Foto("Jane","03/08/2010",fot4,40,"a");
static Foto f17=new Foto("Kiss It Dont Hold","03/08/2010",fot4,41,"a");
static Foto f18=new Foto("Lauren","03/08/2010",fot4,42,"a");
static Foto f19=new Foto("Wednesday","03/08/2010",fot4,43,"a");
static Foto f20=new Foto("Zooey 2 Final","03/08/2010",fot4,44,"a");
static Foto f21=new Foto("American Express Platinum Card","03/08/2010",fot5,45,"a");
static Foto f22=new Foto("Discovery Communications","03/08/2010",fot5,46,"a");
static Foto f23=new Foto("Nokia 5500","03/08/2010",fot5,47,"a");
static Foto f24=new Foto("Sony","03/08/2010",fot5,48,"a");
static Foto f25=new Foto("Water Blot","03/08/2010",fot5,49,"a");






     EGaleriaDeArte()
{
            
            
            
            galeria.agregarCliente(c1);
    		galeria.agregarCliente(c2);
    		galeria.agregarCliente(c3);
    		galeria.agregarCliente(c4);
    		galeria.agregarCliente(c5);
    		
    		galeria.agregarArtista(a1);
    		galeria.agregarArtista(a2);
    		galeria.agregarArtista(a3);
    		galeria.agregarArtista(a4);
    		galeria.agregarArtista(a5);
    		
    		galeria.agregarObra(o1);
    		galeria.agregarObra(o2);
    		galeria.agregarObra(o3);
    		galeria.agregarObra(o4);
    		galeria.agregarObra(o5);    			
    		galeria.agregarObra(o6);
    		galeria.agregarObra(o7);
    		galeria.agregarObra(o8);
    		galeria.agregarObra(o9);
    		galeria.agregarObra(o10);
    		galeria.agregarObra(o11);
    		galeria.agregarObra(o12);
    		galeria.agregarObra(o13);
    		galeria.agregarObra(o14);
    		galeria.agregarObra(o15);    			
    		galeria.agregarObra(o16);
    		galeria.agregarObra(o17);
    		galeria.agregarObra(o18);
    		galeria.agregarObra(o19);
    		galeria.agregarObra(o20);
    		galeria.agregarObra(o21);
    		galeria.agregarObra(o22);
    		galeria.agregarObra(o23);
    		galeria.agregarObra(o24);
    		galeria.agregarObra(o25);
    		
    		galeria.agregarFoto(f1);
    		galeria.agregarFoto(f2);
    		galeria.agregarFoto(f3);
    		galeria.agregarFoto(f4);
    		galeria.agregarFoto(f5);
    		galeria.agregarFoto(f6);
    		galeria.agregarFoto(f7);
    		galeria.agregarFoto(f8);
    		galeria.agregarFoto(f9);
    		galeria.agregarFoto(f10);
    		galeria.agregarFoto(f11);
    		galeria.agregarFoto(f12);
    		galeria.agregarFoto(f13);
    		galeria.agregarFoto(f14);
    		galeria.agregarFoto(f15);
    		galeria.agregarFoto(f16);
    		galeria.agregarFoto(f17);
    		galeria.agregarFoto(f18);
    		galeria.agregarFoto(f19);
    		galeria.agregarFoto(f20);
    		galeria.agregarFoto(f21);
    		galeria.agregarFoto(f22);
    		galeria.agregarFoto(f23);
    		galeria.agregarFoto(f24);
    		galeria.agregarFoto(f25);
	        
	        
	        galeria.agregarFotografos(fot1);
    		galeria.agregarFotografos(fot2);
    		galeria.agregarFotografos(fot3);
    		galeria.agregarFotografos(fot4);
    		galeria.agregarFotografos(fot5);
	        
	        //falta agregar las 50 obras
	        
	        /*if(a==1)
	        {
	        JOptionPane.showMessageDialog(null,"LISTO ");	
	        galeria.agregarArtista(art);
	        }*/
	
	
}


	public void listaNombres()
    	{
    		
    		nombres = new String[galeria.clientes.size()];
    		for(int i = 0; i < galeria.clientes.size(); i++)
    		{
    			Cliente cliente = galeria.clientes.get(i);
    			nombres[i] = cliente.getNombre() +" "+  cliente.getTelefono();
    			
    		}
    		
    	}







    void listarFotografos()
    {
    	
    	fotografos=new String[galeria.fotografos.size()];
    int i;
    for(i=0;i<galeria.fotografos.size();i++)
    {
    Fotografo fotografo=galeria.obtenerFotografo(i);
    fotografos[i]=fotografo.getNombre();
    
    }
    
   
    }
    
    
    
    
      
    
    void listarArtistas()
    {
    	
    	artistas=new String[galeria.artistas.size()];
    int i;
    for(i=0;i<galeria.artistas.size();i++)
    {
    Artista artista=galeria.obtenerArtista(i);
    artistas[i]=artista.getNombre();
    
    }
    
   
    }
    
    
    
    
    void listarArtistasVivos()
    {
    	artistasvivos=new String[galeria.artistas.size()];
    
    for(int i=0;i<galeria.artistas.size();i++)
    {
    Artista artista=galeria.obtenerArtista(i);	
    	
    
    if(artista.getEstado().equalsIgnoreCase("vivo"))
    {
   
    artistasvivos[i]=artista.getNombre();
      
     }
    }
   
   //JOptionPane.showMessageDialog(null,artistasvivos);
    }
    
    
    
    
     void listarObras(Artista artista)
    {  
    	int i=0;
    	int m=0;
    	  for(i=0;i<galeria.artistas.size();i++)
    	if(artista.getNombre().equalsIgnoreCase(galeria.obtenerArtista(i).getNombre()))
    	{
    	
    	
    	if(i==0)
    	{
    		
    		obras=new String[galeria.obras.size()];
    
    for(m=0;m<=4;m++)
    {
    	
    Obra obra=galeria.obtenerObra(m);
    obras[m]=obra.getNombre();
    
    }
    	}	
    	
    	   	
    	
    	else if(i==1)
    	{
    	
    	obras=new String[galeria.obras.size()];
    
   int v=0;
    for(m=5;m<=9;m++)
    {
    	
    	
    Obra obra=galeria.obtenerObra(m);
    
    
    obras[v]=obra.getNombre();
     	
    v++;		
    	}}	
    	
    	
    	
    	else if(i==2)
    	{
    	obras=new String[galeria.obras.size()];
    
    int v=0;
    for(m=10;m<=14;m++)
    {
    	
    Obra obra=galeria.obtenerObra(m);
    obras[v]=obra.getNombre();
    v++;	
    	}}
    	
    	
    	
    	else if(i==3)
    	{
    		obras=new String[galeria.obras.size()];
    
    int v=0;
    for(m=15;m<=19;m++)
    {
    	
    Obra obra=galeria.obtenerObra(m);
    obras[v]=obra.getNombre();
    v++;		
    	}}
    		
    	
    	else if(i==4)
    	{
    	
    	obras=new String[galeria.obras.size()];
    
    int v=0;
    for(m=20;m<=24;m++)
    {
    	
    Obra obra=galeria.obtenerObra(m);
    obras[v]=obra.getNombre();
    		
    v++;		
    	}}}}
    	
    	
    	
    	
    	
    	
    	
    	
    	void listarObrasActual(Artista artista)
    {  
    	int i=0;
    	int m=0;
    	  for(i=0;i<galeria.artistas.size();i++)
    	if(artista.getNombre().equalsIgnoreCase(galeria.obtenerArtista(i).getNombre()))
    	{
    	
    	
    	if(i==0)
    	{
    		
    		obras=new String[galeria.obras.size()];
    		
    
    for(m=0;m<=4;m++)
    {
    	
    Obra obra=galeria.obtenerObra(m);
    
    
    if(obra.disponible==false)
    { obras[m]="";}
    else
    {
    	obras[m]=obra.getNombre();
    }
    }
    	}	
    	
    	   	
    	
    	else if(i==1)
    	{
    	
    	obras=new String[galeria.obras.size()];
    
   int v=0;
    for(m=5;m<=9;m++)
    {
    	
    	
    Obra obra=galeria.obtenerObra(m);
    
   if(obra.disponible==false)
    { obras[v]="";}
    else{obras[v]=obra.getNombre();}
     	
    v++;		
    	}}	
    	
    	
    	
    	else if(i==2)
    	{
    	obras=new String[galeria.obras.size()];
    
    int v=0;
    for(m=10;m<=14;m++)
    {
    	
    Obra obra=galeria.obtenerObra(m);
    if(obra.disponible==false)
    { obras[v]="";}
    else{obras[v]=obra.getNombre();}
    v++;	
    	}}
    	
    	
    	
    	else if(i==3)
    	{
    		obras=new String[galeria.obras.size()];
    
    int v=0;
    for(m=15;m<=19;m++)
    {
    	
    Obra obra=galeria.obtenerObra(m);
   if(obra.disponible==false)
    { obras[v]="";}
    else{obras[v]=obra.getNombre();}
    v++;		
    	}}
    		
    	
    	else if(i==4)
    	{
    	
    	obras=new String[galeria.obras.size()];
    
    int v=0;
    for(m=20;m<=24;m++)
    {
    	
    Obra obra=galeria.obtenerObra(m);
    if(obra.disponible==false)
    { obras[v]="";}
    else{obras[v]=obra.getNombre();}
    		
    v++;		
    	}}}}
    	
    	
    	
   	
   	
   	
    	
    	
    	
    	 void listarFotosActual(Fotografo fotografo)
    {  
    	int i=0;
    	int m=0;
    	  for(i=0;i<galeria.fotografos.size();i++)
    	if(fotografo.getNombre().equalsIgnoreCase(galeria.obtenerFotografo(i).getNombre()))
    	{
    	
    	
    	if(i==0)
    	{
    		
    		fotos=new String[galeria.fotos.size()];
    int v=0;
    for(m=0;m<=4;m++)
    {
    	
    Foto foto=galeria.obtenerFoto(m);
    
    if(foto.disponible==false)
    {
    	fotos[v]="";
    }
    else{fotos[v]=foto.getNombre();}
    v++;
    }
    	}	
    	
    	   	
    	
    	else if(i==1)
    	{
    	
    	fotos=new String[galeria.fotos.size()];
    int v=0;
    for(m=5;m<=9;m++)
    {
    	
    Foto foto=galeria.obtenerFoto(m);
    if(foto.disponible==false)
    {
    	fotos[v]="";
    }
    else{fotos[v]=foto.getNombre();}
    v++;	
    		
    	}}	
    	
    	
    	
    	else if(i==2)
    	{
    	fotos=new String[galeria.fotos.size()];
    int v=0;
    for(m=10;m<=14;m++)
    {
    	
    Foto foto=galeria.obtenerFoto(m);
    if(foto.disponible==false)
    {
    	fotos[v]="";
    }
    else{fotos[v]=foto.getNombre();}
    v++;	
    	}}
    	
    	
    	
    	else if(i==3)
    	{
    		fotos=new String[galeria.fotos.size()];
    int v=0;
    for(m=15;m<=19;m++)
    {
    	
    Foto foto=galeria.obtenerFoto(m);
    if(foto.disponible==false)
    {
    	fotos[v]="";
    }
    else{fotos[v]=foto.getNombre();}
    v++;		
    	}}
    		
    	
    	else if(i==4)
    	{
    	
    	fotos=new String[galeria.fotos.size()];
    int v=0;
    for(m=20;m<=24;m++)
    {
    	
    Foto foto=galeria.obtenerFoto(m);
    if(foto.disponible==false)
    {
    	fotos[v]="";
    }
    else{fotos[v]=foto.getNombre();}
    v++;		
    		
    	}}}
    	
    	}
    	
    	
    	
   
   
   	 void listarFotos(Fotografo fotografo)
    {  
    	int i=0;
    	int m=0;
    	  for(i=0;i<galeria.fotografos.size();i++)
    	if(fotografo.getNombre().equalsIgnoreCase(galeria.obtenerFotografo(i).getNombre()))
    	{
    	
    	
    	if(i==0)
    	{
    		
    		fotos=new String[galeria.fotos.size()];
    int v=0;
    for(m=0;m<=4;m++)
    {
    	
    Foto foto=galeria.obtenerFoto(m);
    fotos[v]=foto.getNombre();
    v++;
    }
    	}	
    	
    	   	
    	
    	else if(i==1)
    	{
    	
    	fotos=new String[galeria.fotos.size()];
    int v=0;
    for(m=5;m<=9;m++)
    {
    	
    Foto foto=galeria.obtenerFoto(m);
    fotos[v]=foto.getNombre();
    v++;	
    		
    	}}	
    	
    	
    	
    	else if(i==2)
    	{
    	fotos=new String[galeria.fotos.size()];
    int v=0;
    for(m=10;m<=14;m++)
    {
    	
    Foto foto=galeria.obtenerFoto(m);
    fotos[v]=foto.getNombre();
    v++;	
    	}}
    	
    	
    	
    	else if(i==3)
    	{
    		fotos=new String[galeria.fotos.size()];
    int v=0;
    for(m=15;m<=19;m++)
    {
    	
    Foto foto=galeria.obtenerFoto(m);
    fotos[v]=foto.getNombre();
    v++;		
    	}}
    		
    	
    	else if(i==4)
    	{
    	
    	fotos=new String[galeria.fotos.size()];
    int v=0;
    for(m=20;m<=24;m++)
    {
    	
    Foto foto=galeria.obtenerFoto(m);
    fotos[v]=foto.getNombre();
    v++;		
    		
    	}}}
    	
    	}
    	
    	
    	
    	
    	
    	
    	void registrarArtista(Artista artista)
{
	
    a=1;
    this.art=artista;
    //galeria.agregarArtista(artista);

}
    
    




  public static void main(String args[])
  {
  	

 
    
   	Inicio aplicacion=new Inicio();
   	JFrame.setDefaultLookAndFeelDecorated(true);
   aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
	
  	
	
		
   	
   		
    
    	
  }
  	
  }
    
    
