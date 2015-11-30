/* CLASE					EliminarArtista
 * RESPONSABILIDAD			Eliminar un artista buscado por el nombre
 * DESCRIPCION				Aplicacion que elimina un Artista
 * COLABORACION				Trabaja con las clases: Artista, EgaleriaDeArte, Galeria, Eliminar
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EliminarArtista extends JFrame{
JTextField artista;
JButton buscar;
JLabel nombre,titulo,titulo2,titulo3, frase, borrado;
String nombreArtista="";
Galeria galeria = new Galeria();
Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
Font fuente2=new Font("Segoe Print",Font.PLAIN,13);
Font fuente3=new Font("Segoe Script",Font.BOLD,20);
    public EliminarArtista()
    {
    	super("ELIMINAR ARTISTA");
    	Container contenedor = getContentPane();
    	contenedor.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( EliminarArtista.this,
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
    	
    	titulo= new JLabel("ELIMINAR ARTISTA");
    	titulo.setToolTipText("Eliminar artista en picasa");
    	titulo.setForeground(Color.blue);
    	titulo.setFont(fuente3);    	
    	titulo.setBounds(150,70,500,30);
    	contenedor.add(titulo);
    	
    	frase=new JLabel("ARTISTA_______________________________________________________");
        frase.setForeground(Color.black);
    	frase.setFont(fuente2);
    	frase.setBounds(10,100,500,20);
    	contenedor.add(frase);
    	
    	nombre = new JLabel("Nombre:");
    	nombre.setBounds(30,130,200,20);
    	nombre.setFont(fuente2);
    	artista = new JTextField(15);
    	artista.setBounds(100,130,100,20);
    	contenedor.add(artista);
    	contenedor.add(nombre);
    	    	
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
    				
    				nombreArtista = artista.getText();
    				Artista art;
    				
    				if(artista.getText().equalsIgnoreCase(""))
    				{
    					JOptionPane.showMessageDialog(null, "No se puede dejar espacios en blanco");
    					
    				}
    				else
    				{
    					if(galeria.buscarArtista2(nombreArtista) == true)
    				{
    					art = (galeria.buscarArtista(nombreArtista));
    					art.nombre = "";
    					art.especialidad= "";
    					art.estado = "";
    					art.iprecio = 0;
    					art.fprecio = 0;
    					borrado.setBounds(20,200,400,30);
    					borrado.setForeground(Color.blue);
    					borrado.setText("El artista " +artista.getText() +" se elimino exitosamente");
    					artista.setText("");
    				}
    				else
    				{
    					borrado.setForeground(Color.red);
    					borrado.setBounds(90,200,400,30);
    					borrado.setText("El artista no existe");
    				}
    				}
    				
    				//setVisible(false);	
    			}
    			
    			
    		
    		}
    				
    	}
    	
    }
    
    
