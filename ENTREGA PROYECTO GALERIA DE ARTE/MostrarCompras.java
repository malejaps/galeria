/* CLASE					MostrarCompras
 * RESPONSABILIDAD			Mostrar las compras de un cliente
 * DESCRIPCION				Aplicacion que muestra las compras de un cliente
 * COLABORACION				Trabaja con las clases: ListarCompras, EgaleriDeArte, Galeria
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MostrarCompras extends JFrame 

{
     JLabel titulo,titulo2, titulo3;
     JComboBox compras;
     JComboBox fotos;
    Galeria galeria =new Galeria(); 
    	Cliente cl;
    	EGaleriaDeArte gal=new EGaleriaDeArte();
    
     
     Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,15);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
     Font fuente4=new Font("Segoe Script",Font.BOLD,15);
  
  
   
  
    public MostrarCompras(Cliente cliente) 
    {
    	super ("COMPRAS");
    	Container ventana1=getContentPane();
    	ventana1.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( MostrarCompras.this,
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
    
        	    	
    	titulo3= new JLabel("COMPRAS DEL CLIENTE");
    	titulo3.setToolTipText("Mostrar artista vivo en picasa");
    	titulo3.setForeground(Color.black);
    	titulo3.setFont(fuente3);    	
    	titulo3.setBounds(150,50,500,30);
    	ventana1.add(titulo3);
           	
       
        
        compras = new JComboBox();
    	//Listar.setMaximumRowCount(5);
    	compras.setBounds(50,150,150,20);
    	
    	fotos = new JComboBox();
    	//Listar.setMaximumRowCount(5);
    	fotos.setBounds(300,150,150,20);
    	
    	cliente.listarComprasObra();
    	cliente.listarComprasFoto();
    	ComboBoxModel elemento = new DefaultComboBoxModel(cliente.cobras);
    	compras.setModel(elemento);
    		
    
        ComboBoxModel elemento2 = new DefaultComboBoxModel(cliente.cfotos);
    	fotos.setModel(elemento2);
    
        
    	ventana1.add(titulo);
    	ventana1.add(titulo2);
    	ventana1.add(titulo3);
    	ventana1.add(compras);
    	ventana1.add(fotos);
    	
    	
    		
    	
    	ventana1.setBackground(Color.white);
    	setSize(500,300);
    	setVisible(true);
    	
    	
    	
   
    }
    

    
    
    
  
    

}