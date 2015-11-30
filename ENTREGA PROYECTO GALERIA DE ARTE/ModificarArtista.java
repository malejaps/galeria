/* CLASE					ModificarArtista
 * RESPONSABILIDAD			Modificar un artista
  * DESCRIPCION				Aplicacion que modifica un artista de la galeria
 * COLABORACION				Trabaja con las clases: Galeria, Artista, EGaleriaDeArte, Modificar
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ModificarArtista extends JFrame{

    JLabel frase,frase2,titulo3,titulo,titulo2,nombre;
    JRadioButton botonNombre,botonEspecialidad,botonEstado,botonIprecios,botonFprecios;
    JButton buscar,salir;
    ButtonGroup grupoBotonesOpcion;
    JTextField nom,tel,ncliente,apcliente;
    Container ventana2;
    
    
    Galeria galeria=new Galeria();
    		
    	   		
    		
    		
    		
    		String n="";
    		String nomb="";
    		String apellido,especialidad,estado;
    		long inicioP,finalP;
    		String m="";
    
     
     Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,15);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
     Font fuente4=new Font("Segoe Script",Font.BOLD,15);
     
    public ModificarArtista() 
    {
    	super("ModificarArtista");
    	ventana2=getContentPane();
    	ventana2.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( ModificarArtista.this,
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
    	    	
    	titulo3= new JLabel("MODIFICAR ARTISTA");
    	titulo3.setToolTipText("Modificar artista en picasa");
    	titulo3.setForeground(Color.blue);
    	titulo3.setFont(fuente3);    	
    	titulo3.setBounds(150,50,500,30);
    	ventana2.add(titulo3);
    	
    	titulo= new JLabel("GALERIA",icono,SwingConstants.LEFT);
    	titulo.setForeground(Color.black);
    	titulo.setFont(fuente);
    	titulo.setToolTipText("Menu Picasa");
    	titulo.setBounds(20,20,500,20);
    	ventana2.add(titulo);
    	
    	titulo2=new JLabel("PICASA");
    	titulo2.setForeground(Color.black);
    	titulo2.setFont(fuente);
    	titulo2.setBounds(30,40,500,20);
    	ventana2.add(titulo2);
    	
    	frase= new JLabel("ARTISTA_______________________________________________________");
    	frase.setForeground(Color.black);
    	frase.setFont(fuente4);    	
    	frase.setBounds(50,80,500,30);
    	ventana2.add(frase);
    	
    	
    	nombre= new JLabel("Nombre del artista");
    	nombre.setForeground(Color.black);
    	nombre.setFont(fuente4);    	
    	nombre.setBounds(70,110,500,30);  
    	ventana2.add(nombre);
    	
    
    	
    	frase2= new JLabel("¿Que informacion desea modificar del artista  ?" );
    	frase2.setForeground(Color.black);
    	frase2.setFont(fuente4);    	
    	frase2.setBounds(50,180,500,30);
    	ventana2.add(frase2);
    	
    	
    		
    	//creacion de jText
    	nom=new JTextField(50);
    	nom.setBounds(230,115,100,20);
    	ventana2.add(nom);
    	
    	
    	//creacion de boton
    	buscar=new JButton("BUSCAR");
    	buscar.setBackground(Color.black);
    	buscar.setForeground(Color.white);
    	buscar.setFont(fuente4);
    	buscar.setBounds(50,160,200,20);
    	ventana2.add(buscar);
    	
        salir=new JButton("SALIR");
    	salir.setBackground(Color.black);
    	salir.setForeground(Color.white);
    	salir.setFont(fuente4);
    	salir.setBounds(150,390,200,20);
    	ventana2.add(salir);
    	
    	
    	
    	//Creacion de botones radio 
    	botonNombre=new JRadioButton("Modificar nombre",true);
    	botonNombre.setForeground(Color.black);
    	botonNombre.setFont(fuente2);
    	botonEspecialidad=new JRadioButton("Modificar especialidad",true);
    	botonEspecialidad.setForeground(Color.black);
    	botonEspecialidad.setFont(fuente2);
    	botonEstado=new JRadioButton("Modificar estado",true);
    	botonEstado.setForeground(Color.black);
    	botonEstado.setFont(fuente2);
    	botonIprecios=new JRadioButton("Modificar inicio de \nintervalo de precios",true);
    	botonIprecios.setForeground(Color.black);
    	botonIprecios.setFont(fuente2);
    	botonFprecios=new JRadioButton("Modificar final de \nintervalo de precios",true);
    	botonFprecios.setForeground(Color.black);
    	botonFprecios.setFont(fuente2);
    	
    	
    	botonNombre.setBounds(100,210,300,30);
    	botonEspecialidad.setBounds(100,240,300,30);
    	botonEstado.setBounds(100,270,300,30);
    	botonIprecios.setBounds(100,300,300,30);
    	botonFprecios.setBounds(100,330,300,30);
    	
    	ventana2.add(botonNombre);
    	ventana2.add(botonEspecialidad);
        ventana2.add(botonEstado);
        ventana2.add(botonIprecios);
        ventana2.add(botonFprecios);
        
        
        //relacion entre los objeto JRadioButton, aparecera el primer boton de la lista selccionado por defecto
        grupoBotonesOpcion=new ButtonGroup();
        grupoBotonesOpcion.add(botonNombre);
        grupoBotonesOpcion.add(botonEspecialidad);
        grupoBotonesOpcion.add(botonEstado);
        grupoBotonesOpcion.add(botonIprecios);
        grupoBotonesOpcion.add(botonFprecios);
                
    	    
    	//registro de eventos
        ManejadorBoton manejador=new ManejadorBoton();	
        botonNombre.addActionListener(manejador);
        botonEspecialidad.addActionListener(manejador);
        botonEstado.addActionListener(manejador);
        botonIprecios.addActionListener(manejador);
        botonFprecios.addActionListener(manejador);
        buscar.addActionListener(manejador);
        salir.addActionListener(manejador);
    	
    	ventana2.setBackground(Color.white);
    	setSize(650,500);
    	setVisible(true);
    	
    }
    
    private class ManejadorBoton extends EGaleriaDeArte implements ActionListener
    {
     	
    	public void actionPerformed(ActionEvent evento)
    	{
    		
    	  
    	  
    	 Artista artista=null;
    	     	 
    	 int a=1;
    	 
    	
    	  	try
    	  	{
    	  
    	  		n=nom.getText();
    		
    		}
    		catch(Exception exp)
    		{
    			
    		}
    		
    		
    	  
    	  if(galeria.buscarArtista2(n)==true)
    	 {
    	
    		artista=galeria.buscarArtista(n);
    		a=1;
    	 	
    	 	}else
    	 {
    	 m=JOptionPane.showInputDialog("El artista ingresado no existe\nDesea registrarlo?");
    	 
    	 if(m.equalsIgnoreCase("si"))
    	 {	RegistrarArtista rc=new RegistrarArtista();
    	 	
    	 }}
    	  
    	   if(evento.getSource()==buscar)
    	  {
    	  	if(a==1)
    	  {
    	  	
    	  	JOptionPane.showMessageDialog(null,"Va a modificar los datos del artista ");	
    	  }
    	  
    	  }
    	  
    		
    		if(evento.getSource()==botonNombre)
    		{
    	    
    	    nomb=JOptionPane.showInputDialog("Ingrese el nuevo nombre");
    	    artista.nombre=nomb;
    	    
    	    JOptionPane.showMessageDialog(null,"El nombre fue cambiado por "+nombre);
    	    
    
    		
    		}
    	    if(evento.getSource()==botonEspecialidad)
    		{
    	     
    		especialidad=JOptionPane.showInputDialog("Ingrese la nueva especialidad");
    		artista.especialidad=especialidad;
    		}
    	    if(evento.getSource()==botonEstado)
    		{
    		estado=JOptionPane.showInputDialog("Ingrese el nuevo estado del artista.\nVivo/Muerto");
    	    

    		}
    		if(evento.getSource()==botonIprecios)
    		{
    		inicioP=Long.parseLong(JOptionPane.showInputDialog("Ingrese el nuevo inicio del intervalo de precios"));
    		artista.iprecio=inicioP;
    		}
    		if(evento.getSource()==botonFprecios)
    		{
    			
    		finalP=Long.parseLong(JOptionPane.showInputDialog("Ingrese el nuevo final del intervalo de precios"));
    		artista.fprecio=finalP;
    		}
    	   
    	    if(evento.getSource()==salir)
    	    {
    	    JOptionPane.showMessageDialog(null,"Se modifico el artista"+nomb);
    	    setVisible(false);
    	    }
    		
    	}
    	
    }
    
    
}