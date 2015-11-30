/* CLASE					Vender
 * RESPONSABILIDAD			Vender a un cliente de la galeria
 ** DESCRIPCION				Aplicacion que vende a un cliente
 * COLABORACION				Trabaja con las clases: Galeria, MenuGaleria
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Vender extends JFrame {

JTextField nombre, telefono,codigoo;
	JButton buscar;
	JLabel nombree, telefonoo,codigo,titulo,titulo2,titulo3,explicacion;
	String nombreCliente="";
	long telefonoCliente=0;
	long codigoobra=0;
	Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,13);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
	Galeria galeria = new Galeria();


    public Vender() {
    	
    		super("VENDER");
    	Container contenedor = getContentPane();
    	contenedor.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( Vender.this,
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
    	titulo= new JLabel("VENDER");
    	titulo.setToolTipText("VENDER OBRA EN PICASA");
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
    	
    	nombree = new JLabel("Nombre Cliente:");
    	nombree.setForeground(Color.black);
    	nombree.setFont(fuente2);
    	nombree.setBounds(20,130,200,20);
    	nombre = new JTextField(15);
    	nombre.setBounds(320,130,100,20);
    	contenedor.add(nombre);
    	contenedor.add(nombree);
    	
    	telefonoo = new JLabel("Telefono del cliente:");
    	telefonoo.setForeground(Color.black);
    	telefonoo.setFont(fuente2);
    	telefonoo.setBounds(20,150,200,20);
    	telefono = new JTextField(15);
    	telefono.setBounds(320,150,100,20);
    	contenedor.add(telefono);
    	contenedor.add(telefonoo);
    	
    	codigo = new JLabel("Codigo de la obra:");
    	codigo.setForeground(Color.black);
    	codigo.setFont(fuente2);
    	codigo.setBounds(20,170,300,20);
    	explicacion = new JLabel("Pinturas de 0 a 24 - Fotos de 24 a 49 ");
    	explicacion.setForeground(Color.black);
    	explicacion.setFont(fuente2);
    	explicacion.setBounds(20,190,300,20);
    	codigoo = new JTextField(15);
    	codigoo.setBounds(320,170,100,20);
    	contenedor.add(codigo);
    	contenedor.add(codigoo);
    	contenedor.add(explicacion);
    	
    	buscar = new JButton("Vender");
    	buscar.setForeground(Color.white);
    	buscar.setFont(fuente2);
    	buscar.setBackground(Color.black);
    	buscar.setBounds(50,210,100,20);
    	contenedor.add(buscar);
    	
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
    			try
    			{
    				telefonoCliente = Long.parseLong(telefono.getText());
    				nombreCliente = nombre.getText();
    				codigoobra=Long.parseLong(codigoo.getText());
    				
    				galeria.Vender(nombreCliente,telefonoCliente,codigoobra);
    				setVisible(false);
    			}
    			catch(NumberFormatException nfe)
    			{
    				JOptionPane.showMessageDialog(null,"-No puede dejar espacios en blanco.\n-No puede escribir letras en el telefono");
    				as=1;
    				
    			}
    	    	if(as==1){
    			
    			setVisible(true);
    			}
    			
    		}
    	}
    	
    }
    
}
    
