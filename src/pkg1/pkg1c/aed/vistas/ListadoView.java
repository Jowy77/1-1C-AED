package pkg1.pkg1c.aed.vistas;

import javax.swing.*;
import java.awt.*;

public class ListadoView extends JFrame {

    private JLabel label;
    private JTextArea textArea;

    public ListadoView() {
        setTitle("Listado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        label = new JLabel("Listado:");
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0)); // Agregar espacio inferior

        textArea = new JTextArea();
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setEditable(false);

        panel.add(label, BorderLayout.PAGE_START);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        add(panel);
    }

    // Método para obtener el JLabel
    public JLabel getLabel() {
        return label;
    }

    // Método para obtener el JTextArea
    public JTextArea getTextArea() {
        return textArea;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }
    
    public void setTextFromTextArea(String listadoCoches){
        getTextArea().setText(listadoCoches);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ListadoView ventana = new ListadoView();
            ventana.setVisible(true);
        });
    }
}
