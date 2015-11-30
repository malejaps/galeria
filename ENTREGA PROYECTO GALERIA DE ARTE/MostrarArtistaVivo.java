/* CLASE					MostrarArtistasVivos
 * RESPONSABILIDAD			Mostrar la informacion de un artista vivo
 * DESCRIPCION				Aplicacion que muestra la informacion de un artista vivo
 * COLABORACION				Trabaja con las clases: ListarArtistasVivos
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MostrarArtistaVivo extends JFrame 

{
     JLabel titulo,titulo2, titulo3,nombre,especialidad,estado,iprecio,fprecio;
     
   
    Galeria galeria =new Galeria(); 
    	EGaleriaDeArte gal=new EGaleriaDeArte();
    
     
     Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,15);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
     Font fuente4=new Font("Segoe Script",Font.BOLD,15);
  
  
   
  
    public MostrarArtistaVivo(Artista artista) 
    {
    	super ("ARTISTA VIVO");
    	Container ventana1=getContentPane();
    	ventana1.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( MostrarArtistaVivo.this,
                  "Programa creado para organizacion y inventariado de una galeria de arte\n\n Creado por : \n JAIRO ANDRES LEYTON  \n MARIA ALEJANDRA PABON  \n VICTOR CAMILO JIMENEZ \n\n\n\nVersion 1.0 \n\n ",
                  "Acerca de", JOptionPane.PLAIN_MESSAGE );
            } 	
    }
    	);
   JMenuItem ayuda = new JMenuItem( "Ayuda " );
   ayuda.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              Acercade obj=new Acercade();
            } 	
    }
    	); 
    
      
      menuAyuda.add( ayuda);
      menuAyuda.add( acercade );
      
       	
    JMenuItem elementoSalir = new JMenuItem( "Salir Del programa" );
      elementoSalir.setMnemonic( 'S' );
      menuAyuda.add( elementoSalir );
      elementoSalir.addActionListener(

         new ActionListener() {  

           
            public void actionPerformed( ActionEvent evento )
            {
               System.exit( 0 );
            }

         }  

      ); 	
    	//creacion de barra
    	JMenuBar barra = new JMenuBar();  
      setJMenuBar( barra );  
      barra.add( menuAyuda ); 
    	
    	
    	//FIN MENU INICIO
    	
    	  ImageIcon icono=new ImageIcon("arte1.gif");
    
    	
    	
    	//Creacion de etiquetas
    		titulo= new JLabel("GALERIA",icono,SwingConstants.LEFT);
    	titulo.setForeground(Color.black);
    	titulo.setFont(fuente);
    	titulo.setToolTipText("Menu Picasa");
    	titulo.setBounds(20,20,500,20);
    	ventana1.add(titulo);
    	
    	titulo2=new JLabel("PICASA");
    	titulo2.setForeground(Color.black);
    	titulo2.setFont(fuente);
    	titulo2.setBounds(30,40,500,20);
    	ventana1.add(titulo2);
    	
    	
    	
    	//Creacion de label
    
        	    	
    	titulo3= new JLabel("ARTISTA VIVO");
    	titulo3.setToolTipText("Mostrar artista vivo en picasa");
    	titulo3.setForeground(Color.blue);
    	titulo3.setFont(fuente3);    	
    	titulo3.setBounds(150,50,500,30);
    	ventana1.add(titulo3);
           	
        nombre=new JLabel ("Nombre:                 "+artista.getNombre());
        nombre.setForeground(Color.black);
    	nombre.setFont(fuente2);
    	nombre.setBounds(20,110,500,20);
    	ventana1.add(nombre);
           
        especialidad=new JLabel("Especialidad:            "+artista.getEspecialidad());
    	especialidad.setForeground(Color.black);
    	especialidad.setFont(fuente2);
    	especialidad.setBounds(20,130,500,20);
    	ventana1.add(especialidad);
    	
    		
    	estado=new JLabel("Estado:                   "+artista.getEstado());
    	estado.setForeground(Color.black);
    	estado.setFont(fuente2);
    	estado.setBounds(20,150,500,20);
    	ventana1.add(estado);
    	
   
    	iprecio=new JLabel("Intervalo de precios:  "+String.valueOf(artista.getIprecio())+" - " +String.valueOf(artista.getFprecio()));
    	iprecio.setForeground(Color.black);
    	iprecio.setFont(fuente2);
    	iprecio.setBounds(20,170,500,20);
    	ventana1.add(iprecio);
    	
    		
    /*	fprecio=new JLabel();
    	fprecio.setForeground(Color.black);
    	fprecio.setFont(fuente2);
    	fprecio.setBounds(580,170,500,20);
    	ventana1.add(fprecio);*/
    	
        
    
    	ventana1.add(titulo);
    	ventana1.add(titulo2);
    	ventana1.add(titulo3);
    	ventana1.add(nombre);
    	ventana1.add(especialidad);
    	ventana1.add(estado);
    	ventana1.add(iprecio);
    	//ventana1.add(fprecio);
    	
    		
    	
    	ventana1.setBackground(Color.white);
    	setSize(500,300);
    	setVisible(true);
    	
    	
    	
   
    }
    

    
    
    
  
    

}