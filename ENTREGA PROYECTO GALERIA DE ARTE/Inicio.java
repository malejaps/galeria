/* CLASE					Inicio
 * RESPONSABILIDAD			Crear la pantalla de bienvenida
 * DESCRIPCION				Aplicacion que crea la pantalla de bienvenida
 * COLABORACION				Trabaja con las clases: MenuGaleria, Acercade
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Inicio extends JFrame {

JLabel titulo,titulo2,titulo3,tiulo4;
Font fuente=new Font("Lucida Calligraphy",Font.BOLD,25);
     Font fuente2=new Font("Segoe Script",Font.BOLD,15);
     Font fuente3=new Font("Lucida Calligraphy",Font.BOLD,10);
     Color color1=new Color(0.53f,0.32f,0.25f);
 JButton ingresar;
    public Inicio() {
    	
    	super ("Menu Picasa");
    	Container ventana1=getContentPane();
    	ventana1.setLayout(null);
    	  ImageIcon icono=new ImageIcon("arte1.gif");
    
    //menu acerca de copia desde aquiii ****
    
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( Inicio.this,
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
    		
    //****copia hasta aqui	
    	//Creacion de etiquetas
    	titulo= new JLabel("GALERIA",icono,SwingConstants.LEFT);
    	titulo.setForeground(Color.black);
    	titulo.setFont(fuente);
    	titulo.setToolTipText("Menu Picasa");
    	titulo.setBounds(150,20,500,20);
    	ventana1.add(titulo);
    	
    	titulo2=new JLabel("PICASA");
    	titulo2.setForeground(Color.black);
    	titulo2.setFont(fuente);
    	titulo2.setBounds(200,40,500,20);
    	ventana1.add(titulo2);
    	
    	titulo3=new JLabel("__BIENVENIDOS__");
    	titulo3.setForeground(Color.black);
    	titulo3.setFont(fuente2);
    	titulo3.setBounds(175,100,500,20);
    	ventana1.add(titulo3);
    	//creacion de boton
    		ingresar=new JButton("INGRESAR");
    		ingresar.setForeground(Color.white);
    	    ingresar.setFont(fuente2);
    		ingresar.setBackground(Color.black);
    	    ingresar.setBounds(175,140,150,20);
    	    ventana1.add(ingresar);
    	    ManejadorBoton manejador=new ManejadorBoton();
    	    ingresar.addActionListener(manejador);
    	    
    	    
    		ventana1.setBackground(Color.white);
    	setSize(500,300);
    	setVisible(true);
    	
    }
    
    
     public void paint(Graphics g)
    {
   
    super.paint(g); 
    

 
    
    
   g.fillOval(50,100,75,170) ;
   g.setColor(Color.white.gray);
   g.fillOval(60,100,65,160) ;
   g.setColor(Color.white);
   g.fillOval(70,100,55,150) ; 
  g.setColor(Color.black); 	
    g.fillOval(80,100,45,140) ;
   g.setColor(Color.white.gray);
   g.fillOval(90,100,35,130) ;
   g.setColor(Color.white);
   g.fillOval(100,100,25,120) ;
   
   g.setColor(Color.black);
   g.fillOval(390,100,75,170) ;
   g.setColor(Color.white.gray);
   g.fillOval(390,100,65,160) ;
   g.setColor(Color.white);
   g.fillOval(390,100,55,150) ; 
  g.setColor(Color.black); 	
    g.fillOval(390,100,45,140) ;
   g.setColor(Color.white.gray);
   g.fillOval(390,100,35,130) ;
   g.setColor(Color.white);
   g.fillOval(390,100,25,120) ;
   
   
    
    
    }
    
    public static void main (String args[]){
    	
    	Inicio obj =new Inicio();
    	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    private class ManejadorBoton implements ActionListener
    {
    
   
    
    
    	public void actionPerformed(ActionEvent evento)
    	{
    		if(evento.getSource()==ingresar)
    		{
    			
    		new MenuGaleria();	
    		setVisible(false);
    		}
    		
    	
    
    	}
     
    	
    }
    
    
  
}

