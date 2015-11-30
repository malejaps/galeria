/* CLASE					RegistrarObra
 * RESPONSABILIDAD			Registrar una obra en la galeria
 * DESCRIPCION				Aplicacion que registra una obra en la galeria
 * COLABORACION				Trabaja con las clases: Obra, Galeria, EgaleriaDeArte, Registrar
 */



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrarObra extends JFrame 

{

     JLabel titulo,titulo2,titulo3,frase,frase2,nombre,codigo,fecha,tipo,disponibilidad,especialidad,estado,nartista,intervaloi,intervalof;
     JTextField n,c,f,t,e,esta,d,na,ip,fp;
     JButton salir;
    
      Container ventana3;
    
     Font fuente=new Font("Lucida Calligraphy",Font.BOLD,13);
     Font fuente2=new Font("Segoe Print",Font.PLAIN,13);
     Font fuente3=new Font("Segoe Script",Font.BOLD,20);
     
    public RegistrarObra() 
    {
    	super ("Registrar Obra");
        ventana3=getContentPane();
    	ventana3.setLayout(null);
    	
    		//MENU INICIO
    	
    	
    JMenu menuAyuda = new JMenu( "INICIO" );
    
    JMenuItem acercade=new JMenuItem("Acerca de ....");
    
    
    acercade.addActionListener(new ActionListener()
    {
    	
    	public void actionPerformed( ActionEvent evento )
            {
              JOptionPane.showMessageDialog( RegistrarObra.this,
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
    	titulo3= new JLabel("REGISTRAR OBRA");
    	titulo3.setToolTipText("Registrar obra en picasa");
    	titulo3.setForeground(Color.blue);
    	titulo3.setFont(fuente3);  
    	titulo3.setBounds(150,50,500,20);
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
    	
    	
    	frase=new JLabel("OBRA_______________________________________________________");
        frase.setForeground(Color.black);
    	frase.setFont(fuente2);
    	frase.setBounds(10,80,500,20);
    	ventana3.add(frase);
    	
    	nombre=new JLabel("Nombre: ");
    	nombre.setForeground(Color.black);
    	nombre.setFont(fuente2);
    	nombre.setBounds(20,110,200,20);
    	ventana3.add(nombre);
    	
    	codigo=new JLabel("Codigo: ");
    	codigo.setForeground(Color.black);
    	codigo.setFont(fuente2);
    	codigo.setBounds(20,130,200,20);
    	ventana3.add(codigo);
    	
    	fecha=new JLabel("Fecha: ");
    	fecha.setForeground(Color.black);
    	fecha.setFont(fuente2);
    	fecha.setBounds(20,150,200,20);
    	ventana3.add(fecha);
    	
    	tipo=new JLabel("Tipo: ");
    	tipo.setForeground(Color.black);
    	tipo.setFont(fuente2);
    	tipo.setBounds(20,170,200,20);
    	ventana3.add(tipo);
    	
       /* disponibilidad=new JLabel("Disponibilidad: ");
    	obrapref.setBounds(20,130,200,20);
    	ventana3.add(disponibilidad);*/
    	
    	
    	frase2=new JLabel("ARTISTA____________________________________________________");
    	frase2.setForeground(Color.black);
    	frase2.setFont(fuente2);
    	frase2.setBounds(10,200,500,20);
    	ventana3.add(frase2);
    	
    	 		
    	nartista=new JLabel("Nombre del artista ");
    	nartista.setForeground(Color.black);
    	nartista.setFont(fuente2);
    	nartista.setBounds(20,230,200,20);
    	ventana3.add(nartista);
    	
    	especialidad=new JLabel("Especialidad ");
    	especialidad.setForeground(Color.black);
    	especialidad.setFont(fuente2);
    	especialidad.setBounds(20,250,200,20);
    	ventana3.add(especialidad);
    	
    		
    	estado=new JLabel("Estado: ");
    	estado.setForeground(Color.black);
    	estado.setFont(fuente2);
    	estado.setBounds(20,270,200,20);
    	ventana3.add(estado);
    	
   
    	intervaloi=new JLabel("Precio minimo de sus obras: ");
    	intervaloi.setForeground(Color.black);
    	intervaloi.setFont(fuente2);
    	intervaloi.setBounds(20,290,200,20);
    	ventana3.add(intervaloi);
    	
    		
    	intervalof=new JLabel("Precio maximo de sus obras: ");
    	intervalof.setForeground(Color.black);
    	intervalof.setFont(fuente2);
    	intervalof.setBounds(20,310,200,20);
    	ventana3.add(intervalof);
    	
    	
    	//creacion de campos de texto
    	n=new JTextField(50);
    	n.setBounds(220,110,100,20);
    	ventana3.add(n);
    	
    	c=new JTextField(50);
    	c.setBounds(220,130,100,20);
    	ventana3.add(c);
    	
    	f=new JTextField(50);
    	f.setBounds(220,150,100,20);
    	ventana3.add(f);
    	
    	t=new JTextField(50);
    	t.setBounds(220,170,100,20);
    	ventana3.add(t);
    	
    	na=new JTextField(50);
    	na.setBounds(220,230,100,20);
    	ventana3.add(na);
    	
    	e=new JTextField(50);
    	e.setBounds(220,250,100,20);
    	ventana3.add(e);
    	
    	esta=new JTextField(50);
    	esta.setBounds(220,270,100,20);
    	ventana3.add(esta);
    	
       	
    	ip=new JTextField(50);
    	ip.setBounds(220,290,100,20);
    	ventana3.add(ip);
    	
    	
    	fp=new JTextField(50);
    	fp.setBounds(220,310,100,20);
    	ventana3.add(fp);
    	
    	//Creacion de botones
    	salir=new JButton ("Finalizar");
    	salir.setForeground(Color.white);
    	salir.setFont(fuente2);
    	salir.setBackground(Color.black);
    	salir.setBounds(330,350,95,20);
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
   
    
    private class ManejadorBoton  implements ActionListener
    {
    	            
   
           
           
    
     Galeria galeria=new Galeria();
    
    	public void actionPerformed(ActionEvent evento)
    	{
    			int as=0;
    		String	nomb="";
    	    String	esp="";
    	    String	nar="";
    	    String  st="";
    	    String	fech="";
    	    String	tipo="";
    	    long 	cod=0;
    	    long inti=0;
    	    long intf=0;
    	   // boolean di=false;
           try{
           
           nomb=n.getText();
           }
            catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de nombre ."+ex);
    	     as=1;
            }
            try{
           esp=e.getText();
            }
            catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de nombre ."+ex);
    	     as=1;
            }
            try{
           nar=na.getText();
            }
            catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de nombre ."+ex);
    	     as=1;
            }
            try{
           st=esta.getText();
            }
            catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de nombre ."+ex);
    	     as=1;
            }
            try{
           cod=Long.parseLong(c.getText());
            }
            catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de nombre ."+ex);
    	     as=1;
            }
            try{
           tipo=t.getText();
            }
            catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de nombre ."+ex);
    	     as=1;
            }
            try{
           fech  =f.getText();
            }
            catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de nombre ."+ex);
    	     as=1;
            }
            try{
           inti=Long.parseLong(ip.getText());
            }
            catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de nombre ."+ex);
    	     as=1;
            }
            try{
           intf=Long.parseLong(fp.getText());
            }
            catch(Exception ex){
            	JOptionPane.showMessageDialog(null,"error en ingreso de nombre ."+ex);
    	     as=1;
            }
           //di=Boolean.parseBoolean(d.getText());
    		
    		if(evento.getSource()==salir)
    		{
    	    if(as==0)		
    	    {
            Artista art=new Artista(nar,esp,st,inti,intf);
           
            Obra obr =new Obra(nomb,fech,art,cod,tipo);
            
            if(galeria.buscarArtista2(nar)==false)
            {
            	
             galeria.agregarArtista(art);
            }
         
            
    		JOptionPane.showMessageDialog(null,"Se registro la obra "+nomb+" del artista "+nar);	
    		
            galeria.agregarObra(obr);
            setVisible(false); 
    	    }
    	    if(as==1){
    	    	setVisible(true);
    	    }
    		}
    		
    	//	galeria.listarObras();
    	}
    	
    }
    
    
    
    
 
    
}
    
