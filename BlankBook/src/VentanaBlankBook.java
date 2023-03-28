import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class VentanaBlankBook extends JFrame  {
	
	FileWriter esc = null;
	PrintWriter lec = null;
	
	public VentanaBlankBook() {
		this.setVisible(true);
		this.setSize(600, 800);
		this.setLocation(500, 500);
		this.setTitle("BlankBoock");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		
		//menu
		JPanel panel = new JPanel();	
		//panel.setMenuBar
		JMenuBar menu = new JMenuBar();
		menu.setSize(this.getWidth(),30);
		panel.add(menu);
		
		JMenu m1 = new JMenu("               Cuenta               ");
		JMenu m2 = new JMenu("               Usuarios               ");
		JMenu m3 = new JMenu("               Ayuda               ");
		JMenu m4 = new JMenu("         Gestor de Usuarios");
		/**/
		m1.setEnabled(false);
		m2.setEnabled(false);
		m3.setEnabled(false);
		m4.setEnabled(false);
		
		menu.add(m1);
		menu.add(m2);
		menu.add(m3);
		menu.add(m4);
		
		JMenuItem jm1 = new JMenuItem("Mi Cuenta");
		JMenuItem jm2 = new JMenuItem("Cerrar sesion");
		JMenuItem jm3 = new JMenuItem("Lista de los usuarios");
		JMenuItem jm4 = new JMenuItem("Crear usuarios");
		JMenuItem jm5 = new JMenuItem("¿Como crear usuarios?");
		
		m1.add(jm1);
		m1.add(jm2);
		m2.add(jm3);
		m2.add(jm4);
		m3.add(jm5);
		
		this.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JPanel panel1 = new JPanel();
		panel1.setSize(600,800);
		panel1.setLocation(0,0);
		panel.add(panel1);
		
		JButton Enter = new JButton();
		Enter.setIcon(new ImageIcon("Enter.png")); 
		Enter.setBounds(45,200,400,400);
		panel1.add(Enter);
		
		JLabel texto = new JLabel("Power By Ruben Junco ");
		texto.setSize(300,100);
		texto.setLocation(180,750);
		texto.setFont(new Font("Arial", Font.BOLD, 18));
		panel1.add(texto);
		////////////////////////////////
		//login
		JPanel login = new JPanel();
		login.setVisible(true);
		login.setSize(600, 800);
		login.setBackground(Color.decode("#A8ACB7"));
		login.setLayout(null);
		
		JLabel Inicio = new JLabel("Iniciar Sesion:");
		Inicio.setSize(200,50);
		Inicio.setLocation(100,100);
		Inicio.setFont(new Font("Arial", Font.BOLD, 16));
		login.add(Inicio);
		
		
		JLabel usuario1 = new JLabel("Usuario");
		usuario1.setSize(200,50);
		usuario1.setLocation(100,150);
		usuario1.setFont(new Font("Arial", Font.BOLD, 16));
		login.add(usuario1);
		
		JTextField usuario2 = new JTextField("");
		usuario2.setSize(300,50);
		usuario2.setLocation(100,190);
		usuario2.setOpaque(true);
		usuario2.setBackground(Color.decode("#FFFFFF"));
		login.add(usuario2);
		
		JLabel contraseña1 = new JLabel("Contraseña");
		contraseña1.setSize(200,50);
		contraseña1.setLocation(100,250);
		contraseña1.setFont(new Font("Arial", Font.BOLD, 16));
		login.add(contraseña1);
		
		JPasswordField contraseña2 = new JPasswordField("");
		contraseña2.setSize(300,50);
		contraseña2.setLocation(100,290);
		contraseña2.setOpaque(true);
		contraseña2.setBackground(Color.decode("#FFFFFF"));
		login.add(contraseña2);
		
		JButton BottomLog = new JButton("Entrar");
		BottomLog.setSize(300,50);
		BottomLog.setLocation(100,370);
		login.add(BottomLog);
		
		
		JButton Inf = new JButton();
		Inf.setSize(50,50);
		Inf.setLocation(450,370);
		Inf.setIcon(new ImageIcon("Info.png")); 
		login.add(Inf);
		
	
		//////////////////////////////////////
		//Menu principal
		
		JPanel MenuP = new JPanel();
		MenuP.setSize(panel.getWidth(),20);
		MenuP.setBackground(Color.decode("#E4E4E4"));
		MenuP.setSize(600,800);
		MenuP.setLocation(0,0);
		
		
		JLabel Saludo1 = new JLabel("");
		Saludo1.setSize(0,0);
		Saludo1.setLocation(0,0);
		Saludo1.setIcon(new ImageIcon("MenuP.png")); //agregar una imagen
		Saludo1.setBounds(0,0,600,800);
		MenuP.add(Saludo1);
		
		////////////////////////////////
		//mi cuenta
		JPanel CuentaUsu = new JPanel();
		CuentaUsu.setSize(600,800);
		CuentaUsu.setLocation(0,0);
		CuentaUsu.setBackground(Color.decode("#E5E5E5"));
		
		JLabel edit = new JLabel("Editar Informacion:");
		edit.setSize(200,50);
		edit.setLocation(20,360);
		edit.setFont(new Font("Arial", Font.BOLD, 18));
		CuentaUsu.add(edit);
		
		JLabel nombre11 = new JLabel("Nombre:");
		nombre11.setSize(200,50);
		nombre11.setLocation(50,400);
		nombre11.setFont(new Font("Arial", Font.BOLD, 14));
		CuentaUsu.add(nombre11);
		
		JTextField nombre22 = new JTextField("");
		nombre22.setSize(200,50);
		nombre22.setLocation(50,450);
		nombre22.setOpaque(true);
		nombre22.setBackground(Color.decode("#FFFFFF"));
		CuentaUsu.add(nombre22);
		
		JLabel apellido11 = new JLabel("Apellido:");
		apellido11.setSize(200,50);
		apellido11.setLocation(300,400);
		apellido11.setFont(new Font("Arial", Font.BOLD, 14));
		CuentaUsu.add(apellido11);
		
		JTextField apellido22 = new JTextField("");
		apellido22.setSize(200,50);
		apellido22.setLocation(300,450);
		apellido22.setOpaque(true);
		apellido22.setBackground(Color.decode("#FFFFFF"));
		CuentaUsu.add(apellido22);
		
		JLabel email11 = new JLabel("Email:");
		email11.setSize(200,50);
		email11.setLocation(50,550);
		email11.setFont(new Font("Arial", Font.BOLD, 14));
		CuentaUsu.add(email11);
		
		JTextField email22 = new JTextField("");
		email22.setSize(200,50);
		email22.setLocation(50,600);
		email22.setOpaque(true);
		email22.setBackground(Color.decode("#FFFFFF"));
		CuentaUsu.add(email22);
		
		JLabel contraseña11 = new JLabel("Contraseña:");
		contraseña11.setSize(200,50);
		contraseña11.setLocation(300,550);
		contraseña11.setFont(new Font("Arial", Font.BOLD, 14));
		CuentaUsu.add(contraseña11);
		
		JTextField contraseña22 = new JTextField("");
		contraseña22.setSize(200,50);
		contraseña22.setLocation(300,600);
		contraseña22.setOpaque(true);
		contraseña22.setBackground(Color.decode("#FFFFFF"));
		CuentaUsu.add(contraseña22);
		
		
		JButton IconoAdmin = new JButton();
		IconoAdmin.setSize(200,200);
		IconoAdmin.setLocation(200,80);
		IconoAdmin.setIcon(new ImageIcon("Icono.png"));
        CuentaUsu.add(IconoAdmin);
        
        JButton actualizar = new JButton("Actualizar Informacion");
        actualizar.setSize(200,40);
        actualizar.setLocation(300,700);
        CuentaUsu.add(actualizar);
        
        JButton salir = new JButton("salir");
        salir.setSize(200,40);
        salir.setLocation(50,700);
        CuentaUsu.add(salir);
        
        JButton AdminVer = new JButton("Visualizar informacion");
        AdminVer.setSize(200,40);
        AdminVer.setLocation(200,300);
        CuentaUsu.add(AdminVer);
        
        ///////////////////////////////
        //Usuarios
        JPanel Usuarios = new JPanel();
        Usuarios.setSize(600,800);
        Usuarios.setLocation(0,0);
        Usuarios.setBackground(Color.decode("#CAD3B9"));
        
        JLabel TLista = new JLabel("Lista Usuarios");
        TLista.setSize(200,50);
        TLista.setLocation(100,300);
        TLista.setFont(new Font("Arial", Font.BOLD, 24));
        Usuarios.add(TLista);
        
        JButton Tvista = new JButton("Ver usuarios");
        Tvista.setSize(400,150);
        Tvista.setLocation(100,400);
        //Tvista.setFont(new Font("Arial", Font.BOLD, 24));
        Usuarios.add(Tvista);
        
        
        ////
        ///Agregar usuarios
        
        
    
       
       
       
    	panel.repaint();
		
	/////////////////////////////////////////////////////////////////////////////////	
		Enter.addActionListener(new ActionListener() {

			
			//logearte
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.print("hola");
				panel.add(login);
				panel.remove(panel1);
			
				panel.remove(Enter);
				panel.remove(texto);
				
				panel.repaint();
			}
			});
			
		//logeado
		 BottomLog.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.print("hola");
			
			FileReader archivo;
			BufferedReader lector;
			
			try {
				archivo = new FileReader("Admin.txt");
				if(archivo.ready()) {
					lector= new BufferedReader(archivo);
					String cadena;
					while((cadena=lector.readLine())!=null) {
						System.out.println(cadena);}
					JOptionPane.showMessageDialog(null, "se a ingresado con exito");
					login.add(MenuP);
					MenuP.remove(login);
					
					panel.repaint();
					}else {
						System.out.println("No se a podido ingresar por un error desconocido...");
					}
					}catch(Exception e1) {
						System.out.println("Error..."+e1.getMessage());
					}
			

			
			//usuario1.setSize(0,0);
			login.remove(usuario1);
		
			login.remove(usuario2);
			
			login.remove(contraseña1);
		
			login.remove(contraseña2);
			
			login.remove(BottomLog);
			
			login.remove(Inf);
			
			login.remove(Inicio);
			m1.setEnabled(true);
			m2.setEnabled(true);
			m3.setEnabled(true);
			
			
			//MenuP.repaint();
			panel.repaint();
		}
		});
		 
		 //mi cuenta
		 jm1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.print("hola");

					
					MenuP.remove(Saludo1);	
					MenuP.add(CuentaUsu);
					CuentaUsu.remove(MenuP);
					CuentaUsu.repaint();
					//CuentaUsu.revalidate();
					panel1.repaint();
				}
				});
		 
		 panel.repaint();
		 
	
	
	//cerrar sesion y reinicio
	jm2.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        VentanaBlankBook.this.setVisible(false); 
	        VentanaBlankBook nuevaVentana = new VentanaBlankBook(); 
	        nuevaVentana.setVisible(true); 
	    }
	});
	
	//ver usuarios
	jm3.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			CuentaUsu.add(Usuarios);
			MenuP.add(Usuarios);
			Usuarios.remove(MenuP);
			MenuP.remove(Saludo1);
			Usuarios.remove(CuentaUsu);
			CuentaUsu.remove(IconoAdmin);
			CuentaUsu.remove(nombre11);
			CuentaUsu.remove(nombre22);
			CuentaUsu.remove(apellido11);
			CuentaUsu.remove(apellido22);
			CuentaUsu.remove(email11);
			CuentaUsu.remove(email22);
			CuentaUsu.remove(contraseña11);
			CuentaUsu.remove(contraseña22);
			CuentaUsu.remove(actualizar);
			CuentaUsu.remove(salir);
			CuentaUsu.remove(AdminVer);
			
			Usuarios.repaint();
	    }
		
		
	});
	
	
	
	//como agregar nuevo usuario
	
	jm5.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        
	    	JOptionPane.showMessageDialog(null, "1.Hacer click en la opcion Usuarios en el menu superior\n 2.Hacer click en la opcion CREAR USUARIO en el menu\n 3.Llenar los campos solicitados\n 4.Escribir una descripcion breve de ti\n 5.Seleccione su comida favorita\n 6.Seleccione su color favorito\n 7.Hacer click en el boton CREAR USUSARIO\n 8.Listo, el usuario a sido creado");
	    			
	    	                                   
	    	
	    }
	});
	
	///Ver informacion admin
	AdminVer.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        
	 List<String[]> datos = new ArrayList<>();

     try {
         Scanner scanner = new Scanner(new File("Admin.txt"));
         while (scanner.hasNextLine()) {
             String[] fila = scanner.nextLine().split(",");
             datos.add(fila);
         }
         scanner.close();
     } catch (FileNotFoundException e3) {
         e3.printStackTrace();
     }


     String[] columnas = { "Nombre", "Apellidos", "Correo","Passaword"};
     DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
     for (String[] fila : datos) {
         modelo.addRow(fila);
     }
     JTable tabla = new JTable(modelo);
     JScrollPane scrollPane = new JScrollPane(tabla);
     JFrame TabUsuarios = new JFrame("Adminstrador:");
     //TabUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     TabUsuarios.add(scrollPane);
     TabUsuarios.pack();
     TabUsuarios.setVisible(true);
    	
	    }
	});
	
	
	//Ver informacion de usuarios
	Tvista.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	        
	 List<String[]> datos = new ArrayList<>();

     try {
         Scanner scanner = new Scanner(new File("Usu.txt"));
         while (scanner.hasNextLine()) {
             String[] fila = scanner.nextLine().split(",");
             datos.add(fila);
         }
         scanner.close();
     } catch (FileNotFoundException e3) {
         e3.printStackTrace();
     }


     String[] columnas = { "Nombre", "Apellidos", "Correo","Passaword"};
     DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
     for (String[] fila : datos) {
         modelo.addRow(fila);
     }
     JTable tabla = new JTable(modelo);
     JScrollPane scrollPane = new JScrollPane(tabla);
     JFrame TabUsuarios = new JFrame("Usuarios:");
     
     TabUsuarios.add(scrollPane);
     TabUsuarios.pack();
     TabUsuarios.setVisible(true);
    	
	    }
	});
	
	
	
	
	
	
	actualizar.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
	    	JOptionPane.showMessageDialog(null, "En proceso...");

		}});
	
	Inf.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
	    	JOptionPane.showMessageDialog(null, "Usuario: Ruben\n Contraseña: Aguacate");

		}});
	
	jm4.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			 JFrame AgrUsuarios = new JFrame("Agregar usuarios");
			// AgrUsuarios.pack();
			 AgrUsuarios.setVisible(true);
			 AgrUsuarios.setSize(500,800);
			 AgrUsuarios.setLocation(600,150);
			 AgrUsuarios.setBackground(Color.decode("#AEB89B"));
			 
			 
			 JOptionPane.showMessageDialog(null, "En proceso...");
				AgrUsuarios.repaint();
			
	    	

		}});
	
	salir.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			        VentanaBlankBook.this.setVisible(false); 
			        VentanaBlankBook nuevaVentana = new VentanaBlankBook(); 
			        nuevaVentana.setVisible(true); 
			    }

		});

	}
	
	
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub 

			VentanaBlankBook v = new VentanaBlankBook();
		}
	
}