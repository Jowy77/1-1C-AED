package pkg1.pkg1c.aed.vistas;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import pkg1.pkg1c.aed.modelo.Turismo;
import pkg1.pkg1c.aed.modelo.Vehiculo;

public class AlquilerCochesView extends javax.swing.JFrame {

    List<Vehiculo> listaVehiculos = new ArrayList<>();

    public AlquilerCochesView(List<Vehiculo> listaVehiculos) {
        initComponents();
        this.listaVehiculos = listaVehiculos;
    }

    public AlquilerCochesView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        matriculaTextField = new javax.swing.JTextField();
        continuarToDiasButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        numDiasAlquilerTextField = new javax.swing.JTextField();
        continuarAlquilarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("ALQUILER  DE COCHES");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 241, 2)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("INDICAR LA MATRICULA DEL COCHE CONTRATADO:");

        matriculaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaTextFieldActionPerformed(evt);
            }
        });

        continuarToDiasButton.setBackground(new java.awt.Color(255, 255, 102));
        continuarToDiasButton.setForeground(new java.awt.Color(187, 0, 255));
        continuarToDiasButton.setText("Continuar");
        continuarToDiasButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 0)));
        continuarToDiasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarToDiasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continuarToDiasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(matriculaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matriculaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(continuarToDiasButton)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        jLabel3.setText("INDICAR NUMERO DE DIAS EN ALQUILER:");

        numDiasAlquilerTextField.setEditable(false);

        continuarAlquilarButton.setBackground(new java.awt.Color(255, 0, 0));
        continuarAlquilarButton.setForeground(new java.awt.Color(0, 255, 255));
        continuarAlquilarButton.setText("Continuar");
        continuarAlquilarButton.setEnabled(false);
        continuarAlquilarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarAlquilarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continuarAlquilarButton)
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(numDiasAlquilerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numDiasAlquilerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(continuarAlquilarButton)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matriculaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaTextFieldActionPerformed

    private void continuarToDiasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarToDiasButtonActionPerformed

        String matriculaRecogida = matriculaTextField.getText();

        String regex = "^[A-Za-z]{2}-\\d{4}-[A-Za-z]{3}$";

        Turismo turismoAlquilar = encontrarTurismoPorMatricula(matriculaRecogida);

        if (!matriculaRecogida.matches(regex)) {
            mostrarMensajeDeError("Ese formato no es válido para una matrícula.");
        } else if (turismoAlquilar == null) {
            mostrarMensajeDeError("Ese coche no existe en la empresa.");
        } else if (turismoAlquilar.isAlquilado()) {
            mostrarMensajeDeError("Ese turismo ya está alquilado.");
        } else {
            matriculaTextField.setEditable(false);
            continuarToDiasButton.setEnabled(false);
            numDiasAlquilerTextField.setEnabled(true);
            numDiasAlquilerTextField.setEditable(true);
            continuarAlquilarButton.setEnabled(true);
        }

    }//GEN-LAST:event_continuarToDiasButtonActionPerformed
    private Turismo encontrarTurismoPorMatricula(String matricula) {
        return listaVehiculos.stream()
                .filter(vehiculo -> vehiculo instanceof Turismo && vehiculo.getMatricula().equalsIgnoreCase(matricula))
                .map(vehiculo -> (Turismo) vehiculo)
                .findFirst()
                .orElse(null);
    }

    private void mostrarMensajeDeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void mostrarMensajeDeInformacion(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    private void continuarAlquilarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarAlquilarButtonActionPerformed
        String matriculaRecogida = matriculaTextField.getText();

        Turismo turismoAlquilar = encontrarTurismoPorMatricula(matriculaRecogida);

        if (!contieneSoloNumerosEnteros()) {
            mostrarMensajeDeError("Solo puedes introducir el numero de dias que quieres alquilar el coche.");
        } else {
            turismoAlquilar.alquilar(Integer.parseInt(numDiasAlquilerTextField.getText()));
            mostrarMensajeDeInformacion("[ª] Total turismos: "+ contarTurismos()+ " Alquilados: "+ contarTurismosAlquilados());
            this.setVisible(false);
        }

    }//GEN-LAST:event_continuarAlquilarButtonActionPerformed

    public int contarTurismos() {
        // Utiliza stream() y filter() para contar los turismos en la lista
        long cantidadTurismos = listaVehiculos.stream()
                .filter(vehiculo -> vehiculo instanceof Turismo)
                .count();

        return (int) cantidadTurismos; // Convierte el resultado a int
    }

    public int contarTurismosAlquilados() {
        // Utiliza stream(), filter() y count() para contar los turismos alquilados en la lista
        long cantidadTurismosAlquilados = listaVehiculos.stream()
                .filter(vehiculo -> vehiculo instanceof Turismo && vehiculo.isAlquilado())
                .count();

        return (int) cantidadTurismosAlquilados; // Convierte el resultado a int
    }

    private boolean contieneSoloNumerosEnteros() {
        String contenido = numDiasAlquilerTextField.getText();

        return contenido.matches("^\\d+$");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlquilerCochesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlquilerCochesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlquilerCochesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlquilerCochesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlquilerCochesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuarAlquilarButton;
    private javax.swing.JButton continuarToDiasButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField matriculaTextField;
    private javax.swing.JTextField numDiasAlquilerTextField;
    // End of variables declaration//GEN-END:variables
}