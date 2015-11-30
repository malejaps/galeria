/**
 * @(#)Acercade.java
 *
 *
 * @author 
 * @version 1.00 2010/11/27
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Acercade extends JFrame{

JLabel titulo,titulo2,titulo3,cuerpo;
 Font fuente=new Font("Lucida Calligraphy",Font.BOLD,25);
     Font fuente2=new Font("Segoe Script",Font.BOLD,15);
     Font fuente3=new Font("calibri",Font.BOLD,12);
     Color color1=new Color(0.53f,0.32f,0.25f);
     
     
    public Acercade() {
    	
    	  super ("Acerca de Picasa");
    	Container ventana1=getContentPane();
    	ventana1.setLayout(null);
    	  ImageIcon icono=new ImageIcon("arte1.gif");
    
    	
    	
    	//Creacion de etiquetas
    	titulo= new JLabel("GALERIA",icono,SwingConstants.LEFT);
    	titulo.setForeground(Color.black);
    	titulo.setFont(fuente);
    	titulo.setToolTipText("informacion sobre software");
    	titulo.setBounds(150,20,500,20);
    	ventana1.add(titulo);
    	
    	titulo2=new JLabel("PICASA");
    	titulo2.setForeground(Color.black);
    	titulo2.setFont(fuente);
    	titulo2.setBounds(200,40,500,20);
    	ventana1.add(titulo2);
    
        cuerpo=new JLabel("<html>"+"(LA AYUDA QUEDA PENDIENTE PARA COMPLETAR)Este espacio esta diseñado para Que tenga una guia basica sobre "+"</br>"+" el manejo del programa GALERIA PICASA, el programa consta de 6 partes:"+"</br>"+"1:Vender: Esta opcion brinda la posibilidad de asignar una obra"+"</br>"+" que previamente el cliente halla escogido ; para utilizar esta herramienta se necesita:"+"</br>"+" el nombre y telefono del cliente,y el codigo de la obra ."+"</html>");
        /* dogitando un  nombre y telefono de cliente previamente registrado, un  codigo de obra registradop el soft pedira confirmacion si desea o no realizar la venta, si se realiza la venta exitosamente 
         *el software asiganra la obra a la lista de obras compradas y desactivara esta para otra operacion.
         *
         *parte 2: Registrar: en esta parte del programa se ofrece la posibilidad de registrar un cliente en el software y asi poder venderle un producto de la galeria, de esta parte se desprende varias opciones de registrar 
         *como son : registrar cliente , Registrar obra o registrar Artista.
         *
         * para registrar un cliente satisfatoriamente se necesitan lo sigueinte datos del cliente :
         *nombre,apellido,telefono,direccion, obra preferia del cliente y artista preferido del cliente.
         *
         *
         *para registrar una obra satisfactoriamente se necesitan los siguientes datos de la obra y del artista que la realizo:
         *datos obra: nombre,codigo,fecha,tipo de obra(foto,pintura..)
         *datos artista: nombre del artista,especialidad,estado(vivo o muerto) ,precio minimo de obras,precio maximo de obras.
         *
         *
         *para registrar un artista satisfactoriamente se necesitan los siguientes datos del artista:
         *nombre del artista,especialidad,estado(vivo o muerto) ,precio minimo de obras,precio maximo de obras.
         *
         *3 parte Modificar :en esta parte del programa se ofrece la posibilidad de modificar la informacion ya ingresada en el programa como lo son artistas,obras o clientes.
         *como su nombre lo indica modifica datos y son guardados posteriormente , se toma como una actualizacion de base de datos para el programa.
         *
         *para modificar datos del cliente se necesitan  :
         *nombre y telefono del cliente para buscarlo y asi dar la posibilidad de modificar sus datos.
         *
         *para modificar datos del artista se necesitan:
         *nombre, para ubicarlo y asi ofrecer la posibilidad de modificar sus datos.
         *
         *para modificar datos de la obra se necesitan:
         *codigo, para ubicarla y ofrecer la posibilidad de modificar sus datos.
         *
         *4 parte Eliminar: en esta parte del programa encontraremos la posibilidad de eliminar clientes, artista u obras ya registradas.
         *
         *para usar esta herramienta se necesitan los siguientes datos.
         *
         *para eliminar cliente.
         *nombre y telefono del cliente para ubicarlo y posteriormente borrarlo del sistema.
         *
         *para eliminar artista.
         *nombre,para ubicarlo y posteriormente borrarlo del sistema.
         *
         *para eliminar obra.
         *codigo de la obra,para ubicarla y posteriormente borrarla del sistema. 
         *
         *5 parte: Listar : en esta parte se lista o se muestra cada dato guardado en el software como son artistas obras etc.
         *
         *
         *	 */
        	 
        	 cuerpo.setForeground(Color.black);
        cuerpo.setFont(fuente3);
        cuerpo.setBounds(100,100,500,350);
        ventana1.add(cuerpo);
        
        
     	ventana1.setBackground(Color.white);
     	
     	
    	setSize(650,500);
    	setVisible(true);
    	
    	
    }
    
    
     public void paint(Graphics g)
    {
   
    super.paint(g); 
 
    
    }
    
    public static void main (String args[]){
    	
    	Acercade obj =new Acercade();
    }
   
}