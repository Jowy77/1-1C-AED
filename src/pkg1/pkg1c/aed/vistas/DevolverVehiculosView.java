package pkg1.pkg1c.aed.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pkg1.pkg1c.aed.modelo.Camion;
import pkg1.pkg1c.aed.modelo.Turismo;
import pkg1.pkg1c.aed.modelo.Vehiculo;

public class DevolverVehiculosView extends javax.swing.JFrame {

    List<Vehiculo> listaVehiculos = new ArrayList<>();

    public DevolverVehiculosView(List<Vehiculo> listaVehiculos) {
        initComponents();
        this.listaVehiculos = listaVehiculos;
    }

    public DevolverVehiculosView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        matriculaDevolverTextField = new javax.swing.JTextField();
        tipoVehiculoTextField = new javax.swing.JTextField();
        continuarToDevolverButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        diasContratadoTextFeild = new javax.swing.JTextField();
        devolucionButton = new javax.swing.JButton();
        diasTotalesAlquiladoTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("DEVOLVER VEHICULO");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 241, 2)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("INDICAR LA MATRICULA DEL VEHICULO A DEVOLVER:");

        matriculaDevolverTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaDevolverTextFieldActionPerformed(evt);
            }
        });

        tipoVehiculoTextField.setEditable(false);
        tipoVehiculoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoVehiculoTextFieldActionPerformed(evt);
            }
        });

        continuarToDevolverButton.setBackground(new java.awt.Color(255, 0, 0));
        continuarToDevolverButton.setForeground(new java.awt.Color(0, 255, 255));
        continuarToDevolverButton.setText("Continuar");
        continuarToDevolverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarToDevolverButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(matriculaDevolverTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tipoVehiculoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continuarToDevolverButton)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculaDevolverTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoVehiculoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(continuarToDevolverButton)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        jLabel3.setText("INDICAR NUMERO DE DIAS EN ALQUILER:");

        diasContratadoTextFeild.setEditable(false);

        devolucionButton.setBackground(new java.awt.Color(255, 0, 0));
        devolucionButton.setForeground(new java.awt.Color(0, 255, 255));
        devolucionButton.setText("Continuar");
        devolucionButton.setEnabled(false);
        devolucionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolucionButtonActionPerformed(evt);
            }
        });

        diasTotalesAlquiladoTextField.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(diasContratadoTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diasTotalesAlquiladoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(devolucionButton)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diasContratadoTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diasTotalesAlquiladoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(devolucionButton)
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

    private void matriculaDevolverTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaDevolverTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaDevolverTextFieldActionPerformed

    private void tipoVehiculoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVehiculoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoVehiculoTextFieldActionPerformed

    private void devolucionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolucionButtonActionPerformed
        String matriculaRecogida = matriculaDevolverTextField.getText();
        Vehiculo vehiculoAlquilar = encontrarVehiculoPorMatricula(matriculaRecogida);

        String diasTotales = diasTotalesAlquiladoTextField.getText();

        if (!contieneSoloNumerosEnteros()) {
            mostrarMensajeDeError("Solo puedes introducir numeros.");
        } else if (!compruebaDias(diasTotales, vehiculoAlquilar)) {
            mostrarMensajeDeError("El numero de dias totales tiene que ser igual o mayor al que numero"
                    + " de dias contratado inicialmente");
        } else {
            double importeFinal = getImporteFinal(vehiculoAlquilar);
            vehiculoAlquilar.devolver(0);
            mostrarMensajeDeInformacion(Double.toString(importeFinal));
            this.setVisible(false);
        }

    }//GEN-LAST:event_devolucionButtonActionPerformed

    private Double getImporteFinal(Vehiculo vehiculo) {
        double importeFinal = 0;

        int diasTotales = Integer.parseInt(diasTotalesAlquiladoTextField.getText());

        if (vehiculo instanceof Camion) {
            importeFinal = diasTotales * ((Camion) vehiculo).getPrecioPorDia();
        } else {
            importeFinal = diasTotales * ((Turismo) vehiculo).getPrecioPorDia();
        }

        return importeFinal;
    }

    private Boolean compruebaDias(String diasTotales, Vehiculo vehiculo) {
        Boolean diasAlquiladoCorrecto = false;

        if (vehiculo instanceof Camion) {
            if ((((Camion) vehiculo).getDiasAlquiler()) <= Integer.parseInt(diasTotales)) {
                diasAlquiladoCorrecto = true;
            }
        } else {
            if ((((Turismo) vehiculo).getDiasAlquiler()) <= Integer.parseInt(diasTotales)) {
                diasAlquiladoCorrecto = true;
            }
        }
        return diasAlquiladoCorrecto;
    }

    private boolean contieneSoloNumerosEnteros() {
        String contenido = diasTotalesAlquiladoTextField.getText();

        return contenido.matches("^\\d+$");
    }

    private void continuarToDevolverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarToDevolverButtonActionPerformed
        String matriculaRecogida = matriculaDevolverTextField.getText();

        String regex = "^[A-Za-z]{2}-\\d{4}-[A-Za-z]{3}$";

        Vehiculo vehiculoAlquilar = encontrarVehiculoPorMatricula(matriculaRecogida);

        if (!matriculaRecogida.matches(regex)) {
            mostrarMensajeDeError("Ese formato no es válido para una matrícula.");
        } else if (vehiculoAlquilar == null) {
            mostrarMensajeDeError("Ese vehiculo no existe en la empresa.");
        } else if (!vehiculoAlquilar.isAlquilado()) {
            mostrarMensajeDeError("Esa vehiculo nunca ha sido alquilado");
        } else {
            matriculaDevolverTextField.setEditable(false);
            continuarToDevolverButton.setEnabled(false);
            if (vehiculoAlquilar instanceof Turismo) {
                tipoVehiculoTextField.setText("TURISMO");
                diasContratadoTextFeild.setText(Integer.toString(((Turismo) vehiculoAlquilar).getDiasAlquiler()));

            } else {
                tipoVehiculoTextField.setText("CAMION");
                diasContratadoTextFeild.setText("Dias contratado: " + Integer.toString(((Camion) vehiculoAlquilar).getDiasAlquiler()));
            }

            diasTotalesAlquiladoTextField.setEnabled(true);
            diasTotalesAlquiladoTextField.setEditable(true);
            devolucionButton.setEnabled(true);

        }
    }//GEN-LAST:event_continuarToDevolverButtonActionPerformed

    public Vehiculo encontrarVehiculoPorMatricula(String matricula) {
        return listaVehiculos.stream()
                .filter(vehiculo -> vehiculo.getMatricula().equalsIgnoreCase(matricula))
                .findFirst()
                .orElse(null);
    }

    private void mostrarMensajeDeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void mostrarMensajeDeInformacion(String mensaje) {
        JOptionPane.showMessageDialog(null, "[ª] Se devuelve el turismo con matricula "
                + matriculaDevolverTextField.getText()
                + " con "
                + diasTotalesAlquiladoTextField.getText() + " dias."
                + "\n--> Cantidad a pagar: "
                + mensaje + " €", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

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
            java.util.logging.Logger.getLogger(DevolverVehiculosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DevolverVehiculosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DevolverVehiculosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DevolverVehiculosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DevolverVehiculosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuarToDevolverButton;
    private javax.swing.JButton devolucionButton;
    private javax.swing.JTextField diasContratadoTextFeild;
    private javax.swing.JTextField diasTotalesAlquiladoTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField matriculaDevolverTextField;
    private javax.swing.JTextField tipoVehiculoTextField;
    // End of variables declaration//GEN-END:variables
}
