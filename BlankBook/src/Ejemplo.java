import javax.swing.*;
import javax.swing.table.*;
import java.io.*;

public class Ejemplo extends JFrame {

    private JTable tabla;
    private JScrollPane scrollPane;

    public Ejemplo() {
        // Crear un modelo de tabla personalizado
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Columna 1");
        modelo.addColumn("Columna 2");

        try {
            // Leer el archivo de texto
            BufferedReader br = new BufferedReader(new FileReader("Usu.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                // Agregar las filas correspondientes al modelo de tabla
                modelo.addRow(linea.split(","));
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Crear la tabla con el modelo de tabla personalizado
        tabla = new JTable(modelo);

        // Crear un objeto JScrollPane y agregar la tabla
        scrollPane = new JScrollPane(tabla);

        // Crear un JPanel y agregar el objeto JScrollPane
        JPanel panel = new JPanel();
        panel.add(scrollPane);

        // Configurar la ventana principal
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ejemplo de tabla");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Ejemplo();
    }
}
