/* CLASE					ModificarObra
 * RESPONSABILIDAD			Modificar una obra
 * DESCRIPCION				Aplicacion que modifica una obra de la galeria
 * COLABORACION				Trabaja con las clases: Galeria, Obra, EGaleriaDeArte, Modificar
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ModificarObra extends JFrame {
	
	JLabel frase,frase2,titulo3,titulo,titulo2,codigo;
    JRadioButton botonNombre,botonFecha,botonArtista,botonCodigo,botonTipo;
    JButton buscar,salir;
    ButtonGroup grupoBotonesOpcion;
    JTextField cod;
    Container ventana2;
    
    Galeria galeria=new Galeria();
      
      
      
            String n="";
            String fe,tipo;
            String m="";
            long codi=0;
    
    
     
     Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,15);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
      Font fuente4=new Font("Segoe Script",Font.BOLD,15);

    public ModificarObra() {
    	super ("ModificarObra");
    	ventana2=getContentPane();
    	ventana2.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( ModificarObra.this,
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
    	    	
    	titulo3= new JLabel("MODIFICAR OBRA");
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
    	
    	frase= new JLabel("OBRA_______________________________________________________");
    	frase.setForeground(Color.black);
    	frase.setFont(fuente4);    	
    	frase.setBounds(50,80,500,30);
    	ventana2.add(frase);
    	
    	
    
    	
    	codigo= new JLabel("codigo de la obra");
    	codigo.setForeground(Color.black);
    	codigo.setFont(fuente4);    	
    	codigo.setBounds(150,130,200,20);

    	ventana2.add(codigo);
    	
    	
    	
    		
    	//creacion de jText
    
    	
    	cod=new JTextField(50);
    	cod.setBounds(330,130,100,20);
    	ventana2.add(cod);
    	
    	
    	
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
    	botonFecha=new JRadioButton("Modificar fecha de puesta en venta",true);
    	botonFecha.setForeground(Color.black);
    	botonFecha.setFont(fuente2);
    	botonCodigo=new JRadioButton("Modificar codigo",true);
    	botonCodigo.setForeground(Color.black);
    	botonCodigo.setFont(fuente2);
    	botonTipo=new JRadioButton("Modificar tipo de obra",true);
    	botonTipo.setForeground(Color.black);
    	botonTipo.setFont(fuente2);
    	botonArtista=new JRadioButton("Modificar artista de la obra",true);
    	botonArtista.setForeground(Color.black);
    	botonArtista.setFont(fuente2);
    
    
    	botonNombre.setBounds(100,210,300,30);
    	botonFecha.setBounds(100,240,300,30);
    	botonCodigo.setBounds(100,270,300,30);
    	botonTipo.setBounds(100,300,300,30);
    	botonArtista.setBounds(100,330,300,30);
    	
    	ventana2.add(botonNombre);
    	ventana2.add(botonFecha);
        ventana2.add(botonCodigo);
        ventana2.add(botonTipo);
        ventana2.add(botonArtista);
      
        
        //relacion entre los objeto JRadioButton, aparecera el primer boton de la lista selccionado por defecto
        grupoBotonesOpcion=new ButtonGroup();
        grupoBotonesOpcion.add(botonNombre);
        grupoBotonesOpcion.add(botonFecha);
        grupoBotonesOpcion.add(botonCodigo);
        grupoBotonesOpcion.add(botonTipo);
        grupoBotonesOpcion.add(botonArtista);
       
    	    
    	//registro de eventos
        ManejadorBoton manejador=new ManejadorBoton();	
        botonNombre.addActionListener(manejador);
        botonFecha.addActionListener(manejador);
        botonCodigo.addActionListener(manejador);
        botonTipo.addActionListener(manejador);
        botonArtista.addActionListener(manejador);
       
        buscar.addActionListener(manejador);
        salir.addActionListener(manejador);
    	
    	ventana2.setBackground(Color.white);
    	setSize(650,400);
    	setVisible(true);
    }
     private class ManejadorBoton extends EGaleriaDeArte implements ActionListener
    {
    		public void actionPerformed(ActionEvent evento)
    	{
    		
            
            Obra obra=null;
            
            int a =1;
    	    	
    	    try{
    	    	codi=Long.parseLong(cod.getText());
    	    }catch(Exception exp)
    	    {
    	    }
    	    
    	    
    	    if(galeria.buscarObra2(codi)==true)
    	 {
    	
    		obra=galeria.buscarObra(codi);
    		a=1;
    	 	
    	 	}else
    	 {
    	 m=JOptionPane.showInputDialog("La obra ingresada no existe\nDesea registrarla?");
    	 
    	 if(m.equalsIgnoreCase("si"))
    	 {	RegistrarObra rc=new RegistrarObra();
    	 	
    	 }}
    	  
    	   if(evento.getSource()==buscar)
    	  {
    	  	if(a==1)
    	  {
    	  	JOptionPane.showMessageDialog(null,"Va a modificar los datos de la obra");	
    	  	
    	  }
    	  
    	  }
    	  
    	  if (evento.getSource()==botonNombre)
    	  {
    	  	 n=JOptionPane.showInputDialog("Ingrese el nuevo nombre");
    	    obra.nombre=n;
    	     JOptionPane.showMessageDialog(null,"El nombre fue cambiado por "+n);
    	  }
         if(evento.getSource()==botonCodigo)
         {
         
    		codi=Long.parseLong(JOptionPane.showInputDialog("Ingrese el nuevo codigo"));
    	    obra.codigo=codi;	
    	   	JOptionPane.showMessageDialog(null,"El codigo fue cambiado por "+codi);
         } 
         if(evento.getSource()==botonFecha)
         {
         	fe=JOptionPane.showInputDialog("Ingrese la nueva fecha");
            obra.fecha=fe;
            JOptionPane.showMessageDialog(null,"La fecha fue cambiada por "+fe);
    }
    if(evento.getSource()==botonArtista)
    {
    	ModificarArtista ma=new ModificarArtista();
    }
    if(evento.getSource()==botonTipo)
    {
    	tipo=JOptionPane.showInputDialog("Ingrese el nuevo tipo");
    	    obra.tipoObra=tipo;
    	     JOptionPane.showMessageDialog(null,"El tipo de obra fue cambiado por "+tipo);
    	  
    	
    }
     if(evento.getSource()==salir)
     {
     	
     JOptionPane.showMessageDialog(null,"Se modifico la obra"+n);
   setVisible(false);  	
     }
    
}}}