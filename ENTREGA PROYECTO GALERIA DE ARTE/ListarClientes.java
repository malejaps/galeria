/* CLASE					ListarClientes
 * RESPONSABILIDAD			Listar los clientes de la galeria
* DESCRIPCION				Aplicacion que lista los clientes de la galeria
 * COLABORACION				Trabaja con las clases:MenuGaleria, EgaleriaDeArte, Cliente, MostrarClientes, Listar
 */

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class ListarClientes extends JFrame{
	Container contenedor;
	Galeria galeria = new Galeria();
	EGaleriaDeArte Egaleria = new EGaleriaDeArte();
	JComboBox Listar;/////////Cuadro combinado
	String nombres[];
	Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,13);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
     JLabel titulo, titulo2, titulo3, escoger, nombreL, telefonoL;
     
     JButton buscar;
     JTextField nombre, telefono;
     String nombreCliente="";
	long telefonoCliente=0;
    public ListarClientes() 
    {
    	super("LISTAR CLIENTES");
    	contenedor = getContentPane();
    	contenedor.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( ListarClientes.this,
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
    	
    	titulo= new JLabel("LISTAR CLIENTES");
    	titulo.setToolTipText("Eliminar cliente picasa");
    	titulo.setForeground(Color.red);
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
    	
    	   	
    	//lista nombres y telefonos
    	Egaleria.listaNombres();
    	Listar = new JComboBox();
    	ComboBoxModel elemento = new DefaultComboBoxModel(Egaleria.nombres);
    	Listar.setModel(elemento);
    	Listar.setBounds(50,150,150,20);
    	contenedor.add(Listar);
    	
    	escoger = new JLabel("Escoge un cliente y su telefono");
    	escoger.setBounds(50,120,250,20);
    	escoger.setFont(fuente2);
    	contenedor.add(escoger);
    
    	
    	ManejadorBoton manejador = new ManejadorBoton();
    	Listar.addActionListener(manejador);
    	setSize(500,400);
    	setVisible(true);
    	
    }
    
    private class ManejadorBoton extends EGaleriaDeArte implements ActionListener
    {
    
    	public void actionPerformed(ActionEvent evento)
    	{
    		  		
    		for(int i=0;i<galeria.clientes.size();i++)
    		{
    			
    			if(Listar.getSelectedIndex()==i)
    			{
    				Cliente cl=galeria.clientes.get(i);
		    		new MostrarClientes(cl);
		    		
    			}
    			
    		}
    
    	}
    }
    
    
     public static void main(String args[])
  	 {
  		ListarClientes aplicacion=new ListarClientes();
   		JFrame.setDefaultLookAndFeelDecorated(true);
   		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 }
    
   
}