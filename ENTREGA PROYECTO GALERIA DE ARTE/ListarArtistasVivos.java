/* CLASE					ListarArtistasVivos
 * RESPONSABILIDAD			Listar los artistas vivos de la galeria
 * DESCRIPCION				Aplicacion que lista los artistas vivos de la galeria
 * COLABORACION				Trabaja con las clases:MenuGaleria, EgaleriaDeArte, MostrarArtistaVivo, Listar
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ListarArtistasVivos extends JFrame {

	
           Container contenedor;
	Galeria galeria = new Galeria();
	EGaleriaDeArte gal=new EGaleriaDeArte();



	 
	JComboBox Listar;/////////Cuadro combinado
	Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,13);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
     JLabel titulo, titulo2, titulo3, escoger;
     
    // String vector[]={"a"};
  

 	
 
    
    public ListarArtistasVivos () 
    {
    	
    	super( "Listar artistas vivos" );
    	
    
    		
    	     
    	contenedor = getContentPane();
    	contenedor.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( ListarArtistasVivos.this,
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
    	
    	titulo= new JLabel("LISTAR ARTISTAS VIVOS");
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
    	
   
    	
    	escoger = new JLabel("Escoge el Artista");
    	escoger.setBounds(50,120,200,20);
    	escoger.setFont(fuente2);
    	
    	Listar = new JComboBox();
    	//Listar.setMaximumRowCount(5);
    	Listar.setBounds(50,150,150,20);
    	
    	gal.listarArtistasVivos();
    	ComboBoxModel elemento = new DefaultComboBoxModel(gal.artistasvivos);
    	Listar.setModel(elemento);
    		
    	 // JOptionPane.showMessageDialog(null,artistasvivos);
    	
    	
    	contenedor.add(escoger);
    	contenedor.add(Listar);
    	
     ManejadorBoton manejador=new ManejadorBoton();
    	Listar.addActionListener(manejador);
    	    	
    
    	setSize(500,400);
    	setVisible(true);
    	
    }
    
    
     private class ManejadorBoton extends EGaleriaDeArte implements ActionListener
    {
     	
    
    	
    	@Override
    	public void actionPerformed(ActionEvent e) {
    	
    	
    	for(int i=0;i<galeria.artistas.size();i++)
    	{	if(Listar.getSelectedIndex()==i)
    	{
    
      	Artista art= galeria.obtenerArtista(i);
    	new MostrarArtistaVivo(art);	
    		
    	}}
    		
    		
    		
    		
    	}}}
   
