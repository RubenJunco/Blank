import javax.swing.JFrame;

public class VentanaBlankBook extends JFrame  {

		
		public  VentanaBlankBook() {
			this.setVisible(true);
			this.setSize(600, 800);
			this.setLocation(500, 500);
			this.setTitle("BlankBoock");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			
	
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub 

			VentanaBlankBook v = new VentanaBlankBook();
		}
	
}