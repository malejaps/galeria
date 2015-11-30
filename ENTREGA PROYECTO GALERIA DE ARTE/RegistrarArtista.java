/* CLASE					RegistrarArtista
 * RESPONSABILIDAD			Registrar un artista en la galeria
 * DESCRIPCION				Aplicacion que registra a un artista en la galeria
 * COLABORACION				Trabaja con las clases: Artista, Galeria, EgaleriaDeArte, Registrar
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrarArtista extends JFrame 

{
      
    
    
    private JLabel titulo,titulo2,titulo3,nombre,especialidad,estado,iprecio,fprecio, frase;
    private JTextField nom,espe,estad,ipreci,fpreci;
    private JButton botonRegistrar;
    
    	int a=0;
    	int listo=0;
    		String	nomb="";
    	    String	esp="";
    	    String	esta="";
    	    long  ipr=0;
    	    long 	fpr=0;
    
    Galeria galeria=new Galeria();
    Artista art;
    
     Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,13);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
     
     Container ventana;
    public RegistrarArtista() 
    {
    	super ("Registrar artista");
        ventana=getContentPane();
    	ventana.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( RegistrarArtista.this,
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
    	titulo= new JLabel("REGISTRAR ARTISTA");
    	titulo.setToolTipText("Registrar artista en picasa");
    	titulo.setForeground(Color.blue);
    	titulo.setFont(fuente3);  
    	titulo.setBounds(150,50,500,20);
    	ventana.add(titulo);
    	
    	titulo2= new JLabel("GALERIA",icono,SwingConstants.LEFT);
    	titulo2.setForeground(Color.black);
    	titulo2.setFont(fuente);
    	titulo2.setToolTipText("Menu Picasa");
    	titulo2.setBounds(20,20,500,20);
    	ventana.add(titulo2);
    	
    	titulo3=new JLabel("PICASA");
    	titulo3.setForeground(Color.black);
    	titulo3.setFont(fuente);
    	titulo3.setBounds(30,40,500,20);
    	ventana.add(titulo3);

    	frase=new JLabel("ARTISTA_______________________________________________________");
        frase.setForeground(Color.black);
    	frase.setFont(fuente2);
    	frase.setBounds(10,80,500,20);
    	ventana.add(frase);
    			
        nombre=new JLabel("Nombre del artista ");
    	nombre.setForeground(Color.black);
    	nombre.setFont(fuente2);
    	nombre.setBounds(20,110,150,20);
    	ventana.add(nombre);
    	
    	especialidad=new JLabel("Especialidad ");
    	especialidad.setForeground(Color.black);
    	especialidad.setFont(fuente2);
    	especialidad.setBounds(20,130,100,20);
    	ventana.add(especialidad);
    	
    		
    	estado=new JLabel("Estado: ");
    	estado.setForeground(Color.black);
    	estado.setFont(fuente2);
    	estado.setBounds(20,150,100,20);
    	ventana.add(estado);
    	
   
    	iprecio=new JLabel("Precio minimo de sus obras: ");
    	iprecio.setForeground(Color.black);
    	iprecio.setFont(fuente2);
    	iprecio.setBounds(20,170,200,20);
    	ventana.add(iprecio);
    	
    		
    	fprecio=new JLabel("Precio maximo de sus obras: ");
    	fprecio.setForeground(Color.black);
    	fprecio.setFont(fuente2);
    	fprecio.setBounds(20,190,200,20);
    	ventana.add(fprecio);
    	
    	nom=new JTextField(50);
    	nom.setBounds(220,110,100,20);
    	ventana.add(nom);
    	
    	espe=new JTextField(50);
    	espe.setBounds(220,130,100,20);
    	ventana.add(espe);
    	
    	estad=new JTextField(50);
    	estad.setBounds(220,150,100,20);
    	ventana.add(estad);
    	
         ipreci =new JTextField(50);
    	ipreci.setBounds(220,170,100,20);
    	ventana.add(ipreci);
    	
    	fpreci=new JTextField(50);
    	fpreci.setBounds(220,190,100,20);
    	ventana.add(fpreci);
    	
    
    	//Creacion de botones
    	
    	botonRegistrar=new JButton("Finalizar" );//TAMBIEN SE PUEDE PONER UN BOTON CON UNA IAMGEN AL LADO
    	botonRegistrar.setForeground(Color.white);
    	botonRegistrar.setFont(fuente2);
    	botonRegistrar.setBackground(Color.black);
    	botonRegistrar.setBounds(330,350,95,20);
    	ventana.add(botonRegistrar);
    	
    	ManejadorBoton manejador=new ManejadorBoton();
    	nom.addActionListener(manejador);
    	espe.addActionListener(manejador);
    	estad.addActionListener(manejador);
    	ipreci.addActionListener(manejador);
    	fpreci.addActionListener(manejador);
    	
    	
    	botonRegistrar.addActionListener(manejador);	
    	
    	ventana.setBackground(Color.white);
    	setSize(500,400);
    	setVisible(true);
    	
    }
    
    private class ManejadorBoton extends EGaleriaDeArte implements ActionListener
    {
    
    
    	public void actionPerformed(ActionEvent evento)
    	{
    	
    	     
    	    try{    	    
    	    nomb=nom.getText();
    	    }
    	    catch(Exception ex){
    	    	JOptionPane.showMessageDialog(null,"error en ingreso de nombre ."+ex);
    	     a=1;
    	    }
    	    try{
           esp=espe.getText();
           }
    	    catch(Exception exc){
    	    	JOptionPane.showMessageDialog(null,"error en ingreso de especialidad  ."+exc);
    	    	 a=1;
    	    }
    	    try{
           esta=estad.getText();
           }
    	    catch(Exception excp){
    	    	JOptionPane.showMessageDialog(null,"error en ingreso de estado ."+excp);
    	      a=1;
    	    }
    	    try{
           ipr=Long.parseLong(ipreci.getText());
           }
           
    	    catch(Exception excpt){
    	    	JOptionPane.showMessageDialog(null,"error en ingreso de precio minimo ."+excpt);
    	     a=1;
    	    }
    	   try{
           fpr=Long.parseLong(fpreci.getText());
           }
    	    catch(Exception excpti){
    	    	JOptionPane.showMessageDialog(null,"error en ingreso de precio maximo ."+excpti);
    	    	 a=1;
    	    }
    	   
    	   
    	    
    	    
    		if(evento.getSource()==botonRegistrar)
    		{
    		if(a==0)
    		{
    		  art=new Artista(nomb,esp,esta,ipr,fpr);	
    		  galeria.agregarArtista(art);
    		 
    		 //registrarArtista(art);
    		/* if(galeria.buscarArtista2(nomb)==true)
    	    {
    		 JOptionPane.showMessageDialog(null,"El artista ya se encuentra registrado ");
    		}
    		 else
    		 {JOptionPane.showMessageDialog(null,"Se registro el Artista "+nomb);
    		 
    		 }*/
    		 JOptionPane.showMessageDialog(null,"Se registro el Artista "+nomb);
            
            setVisible(false); 
            }}
            if(a==1){
             setVisible(true); 	
            }
    		   			
    		}
            
    		}
    		
    				
    	}
    	
    
    
    
    
    
    
    
    
   
    
