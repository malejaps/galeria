
/* CLASE					Inventario
 * RESPONSABILIDAD			Crear un inventario para la galeria
* DESCRIPCION				Aplicacion que crea un inventario de la galeria
 * COLABORACION				Trabaja con las clases: MenuGaleria, EgaleriaDeArte, invListarFotos, invListarObras, MenuInventario
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Inventario extends JFrame {

	
    	Galeria galeria = new Galeria();
	EGaleriaDeArte gal=new EGaleriaDeArte();
	

	 
	JComboBox Pintores;
	JComboBox Fotografos;
	
	Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,20);
     Font fuente3=new Font("Segoe Script",Font.BOLD,27);
     JLabel titulo, titulo2, titulo3,pintor,fotog;
     //JButton ver;

 
    
    public Inventario() 
    {
    	
    	
    	
    		super( "INVENTARIO" );
    	
         
    		
    	     
    Container ventana= getContentPane();
    
    	ventana.setLayout(null);
    	
    	
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( Inventario.this,
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
    	
        titulo= new JLabel("GALERIA",icono,SwingConstants.LEFT);
    	titulo.setForeground(Color.black);
    	titulo.setFont(fuente);
    	titulo.setToolTipText("Menu Picasa");
    	titulo.setBounds(20,20,500,20);
    	ventana.add(titulo);
    	titulo.setLayout(new FlowLayout(FlowLayout.RIGHT));
    	
    	titulo2=new JLabel("PICASA");
    	titulo2.setForeground(Color.black);
    	titulo2.setFont(fuente);
    	titulo2.setBounds(30,40,500,20);
    	ventana.add(titulo2);
    	titulo2.setLayout(new FlowLayout(FlowLayout.RIGHT));
    	
    	titulo3= new JLabel("INVENTARIO");
    	titulo3.setForeground(Color.blue);
    	titulo3.setFont(fuente3);    	
    	titulo3.setBounds(200,70,500,40);
    	ventana.add(titulo3);
    
    	pintor= new JLabel("PINTORES");
    	pintor.setForeground(Color.black);
    	pintor.setFont(fuente2);
    	pintor.setLayout(new FlowLayout(FlowLayout.RIGHT));    	
    	pintor.setBounds(70,200,200,30);
    	ventana.add(pintor);
    	
    
    	
    	fotog= new JLabel("FOTOGRAFOS");
    	fotog.setForeground(Color.black);
    	fotog.setFont(fuente2);    	
    	fotog.setBounds(70,300,200,30);
    	ventana.add(fotog);
    	
    	
    	gal.listarArtistas();
    	Pintores=new JComboBox(gal.artistas);
    	Pintores.setBounds(300,200,300,20);
    	
    	
        gal.listarFotografos();
    	Fotografos=new JComboBox(gal.fotografos);
    	Fotografos.setBounds(300,300,300,20);
    	
   
    
    
    
    	ventana.add(new JScrollPane(Fotografos));
    	ventana.add( new JScrollPane(Pintores ) );
   
    		
    
    
    	
    
    	 ManejadorBoton manejador=new ManejadorBoton();
    	Pintores.addActionListener(manejador);
    	Fotografos.addActionListener(manejador);
    	
    	
    	
    	ventana.add(Fotografos);
    	ventana.add(Pintores);
    //	ventana.add(ver);
    	
    	  
        setBackground(Color.white);
    	setSize(700,500);
    	setVisible(true);
    	
    }
    
    
     private class ManejadorBoton extends EGaleriaDeArte implements ActionListener
    {
     	
    
    	
    
    	public void actionPerformed(ActionEvent e) {
    	
    	
    
    if(e.getSource()==Pintores)
    { for(int i=0;i<galeria.artistas.size();i++)
    	{	
    		
    		if(Pintores.getSelectedIndex()==i)
    	{
    
      	Artista art= galeria.obtenerArtista(i);
    	new invListarObras(art);	
    		
    	}}}
    	
    if(e.getSource()==Fotografos)
    	
    {	for(int i=0;i<galeria.fotografos.size();i++)
    	{	if(Fotografos.getSelectedIndex()==i)
    	{
    		 Fotografo fot= galeria.obtenerFotografo(i);
    	new invListarFotos(fot);	
    	}}
    			
    	
    		
    	}
    	
    	
    	}}}
    		
    		
    		
    	
    		
    		
    		
    		
    
   
