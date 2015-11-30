/* CLASE					EliminarObra
 * RESPONSABILIDAD			Eliminar una obra buscada por el codigo
 * DESCRIPCION				Aplicacion que elimina una obra
 * COLABORACION				Trabaja con las clases: Cliente, EgaleriaDeArte, Galeria, Eliminar
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EliminarObra extends JFrame{
	
JTextField obra;
JButton buscar;
JLabel codigo,titulo,titulo2,titulo3, frase, borrado;
long codigoObra=0;
Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
Font fuente2=new Font("Segoe Print",Font.PLAIN,13);
Font fuente3=new Font("Segoe Script",Font.BOLD,20);
Galeria galeria = new Galeria();
    
    public EliminarObra() 
    {
    	super("ELIMINAR OBRA");
    	Container contenedor = getContentPane();
    	contenedor.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( EliminarObra.this,
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
    	
    	titulo= new JLabel("ELIMINAR OBRA");
    	titulo.setToolTipText("Eliminar obra en picasa");
    	titulo.setForeground(Color.blue);
    	titulo.setFont(fuente3);    	
    	titulo.setBounds(150,70,500,30);
    	contenedor.add(titulo);
    	
    	frase=new JLabel("OBRA_______________________________________________________");
        frase.setForeground(Color.black);
    	frase.setFont(fuente2);
    	frase.setBounds(10,100,500,20);
    	contenedor.add(frase);
    	
    	codigo = new JLabel("Codigo:");
    	codigo.setFont(fuente2);
    	codigo.setBounds(30,130,200,20);
    	obra = new JTextField(15);
    	obra.setBounds(100,130,100,20);
    	contenedor.add(obra);
    	contenedor.add(codigo);
    	    	
    	buscar = new JButton("BUSCAR");
    	buscar.setForeground(Color.white);
    	buscar.setFont(fuente2);
    	buscar.setBackground(Color.black);
    	buscar.setBounds(100,160,100,20);
    	contenedor.add(buscar);
    	
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
    	
    	public void actionPerformed(ActionEvent evento)
    	{
    	
    		if(evento.getSource() == buscar)
    		{
    			borrado.setText("");
    			try
    			{
    				codigoObra = Long.parseLong(obra.getText());
    			//	galeria.eliminarObraSeleccionada(codigoObra);
    			Obra obr;
    			
    			if(galeria.buscarObra2(codigoObra)==true)
    			{
    			 obr=galeria.buscarObra(codigoObra);
    			 obr.nombre="";
    			 obr.fecha="";
    			 obr.codigo=-2;
    			 obr.tipoObra="";
    			 borrado.setForeground(Color.blue);
    			 borrado.setBounds(20,190,400,20);
    			 borrado.setText("La obra se borro exitosamente");	
    			 obra.setText("");
    				
    				}
    				else
    				{
    					borrado.setForeground(Color.red);
    					borrado.setBounds(90,190,400,20);
    					borrado.setText("La obra no existe");		
    				
    				}
    			
    			}
    			catch(NumberFormatException nfe)
    			{
    				JOptionPane.showMessageDialog(null,"-No puede dejar espacios en blanco\n-No puede escribir letras en el codigo");
    				
    			}
    			setVisible(true);
    		}
    	}
    	
    }
    
}