/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Business.Principal;
import Data.Externo;
import Data.Panel_Imagen;
import Data.Parqueadero;
import Data.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Panel_Parqueadero extends javax.swing.JFrame {

    /**
     * Creates new form Parqueadero
     */
    public Panel_Parqueadero() {        
        initComponents();
        pID.setText(Inicio.parqueaderoActual.getId());   
        pNombre.setText(Inicio.parqueaderoActual.getNombre()); 
        pCupos.setText(Inicio.parqueaderoActual.getCupos()); 
        pDescripcion.setText(Inicio.parqueaderoActual.getDescripcion()); 
        pSeguridad.setText(Inicio.parqueaderoActual.getSeguridad()); 
        pMulta.setText(Inicio.parqueaderoActual.getMulta()); 
        footo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/"+Inicio.parqueaderoActual.getId()+".jpg")));
        Imagen.add(new Panel_Imagen());
        Imagen.setSize(600,600);
        Imagen.setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Contacto");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pMulta = new javax.swing.JLabel();
        pSeguridad = new javax.swing.JLabel();
        pDescripcion = new javax.swing.JLabel();
        pCupos = new javax.swing.JLabel();
        pID = new javax.swing.JLabel();
        pNombre = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Imagen = new javax.swing.JPanel();
        footo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 109, 81));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("INICIO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cupos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripci??n");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seguridad");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Multa");

        pMulta.setForeground(new java.awt.Color(255, 255, 255));

        pSeguridad.setForeground(new java.awt.Color(255, 255, 255));

        pDescripcion.setForeground(new java.awt.Color(255, 255, 255));

        pCupos.setForeground(new java.awt.Color(255, 255, 255));

        pID.setForeground(new java.awt.Color(255, 255, 255));

        pNombre.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pNombre)
                    .addComponent(pID)
                    .addComponent(pCupos)
                    .addComponent(pDescripcion)
                    .addComponent(pSeguridad)
                    .addComponent(pMulta)
                    .addComponent(jLabel8)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pID))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pNombre))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pCupos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pDescripcion)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pSeguridad)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pMulta)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 290));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagen.setMinimumSize(new java.awt.Dimension(275, 155));
        Imagen.setPreferredSize(new java.awt.Dimension(275, 155));

        footo.setPreferredSize(new java.awt.Dimension(275, 155));

        javax.swing.GroupLayout ImagenLayout = new javax.swing.GroupLayout(Imagen);
        Imagen.setLayout(ImagenLayout);
        ImagenLayout.setHorizontalGroup(
            ImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagenLayout.createSequentialGroup()
                .addComponent(footo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        ImagenLayout.setVerticalGroup(
            ImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(footo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 240, 150));

        jPanel4.setBackground(new java.awt.Color(0, 109, 81));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reservar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -5, -1, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 110, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 370, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Inicio.parqueaderoActual.getCupos().equals("0")){
          JFrame parentFrame = new JFrame();
          JOptionPane.showMessageDialog(parentFrame, "No se puede reservar en este Parqueadero. No hay cupos");  
        }else if(Inicio.usuarioActual.getRol()=="Externo"){
          Externo e= (Externo)Inicio.usuarioActual;
          if(e.getDeuda()!=0){             
            JFrame parentFrame = new JFrame();
            JOptionPane.showMessageDialog(parentFrame, "No se puede reservar en este Parqueadero. No has pagado deuda");   
          }else if(e.getEstado().equals("Ninguno")){
            Inicio.usuarioActual=(Usuario)e; 
            Inicio.usuarioActual.setEstado(Inicio.parqueaderoActual.getId());
            Principal.editarB(Inicio.usuarioActual.getRol());
            Inicio.parqueaderoActual.disminuirCupos(Principal.BDParqueadero);
            Principal.editarB("Parqueadero");
            JFrame parentFrame = new JFrame();
            JOptionPane.showMessageDialog(parentFrame, "Ha reservado cupo en: Edificio "+Inicio.usuarioActual.getEstado()); 
          }else{
            JFrame parentFrame = new JFrame();
            JOptionPane.showMessageDialog(parentFrame, "No se puede reservar en este Parqueadero");                         
          }
            dispose();             
        }else if(Inicio.usuarioActual.getEstado().equals("Ninguno")){
          Inicio.usuarioActual.setEstado(Inicio.parqueaderoActual.getId());
          Principal.editarB(Inicio.usuarioActual.getRol());
          Inicio.parqueaderoActual.disminuirCupos(Principal.BDParqueadero);
          Principal.editarB("Parqueadero");
          JFrame parentFrame = new JFrame();
          JOptionPane.showMessageDialog(parentFrame, "Ha reservado cupo en: Edificio "+Inicio.usuarioActual.getEstado()); 
        }else{
          JFrame parentFrame = new JFrame();
          JOptionPane.showMessageDialog(parentFrame, "No se puede reservar en este Parqueadero.Ya reserv??");                         
        }
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Panel_Parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_Parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_Parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_Parqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Parqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Imagen;
    private javax.swing.JLabel footo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel pCupos;
    private javax.swing.JLabel pDescripcion;
    private javax.swing.JLabel pID;
    private javax.swing.JLabel pMulta;
    private javax.swing.JLabel pNombre;
    private javax.swing.JLabel pSeguridad;
    // End of variables declaration//GEN-END:variables
}
