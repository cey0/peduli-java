/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Peduli;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
/**
 *
 * @author cey0
 */
public class insert extends javax.swing.JFrame {

    /**
     * Creates new form insert
     */
    public insert() {
        initComponents();
          // Membuat model untuk time spinner
        SpinnerDateModel model = new SpinnerDateModel();
        model.setCalendarField(Calendar.HOUR_OF_DAY);
        
        // Membuat time spinner
        JSpinner timeSpinner = new JSpinner(model);
        JSpinner.DateEditor editor = new JSpinner.DateEditor(timeSpinner, "HH:mm:ss");
        timeSpinner.setEditor(editor);
    }
    
        private boolean insertEntry(String nik, String name, String location, String time, String temperature, String customPath) {
    String filename = customPath + "/" + nik + "_" + name + ".txt";
    try (FileWriter writer = new FileWriter(filename, true)) { // 'true' for appending to the file
        writer.write("Location: " + location + "\n");
        writer.write("Temperature: " + temperature + "\n");
        writer.write("Time: " + time + "\n");
        writer.write("\n"); // Add a new line for separating entries
        return true;
    } catch (IOException e) {
        e.printStackTrace();
        return false;
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        SuhuSpin = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        TimeSpin = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        LokasiTF = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel16.setText("Submit");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(940, 510, 90, 30);

        jButton3.setIcon(new javax.swing.ImageIcon("/home/cey0/Unduhan/Rectangle 17.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(510, 490, 900, 80);
        getContentPane().add(SuhuSpin);
        SuhuSpin.setBounds(1200, 300, 64, 25);

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel15.setText("C");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(1350, 300, 20, 20);

        TimeSpin.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1722305671671L), null, null, java.util.Calendar.HOUR_OF_DAY));
        getContentPane().add(TimeSpin);
        TimeSpin.setBounds(530, 300, 150, 25);

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel12.setText("suhu");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(1170, 250, 70, 20);

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel13.setText("lokasi");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(520, 350, 70, 20);

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel14.setText("time");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(510, 250, 70, 20);

        LokasiTF.setBackground(new java.awt.Color(208, 184, 168));
        LokasiTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(LokasiTF);
        LokasiTF.setBounds(530, 390, 850, 40);

        jTextField3.setBackground(new java.awt.Color(208, 184, 168));
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(1180, 290, 210, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon("/home/cey0/Unduhan/Rectangle 23.png")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(510, 370, 920, 80);

        jLabel5.setIcon(new javax.swing.ImageIcon("/home/cey0/Unduhan/Rectangle 20.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1160, 270, 250, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/cey0/Unduhan/Rectangle 20.png")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(510, 270, 240, 80);

        jButton2.setBackground(new java.awt.Color(223, 211, 195));
        jButton2.setIcon(new javax.swing.ImageIcon("/home/cey0/Unduhan/Rectangle 11.png")); // NOI18N
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 160, 270, 70);

        jButton1.setBackground(new java.awt.Color(223, 211, 195));
        jButton1.setIcon(new javax.swing.ImageIcon("/home/cey0/Unduhan/Rectangle 11.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 40, 270, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/cey0/Unduhan/LOGIN.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(880, 80, 160, 38);

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/cey0/Unduhan/Rectangle 1.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 10, 1020, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/cey0/Unduhan/Rectangle 6.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 20, 312, 975);

        jLabel4.setIcon(new javax.swing.ImageIcon("/home/cey0/Unduhan/Rectangle 19.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 210, 1020, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
   String time = TimeSpin.getValue().toString();
    String suhu = SuhuSpin.getValue().toString();
    String lokasi = LokasiTF.getText();
    String customPath = "/home/cey0/Dokumen/Peduli";

    boolean success = insertEntry(Login.nikPB, Login.namePB, lokasi, time, suhu, customPath);
    if (success) {
        JOptionPane.showMessageDialog(this, "Entry inserted successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to insert entry.");
    }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        view view = new view();
        view.show();
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
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LokasiTF;
    private javax.swing.JSpinner SuhuSpin;
    private javax.swing.JSpinner TimeSpin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
