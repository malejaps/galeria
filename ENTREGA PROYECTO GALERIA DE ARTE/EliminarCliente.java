/* CLASE					EliminarCliente
 * RESPONSABILIDAD			Eliminar un cliete buscado por el nombre y el telefono
 * DESCRIPCION				Aplicacion que elimina un Cliente
 * COLABORACION				Trabaja con las clases: Cliente, EgaleriaDeArte, Galeria, Eliminar
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EliminarCliente extends JFrame{
	JTextField nombre, telefono;
	JButton buscar;
	JLabel nombree, telefonoo,titulo,titulo2,titulo3, frase, borrado;
	String nombreCliente="";
	long telefonoCliente=0;
	Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,13);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
	Galeria galeria = new Galeria();
    public EliminarCliente() 
    {
    	super("ELIMINAR CLIENTE");
    	Container contenedor = getContentPane();
    	contenedor.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( EliminarCliente.this,
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
    	titulo= new JLabel("ELIMINAR CLIENTE");
    	titulo.setToolTipText("Eliminar cliente picasa");
    	titulo.setForeground(Color.blue);
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
    	
    	frase=new JLabel("CLIENTE_______________________________________________________");
        frase.setForeground(Color.black);
    	frase.setFont(fuente2);
    	frase.setBounds(10,100,500,20);
    	contenedor.add(frase);
    	
    	nombree = new JLabel("Nombre:");
    	nombree.setForeground(Color.black);
    	nombree.setFont(fuente2);
    	nombree.setBounds(20,130,100,20);
    	nombre = new JTextField(15);
    	nombre.setBounds(100,130,100,20);
    	contenedor.add(nombre);
    	contenedor.add(nombree);
    	
    	telefonoo = new JLabel("Telefono:");
    	telefonoo.setForeground(Color.black);
    	telefonoo.setFont(fuente2);
    	telefonoo.setBounds(20,150,100,20);
    	telefono = new JTextField(15);
    	telefono.setBounds(100,150,100,20);
    	contenedor.add(telefono);
    	contenedor.add(telefonoo);
    	
    	buscar = new JButton("BUSCAR");
    	buscar.setForeground(Color.white);
    	buscar.setFont(fuente2);
    	buscar.setBackground(Color.black);
    	buscar.setBounds(50,200,100,20);
    	contenedor.add(buscar);
    	
    	borrado = new JLabel("");
    	borrado.setFont(fuente);
    	contenedor.add(borrado);
    	
    	ManejadorCampoTexto manejador = new ManejadorCampoTexto();
    	buscar.addActionListener(manejador);
    	contenedor.setBackground(Color.white);
    	setSize(500,300);
    	setVisible(true);
    	
    }
    
    
    public class ManejadorCampoTexto extends EGaleriaDeArte implements ActionListener
    {
    	
    	int as=0;
    	public void actionPerformed(ActionEvent evento)
    	{
    		
    		if(evento.getSource() == buscar)
    		{
    			borrado.setText("");
    			try
    			{
    				int b =0;
    				Cliente cliente;
    				telefonoCliente = Long.parseLong(telefono.getText());
    				nombreCliente = nombre.getText();
    				if(galeria.buscarCliente2(nombreCliente, telefonoCliente) == true)
    				{
    					cliente = galeria.buscarCliente(nombreCliente, telefonoCliente);
    					cliente.nombre = "";
    					cliente.apellido = "";
    					cliente.telefono=0;
    					cliente.direccion = "";
    					cliente.obra ="";
    					cliente.artpref="";
    					borrado.setForeground(Color.blue);
    					borrado.setBounds(20,230,400,20);
    					borrado.setText("El cliente " + nombre.getText() + " se elimino exitosamente");
    					nombre.setText("");
    					telefono.setText("");
    					
    				}
    				
    				else
    				{
    					borrado.setForeground(Color.red);
    					borrado.setBounds(90,230,400,20);
    					borrado.setText("El cliente no existe");
    				}
    				
    				
    			
    			}
    			catch(NumberFormatException nfe)
    			{
    				JOptionPane.showMessageDialog(null,"-No puede dejar espacios en blanco.\n-No puede escribir letras en el telefono");
    				
    				
    			}
    	    	setVisible(true);
    		}
    	}
    	
    }
    
}