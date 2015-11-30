/* CLASE					ModificarCliente
 * RESPONSABILIDAD			Modificar un cliente
 * DESCRIPCION				Aplicacion que modifica un cliente de la galeria
 * COLABORACION				Trabaja con las clases: Galeria, Cliente, EGaleriaDeArte, Modificar
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ModificarCliente extends JFrame 

{

    JLabel frase,frase2,titulo3,titulo,titulo2,nombre,telefono;
    JRadioButton botonNombre,botonApellido,botonTelefono,botonDireccion,botonArtistap,botonObrap;
    JButton buscar,salir;
    ButtonGroup grupoBotonesOpcion;
    JTextField nom,tel,ncliente,apcliente;
    Container ventana2;
    
    Galeria galeria=new Galeria();
    	
    		String n="";
    		String nomb="";
    		String apellido,direccion,obra,artista;
    		long telef=0;
    		long t=0;
    		String m="";
    	  
    
     
     Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,15);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
      Font fuente4=new Font("Segoe Script",Font.BOLD,15);
     
    public ModificarCliente() 
    {
    	super ("ModificarCliente");
    	ventana2=getContentPane();
    	ventana2.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( ModificarCliente.this,
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
    	    	
    	titulo3= new JLabel("MODIFICAR CLIENTE");
    	titulo3.setToolTipText("Registrar cliente en picasa");
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
    	
    	frase= new JLabel("CLIENTE_______________________________________________________");
    	frase.setForeground(Color.black);
    	frase.setFont(fuente4);    	
    	frase.setBounds(50,80,500,30);
    	ventana2.add(frase);
    	
    	
    	nombre= new JLabel("Nombre del cliente");
    	nombre.setForeground(Color.black);
    	nombre.setFont(fuente4);    	
    	nombre.setBounds(70,110,500,30);  
    	ventana2.add(nombre);
    	
    	telefono= new JLabel("Telefono");
    	telefono.setForeground(Color.black);
    	telefono.setFont(fuente4);    	
    	telefono.setBounds(70,130,500,30);
    	ventana2.add(telefono);
    	
    	frase2= new JLabel("¿Que informacion desea modificar del cliente  ?" );
    	frase2.setForeground(Color.black);
    	frase2.setFont(fuente4);    	
    	frase2.setBounds(50,180,500,30);
    	ventana2.add(frase2);
    	
    	
    		
    	//creacion de jText
    	nom=new JTextField(50);
    	nom.setBounds(330,110,100,20);
    	ventana2.add(nom);
    	
    	tel=new JTextField(50);
    	tel.setBounds(330,130,100,20);
    	ventana2.add(tel);
    	
    	
    	
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
    	botonApellido=new JRadioButton("Modificar apellido",true);
    	botonApellido.setForeground(Color.black);
    	botonApellido.setFont(fuente2);
    	botonTelefono=new JRadioButton("Modificar telefono",true);
    	botonTelefono.setForeground(Color.black);
    	botonTelefono.setFont(fuente2);
    	botonDireccion=new JRadioButton("Modificar direccion",true);
    	botonDireccion.setForeground(Color.black);
    	botonDireccion.setFont(fuente2);
    	botonArtistap=new JRadioButton("Modificar artista preferido",true);
    	botonArtistap.setForeground(Color.black);
    	botonArtistap.setFont(fuente2);
    	botonObrap=new JRadioButton("Modificar obra preferida",true);
    	botonObrap.setForeground(Color.black);
    	botonObrap.setFont(fuente2);
    	
    	botonNombre.setBounds(100,210,300,30);
    	botonApellido.setBounds(100,240,300,30);
    	botonTelefono.setBounds(100,270,300,30);
    	botonDireccion.setBounds(100,300,300,30);
    	botonArtistap.setBounds(100,330,300,30);
    	botonObrap.setBounds(100,360,300,30);
    	ventana2.add(botonNombre);
    	ventana2.add(botonApellido);
        ventana2.add(botonTelefono);
        ventana2.add(botonDireccion);
        ventana2.add(botonArtistap);
        ventana2.add(botonObrap);
        
        //relacion entre los objeto JRadioButton, aparecera el primer boton de la lista selccionado por defecto
        grupoBotonesOpcion=new ButtonGroup();
        grupoBotonesOpcion.add(botonNombre);
        grupoBotonesOpcion.add(botonApellido);
        grupoBotonesOpcion.add(botonTelefono);
        grupoBotonesOpcion.add(botonDireccion);
        grupoBotonesOpcion.add(botonArtistap);
        grupoBotonesOpcion.add(botonObrap);
        
    	    
    	//registro de eventos
        ManejadorBoton manejador=new ManejadorBoton();	
        botonNombre.addActionListener(manejador);
        botonApellido.addActionListener(manejador);
        botonTelefono.addActionListener(manejador);
        botonDireccion.addActionListener(manejador);
        botonArtistap.addActionListener(manejador);
        botonObrap.addActionListener(manejador);
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
    			 Cliente cliente=null;
    	
    	    
    	 int a=1;
    	 
    	
    	  	try{
    	  
    	  	n=nom.getText();
    		t=Long.parseLong(tel.getText());
    		}
    		catch(Exception exp)
    		{
    			
    		}
    		
    		
    	  
    	  if(galeria.buscarCliente2(n,t)==true)
    	 {
    	
    		cliente=galeria.buscarCliente(n,t);
    		a=1;
    		
    	 	
    	 }
    	 else
    	 {
    	 m=JOptionPane.showInputDialog("El cliente ingresado no existe\nDesea registrarlo?");
    	 
    	 if(m.equalsIgnoreCase("si"))
    	 {	RegistrarCliente rc=new RegistrarCliente();
    	 	
    	 }}
    	  
    	   if(evento.getSource()==buscar)
    	  {
    	  	if(a==1)
    	  {
    	  	JOptionPane.showMessageDialog(null,"Va a modificar los datos del cliente ");	
    	  	
    	  }
    	 
    	  }
    	  
    	  
    		
    		if(evento.getSource()==botonNombre)
    		{
    	    
    	    nomb=JOptionPane.showInputDialog("Ingrese el nuevo nombre");
    	    cliente.nombre=nomb;
    	    
    	    JOptionPane.showMessageDialog(null,"El nombre fue cambiado por "+nomb);
    	    
    
    		//JFrame.setDefaultLookAndFeelDecorated(true);
    		}
    	    if(evento.getSource()==botonApellido)
    		{
    	     
    		apellido=JOptionPane.showInputDialog("Ingrese el nuevo apellido");
    		cliente.apellido=apellido;
    		
    		JOptionPane.showMessageDialog(null,"El apellido fue cambiado por "+apellido);
    		}
    	    if(evento.getSource()==botonTelefono)
    		{
    		telef=Long.parseLong(JOptionPane.showInputDialog("Ingrese el nuevo telefono"));
    	    cliente.telefono=telef;
    	    JOptionPane.showMessageDialog(null,"El telefono fue cambiado por "+telef);

    		}
    		if(evento.getSource()==botonDireccion)
    		{
    		direccion=JOptionPane.showInputDialog("Ingrese la nueva direccion");
    		cliente.direccion=direccion;
    		JOptionPane.showMessageDialog(null,"La direccion fue cambiada por "+direccion);
    		}
    		if(evento.getSource()==botonObrap)
    		{
    			
    		obra=JOptionPane.showInputDialog("Ingrese el nombre de la nueva obra preferida");
    		cliente.obra=obra;
    		JOptionPane.showMessageDialog(null,"La obra preferida fue cambiada por "+obra);
    		}
    	    if(evento.getSource()==botonArtistap)
    	    {
    	    artista=JOptionPane.showInputDialog("Ingrese el nombre del nuevo artista preferido");
    	    cliente.artpref=artista;
    	    JOptionPane.showMessageDialog(null,"El artista preferido fue cambiado por "+artista);
    	    }
    	    if(evento.getSource()==salir)
    	    {
    	    JOptionPane.showMessageDialog(null,"Se modifico el cliente"+nomb);
    	    setVisible(false);
    	    }
    	 	
    	 	
    	 
    	  
    	}
    	
    }
  
    
    
    

    
}