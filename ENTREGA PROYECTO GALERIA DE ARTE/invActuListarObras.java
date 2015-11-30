/* CLASE					InvActuListarObras
 * RESPONSABILIDAD			Mostrar el inventario actual de las obras
 * COLABORACION				Trabaja con las clases: Galeria, EgaleriaDeArte, Inventario
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class invActuListarObras extends JFrame {

	
    Container contenedor;
	Galeria galeria = new Galeria();
	EGaleriaDeArte gal=new EGaleriaDeArte();
	
	
	//String nombres[]={"mulata cartagenera.jpg","colombiana.jpg"};
	//Icon imagenes[]={new ImageIcon(nombres[0]), new ImageIcon(nombres[1])
	

	 
	JComboBox Listar;/////////Cuadro combinado
	Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,13);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
     JLabel titulo, titulo2, titulo3, escoger,imagen;
     

 
    
    public invActuListarObras (Artista artista) 
    {
    	
    	
    	
    	super( "Listar obras" );
    	
    
    		
    	     
    	contenedor = getContentPane();
    	contenedor.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( invActuListarObras.this,
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
    	
    	titulo= new JLabel("INVENTARIO DE PINTURAS");
    	titulo.setToolTipText("INVENTARIO");
    	titulo.setForeground(Color.black);
    	titulo.setFont(fuente3);    	
    	titulo.setBounds(150,70,500,30);
    	contenedor.add(titulo);
    	
    	titulo2= new JLabel("GALERIA",icono,SwingConstants.LEFT);
    	titulo2.setForeground(Color.black);
    	titulo2.setFont(fuente);
    	titulo2.setToolTipText("Menu Picasa");
    	titulo2.setBounds(20,20,500,20);
    	contenedor.add(titulo2);
    	
    	titulo3=new JLabel("PICASA");
    	titulo3.setForeground(Color.black);
    	titulo3.setFont(fuente);
    	titulo3.setBounds(30,40,500,20);
    	contenedor.add(titulo3);
    	contenedor.setBackground(Color.white);
    	
    	
    	imagen=new JLabel();
    	imagen.setBounds(220,50,500,500);
    	
   
    	
    	escoger = new JLabel("Escoge el Artista");
    	escoger.setBounds(50,120,200,20);
    	escoger.setFont(fuente2);
    	
    	gal.listarObrasActual(artista);
    	Listar = new JComboBox();
    	//Listar.setMaximumRowCount(5);
    	Listar.setBounds(50,150,150,20);
    	
    	
    	ComboBoxModel elemento = new DefaultComboBoxModel(gal.obras);
    	Listar.setModel(elemento);
   
    	
    	
    
    	Listar.addItemListener(
    		
        new ItemListener(){
        	
        	
        	public void itemStateChanged(ItemEvent evento)
        	{
        		
        		if(evento.getStateChange()==ItemEvent.SELECTED)
        		{
        			String s=(String)evento.getItem();
        			imagen.setIcon(new ImageIcon(s+".jpg"));
        			
        			
        		}
        		
        	}
        	
        	
        	
        }
    
    
    
    
    
    );
    	
    	
    	
    	contenedor.add(escoger);
    	contenedor.add(imagen);    	
    	contenedor.add(Listar);
    	
    	  
    
    	setSize(700,700);
    	setVisible(true);
    	
    }
    
    
 }
    		
    		
    		
    		
    
   
