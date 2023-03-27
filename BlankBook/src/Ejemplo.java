import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
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
import javax.swing.table.DefaultTableModel;

public class Ejemplo extends JFrame implements ActionListener {
	
	public JTextField username = new JTextField();
	public JPasswordField password = new JPasswordField();
    
	public  Ejemplo() {
		this.setVisible(true);//modificar la visibilidad
		this.setSize(500, 800);//modificar el tamaño
		this.setLocation(500, 500);//modificar la ubicacion
		this.setTitle("BlankBoock");//modificar la el titulo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para cerrar la ventana del administrador de tareas
		this.setLocationRelativeTo(null);//Para que sea posible mover la ventana
		
		//menu
		JPanel panel = new JPanel();
		//panel.setMenuBar
		this.getContentPane().add(panel);//los paneles son necesarios para que las ventanas funcionen bien
		panel.setLayout(null);
		panel.setBackground(Color.black);
		
		JMenuBar menu = new JMenuBar();
		menu.setSize(this.getWidth(),25);//para crear una barra de menu
		panel.add(menu);
		
		JMenu m1 = new JMenu("inicio");//para colocar opciones en la barra menu
		JMenu m2 = new JMenu("cuenta");
		JMenu m3 = new JMenu("estudiantes");
		JMenu m4 = new JMenu("ayuda");
		m4.setEnabled(false);// evita que puedas seleccionar la opcion de la barra menu
		
		menu.add(m1);
		menu.add(m2);
		menu.add(m3);//agregameos las opciones en la barra menu
		menu.add(m4);
		
		JMenuItem jm1 = new JMenuItem("Ingresar");//para colocar herramientas en las opciones del menu
		JMenuItem jm2 = new JMenuItem("Registrarse");
		m2.add(jm1);
		m2.add(jm2);
		
		//agregamos nuevos paneles que se abriran al seleccionar la opcion correspondiente
		JPanel login = new JPanel();
		login.setVisible(true);
		login.setSize(500, 800);
		login.setBackground(Color.black);
		login.setLayout(null);
		
		JPanel registro = new JPanel();
		registro.setVisible(true);
		registro.setSize(500, 800);
		registro.setBackground(Color.pink);
		registro.setLayout(null);
		
		jm1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.print("hola");
				panel.remove(registro);
				panel.add(login);
				panel.repaint();
			}
			});
		
		jm2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.print("com0 estaz¿");
				panel.remove(login);
				panel.add(registro);
				panel.repaint();
			}
			});
	
		//******************************************* Login		
		
		JLabel Usuario = new JLabel("Usuario:");
		Usuario.setSize(200, 50);
		Usuario.setForeground(Color.white);
		Usuario.setLocation(10,30);
		Usuario.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		login.add(Usuario);
		
		//username
		username.setSize(200,50);
		username.setLocation(10,80);
		username.setOpaque(true);
		username.setBackground(Color.white);
		login.add(username);
		
		JLabel Contrasena = new JLabel("Contraseña:");
		Contrasena.setSize(200, 50);
		Contrasena.setForeground(Color.white);
		Contrasena.setLocation(10,160);
		Contrasena.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		login.add(Contrasena);
		
		//Password
		password.setSize(200,50);
		password.setLocation(10,200);
		password.setOpaque(true);
		//password = new JPasswordField();
		password.setBackground(Color.white);
		login.add(password);
		
		JButton Entrar = new JButton("Ingresar");
		Entrar.setSize(200,50);
		Entrar.setLocation(10,290);
		login.add(Entrar);
		     
		
		JPanel Usuarios = new JPanel();
		Usuarios.setVisible(true);
		Usuarios.setSize(500, 800);
		Usuarios.setBackground(Color.GRAY);
		Usuarios.setLayout(null);
		
		//********************************************
		
		Entrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FileReader archivo;
				BufferedReader lector;
				
				try {
					archivo = new FileReader("Usu.txt");
					if(archivo.ready()) {
						lector= new BufferedReader(archivo);
						String cadena;
						while((cadena=lector.readLine())!=null) {
							System.out.println(cadena);}
						JOptionPane.showMessageDialog(null, "se a ingresado con exito");
						panel.remove(login);
						panel.add(Usuarios);
						panel.repaint();
						}else {
							System.out.println("El archivo no funciona bien...");
						}
						}catch(Exception e1) {
							System.out.println("Error..."+e1.getMessage());
						}
					
	
			       
						}});
		
		JLabel Titulotabla = new JLabel("   Panel administrador");
		Titulotabla.setSize(200, 50);
		Titulotabla.setForeground(Color.black);
		Titulotabla.setLocation(10,30);
		Titulotabla.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		Titulotabla.setOpaque(true);
		Usuarios.add(Titulotabla);
		
		JLabel TextoTabla = new JLabel("    Consultar usuarios");
		TextoTabla.setSize(200, 50);
		TextoTabla.setForeground(Color.black);
		TextoTabla.setLocation(10,90);
		TextoTabla.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		TextoTabla.setOpaque(true);
		Usuarios.add(TextoTabla);
		
		JButton visual = new JButton("ver");
		visual.setSize(200,50);
		visual.setLocation(10,150);
		Usuarios.add(visual);
		
		visual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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

		        // Crear la tabla y mostrar los datos
		        String[] columnas = { "Nombre", "Apellidos", "Correo","Passaword"};
		        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		        for (String[] fila : datos) {
		            modelo.addRow(fila);
		        }
		        JTable tabla = new JTable(modelo);
		        JScrollPane scrollPane = new JScrollPane(tabla);
		        JFrame frame = new JFrame("Tabla de datos");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.add(scrollPane);
		        frame.pack();
		        frame.setVisible(true);
		    }
			
			
		});
		
		panel.repaint();
		//********************************************
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ejemplo v = new Ejemplo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
