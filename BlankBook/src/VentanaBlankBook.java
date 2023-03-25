import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class VentanaBlankBook extends JFrame  {

		
		public  VentanaBlankBook() {
			this.setVisible(true);
			this.setSize(600, 800);
			this.setLocation(500, 500);
			this.setTitle("BlankBoock");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			
			
			//panelCero
			JPanel panel0 = new JPanel();	
			this.getContentPane().add(panel0);
			panel0.setLayout(null);
			
			//Primer panel
			JPanel titulo = new JPanel();
			titulo.setBackground(Color.decode("#747D96"));
			this.getContentPane().add(titulo);
			titulo.setLayout(null);
			

			JLabel DatosCliente = new JLabel("Power By Ruben Junco");
			DatosCliente.setSize(250,50);
			DatosCliente.setLocation(210,700);
			DatosCliente.setFont(new Font("Comic Sans", Font.BOLD, 14));
			titulo.add(DatosCliente);
			
			JButton save = new JButton();
			save.setIcon(new ImageIcon("Enter.png")); //agregar una imagen
			save.setBounds(100,130,400,400);
			titulo.add(save);
			
			titulo.revalidate();
			titulo.repaint();
			
			
		}
		
		public void cambioPaneles() {
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub 

			VentanaBlankBook v = new VentanaBlankBook();
		}
	
}