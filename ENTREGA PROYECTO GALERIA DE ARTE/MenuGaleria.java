/* CLASE					MenuGaleria
 * RESPONSABILIDAD			Mostrar el menu principal de la galeria
 * DESCRIPCION				Aplicacion que muestra el menu principal de la galeria
 * COLABORACION				Trabaja con las clases: MenuGaleria, Eliminar, Registrar, Inventario, Listar, Modificar, Vender
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuGaleria extends JFrame 

{
     JLabel titulo,titulo2,titulo3,registrar,modificar,eliminar;
     
     JButton botonRegistrar;
     JButton botonModificar;
     JButton botonEliminar;
     JButton listar;
     JButton inventario;
     JButton vender;
   
     
     Font fuente=new Font("Lucida Calligraphy",Font.BOLD,25);
     Font fuente2=new Font("Segoe Script",Font.BOLD,15);
     Color color1=new Color(0.53f,0.32f,0.25f);
  
  /*public void paint(Graphics g)
    {
   
    super.paint(g); 
    
   /*g.setColor(Color.black);
   g.fillRect(0,30,497,3);
   
   g.setColor(Color.black);
   g.fillRect(0,30,3,297);
    
   g.setColor(Color.black);
   g.fillRect(470,0,3,297);
   
   g.setColor(Color.black);
   g.fillRect(0,270,497,3);
    
    }*/
  
    public MenuGaleria() 
    {
    	super ("Menu Picasa");
    	Container ventana1=getContentPane();
    	ventana1.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( MenuGaleria.this,
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
    	titulo.setBounds(150,20,500,20);
    	ventana1.add(titulo);
    	
    	titulo2=new JLabel("PICASA");
    	titulo2.setForeground(Color.black);
    	titulo2.setFont(fuente);
    	titulo2.setBounds(200,40,500,20);
    	ventana1.add(titulo2);
    	
    	
    	
    	//Creacion de botones
    	Icon imag1 = new ImageIcon( "1.png" );
        Icon imag2 = new ImageIcon( "2.png" );
        
           	
    	botonRegistrar=new JButton("REGISTRAR");//TAMBIEN SE PUEDE PONER UN BOTON CON UNA IAMGEN AL LADO("registrar",imag1)
    	botonModificar=new JButton ("MODIFICAR");
    	botonEliminar=new JButton ("ELIMINAR");
    	listar=new JButton("LISTAR");
    	inventario=new JButton("INVENTARIO");
    	vender=new JButton("VENDER");
    	botonRegistrar.setForeground(Color.white);
    	botonRegistrar.setFont(fuente2);
    	botonModificar.setForeground(Color.white);
    	botonModificar.setFont(fuente2);
    	botonEliminar.setForeground(Color.white);
    	botonEliminar.setFont(fuente2);
    	listar.setFont(fuente2);
    	listar.setForeground(Color.white);
    	inventario.setFont(fuente2);
    	inventario.setForeground(Color.white);
    	vender.setFont(fuente2);
        vender.setForeground(Color.white);
    	
    
    	//botonEliminar.setRolloverIcon(imag2);
    	botonRegistrar.setBackground(Color.black);
    	botonModificar.setBackground(Color.black);
    	botonEliminar.setBackground(Color.black);
        listar.setBackground(Color.black);
        inventario.setBackground(Color.black);
        vender.setBackground(Color.black);
    	
      	botonRegistrar.setBounds(70,100,200,20);
    	botonModificar.setBounds(70,150,200,20);
    	botonEliminar.setBounds(70,200,200,20);
    	listar.setBounds(300,100,200,20);
    	inventario.setBounds(300,150,200,20);
    	vender.setBounds(300,200,200,20);
    	
    	ventana1.add(botonRegistrar);
    	ventana1.add(botonModificar);
    	ventana1.add(botonEliminar);
    	ventana1.add(listar);
    	ventana1.add(inventario);
    	ventana1.add(vender);
    	
    	ManejadorBoton manejador=new ManejadorBoton();
    	botonRegistrar.addActionListener(manejador);
    	botonModificar.addActionListener(manejador);
    	botonEliminar.addActionListener(manejador);
    	listar.addActionListener(manejador);  
    	inventario.addActionListener(manejador);
    	vender.addActionListener(manejador);    	
    	
    	ventana1.setBackground(Color.white);
    	setSize(600,400);
    	setVisible(true);
    	
    	
  
    }
    

    
    private class ManejadorBoton implements ActionListener
    {
    
    Registrar registrar;
    Modificar modificar;
    Eliminar eliminar;
    
    
    	public void actionPerformed(ActionEvent evento)
    	{
    		if(evento.getSource()==botonRegistrar)
    		{
    			
    		registrar=new Registrar();	
    		
    		}
    		if(evento.getSource()==botonModificar)
    		{
    		modificar=new Modificar();
    		}
    		if(evento.getSource()==botonEliminar)
    		{
    		eliminar=new Eliminar();
    		}
    			if(evento.getSource()==listar)
    		{
    		 new MenuListar();
    		}
    		if(evento.getSource()==inventario)
    		{
    		 new MenuInventario();
    		}
    		if(evento.getSource()==vender)
    		{
    		 new  Vender();
    		}
    	
    	
    	 //JFrame.setDefaultLookAndFeelDecorated(true);
    	}
     
    	
    }
    
    
  
    

}