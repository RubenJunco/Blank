
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TablaLibro {
    public static void main(String[] args) {
        // Crear datos para la tabla
        String[] columnas = {"Nombre", "Edad", "Ciudad"};
        Object[][] datos = {
            {"Juan", 25, "Bogotá"},
            {"María", 30, "Medellín"},
            {"Pedro", 35, "Cali"},
            {"Luisa", 40, "Barranquilla"}
        };

        // Crear un objeto JTable con los datos
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);

        // Crear un objeto JScrollPane con la tabla
        JScrollPane scrollPane = new JScrollPane(tabla);

        // Crear un objeto JPanel para contener la tabla
        JPanel panelTabla = new JPanel();
        panelTabla.add(scrollPane);

        // Crear un objeto JFrame para mostrar el panel
        JFrame frame = new JFrame("Ejemplo de tabla");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panelTabla);
        frame.pack();
        frame.setVisible(true);
    }
}
