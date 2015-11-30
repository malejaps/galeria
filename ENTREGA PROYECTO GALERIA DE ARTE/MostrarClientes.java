/* CLASE					MostrarClientes
 * RESPONSABILIDAD			Mostrar la informacion de un cliente
 * DESCRIPCION				Aplicacion que muestra la informacion de un cliente
 * COLABORACION				Trabaja con las clases: ListarClientes
 */
 
 import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;


public class MostrarClientes extends JFrame{

    JLabel titulo,titulo2, titulo3;
    JLabel Ncliente, Acliente, Tcliente, Dcliente, Ocliente, ArCliente; 
    Container contenedor;
    
    Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,15);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
    
    public MostrarClientes(Cliente cliente) 
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
              JOptionPane.showMessageDialog( MostrarClientes.this,
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
    	
    	titulo= new JLabel("INFORMACION DEL CLIENTE");
    	titulo.setToolTipText("Eliminar cliente picasa");
    	titulo.setForeground(Color.blue);
    	titulo.setFont(fuente3);    	
    	titulo.setBounds(100,70,500,30);
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
   		
   		Ncliente = new JLabel();
   		Acliente = new JLabel();
   		Tcliente = new JLabel();
   		Dcliente = new JLabel();
   		Ocliente = new JLabel();
   		ArCliente = new JLabel();
   		
   		Ncliente.setForeground(Color.black);
    	Ncliente.setFont(fuente2);
    	Ncliente.setBounds(20,120,500,20);
    	contenedor.add(Ncliente);
    	
    	Acliente.setForeground(Color.black);
    	Acliente.setFont(fuente2);
    	Acliente.setBounds(20,140,500,20);
    	contenedor.add(Acliente);
    	
    	Tcliente.setForeground(Color.black);
    	Tcliente.setFont(fuente2);
    	Tcliente.setBounds(20,160,500,20);
    	contenedor.add(Tcliente);
    	
    	Dcliente.setForeground(Color.black);
    	Dcliente.setFont(fuente2);
    	Dcliente.setBounds(20,180,500,20);
    	contenedor.add(Dcliente);
    	
    	Ocliente.setForeground(Color.black);
    	Ocliente.setFont(fuente2);
    	Ocliente.setBounds(20,200,500,20);
    	contenedor.add(Ocliente);
    	
    	ArCliente.setForeground(Color.black);
    	ArCliente.setFont(fuente2);
    	ArCliente.setBounds(20,220,500,20);
    	contenedor.add(ArCliente);
    	
   		
   		Ncliente.setText("Nombre: ");
	    Acliente.setText("Apellido: ");
	    Tcliente.setText("Telefono: ");
	    Dcliente.setText("Direccion: ");
	    Ocliente.setText("Obra: ");
	    ArCliente.setText("Artista preferido: ");
	    			
		Ncliente.setText(Ncliente.getText() + cliente.getNombre());
	    Acliente.setText(Acliente.getText() + cliente.getApellido());
	    Tcliente.setText(Tcliente.getText() + String.valueOf(cliente.getTelefono()));
	    Dcliente.setText(Dcliente.getText() + cliente.getDireccion());
	    Ocliente.setText(Ocliente.getText() + cliente.getObra());
	    ArCliente.setText(ArCliente.getText() + cliente.GetArtPref());
    
      //acomodar esta ventana donde se muestre la informacion del cliente
    	setVisible(true);
    	setSize(500,300);
    }
    
    
}