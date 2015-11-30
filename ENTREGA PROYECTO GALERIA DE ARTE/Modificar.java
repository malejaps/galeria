/* CLASE					Modificar
 * RESPONSABILIDAD			Mostrar el menu modificar de la galeria
 ** DESCRIPCION				Aplicacion que muestra el menu modificar de la galeria
 * COLABORACION				Trabaja con las clases: MenuGaleria, ModificarCliente, ModificarArtista, ModificarCliente
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Modificar extends JFrame 

{

    JLabel titulo3,titulo,titulo2;
    JRadioButton botonCliente,botonObra,botonArtista;
    ButtonGroup grupoBotonesOpcion;
    Container ventana2;
    
    
     
     Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,20);
     Font fuente3=new Font("Segoe Script",Font.BOLD,30);
     
    public Modificar() 
    {
    	super ("Modificar");
    	ventana2=getContentPane();
    	ventana2.setLayout(null);
    	
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( Modificar.this,
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
    	    	
    	titulo3= new JLabel("MODIFICAR");
    	titulo3.setToolTipText("Modificar cliente,obra o artista");
    	titulo3.setForeground(Color.red);
    	titulo3.setFont(fuente3);
    	titulo3.setBounds(150,90,500,30);
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
    	
    	//Creacion de botones radio 
    	botonCliente=new JRadioButton("Modificar cliente",true);
    	botonCliente.setForeground(Color.black);
    	botonCliente.setFont(fuente2);
    	botonObra=new JRadioButton("Modificar obra",true);
    	botonObra.setForeground(Color.black);
    	botonObra.setFont(fuente2);
    	botonArtista=new JRadioButton("Modificar artista",true);
    	botonArtista.setForeground(Color.black);
    	botonArtista.setFont(fuente2);
    	botonCliente.setBounds(100,160,300,30);
    	botonObra.setBounds(100,190,300,30);
    	botonArtista.setBounds(100,220,300,30);
    	ventana2.add(botonCliente);
    	ventana2.add(botonObra);
        ventana2.add(botonArtista);
        
        //relacion entre los objeto JRadioButton, aparecera el primer boton de la lista selccionado por defecto
        grupoBotonesOpcion=new ButtonGroup();
        grupoBotonesOpcion.add(botonCliente);
        grupoBotonesOpcion.add(botonObra);
        grupoBotonesOpcion.add(botonArtista);
        
    	    
    	//registro de eventos
        ManejadorBoton manejador=new ManejadorBoton();	
        botonCliente.addActionListener(manejador);
        botonObra.addActionListener(manejador);
        botonArtista.addActionListener(manejador);
    	
    	ventana2.setBackground(Color.white);
    	setSize(500,300);
    	setVisible(true);
    	
    }
    
    
     private class ManejadorBoton implements ActionListener
    {
    
    ModificarCliente modificarCliente;
    ModificarObra modificarObra;
    ModificarArtista modificarArtista;
  
    
    	public void actionPerformed(ActionEvent evento)
    	{
    		if(evento.getSource()==botonCliente)
    		{
    	
    	modificarCliente=new ModificarCliente();
    
    		JFrame.setDefaultLookAndFeelDecorated(true);
    		}
    	    if(evento.getSource()==botonObra)
    		{
    		modificarObra=new ModificarObra();
    		
    		JFrame.setDefaultLookAndFeelDecorated(true);
    		
    		}
    	    if(evento.getSource()==botonArtista)
    		{
    		modificarArtista=new ModificarArtista();
    		
    		JFrame.setDefaultLookAndFeelDecorated(true);	
    		}
    	}
    	
    }
  
    
    
    

    
}