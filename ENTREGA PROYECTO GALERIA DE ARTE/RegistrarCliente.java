
/* CLASE					RegistrarCliente
 * RESPONSABILIDAD			Registrar un cliente en la galeria
 * DESCRIPCION				Aplicacion que registra a un cliente en la galeria
 * COLABORACION				Trabaja con las clases: Cliente, Galeria, EgaleriaDeArte, Registrar
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrarCliente extends JFrame

{

     JLabel titulo,titulo2,titulo3,frase,nombre,apellido,telefono,direccion,obrapref,artpref;
     JTextField n,a,tel,dir,op,ap;
     JButton salir;
    Cliente cl;
    static Container ventana3;
     	
      Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,13);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
    
    
    public RegistrarCliente() 
    {
    	super ("Registrar Cliente");
        ventana3=getContentPane();
    	ventana3.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( RegistrarCliente.this,
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
    	titulo3= new JLabel("REGISTRAR CLIENTE");
    	titulo3.setToolTipText("Registrar cliente en picasa");
    	titulo3.setForeground(Color.blue);
    	titulo3.setFont(fuente3);    	
    	titulo3.setBounds(150,70,500,30);
    	ventana3.add(titulo3);
    	
    	titulo= new JLabel("GALERIA",icono,SwingConstants.LEFT);
    	titulo.setForeground(Color.black);
    	titulo.setFont(fuente);
    	titulo.setToolTipText("Menu Picasa");
    	titulo.setBounds(20,20,500,20);
    	ventana3.add(titulo);
    	
    	titulo2=new JLabel("PICASA");
    	titulo2.setForeground(Color.black);
    	titulo2.setFont(fuente);
    	titulo2.setBounds(30,40,500,20);
    	ventana3.add(titulo2);
    	
    	frase=new JLabel("CLIENTE_______________________________________________________");
    	frase.setForeground(Color.black);
    	frase.setFont(fuente2);
    	frase.setBounds(10,105,500,20);
    	ventana3.add(frase);
    	
    	nombre=new JLabel("Nombre: ");
    	nombre.setForeground(Color.black);
    	nombre.setFont(fuente2);
    	nombre.setBounds(20,130,200,20);
    	ventana3.add(nombre);
    	
    	apellido=new JLabel("Apellido: ");
    	apellido.setForeground(Color.black);
    	apellido.setFont(fuente2);
    	apellido.setBounds(20,150,200,20);
    	ventana3.add(apellido);
    	
    	telefono=new JLabel("Telefono: ");
    	telefono.setForeground(Color.black);
    	telefono.setFont(fuente2);
    	telefono.setBounds(20,170,200,20);
    	ventana3.add(telefono);
    	
    	direccion=new JLabel("Direccion: ");
    	direccion.setForeground(Color.black);
    	direccion.setFont(fuente2);
    	direccion.setBounds(20,190,200,20);
    	ventana3.add(direccion);
    	
        obrapref=new JLabel("Obra de arte preferida: ");
        obrapref.setForeground(Color.black);
    	obrapref.setFont(fuente2);
    	obrapref.setBounds(20,210,200,20);
    	ventana3.add(obrapref);
    	
    	artpref=new JLabel("Artista preferido: ");
    	artpref.setForeground(Color.black);
    	artpref.setFont(fuente2);
    	artpref.setBounds(20,230,200,20);
    	ventana3.add(artpref);
    	
    	//creacion de campos de texto
    	n=new JTextField(50);
    	n.setBounds(200,130,100,20);
    	ventana3.add(n);
    	
    	a=new JTextField(50);
    	a.setBounds(200,150,100,20);
    	ventana3.add(a);
    	
    	tel=new JTextField(50);
    	tel.setBounds(200,170,100,20);
    	ventana3.add(tel);
    	
    	dir=new JTextField(50);
    	dir.setBounds(200,190,100,20);
    	ventana3.add(dir);
    	
    	op=new JTextField(50);
    	op.setBounds(200,210,100,20);
    	ventana3.add(op);
    	
    	ap=new JTextField(50);
    	ap.setBounds(200,230,100,20);
    	ventana3.add(ap);
    	
    	//Creacion de botones
    	salir=new JButton ("Finalizar");
    	salir.setForeground(Color.white);
    	salir.setFont(fuente2);
    	salir.setBackground(Color.black);
    	salir.setBounds(330,230,95,20);
    	ventana3.add(salir);
    
    	   	
    	ManejadorBoton manejador=new ManejadorBoton();
    	/*n.addActionListener(manejador);
    	a.addActionListener(manejador);
    	tel.addActionListener(manejador);
    	dir.addActionListener(manejador);
    	op.addActionListener(manejador);
    	ap.addActionListener(manejador);*/
    	
    	salir.addActionListener(manejador);	
    	
    	ventana3.setBackground(Color.white);
    	setSize(500,400);
    	setVisible(true);
    	
    }
   
    
    private class ManejadorBoton extends EGaleriaDeArte implements ActionListener
    {
    	            

    
    	public void actionPerformed(ActionEvent evento)
    	{
    		
    		   
           Galeria galeria = new Galeria();

           
    		int as=0;	
    		String	nomb="";
    	    String	apel="";
    	    String	di="";
    	    String	obrc="";
    	    String	artc="";
    	    long 	te=0;
            
            try{
            
           nomb=n.getText();
            }
            catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de nombre ."+ex);
    	     as=1;
            }
             try{
           apel=ap.getText();
             }
           catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de apellido ."+ex);
    	     as=1;
            }
             try{
           te=Long.parseLong(tel.getText());
             }
           catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de telefono ."+ex);
    	     as=1;
            }
             try{
           di=dir.getText();
             }
           catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de direccion  ."+ex);
    	     as=1;
            }
             try{
           obrc=op.getText();
             }
           catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de obra favorita ."+ex);
    	     as=1;
            }
             try{
           artc=ap.getText();
             }
           catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de artista preferido ."+ex);
    	     as=1;
            }
    		
    		if(evento.getSource()==salir)
    		{
    	    if(as==0){
    	    
            cl =new Cliente(nomb,apel,te,di,obrc,artc);
            
            setVisible(false); 
            
    		JOptionPane.showMessageDialog(null,"Se registro el cliente "+nomb+" "+apel);	
    	    }
    	    if(as==1){
    	    	setVisible(true);
    	    }
    
    		}
    		galeria.agregarCliente(cl);
    	//	galeria.listarClientes();
    	}
    	
    }
    
    
    
    
 
    
}
    
